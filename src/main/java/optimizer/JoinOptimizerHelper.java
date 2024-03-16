package optimizer;

import javafx.util.Pair;
import org.antlr.v4.runtime.tree.ParseTree;
import parser_util.XQueryParser;

import java.util.*;
import java.util.regex.Matcher;
import java.util.stream.Collectors;

import static helper.CommonUtils.getValidChild;
import static helper.CommonUtils.getValidChildCount;

public class JoinOptimizerHelper {

    public static String getVariableName(ParseTree variableValue){
        if (variableValue instanceof XQueryParser.XqContext){
            return getVariableName(getValidChild(variableValue, 0));
        } else if (variableValue instanceof XQueryParser.VariableContext){
            return variableValue.getText();
        } else {
            return null;
        }
    }

    public static HashMap<String, String> getDependencyList(ParseTree forVariablesContext, HashMap<String, String> dependencyList){
        int childCount = getValidChildCount(forVariablesContext);
        if (childCount == 1){
            ParseTree loopVariableAssinment = getValidChild(forVariablesContext, 0);
            dependencyList.putAll(getDependentPair(loopVariableAssinment));
        } else{
            ParseTree loopVariableAssignment = getValidChild(forVariablesContext, 0);
            dependencyList.putAll(getDependentPair(loopVariableAssignment));

            dependencyList = getDependencyList(getValidChild(forVariablesContext, 1), dependencyList);
            ParseTree moreLoopVariable = getValidChild(forVariablesContext, 1);
            dependencyList = getDependencyList(getValidChild(moreLoopVariable, 1), dependencyList);
        }
        return dependencyList;
    }

    public static HashMap<String, String> getDependentPair(ParseTree loopVariableAssignment){
        String dependent = getVariableName(getValidChild(loopVariableAssignment, 0));
        String master = getVariableName(getValidChild(loopVariableAssignment, 2));
        HashMap<String, String> dependentPair = new HashMap<>();
        if (master != null && dependent != null)
            dependentPair.put(dependent, master);
        return dependentPair;
    }

    public static ArrayList<HashMap<String, String>> segmentDisconnectedComponents(HashMap<String, String> dependencyList){
        List<String> roots = new ArrayList<>();
        Set<String> distinctValues = new HashSet<>(dependencyList.values());
        for (String value : distinctValues){
            if (!dependencyList.containsKey(value)){
                roots.add(value);
            }
        }
        ArrayList<HashMap<String, String>> independentGroups = new ArrayList<>();
        for (String root : roots){
            Queue<String> candidates = new LinkedList<>();
            HashMap<String, String> independentGroup = new HashMap<>();
            candidates.add(root);
            while (candidates.size() > 0){
                String candidate = candidates.remove();
                for (String key : dependencyList.keySet()){
                    if (dependencyList.get(key).equals(candidate)){
                        candidates.add(key);
                        independentGroup.put(key, dependencyList.get(key));
                    }
                }
            }
            independentGroups.add(independentGroup);
        }
        return independentGroups;
    }

    public static ArrayList<ArrayList<String>> getOrderedIndependentGroupsVariables(ArrayList<HashMap<String, String>> independentGroups){
        ArrayList<ArrayList<String>> orderedIndependentGroups = new ArrayList<>();
        for (HashMap<String, String> independentGroup : independentGroups){
            ArrayList<String> potentialRoots = new ArrayList<>();
            Set<String> distinctValues = new HashSet<>(independentGroup.values());
            for (String value : distinctValues){
                if (!independentGroup.containsKey(value)){
                    potentialRoots.add(value);
                }
            }
            String root = potentialRoots.get(0);
            ArrayList<String> orderedIndependentGroup = new ArrayList<>();
            Queue<String> candidates = new LinkedList<>();
            candidates.add(root);
            while (candidates.size() > 0){
                String candidate = candidates.remove();
                orderedIndependentGroup.add(candidate);
                for (String key : independentGroup.keySet()){
                    if (independentGroup.get(key).equals(candidate)){
                        candidates.add(key);
                    }
                }
            }
            orderedIndependentGroups.add(orderedIndependentGroup);
        }
        return orderedIndependentGroups;
    }


    public static ArrayList<String> getAllConditions(ParseTree tree, ArrayList<String> conditions) {
        String condition = tree.getText();
        ArrayList<String> conditionsList = new ArrayList<>(Arrays.asList(condition.split("and")))
                .stream().map(String::trim).collect(Collectors.toCollection(ArrayList::new));
        conditions.addAll(conditionsList);
        return conditions;
    }
    public static List<String> getAllForSelections(ParseTree tree, List<String> selections) {
        String loopVariableAssignments = tree.getText();
        ArrayList<String> loopVariableAssignmentsList = new ArrayList<>(Arrays.asList(loopVariableAssignments.split(",")))
                .stream().map(String::trim).collect(Collectors.toCollection(ArrayList::new));
        selections.addAll(loopVariableAssignmentsList);
        return selections;

    }

    public static String getTaggedString(String variable){
        String variableName = variable.replaceAll("\\$", "");
        return "<" + variableName + "> {" + variable + "} </" + variableName + ">";
    }

    public static String getJoinString(IndependentJoinGroup independentJoinGroup) {
        StringBuilder joinString = new StringBuilder("for ");
        joinString.append(independentJoinGroup.selections.get(0));
        for (int i = 1; i < independentJoinGroup.selections.size(); i++) {
            joinString.append(", \n\t").append(independentJoinGroup.selections.get(i));
        }
        if (independentJoinGroup.conditions.size() > 0){
            joinString.append("\nwhere ");
            joinString.append(independentJoinGroup.conditions.get(0));
            for (int i = 1; i < independentJoinGroup.conditions.size(); i++) {
                joinString.append(" and \n\t").append(independentJoinGroup.conditions.get(i));
            }
        }
        joinString.append("\nreturn <tuple>{");
        joinString.append("\n\t");
        joinString.append(getTaggedString(independentJoinGroup.variables.get(0)));
        for (int i = 1; i < independentJoinGroup.variables.size(); i++){
            joinString.append(", \n\t").append(getTaggedString(independentJoinGroup.variables.get(i)));
        }
        joinString.append("\n}</tuple>");

        return joinString.toString();
    }

    public static List<String> getAllVariablesInString(String string){
        ArrayList<String> variables = new ArrayList<>();
        // split if joined by "and", " ", "/". "//"
        ArrayList<String> words = Arrays.stream(string.split("and| |/|//")).map(String::trim).collect(Collectors.toCollection(ArrayList::new));
        for (String word : words){
            if (word.contains("$")){
                variables.add(word);
            }
        }
        return variables;
    }

    public static List<String> getForLoopConditions(List<String> variables, List<String> conditions) {
        List<String> validConditions = new ArrayList<>();
        for (String condition : conditions){
            Set <String> conditionVariables = new HashSet<>(getAllVariablesInString(condition));
            Set <String> variableSet = new HashSet<>(variables);
            if (variableSet.containsAll(conditionVariables)) {
                validConditions.add(condition);
            }
        }
        return validConditions;
    }

    public static ArrayList<Pair<String, String>> getJoinConditions(List<String> variablesGroup1, List<String> variablesGroup2, ArrayList<String> conditions) {
        ArrayList<Pair<String, String>> validConditions = new ArrayList<>();
        for (String condition : conditions){
            Set <String> conditionVariables = new HashSet<>(getAllVariablesInString(condition));
            Set <String> variableSet1 = new HashSet<>(variablesGroup1);
            Set <String> variableSet2 = new HashSet<>(variablesGroup2);
            variableSet1.retainAll(conditionVariables);
            variableSet2.retainAll(conditionVariables);
            if (variableSet1.size() > 0 && variableSet2.size() > 0) {
                validConditions.add(new Pair<>(
                        new ArrayList<>(variableSet1).get(0),
                        new ArrayList<>(variableSet2).get(0)));
            }
        }
        return validConditions;
    }

    public static boolean doesStringContainVariable(String string, String variable){
        ArrayList<String> parts = Arrays.stream(string.split(" ")).map(String::trim).collect(Collectors.toCollection(ArrayList::new));
        return parts.contains(variable);
    }
    public static List<IndependentJoinGroup> generateIndependentJoinGroups(ParseTree tree, ArrayList<ArrayList<String>> orderedIndependentGroup){
        ArrayList<String> selections = new ArrayList<>();
        ArrayList<String> projections = new ArrayList<>();
        ArrayList<String> conditions = new ArrayList<>();

        ParseTree forVariablesContext = getValidChild(getValidChild(tree, 0), 1);
        selections = (ArrayList<String>) getAllForSelections(forVariablesContext, selections);
        ParseTree conditionTree = getValidChild(getValidChild(tree, 1), 1);
        conditions = (ArrayList<String>) getAllConditions(conditionTree, conditions);

        List<IndependentJoinGroup> independentJoinGroupList = new ArrayList<>();

        for(List<String> independentGroup : orderedIndependentGroup){
            IndependentJoinGroup independentJoinGroup = new IndependentJoinGroup();
            for (String variable : independentGroup){
               for (String selection : selections){
                   if (doesStringContainVariable(selection, variable) && !independentJoinGroup.selections.contains(selection)){
                       independentJoinGroup.selections.add(selection);
                   }
               }
               independentJoinGroup.conditions = (ArrayList<String>) getForLoopConditions(independentGroup, conditions);
            }
            independentJoinGroup.variables = (ArrayList<String>) independentGroup;
            independentJoinGroup.joinString = getJoinString(independentJoinGroup);
            independentJoinGroupList.add(independentJoinGroup);
        }

        return independentJoinGroupList;
    }

    public static JoinBody getJoinBody(ParseTree tree, List<IndependentJoinGroup> independentJoinGroup){
        JoinBody joinBody = new JoinBody();
        ParseTree conditionTree = getValidChild(getValidChild(tree, 1), 1);
        ArrayList<String> conditions = new ArrayList<>();
        conditions = getAllConditions(conditionTree, conditions);
        joinBody.independentJoinGroups = (ArrayList<IndependentJoinGroup>) independentJoinGroup;
        int childCount = getValidChildCount(tree);
        ParseTree returnBody = getValidChild(tree, childCount - 1);
        joinBody.returnString = returnBody.getText();
        joinBody.conditions = conditions;
        joinBody.joins = new ArrayList<>();
        for (int i = 0; i < independentJoinGroup.size(); i++){
            for (int j = i + 1; j < independentJoinGroup.size(); j++){
                List<Pair<String, String>> joinConditions = getJoinConditions(independentJoinGroup.get(i).variables, independentJoinGroup.get(j).variables, conditions);
                if (joinConditions.size() > 0){
                    joinBody.joins.addAll(joinConditions);
                    joinBody.joinMap.put(new Pair<>(i, j), new ArrayList<>(joinConditions));
                }
            }
        }

        return joinBody;
    }

    public static Pair<Integer, Integer> getOptimalJoinPair(JoinBody joinBody, List<Integer> activeGroups){
        Pair<Integer, Integer> optimalJoinPair = new Pair<>(0, 0);

        // check if there is a group with join conditions
        int primeCandidate = -1;
        for (int i = 0; i < activeGroups.size(); i++){
            if (joinBody.independentJoinGroups.get(activeGroups.get(i)).conditions.size() > 0){
                primeCandidate = activeGroups.get(i);
                break;
            }
        }
        if (primeCandidate != -1) {
            int value = 0;
            for (Integer activeGroup : activeGroups) {
                if (activeGroup != primeCandidate) {
                    if (joinBody.joinMap.containsKey(new Pair<>(primeCandidate, activeGroup))) {
                        if (joinBody.joinMap.get(new Pair<>(primeCandidate, activeGroup)).size() >= value) {
                            value = joinBody.joinMap.get(new Pair<>(primeCandidate, activeGroup)).size();
                            optimalJoinPair = new Pair<>(primeCandidate, activeGroup);
                        }
                    }

                    else if (joinBody.joinMap.containsKey(new Pair<>(activeGroup, primeCandidate))) {
                        if (joinBody.joinMap.get(new Pair<>(activeGroup, primeCandidate)).size() >= value) {
                            value = joinBody.joinMap.get(new Pair<>(activeGroup, primeCandidate)).size();
                            optimalJoinPair = new Pair<>(activeGroup, primeCandidate);
                        }
                    }
                }
            }
            return optimalJoinPair;
        }

        // find active group with the most join conditions

        primeCandidate = activeGroups.get(0);
        HashMap<Integer, Integer> joinCount = new HashMap<>();
        for (int i = 0; i < activeGroups.size()-1; i++){
           for (int j = i + 1; j < activeGroups.size(); j++){
               if (joinBody.joinMap.containsKey(new Pair<>(activeGroups.get(i), activeGroups.get(j)))){
                   if (joinCount.containsKey(activeGroups.get(i))){
                       joinCount.put(activeGroups.get(i), joinCount.get(activeGroups.get(i)) + joinBody.joinMap.get(new Pair<>(activeGroups.get(i), activeGroups.get(j))).size());
                   } else {
                       joinCount.put(activeGroups.get(i), joinBody.joinMap.get(new Pair<>(activeGroups.get(i), activeGroups.get(j))).size());
                   }
                    if (joinCount.containsKey(activeGroups.get(j))){
                       joinCount.put(activeGroups.get(j), joinCount.get(activeGroups.get(j)) + joinBody.joinMap.get(new Pair<>(activeGroups.get(i), activeGroups.get(j))).size());
                   } else {
                       joinCount.put(activeGroups.get(j), joinBody.joinMap.get(new Pair<>(activeGroups.get(i), activeGroups.get(j))).size());
                   }
               }
           }
        }
        int maxJoinCount = 0;
        for (int group : activeGroups){
            if (joinCount.get(group) > maxJoinCount){
                primeCandidate = group;
                maxJoinCount = joinCount.get(group);
            }
        }
        int value = 0;
        for (Integer activeGroup : activeGroups) {
            if (activeGroup != primeCandidate) {
                if (joinBody.joinMap.containsKey(new Pair<>(primeCandidate, activeGroup))) {
                    if (joinBody.joinMap.get(new Pair<>(primeCandidate, activeGroup)).size() >= value) {
                        value = joinBody.joinMap.get(new Pair<>(primeCandidate, activeGroup)).size();
                        optimalJoinPair = new Pair<>(primeCandidate, activeGroup);
                    }
                }

                else if (joinBody.joinMap.containsKey(new Pair<>(activeGroup, primeCandidate))) {
                    if (joinBody.joinMap.get(new Pair<>(activeGroup, primeCandidate)).size() >= value) {
                        value = joinBody.joinMap.get(new Pair<>(activeGroup, primeCandidate)).size();
                        optimalJoinPair = new Pair<>(activeGroup, primeCandidate);
                    }
                }
            }
        }
        return optimalJoinPair;
    }

    public static JoinBody getOptimalJoinOrder(JoinBody joinBody){

        List<Integer> activeGroups = new ArrayList<>();
        for(int i = 0; i < joinBody.independentJoinGroups.size(); i++){
            activeGroups.add(i);
        }
        while (activeGroups.size() > 1){
            Pair<Integer, Integer> optimalJoinPair = getOptimalJoinPair(joinBody, activeGroups);
            IndependentJoinGroup newGroup = new IndependentJoinGroup();
            int left = optimalJoinPair.getKey();
            int right = optimalJoinPair.getValue();
            HashSet<String> newVariables = new HashSet<>(joinBody.independentJoinGroups.get(left).variables);
            newVariables.addAll(joinBody.independentJoinGroups.get(right).variables);
            newGroup.variables = new ArrayList<>(newVariables);
            newGroup.selections = joinBody.independentJoinGroups.get(left).selections;
            newGroup.selections.addAll(joinBody.independentJoinGroups.get(right).selections);
            newGroup.conditions = joinBody.independentJoinGroups.get(left).conditions;
            newGroup.conditions.addAll(joinBody.independentJoinGroups.get(right).conditions);
            StringBuilder joinString = new StringBuilder("join (\n");
            joinString.append(joinBody.independentJoinGroups.get(left).joinString);
            joinString.append(", \n");
            joinString.append(joinBody.independentJoinGroups.get(right).joinString);
            joinString.append(", \n\t");

            StringBuilder buildJoinStringLHS = new StringBuilder();
            buildJoinStringLHS.append("[");
            StringBuilder buildJoinStringRHS = new StringBuilder();
            buildJoinStringRHS.append("[");
            for (Pair<String, String> joinCondition : joinBody.joinMap.get(new Pair<>(left, right))){
                buildJoinStringLHS.append(joinCondition.getKey().replace("$", "")).append(", ");
                buildJoinStringRHS.append(joinCondition.getValue().replace("$", "")).append(", ");
            }
            // remove last comma
            if (buildJoinStringLHS.length() > 1) {
                buildJoinStringLHS.deleteCharAt(buildJoinStringLHS.length() - 1);
                buildJoinStringLHS.deleteCharAt(buildJoinStringLHS.length() - 1);
                buildJoinStringRHS.deleteCharAt(buildJoinStringRHS.length() - 1);
                buildJoinStringRHS.deleteCharAt(buildJoinStringRHS.length() - 1);
            }
            buildJoinStringLHS.append("]");
            buildJoinStringRHS.append("]");
            joinString.append(buildJoinStringLHS);
            joinString.append(", ");
            joinString.append(buildJoinStringRHS);
            joinString.append(")");
            newGroup.joinString = joinString.toString();


            joinBody.independentJoinGroups.add(newGroup);
            activeGroups.remove((Integer) left);
            activeGroups.remove((Integer) right);
            activeGroups.add(joinBody.independentJoinGroups.size() - 1);
            ArrayList<Pair<String, String>> newJoins = new ArrayList<>();
            for (int i = 0; i < activeGroups.size() - 1; i++){
                 ArrayList<Pair<String, String>> joins = getJoinConditions(joinBody.independentJoinGroups.get(activeGroups.get(i)).variables,
                         joinBody.independentJoinGroups.get(activeGroups.get(activeGroups.size() - 1)).variables,
                         joinBody.conditions);
                 newJoins.addAll(joins);

                 joinBody.joinMap.put(new Pair<>(activeGroups.get(i), joinBody.independentJoinGroups.size() - 1), joins);
            }
            joinBody.joins.addAll(newJoins);

            joinBody.finalJoinString = joinString.toString();
        }
        return joinBody;
    }

    public static String getOptimizedQuery(JoinBody joinBody) {
        StringBuilder optimizedQuery = new StringBuilder();
        optimizedQuery.append("for $tuple in ");
        optimizedQuery.append(joinBody.finalJoinString);
        optimizedQuery.append("\n");
        String returnString = joinBody.returnString;

        HashSet<String> variables = new HashSet<>();
        for (IndependentJoinGroup independentJoinGroup : joinBody.independentJoinGroups){
            variables.addAll(independentJoinGroup.variables);
        }
        for (String variable : variables){
            String variableName = variable.replaceAll("\\$", "");
            String replaceString = "$tuple/" + variableName + "/*";
            // replace all occurrences of variable with $tuple/variable/*
            // escape $ in variable
            variable = "\\$" + variableName + "(?!\\w)";
            returnString = returnString.replaceAll(variable, Matcher.quoteReplacement(replaceString));
        }
        optimizedQuery.append(returnString);
        return optimizedQuery.toString();
    }


}
