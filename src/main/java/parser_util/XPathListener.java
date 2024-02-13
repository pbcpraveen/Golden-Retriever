// Generated from XPath.g by ANTLR 4.13.1
package parser_util;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link XPathParser}.
 */
public interface XPathListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link XPathParser#eval}.
	 * @param ctx the parse tree
	 */
	void enterEval(XPathParser.EvalContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPathParser#eval}.
	 * @param ctx the parse tree
	 */
	void exitEval(XPathParser.EvalContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPathParser#absolutePath}.
	 * @param ctx the parse tree
	 */
	void enterAbsolutePath(XPathParser.AbsolutePathContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPathParser#absolutePath}.
	 * @param ctx the parse tree
	 */
	void exitAbsolutePath(XPathParser.AbsolutePathContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPathParser#relativePath}.
	 * @param ctx the parse tree
	 */
	void enterRelativePath(XPathParser.RelativePathContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPathParser#relativePath}.
	 * @param ctx the parse tree
	 */
	void exitRelativePath(XPathParser.RelativePathContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPathParser#children}.
	 * @param ctx the parse tree
	 */
	void enterChildren(XPathParser.ChildrenContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPathParser#children}.
	 * @param ctx the parse tree
	 */
	void exitChildren(XPathParser.ChildrenContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPathParser#current}.
	 * @param ctx the parse tree
	 */
	void enterCurrent(XPathParser.CurrentContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPathParser#current}.
	 * @param ctx the parse tree
	 */
	void exitCurrent(XPathParser.CurrentContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPathParser#parent}.
	 * @param ctx the parse tree
	 */
	void enterParent(XPathParser.ParentContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPathParser#parent}.
	 * @param ctx the parse tree
	 */
	void exitParent(XPathParser.ParentContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPathParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilter(XPathParser.FilterContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPathParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilter(XPathParser.FilterContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPathParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(XPathParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPathParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(XPathParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPathParser#textFunction}.
	 * @param ctx the parse tree
	 */
	void enterTextFunction(XPathParser.TextFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPathParser#textFunction}.
	 * @param ctx the parse tree
	 */
	void exitTextFunction(XPathParser.TextFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPathParser#inParenthesis}.
	 * @param ctx the parse tree
	 */
	void enterInParenthesis(XPathParser.InParenthesisContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPathParser#inParenthesis}.
	 * @param ctx the parse tree
	 */
	void exitInParenthesis(XPathParser.InParenthesisContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPathParser#f}.
	 * @param ctx the parse tree
	 */
	void enterF(XPathParser.FContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPathParser#f}.
	 * @param ctx the parse tree
	 */
	void exitF(XPathParser.FContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPathParser#tagName}.
	 * @param ctx the parse tree
	 */
	void enterTagName(XPathParser.TagNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPathParser#tagName}.
	 * @param ctx the parse tree
	 */
	void exitTagName(XPathParser.TagNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPathParser#attName}.
	 * @param ctx the parse tree
	 */
	void enterAttName(XPathParser.AttNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPathParser#attName}.
	 * @param ctx the parse tree
	 */
	void exitAttName(XPathParser.AttNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPathParser#fileName}.
	 * @param ctx the parse tree
	 */
	void enterFileName(XPathParser.FileNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPathParser#fileName}.
	 * @param ctx the parse tree
	 */
	void exitFileName(XPathParser.FileNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPathParser#stringConstantText}.
	 * @param ctx the parse tree
	 */
	void enterStringConstantText(XPathParser.StringConstantTextContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPathParser#stringConstantText}.
	 * @param ctx the parse tree
	 */
	void exitStringConstantText(XPathParser.StringConstantTextContext ctx);
}
