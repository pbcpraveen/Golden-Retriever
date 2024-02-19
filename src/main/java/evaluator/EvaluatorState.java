package evaluator;
import org.antlr.v4.runtime.tree.ParseTree;
import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class EvaluatorState {
    public ParseTree tree;
    public String path;
    public boolean isRecursive;
    public List<Node> currentCandidates;

    public List<Boolean> filterMask;
    public HashMap<String, List<Node>> context = new HashMap<>();
    public HashMap<String, ParseTree> forBodyComponents = new HashMap<>();
    public boolean whereClauseDecision = false;


    public EvaluatorState(ParseTree tree, String path, Node dataNode, boolean isRecursive) {
        this.tree = tree;
        this.path = path;
        this.isRecursive = isRecursive;
        this.currentCandidates = new ArrayList<>();
        this.filterMask = new ArrayList<>();
        this.context = new HashMap<>();
        this.forBodyComponents = new HashMap<>();
        this.whereClauseDecision = false;
    }

    public EvaluatorState(EvaluatorState state) {
        this.tree = state.tree;
        this.path = state.path;
        this.isRecursive = state.isRecursive;
        this.currentCandidates = new ArrayList<>(state.currentCandidates);
        this.filterMask = new ArrayList<>(state.filterMask);
        this.context = new HashMap<>(state.context);
        this.forBodyComponents = new HashMap<>(state.forBodyComponents);
        this.whereClauseDecision = state.whereClauseDecision;
    }


}
