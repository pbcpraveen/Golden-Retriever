package optimizer;

import org.antlr.v4.runtime.tree.ParseTree;

public class OptimizerState {

    public OptimizerState(ParseTree tree) {
        this.tree = tree;
        this.optimizedQuery = "";
    }

    public OptimizerState(OptimizerState state) {
        this.tree = state.tree;
        this.optimizedQuery = "";
    }

    public ParseTree tree;
    public String optimizedQuery;
}
