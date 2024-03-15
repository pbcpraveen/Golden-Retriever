package optimizer;

import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static helper.CommonUtils.getValidChild;
import static helper.CommonUtils.getValidChildCount;
import static optimizer.Optimizer.optimize;

public class JoinOptimizer {

    public static String optimizeJoin(OptimizerState state) {
        OptimizerState newState = new OptimizerState(state);
        int childCount = getValidChildCount(state.tree);
        HashMap<String, String> dependencyList = new HashMap<>();
        ParseTree forVariablesContext = getValidChild(getValidChild(state.tree, 0), 1);
        dependencyList = JoinOptimizerHelper.getDependencyList(forVariablesContext, dependencyList);
        ArrayList<HashMap<String, String>> independentGroups = JoinOptimizerHelper.segmentDisconnectedComponents(dependencyList);
        ArrayList<ArrayList<String>> independentGroupsOrderedList = JoinOptimizerHelper.getOrderedIndependentGroupsVariables(independentGroups);
        List<IndependentJoinGroup> independentJoinGroups = JoinOptimizerHelper.generateIndependentJoinGroups(state.tree, independentGroupsOrderedList);
        JoinBody joinBody = JoinOptimizerHelper.getJoinBody(state.tree, independentJoinGroups);
        JoinOptimizerHelper.getOptimalJoinOrder(joinBody);
        newState.optimizedQuery = JoinOptimizerHelper.getOptimizedQuery(joinBody);
        return newState.optimizedQuery;
    }
}
