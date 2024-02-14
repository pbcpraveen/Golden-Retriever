package evaluator;

import helper.FilterFunctions;
import helper.RelativePathFunctions;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import helper.XMLParser;
import parser_util.XPathLexer;
import parser_util.XPathParser;

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
        XPathLexer lexer = new XPathLexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        XPathParser parser = new XPathParser(tokens);
        state = new EvaluatorState(parser.eval(), "", null, false);
    }

    public QueryEvaluator(String query) {
        CharStream stream = CharStreams.fromString(query);
        XPathLexer lexer = new XPathLexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        XPathParser parser = new XPathParser(tokens);
        state = new EvaluatorState(parser.eval(), "", null, false);
    }

    public QueryEvaluator(EvaluatorState state) {
        this.state = state;
    }
    public EvaluatorState evaluate() {
        return compute(state);
    }

    public static EvaluatorState compute(EvaluatorState state) {
        if (state.tree instanceof XPathParser.EvalContext){
            state.tree = state.tree.getChild(0);
            return compute(state);
        }
        else if (state.tree instanceof XPathParser.AbsolutePathContext){
            return handleAbsolutePath(state);
        }
        else if (state.tree instanceof XPathParser.RelativePathContext){
            return handleRelativePath(state);
        }

        else if (state.tree instanceof XPathParser.TagNameContext){
            return handleTagName(state);
        }

        else if (state.tree instanceof XPathParser.ChildrenContext){
            return handleChildren(state);
        }
        else if (state.tree instanceof XPathParser.CurrentContext){
            return handleCurrent(state);
        }
        else if (state.tree instanceof XPathParser.ParentContext){
            return handleParent(state);
        }
        else if (state.tree instanceof XPathParser.AttributeContext){
            return handleAttribute(state);
        }
        else if (state.tree instanceof XPathParser.TextFunctionContext){
            return handleTextFunction(state);
        }
        else if (state.tree instanceof XPathParser.InParenthesisContext) {
            return handleInParenthesis(state);
        }
        else if (state.tree instanceof XPathParser.FilterContext){
            return handleFilter(state);
        }
        else if (state.tree instanceof XPathParser.StringConstantTextContext){
            return handleStringConstantText(state);
        }
        else if (state.tree instanceof XPathParser.FContext) {
            return computeFilter(state);
        }
        return null;
    }

}
