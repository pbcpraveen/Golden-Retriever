package evaluator;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import parser_util.XQueryLexer;
import parser_util.XQueryParser;

import java.io.IOException;

import static evaluator.XPathEvaluatorUtils.*;

public class QueryEvaluator {
    public EvaluatorState state;
    final static String BASE_FILE_PATH = "src/main/resources/data/";

    public QueryEvaluator(String query_file, Boolean isFile) {
        CharStream stream = null;
        try {
            stream = CharStreams.fromFileName(query_file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        XQueryLexer lexer = new XQueryLexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        XQueryParser parser = new XQueryParser(tokens);
        state = new EvaluatorState(parser.eval(), "", null, false);
    }

    public QueryEvaluator(String query) {
        CharStream stream = CharStreams.fromString(query);
        XQueryLexer lexer = new XQueryLexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        XQueryParser parser = new XQueryParser(tokens);
        state = new EvaluatorState(parser.eval(), "", null, false);
    }

    public QueryEvaluator(EvaluatorState state) {
        this.state = state;
    }
    public EvaluatorState evaluate() {
        return compute(state);
    }

    public static EvaluatorState compute(EvaluatorState state) {
        if (state.tree instanceof XQueryParser.EvalContext){
            state.tree = state.tree.getChild(0);
            return compute(state);
        }
        else if (state.tree instanceof XQueryParser.AbsolutePathContext){
            return handleAbsolutePath(state);
        }
        else if (state.tree instanceof XQueryParser.RelativePathContext){
            return handleRelativePath(state);
        }

        else if (state.tree instanceof XQueryParser.TagNameContext){
            return handleTagName(state);
        }

        else if (state.tree instanceof XQueryParser.ChildrenContext){
            return handleChildren(state);
        }
        else if (state.tree instanceof XQueryParser.CurrentContext){
            return handleCurrent(state);
        }
        else if (state.tree instanceof XQueryParser.ParentContext){
            return handleParent(state);
        }
        else if (state.tree instanceof XQueryParser.AttributeContext){
            return handleAttribute(state);
        }
        else if (state.tree instanceof XQueryParser.TextFunctionContext){
            return handleTextFunction(state);
        }
        else if (state.tree instanceof XQueryParser.InParenthesisContext) {
            return handleInParenthesis(state);
        }
        else if (state.tree instanceof XQueryParser.FilterContext){
            return handleFilter(state);
        }
        else if (state.tree instanceof XQueryParser.StringConstantTextContext){
            return handleStringConstantText(state);
        }
        else if (state.tree instanceof XQueryParser.FContext) {
            return computeFilter(state);
        }
        return null;
    }

}
