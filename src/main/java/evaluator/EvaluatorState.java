package evaluator;
import org.antlr.v4.runtime.tree.ParseTree;
import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.List;

public class EvaluatorState {
    public ParseTree tree;
    public String path;
    public boolean isRecursive;
    public List<Node> currentCandidates;

    public List<Boolean> filterMask;

    public EvaluatorState(ParseTree tree, String path, Node dataNode, boolean isRecursive) {
        this.tree = tree;
        this.path = path;
        this.isRecursive = isRecursive;
        this.currentCandidates = new ArrayList<>();
        this.filterMask = new ArrayList<>();
    }

    public EvaluatorState(EvaluatorState state) {
        this.tree = state.tree;
        this.path = state.path;
        this.isRecursive = state.isRecursive;
        this.currentCandidates = new ArrayList<>(state.currentCandidates);
        this.filterMask = new ArrayList<>(state.filterMask);
    }


}
