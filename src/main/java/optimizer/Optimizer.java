package optimizer;

import evaluator.EvaluatorState;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import parser_util.XQueryLexer;
import parser_util.XQueryParser;

import static optimizer.OptimizerUtil.*;

import java.io.IOException;

public class Optimizer {
    public OptimizerState state;
    public String resultQuery;

    public Optimizer(String query_file) {
        CharStream stream = null;
        try {
            stream = CharStreams.fromFileName(query_file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        XQueryLexer lexer = new XQueryLexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        XQueryParser parser = new XQueryParser(tokens);
        this.state = new OptimizerState(parser.eval());
        resultQuery = "";
    }

    public static OptimizerState optimize(OptimizerState state) {
        if (state.tree instanceof XQueryParser.EvalContext) {
            state.tree = state.tree.getChild(0);
            return optimize(state);
        } else if (state.tree instanceof XQueryParser.XqContext) {
            return handleXquery(state);
        } else if (state.tree instanceof XQueryParser.AbsolutePathContext) {
            return handleAbsolutePath(state);
        } else if (state.tree instanceof XQueryParser.RelativePathContext) {
            return handleRelativePath(state);
        } else if (state.tree instanceof XQueryParser.TagNameContext) {
            return handleTagName(state);
        } else if (state.tree instanceof XQueryParser.ChildrenContext) {
            return handleChildren(state);
        } else if (state.tree instanceof XQueryParser.CurrentContext) {
            return handleCurrent(state);
        } else if (state.tree instanceof XQueryParser.ParentContext) {
            return handleParent(state);
        } else if (state.tree instanceof XQueryParser.AttributeContext) {
            return handleAttribute(state);
        } else if (state.tree instanceof XQueryParser.TextFunctionContext) {
            return handleTextFunction(state);
        } else if (state.tree instanceof XQueryParser.InParenthesisContext) {
            return handleInParenthesis(state);
        } else if (state.tree instanceof XQueryParser.FilterContext) {
            return handleFilter(state);
        } else if (state.tree instanceof XQueryParser.StringConstantContext) {
            return handleStringConstantText(state);
        } else if (state.tree instanceof XQueryParser.FContext) {
            return computeFilter(state);
        } else if (state.tree instanceof XQueryParser.VariableContext) {
            return handleVariable(state);
        } else if (state.tree instanceof XQueryParser.StringConstantContext) {
            return handleStringConstant(state);
        } else if (state.tree instanceof XQueryParser.XqInParenthesisContext) {
            return handleXqueryInParenthesis(state);
        } else if (state.tree instanceof XQueryParser.NewTagContext) {
            return handleNewTag(state);
        } else if (state.tree instanceof XQueryParser.ForBodyContext) {
            return handleForBody(state);
        } else if (state.tree instanceof XQueryParser.LetClauseContext) {
            return handleLetClause(state);
        } else if (state.tree instanceof XQueryParser.ForClauseContext) {
            return handleForClause(state);
        } else if (state.tree instanceof XQueryParser.WhereClauseContext) {
            return handleWhereClause(state);
        } else if (state.tree instanceof XQueryParser.ForVariablesContext) {
            return handleForVariable(state);
        } else if (state.tree instanceof XQueryParser.LoopVariableAssignmentContext) {
            return handleLoopVariableAssignment(state);
        } else if (state.tree instanceof XQueryParser.LetVariablesContext) {
            return handleLetVariables(state);
        } else if (state.tree instanceof XQueryParser.LetVariableAssignmentContext) {
            return handleLetVariableAssignment(state);
        } else if (state.tree instanceof XQueryParser.CondContext) {
            return handleCond(state);
        } else if (state.tree instanceof XQueryParser.EmptyCondContext) {
            return handleEmptyCondition(state);
        } else if (state.tree instanceof XQueryParser.EqualityCondContext) {
            return handleEqualityCondition(state);
        } else if (state.tree instanceof XQueryParser.IdenticalCondContext) {
            return handleIdentityCondition(state);
        } else if (state.tree instanceof XQueryParser.SomeVarCondContext) {
            return handleSomeVarCondition(state);
        } else if (state.tree instanceof XQueryParser.ParenthesisCondContext) {
            return handleParenthesisCondition(state);
        } else if (state.tree instanceof XQueryParser.NotCondContext) {
            return handleNotCondition(state);
        } else if (state.tree instanceof XQueryParser.ReturnClauseContext) {
            return handleReturnClause(state);
        } else if (state.tree instanceof XQueryParser.MoreLoopVariablesContext) {
            return handleMoreForVariables(state);
        } else if (state.tree instanceof XQueryParser.MoreLetVariablesContext) {
            return handleMoreLetVariables(state);
        } else if (state.tree instanceof XQueryParser.LetClauseAndXqContext){
            return handleLetClauseWithXquery(state);
        }
        return state;
    }
}
