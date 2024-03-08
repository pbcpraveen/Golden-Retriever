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
	 * Enter a parse tree produced by {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXq(XQueryParser.XqContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXq(XQueryParser.XqContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#stringConstant}.
	 * @param ctx the parse tree
	 */
	void enterStringConstant(XQueryParser.StringConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#stringConstant}.
	 * @param ctx the parse tree
	 */
	void exitStringConstant(XQueryParser.StringConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#xqInParenthesis}.
	 * @param ctx the parse tree
	 */
	void enterXqInParenthesis(XQueryParser.XqInParenthesisContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#xqInParenthesis}.
	 * @param ctx the parse tree
	 */
	void exitXqInParenthesis(XQueryParser.XqInParenthesisContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#newTag}.
	 * @param ctx the parse tree
	 */
	void enterNewTag(XQueryParser.NewTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#newTag}.
	 * @param ctx the parse tree
	 */
	void exitNewTag(XQueryParser.NewTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#forBody}.
	 * @param ctx the parse tree
	 */
	void enterForBody(XQueryParser.ForBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#forBody}.
	 * @param ctx the parse tree
	 */
	void exitForBody(XQueryParser.ForBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#forClause}.
	 * @param ctx the parse tree
	 */
	void enterForClause(XQueryParser.ForClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#forClause}.
	 * @param ctx the parse tree
	 */
	void exitForClause(XQueryParser.ForClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#forVariables}.
	 * @param ctx the parse tree
	 */
	void enterForVariables(XQueryParser.ForVariablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#forVariables}.
	 * @param ctx the parse tree
	 */
	void exitForVariables(XQueryParser.ForVariablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#moreLoopVariables}.
	 * @param ctx the parse tree
	 */
	void enterMoreLoopVariables(XQueryParser.MoreLoopVariablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#moreLoopVariables}.
	 * @param ctx the parse tree
	 */
	void exitMoreLoopVariables(XQueryParser.MoreLoopVariablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#loopVariableAssignment}.
	 * @param ctx the parse tree
	 */
	void enterLoopVariableAssignment(XQueryParser.LoopVariableAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#loopVariableAssignment}.
	 * @param ctx the parse tree
	 */
	void exitLoopVariableAssignment(XQueryParser.LoopVariableAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#letClauseAndXq}.
	 * @param ctx the parse tree
	 */
	void enterLetClauseAndXq(XQueryParser.LetClauseAndXqContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#letClauseAndXq}.
	 * @param ctx the parse tree
	 */
	void exitLetClauseAndXq(XQueryParser.LetClauseAndXqContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#letClause}.
	 * @param ctx the parse tree
	 */
	void enterLetClause(XQueryParser.LetClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#letClause}.
	 * @param ctx the parse tree
	 */
	void exitLetClause(XQueryParser.LetClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#letVariables}.
	 * @param ctx the parse tree
	 */
	void enterLetVariables(XQueryParser.LetVariablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#letVariables}.
	 * @param ctx the parse tree
	 */
	void exitLetVariables(XQueryParser.LetVariablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#moreLetVariables}.
	 * @param ctx the parse tree
	 */
	void enterMoreLetVariables(XQueryParser.MoreLetVariablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#moreLetVariables}.
	 * @param ctx the parse tree
	 */
	void exitMoreLetVariables(XQueryParser.MoreLetVariablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#letVariableAssignment}.
	 * @param ctx the parse tree
	 */
	void enterLetVariableAssignment(XQueryParser.LetVariableAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#letVariableAssignment}.
	 * @param ctx the parse tree
	 */
	void exitLetVariableAssignment(XQueryParser.LetVariableAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void enterWhereClause(XQueryParser.WhereClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void exitWhereClause(XQueryParser.WhereClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond(XQueryParser.CondContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond(XQueryParser.CondContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#emptyCond}.
	 * @param ctx the parse tree
	 */
	void enterEmptyCond(XQueryParser.EmptyCondContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#emptyCond}.
	 * @param ctx the parse tree
	 */
	void exitEmptyCond(XQueryParser.EmptyCondContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#equalityCond}.
	 * @param ctx the parse tree
	 */
	void enterEqualityCond(XQueryParser.EqualityCondContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#equalityCond}.
	 * @param ctx the parse tree
	 */
	void exitEqualityCond(XQueryParser.EqualityCondContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#identicalCond}.
	 * @param ctx the parse tree
	 */
	void enterIdenticalCond(XQueryParser.IdenticalCondContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#identicalCond}.
	 * @param ctx the parse tree
	 */
	void exitIdenticalCond(XQueryParser.IdenticalCondContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#someVarCond}.
	 * @param ctx the parse tree
	 */
	void enterSomeVarCond(XQueryParser.SomeVarCondContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#someVarCond}.
	 * @param ctx the parse tree
	 */
	void exitSomeVarCond(XQueryParser.SomeVarCondContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#parenthesisCond}.
	 * @param ctx the parse tree
	 */
	void enterParenthesisCond(XQueryParser.ParenthesisCondContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#parenthesisCond}.
	 * @param ctx the parse tree
	 */
	void exitParenthesisCond(XQueryParser.ParenthesisCondContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#notCond}.
	 * @param ctx the parse tree
	 */
	void enterNotCond(XQueryParser.NotCondContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#notCond}.
	 * @param ctx the parse tree
	 */
	void exitNotCond(XQueryParser.NotCondContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#returnClause}.
	 * @param ctx the parse tree
	 */
	void enterReturnClause(XQueryParser.ReturnClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#returnClause}.
	 * @param ctx the parse tree
	 */
	void exitReturnClause(XQueryParser.ReturnClauseContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link XQueryParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(XQueryParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(XQueryParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#openTag}.
	 * @param ctx the parse tree
	 */
	void enterOpenTag(XQueryParser.OpenTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#openTag}.
	 * @param ctx the parse tree
	 */
	void exitOpenTag(XQueryParser.OpenTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#closeTag}.
	 * @param ctx the parse tree
	 */
	void enterCloseTag(XQueryParser.CloseTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#closeTag}.
	 * @param ctx the parse tree
	 */
	void exitCloseTag(XQueryParser.CloseTagContext ctx);
}
