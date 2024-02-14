// Generated from XQuery.g by ANTLR 4.13.1
package parser_util;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link XQueryParser}.
 */
public interface XQueryListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link XQueryParser#eval}.
	 * @param ctx the parse tree
	 */
	void enterEval(XQueryParser.EvalContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#eval}.
	 * @param ctx the parse tree
	 */
	void exitEval(XQueryParser.EvalContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#absolutePath}.
	 * @param ctx the parse tree
	 */
	void enterAbsolutePath(XQueryParser.AbsolutePathContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#absolutePath}.
	 * @param ctx the parse tree
	 */
	void exitAbsolutePath(XQueryParser.AbsolutePathContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#relativePath}.
	 * @param ctx the parse tree
	 */
	void enterRelativePath(XQueryParser.RelativePathContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#relativePath}.
	 * @param ctx the parse tree
	 */
	void exitRelativePath(XQueryParser.RelativePathContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#children}.
	 * @param ctx the parse tree
	 */
	void enterChildren(XQueryParser.ChildrenContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#children}.
	 * @param ctx the parse tree
	 */
	void exitChildren(XQueryParser.ChildrenContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#current}.
	 * @param ctx the parse tree
	 */
	void enterCurrent(XQueryParser.CurrentContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#current}.
	 * @param ctx the parse tree
	 */
	void exitCurrent(XQueryParser.CurrentContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#parent}.
	 * @param ctx the parse tree
	 */
	void enterParent(XQueryParser.ParentContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#parent}.
	 * @param ctx the parse tree
	 */
	void exitParent(XQueryParser.ParentContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilter(XQueryParser.FilterContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilter(XQueryParser.FilterContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(XQueryParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(XQueryParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#textFunction}.
	 * @param ctx the parse tree
	 */
	void enterTextFunction(XQueryParser.TextFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#textFunction}.
	 * @param ctx the parse tree
	 */
	void exitTextFunction(XQueryParser.TextFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#inParenthesis}.
	 * @param ctx the parse tree
	 */
	void enterInParenthesis(XQueryParser.InParenthesisContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#inParenthesis}.
	 * @param ctx the parse tree
	 */
	void exitInParenthesis(XQueryParser.InParenthesisContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 */
	void enterF(XQueryParser.FContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#f}.
	 * @param ctx the parse tree
	 */
	void exitF(XQueryParser.FContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#tagName}.
	 * @param ctx the parse tree
	 */
	void enterTagName(XQueryParser.TagNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#tagName}.
	 * @param ctx the parse tree
	 */
	void exitTagName(XQueryParser.TagNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#attName}.
	 * @param ctx the parse tree
	 */
	void enterAttName(XQueryParser.AttNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#attName}.
	 * @param ctx the parse tree
	 */
	void exitAttName(XQueryParser.AttNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#fileName}.
	 * @param ctx the parse tree
	 */
	void enterFileName(XQueryParser.FileNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#fileName}.
	 * @param ctx the parse tree
	 */
	void exitFileName(XQueryParser.FileNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#stringConstantText}.
	 * @param ctx the parse tree
	 */
	void enterStringConstantText(XQueryParser.StringConstantTextContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#stringConstantText}.
	 * @param ctx the parse tree
	 */
	void exitStringConstantText(XQueryParser.StringConstantTextContext ctx);
}
