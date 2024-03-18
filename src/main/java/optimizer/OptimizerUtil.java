package optimizer;

import org.antlr.v4.runtime.tree.ParseTree;
import parser_util.XQueryParser;

import java.util.HashMap;
import java.util.HashSet;

import static helper.CommonUtils.getValidChild;
import static helper.CommonUtils.getValidChildCount;
import static optimizer.Optimizer.optimize;

public class OptimizerUtil {

    public static OptimizerState handleXquery(OptimizerState state) {
        OptimizerState newState = new OptimizerState(state);
        int childCount = getValidChildCount(state.tree);
        if (childCount == 1) {
            newState.tree = getValidChild(state.tree, 0);
            newState = optimize(newState);
            state.optimizedQuery = newState.optimizedQuery;
            return state;
        } else {
            String separator = getValidChild(state.tree, 1).getText();
            OptimizerState leftState = new OptimizerState(state);
            leftState.tree = getValidChild(state.tree, 0);
            leftState = optimize(leftState);
            OptimizerState rightState = new OptimizerState(state);
            rightState.tree = getValidChild(state.tree, 2);
            rightState = optimize(rightState);
            newState.optimizedQuery = leftState.optimizedQuery +  separator +  rightState.optimizedQuery;
            return newState;
        }
    }

    public static OptimizerState handleAbsolutePath(OptimizerState state) {
        state.optimizedQuery = state.tree.getText();
        return state;
    }

    public static OptimizerState handleRelativePath(OptimizerState state) {
        state.optimizedQuery = state.tree.getText();
        return state;
    }

    public static OptimizerState handleTagName(OptimizerState state) {
        state.optimizedQuery = state.tree.getText();
        return state;
    }

    public static OptimizerState handleChildren(OptimizerState state) {
        state.optimizedQuery = state.tree.getText();
        return state;
    }

    public static OptimizerState handleCurrent(OptimizerState state) {
        state.optimizedQuery = state.tree.getText();
        return state;
    }

    public static OptimizerState handleParent(OptimizerState state) {
        state.optimizedQuery = state.tree.getText();
        return state;
    }

    public static OptimizerState handleAttribute(OptimizerState state) {
        state.optimizedQuery = state.tree.getText();
        return state;
    }

    public static OptimizerState handleTextFunction(OptimizerState state) {
        state.optimizedQuery = state.tree.getText();
        return state;
    }

    public static OptimizerState handleInParenthesis(OptimizerState state) {
        state.optimizedQuery = state.tree.getText();
        return state;
    }

    public static OptimizerState handleFilter(OptimizerState state) {
        state.optimizedQuery = state.tree.getText();
        return state;
    }

    public static OptimizerState handleStringConstantText(OptimizerState state) {
        state.optimizedQuery = state.tree.getText();
        return state;
    }

    public static OptimizerState computeFilter(OptimizerState state) {
        state.optimizedQuery = state.tree.getText();
        return state;
    }

    public static OptimizerState handleVariable(OptimizerState state) {
        OptimizerState newState = new OptimizerState(state);
        newState.optimizedQuery = state.tree.getText();
        return newState;
    }

    public static OptimizerState handleStringConstant(OptimizerState state) {
        OptimizerState newState = new OptimizerState(state);
        newState.optimizedQuery = state.tree.getText();
        return state;
    }

    public static OptimizerState handleXqueryInParenthesis(OptimizerState state) {
        OptimizerState newState = new OptimizerState(state);
        newState.tree = getValidChild(state.tree, 1);
        newState = optimize(newState);
        state.optimizedQuery = "(" + newState.optimizedQuery + ")";
        return state;
    }

    public static OptimizerState handleForClause(OptimizerState state) {
        OptimizerState newState = new OptimizerState(state);
        newState.tree = getValidChild(state.tree, 1);
        newState = optimize(newState);
        state.optimizedQuery = "for " +  newState.optimizedQuery;
        return state;
    }

    public static OptimizerState handleWhereClause(OptimizerState state) {
        OptimizerState newState = new OptimizerState(state);
        newState.tree = getValidChild(state.tree, 1);
        newState = optimize(newState);
        state.optimizedQuery = "where " +  newState.optimizedQuery;
        return state;
    }

    public static OptimizerState handleForVariable(OptimizerState state) {
        int childCount = state.tree.getChildCount();
        if (childCount == 1) {
            OptimizerState rightState = new OptimizerState(state);
            rightState.tree = getValidChild(state.tree, 0);
            state.optimizedQuery = rightState.tree.getText();
        } else {
            OptimizerState leftState = new OptimizerState(state);
            leftState.tree = getValidChild(state.tree, 0);
            leftState = optimize(leftState);
            state.optimizedQuery = leftState.optimizedQuery;
            OptimizerState rightState = new OptimizerState(state);
            rightState.tree = getValidChild(state.tree, 1);
            rightState = optimize(rightState);
            state.optimizedQuery += rightState.optimizedQuery;
        }
        return state;
    }

    public static OptimizerState handleLoopVariableAssignment(OptimizerState state) {
        String variable = getValidChild(state.tree, 0).getText();
        OptimizerState rightState = new OptimizerState(state);
        rightState.tree = getValidChild(state.tree, 2);
        rightState = optimize(rightState);
        state.optimizedQuery = variable + " in " + rightState.optimizedQuery;
        return state;
    }

    public static OptimizerState handleLetClause(OptimizerState state) {

        int childCount = getValidChildCount(state.tree);
        if (childCount > 0){
            OptimizerState newState = new OptimizerState(state);
            newState.tree = getValidChild(state.tree, 1);
            newState = optimize(newState);
            state.optimizedQuery = "let " + newState.optimizedQuery;
        } else {
            state.optimizedQuery = " ";
        }
        return state;
    }

    public static OptimizerState handleForBody(OptimizerState state) {
        if (isOptimizeable(state.tree)) {
            state.optimizedQuery = JoinOptimizer.optimizeJoin(state);
        } else {
            state.optimizedQuery = state.tree.getText();
        }
        return state;
    }

    public static OptimizerState handleNewTag(OptimizerState state) {
        String tagName = getValidChild(state.tree, 0).getText().replaceAll("<", "").replaceAll(">", "");
        OptimizerState rightState = new OptimizerState(state);
        rightState.tree = getValidChild(state.tree, 2);
        rightState = optimize(rightState);
        state.optimizedQuery = "<" + tagName + "> { " + rightState.optimizedQuery + " } </" + tagName + ">";
        return state;
    }

    public static OptimizerState handleLetVariables(OptimizerState state) {
        OptimizerState newState = new OptimizerState(state);
        int childCount = getValidChildCount(state.tree);
        if (childCount == 1) {
            newState.tree = getValidChild(state.tree, 0);
            newState = optimize(newState);
            state.optimizedQuery = newState.optimizedQuery;
        } else {
            newState.tree = getValidChild(state.tree, 0);
            newState = optimize(newState);
            state.optimizedQuery = newState.optimizedQuery;
            newState = new OptimizerState(state);
            newState.tree = getValidChild(state.tree, 1);
            newState = optimize(newState);
            state.optimizedQuery += newState.optimizedQuery;
        }
        return state;
    }

    public static OptimizerState handleLetVariableAssignment(OptimizerState state) {
        String variable = getValidChild(state.tree, 0).getText();
        OptimizerState rightState = new OptimizerState(state);
        rightState.tree = getValidChild(state.tree, 2);
        rightState = optimize(rightState);
        state.optimizedQuery = variable + " := " + rightState.optimizedQuery;
        return state;
    }

    public static OptimizerState handleCond(OptimizerState state) {
        int childCount = getValidChildCount(state.tree);
        if (childCount == 1) {
            OptimizerState newState = new OptimizerState(state);
            newState.tree = getValidChild(state.tree, 0);
            newState = optimize(newState);
            state.optimizedQuery = newState.optimizedQuery;
            return state;
        } else {
            OptimizerState leftState = new OptimizerState(state);
            leftState.tree = getValidChild(state.tree, 0);
            leftState = optimize(leftState);
            OptimizerState rightState = new OptimizerState(state);
            rightState.tree = getValidChild(state.tree, 2);
            rightState = optimize(rightState);
            state.optimizedQuery = leftState.optimizedQuery + " " + getValidChild(state.tree, 1).getText() + " " + rightState.optimizedQuery;
            return state;
        }
    }

    public static OptimizerState handleEmptyCondition(OptimizerState state) {
        OptimizerState newState = new OptimizerState(state);
        newState.tree = getValidChild(state.tree, 2);
        newState = optimize(newState);
        state.optimizedQuery = "empty( " + newState.optimizedQuery + " )";
        return state;
    }

    public static OptimizerState handleEqualityCondition(OptimizerState state) {
        OptimizerState newState = new OptimizerState(state);
        newState.tree = getValidChild(state.tree, 0);
        newState = optimize(newState);
        state.optimizedQuery = newState.optimizedQuery;
        newState = new OptimizerState(state);
        newState.tree = getValidChild(state.tree, 2);
        newState = optimize(newState);
        state.optimizedQuery += " = " + newState.optimizedQuery;
        return state;
    }

    public static OptimizerState handleIdentityCondition(OptimizerState state) {
        OptimizerState newState = new OptimizerState(state);
        newState.tree = getValidChild(state.tree, 0);
        newState = optimize(newState);
        state.optimizedQuery = newState.optimizedQuery;
        newState = new OptimizerState(state);
        newState.tree = getValidChild(state.tree, 2);
        newState = optimize(newState);
        state.optimizedQuery += " is " + newState.optimizedQuery;
        return state;
    }

    public static OptimizerState handleSomeVarCondition(OptimizerState state) {
        OptimizerState newState = new OptimizerState(state);
        newState.tree = getValidChild(state.tree, 1);
        newState = optimize(newState);
        state.optimizedQuery = "some " + newState.optimizedQuery;
        return state;
    }

    public static OptimizerState handleParenthesisCondition(OptimizerState state) {
        OptimizerState newState = new OptimizerState(state);
        newState.tree = getValidChild(state.tree, 1);
        newState = optimize(newState);
        state.optimizedQuery = "( " + newState.optimizedQuery + " )";
        return state;
    }

    public static OptimizerState handleNotCondition(OptimizerState state) {
        OptimizerState newState = new OptimizerState(state);
        newState.tree = getValidChild(state.tree, 1);
        newState = optimize(newState);
        state.optimizedQuery = "not " + newState.optimizedQuery;
        return state;
    }

    public static OptimizerState handleReturnClause(OptimizerState state) {
        OptimizerState newState = new OptimizerState(state);
        newState.tree = getValidChild(state.tree, 1);
        newState = optimize(newState);
        state.optimizedQuery = "return " + newState.optimizedQuery;
        return state;
    }

    public static OptimizerState handleMoreForVariables(OptimizerState state) {
        OptimizerState newState = new OptimizerState(state);
        newState.tree = getValidChild(state.tree, 1);
        newState = optimize(newState);
        state.optimizedQuery = " , \n\t" + newState.optimizedQuery;
        return state;
    }

    public static OptimizerState handleMoreLetVariables(OptimizerState state) {
        OptimizerState newState = new OptimizerState(state);
        newState.tree = getValidChild(state.tree, 1);
        newState = optimize(newState);
        state.optimizedQuery = " , \n\t" + newState.optimizedQuery;
        return state;
    }

    public static String getConditionTypeString(ParseTree tree) {
        if (tree instanceof XQueryParser.EmptyCondContext) {
            return "empty";
        } else if (tree instanceof XQueryParser.EqualityCondContext) {
            return "equality";
        } else if (tree instanceof XQueryParser.IdenticalCondContext) {
            return "identity";
        } else if (tree instanceof XQueryParser.SomeVarCondContext) {
            return "someVar";
        } else if (tree instanceof XQueryParser.ParenthesisCondContext) {
            return "parenthesis";
        } else if (tree instanceof XQueryParser.NotCondContext) {
            return "not";
        } else if (tree instanceof XQueryParser.CondContext) {
            return "cond";
        } else {
            return "var";
        }
    }

    public static void getAllConditionTypes(ParseTree tree, HashSet<String> conditionTypes) {
        int childCount = getValidChildCount(tree);
        if (childCount == 1) {
            ParseTree child = getValidChild(tree, 0);
            if (! (child instanceof XQueryParser.CondContext)) {
                ParseTree innerChild = getValidChild(child, 0);
                if (innerChild instanceof XQueryParser.ParenthesisCondContext) {
                    getAllConditionTypes(innerChild, conditionTypes);
                } else {
                    conditionTypes.add(getConditionTypeString(innerChild));
                }
            }
        } else {
            ParseTree leftChild = getValidChild(tree, 0);
            String operator = getValidChild(tree, 1).getText();
            switch (operator){
                case "and":
                    conditionTypes.add("and");
                    break;
                case "or":
                    conditionTypes.add("or");
                    break;
            }
            ParseTree rightChild = getValidChild(tree, 2);
            if (leftChild instanceof XQueryParser.CondContext) {
                getAllConditionTypes(leftChild, conditionTypes);
            }
            if (rightChild instanceof XQueryParser.CondContext) {
                getAllConditionTypes(rightChild, conditionTypes);
            }
        }
    }
    public static OptimizerState handleLetClauseWithXquery(OptimizerState state) {
        OptimizerState newState = new OptimizerState(state);
        newState.tree = getValidChild(state.tree, 0);
        newState = optimize(newState);
        state.optimizedQuery = newState.optimizedQuery;
        newState = new OptimizerState(state);
        newState.tree = getValidChild(state.tree, 1);
        newState = optimize(newState);
        state.optimizedQuery += " " + newState.optimizedQuery;
        return state;
    }

    public static boolean isOptimizeable(ParseTree joinBody) {
        int childCount = getValidChildCount(joinBody);
        // check id there is no let clause
        for (int i = 0; i < childCount; i++) {
            if (getValidChild(joinBody, i) instanceof XQueryParser.LetClauseContext) {
                return false;
            }
        }

        // get all conditions types in the where clause
        HashSet<String> conditionTypes = new HashSet<>();
        ParseTree whereClause = null;
        for (int i = 0; i < childCount; i++) {
            if (getValidChild(joinBody, i) instanceof XQueryParser.WhereClauseContext) {
                whereClause = getValidChild(joinBody, i);
                break;
            }
        }
        if (whereClause != null) {
            ParseTree condition = getValidChild(whereClause, 1);
            getAllConditionTypes(condition, conditionTypes);
            HashSet<String> optimizeableConditions = new HashSet<>();
            optimizeableConditions.add("equality");
            optimizeableConditions.add("and");
            optimizeableConditions.add("var");

            if (!optimizeableConditions.containsAll(conditionTypes)){
                return false;
            }

        }
        ParseTree returnClause = null;
        for (int i = 0; i < childCount; i++) {
            if (getValidChild(joinBody, i) instanceof XQueryParser.ReturnClauseContext) {
                returnClause = getValidChild(joinBody, i);
                break;
            }
        }
        if (returnClause != null) {
            String returnClauseString = getValidChild(returnClause, 1).getText();
            if (returnClauseString.contains("for") || returnClauseString.contains("let")) {
                return false;
            }
        }
        return true;

    }

}
