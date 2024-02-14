// Generated from XQuery.g by ANTLR 4.13.1
package parser_util;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class XQueryParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DocOpen=1, ImmediateDescendent=2, Descendent=3, Equal=4, Equals=5, Is=6,
		Eq=7, And=8, Or=9, Not=10, Comma=11, OpenBracket=12, CloseBracket=13,
		OpenParen=14, CloseParen=15, At=16, Text=17, Children=18, Current=19,
		Parent=20, StringConstant=21, PathTag=22, Variable=23, For=24, Let=25,
		Some=26, Empty=27, In=28, Where=29, OpenBrace=30, CloseBrace=31, Assign=32,
		Return=33, OpenTag=34, CloseTag=35, WS=36;
	public static final int
		RULE_eval = 0, RULE_xquery = 1, RULE_stringConstant = 2, RULE_variable = 3,
		RULE_xqueryInParenthesis = 4, RULE_newTag = 5, RULE_forBody = 6, RULE_forClause = 7,
		RULE_forVariables = 8, RULE_loopVariableAssignment = 9, RULE_letClause = 10,
		RULE_letVariables = 11, RULE_letVariableAssignment = 12, RULE_whereClause = 13,
		RULE_cond = 14, RULE_emptyCond = 15, RULE_equalityCond = 16, RULE_identicalCond = 17,
		RULE_someVarCond = 18, RULE_parenthesisCond = 19, RULE_notCond = 20, RULE_returnClause = 21,
		RULE_absolutePath = 22, RULE_relativePath = 23, RULE_children = 24, RULE_current = 25,
		RULE_parent = 26, RULE_filter = 27, RULE_attribute = 28, RULE_textFunction = 29,
		RULE_inParenthesis = 30, RULE_f = 31, RULE_tagName = 32, RULE_attName = 33,
		RULE_fileName = 34, RULE_stringConstantText = 35;
	private static String[] makeRuleNames() {
		return new String[] {
			"eval", "xquery", "stringConstant", "variable", "xqueryInParenthesis",
			"newTag", "forBody", "forClause", "forVariables", "loopVariableAssignment",
			"letClause", "letVariables", "letVariableAssignment", "whereClause",
			"cond", "emptyCond", "equalityCond", "identicalCond", "someVarCond",
			"parenthesisCond", "notCond", "returnClause", "absolutePath", "relativePath",
			"children", "current", "parent", "filter", "attribute", "textFunction",
			"inParenthesis", "f", "tagName", "attName", "fileName", "stringConstantText"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'doc('", "'/'", "'//'", "'='", "'=='", "'is'", "'eq'", "'and'",
			"'or'", "'not'", "','", "'['", "']'", "'('", "')'", "'@'", "'text'",
			"'*'", "'.'", "'..'", null, null, null, "'for'", "'let'", "'some'", "'empty'",
			"'in'", "'where'", "'{'", "'}'", "':='", "'return'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DocOpen", "ImmediateDescendent", "Descendent", "Equal", "Equals",
			"Is", "Eq", "And", "Or", "Not", "Comma", "OpenBracket", "CloseBracket",
			"OpenParen", "CloseParen", "At", "Text", "Children", "Current", "Parent",
			"StringConstant", "PathTag", "Variable", "For", "Let", "Some", "Empty",
			"In", "Where", "OpenBrace", "CloseBrace", "Assign", "Return", "OpenTag",
			"CloseTag", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "XQuery.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public XQueryParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EvalContext extends ParserRuleContext {
		public XqueryContext xquery() {
			return getRuleContext(XqueryContext.class,0);
		}
		public EvalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterEval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitEval(this);
		}
	}

	public final EvalContext eval() throws RecognitionException {
		EvalContext _localctx = new EvalContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_eval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			xquery(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class XqueryContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public StringConstantContext stringConstant() {
			return getRuleContext(StringConstantContext.class,0);
		}
		public AbsolutePathContext absolutePath() {
			return getRuleContext(AbsolutePathContext.class,0);
		}
		public XqueryInParenthesisContext xqueryInParenthesis() {
			return getRuleContext(XqueryInParenthesisContext.class,0);
		}
		public NewTagContext newTag() {
			return getRuleContext(NewTagContext.class,0);
		}
		public ForBodyContext forBody() {
			return getRuleContext(ForBodyContext.class,0);
		}
		public LetClauseContext letClause() {
			return getRuleContext(LetClauseContext.class,0);
		}
		public List<XqueryContext> xquery() {
			return getRuleContexts(XqueryContext.class);
		}
		public XqueryContext xquery(int i) {
			return getRuleContext(XqueryContext.class,i);
		}
		public TerminalNode Comma() { return getToken(XQueryParser.Comma, 0); }
		public TerminalNode ImmediateDescendent() { return getToken(XQueryParser.ImmediateDescendent, 0); }
		public RelativePathContext relativePath() {
			return getRuleContext(RelativePathContext.class,0);
		}
		public TerminalNode Descendent() { return getToken(XQueryParser.Descendent, 0); }
		public XqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xquery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterXquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitXquery(this);
		}
	}

	public final XqueryContext xquery() throws RecognitionException {
		return xquery(0);
	}

	private XqueryContext xquery(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		XqueryContext _localctx = new XqueryContext(_ctx, _parentState);
		XqueryContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_xquery, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(75);
				variable();
				}
				break;
			case 2:
				{
				setState(76);
				stringConstant();
				}
				break;
			case 3:
				{
				setState(77);
				absolutePath();
				}
				break;
			case 4:
				{
				setState(78);
				xqueryInParenthesis();
				}
				break;
			case 5:
				{
				setState(79);
				newTag();
				}
				break;
			case 6:
				{
				setState(80);
				forBody();
				}
				break;
			case 7:
				{
				setState(81);
				letClause();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(95);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(93);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new XqueryContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_xquery);
						setState(84);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(85);
						match(Comma);
						setState(86);
						xquery(7);
						}
						break;
					case 2:
						{
						_localctx = new XqueryContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_xquery);
						setState(87);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(88);
						match(ImmediateDescendent);
						setState(89);
						relativePath(0);
						}
						break;
					case 3:
						{
						_localctx = new XqueryContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_xquery);
						setState(90);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(91);
						match(Descendent);
						setState(92);
						relativePath(0);
						}
						break;
					}
					}
				}
				setState(97);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StringConstantContext extends ParserRuleContext {
		public StringConstantTextContext stringConstantText() {
			return getRuleContext(StringConstantTextContext.class,0);
		}
		public StringConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterStringConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitStringConstant(this);
		}
	}

	public final StringConstantContext stringConstant() throws RecognitionException {
		StringConstantContext _localctx = new StringConstantContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_stringConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			stringConstantText();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableContext extends ParserRuleContext {
		public TerminalNode Variable() { return getToken(XQueryParser.Variable, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(Variable);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class XqueryInParenthesisContext extends ParserRuleContext {
		public TerminalNode OpenParen() { return getToken(XQueryParser.OpenParen, 0); }
		public XqueryContext xquery() {
			return getRuleContext(XqueryContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(XQueryParser.CloseParen, 0); }
		public XqueryInParenthesisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xqueryInParenthesis; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterXqueryInParenthesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitXqueryInParenthesis(this);
		}
	}

	public final XqueryInParenthesisContext xqueryInParenthesis() throws RecognitionException {
		XqueryInParenthesisContext _localctx = new XqueryInParenthesisContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_xqueryInParenthesis);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(OpenParen);
			setState(103);
			xquery(0);
			setState(104);
			match(CloseParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NewTagContext extends ParserRuleContext {
		public TerminalNode OpenTag() { return getToken(XQueryParser.OpenTag, 0); }
		public TerminalNode OpenBrace() { return getToken(XQueryParser.OpenBrace, 0); }
		public XqueryContext xquery() {
			return getRuleContext(XqueryContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(XQueryParser.CloseBrace, 0); }
		public TerminalNode CloseTag() { return getToken(XQueryParser.CloseTag, 0); }
		public NewTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterNewTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitNewTag(this);
		}
	}

	public final NewTagContext newTag() throws RecognitionException {
		NewTagContext _localctx = new NewTagContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_newTag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(OpenTag);
			setState(107);
			match(OpenBrace);
			setState(108);
			xquery(0);
			setState(109);
			match(CloseBrace);
			setState(110);
			match(CloseTag);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForBodyContext extends ParserRuleContext {
		public ForClauseContext forClause() {
			return getRuleContext(ForClauseContext.class,0);
		}
		public LetClauseContext letClause() {
			return getRuleContext(LetClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public ReturnClauseContext returnClause() {
			return getRuleContext(ReturnClauseContext.class,0);
		}
		public ForBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterForBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitForBody(this);
		}
	}

	public final ForBodyContext forBody() throws RecognitionException {
		ForBodyContext _localctx = new ForBodyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_forBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			forClause();
			setState(113);
			letClause();
			setState(114);
			whereClause();
			setState(115);
			returnClause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForClauseContext extends ParserRuleContext {
		public TerminalNode For() { return getToken(XQueryParser.For, 0); }
		public ForVariablesContext forVariables() {
			return getRuleContext(ForVariablesContext.class,0);
		}
		public TerminalNode In() { return getToken(XQueryParser.In, 0); }
		public XqueryContext xquery() {
			return getRuleContext(XqueryContext.class,0);
		}
		public ForClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterForClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitForClause(this);
		}
	}

	public final ForClauseContext forClause() throws RecognitionException {
		ForClauseContext _localctx = new ForClauseContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_forClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(For);
			setState(118);
			forVariables();
			setState(119);
			match(In);
			setState(120);
			xquery(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForVariablesContext extends ParserRuleContext {
		public LoopVariableAssignmentContext loopVariableAssignment() {
			return getRuleContext(LoopVariableAssignmentContext.class,0);
		}
		public TerminalNode Comma() { return getToken(XQueryParser.Comma, 0); }
		public ForVariablesContext forVariables() {
			return getRuleContext(ForVariablesContext.class,0);
		}
		public ForVariablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forVariables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterForVariables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitForVariables(this);
		}
	}

	public final ForVariablesContext forVariables() throws RecognitionException {
		ForVariablesContext _localctx = new ForVariablesContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_forVariables);
		try {
			setState(127);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				loopVariableAssignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(123);
				loopVariableAssignment();
				setState(124);
				match(Comma);
				setState(125);
				forVariables();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LoopVariableAssignmentContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode In() { return getToken(XQueryParser.In, 0); }
		public XqueryContext xquery() {
			return getRuleContext(XqueryContext.class,0);
		}
		public LoopVariableAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopVariableAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterLoopVariableAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitLoopVariableAssignment(this);
		}
	}

	public final LoopVariableAssignmentContext loopVariableAssignment() throws RecognitionException {
		LoopVariableAssignmentContext _localctx = new LoopVariableAssignmentContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_loopVariableAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			variable();
			setState(130);
			match(In);
			setState(131);
			xquery(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LetClauseContext extends ParserRuleContext {
		public TerminalNode Let() { return getToken(XQueryParser.Let, 0); }
		public LetVariablesContext letVariables() {
			return getRuleContext(LetVariablesContext.class,0);
		}
		public LetClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterLetClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitLetClause(this);
		}
	}

	public final LetClauseContext letClause() throws RecognitionException {
		LetClauseContext _localctx = new LetClauseContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_letClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(133);
				match(Let);
				setState(134);
				letVariables();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LetVariablesContext extends ParserRuleContext {
		public LetVariableAssignmentContext letVariableAssignment() {
			return getRuleContext(LetVariableAssignmentContext.class,0);
		}
		public TerminalNode Comma() { return getToken(XQueryParser.Comma, 0); }
		public LetVariablesContext letVariables() {
			return getRuleContext(LetVariablesContext.class,0);
		}
		public LetVariablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letVariables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterLetVariables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitLetVariables(this);
		}
	}

	public final LetVariablesContext letVariables() throws RecognitionException {
		LetVariablesContext _localctx = new LetVariablesContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_letVariables);
		try {
			setState(142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				letVariableAssignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(138);
				letVariableAssignment();
				setState(139);
				match(Comma);
				setState(140);
				letVariables();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LetVariableAssignmentContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode Assign() { return getToken(XQueryParser.Assign, 0); }
		public XqueryContext xquery() {
			return getRuleContext(XqueryContext.class,0);
		}
		public LetVariableAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letVariableAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterLetVariableAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitLetVariableAssignment(this);
		}
	}

	public final LetVariableAssignmentContext letVariableAssignment() throws RecognitionException {
		LetVariableAssignmentContext _localctx = new LetVariableAssignmentContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_letVariableAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			variable();
			setState(145);
			match(Assign);
			setState(146);
			xquery(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WhereClauseContext extends ParserRuleContext {
		public TerminalNode Where() { return getToken(XQueryParser.Where, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterWhereClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitWhereClause(this);
		}
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_whereClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Where) {
				{
				setState(148);
				match(Where);
				setState(149);
				cond(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CondContext extends ParserRuleContext {
		public EmptyCondContext emptyCond() {
			return getRuleContext(EmptyCondContext.class,0);
		}
		public EqualityCondContext equalityCond() {
			return getRuleContext(EqualityCondContext.class,0);
		}
		public IdenticalCondContext identicalCond() {
			return getRuleContext(IdenticalCondContext.class,0);
		}
		public SomeVarCondContext someVarCond() {
			return getRuleContext(SomeVarCondContext.class,0);
		}
		public ParenthesisCondContext parenthesisCond() {
			return getRuleContext(ParenthesisCondContext.class,0);
		}
		public NotCondContext notCond() {
			return getRuleContext(NotCondContext.class,0);
		}
		public List<CondContext> cond() {
			return getRuleContexts(CondContext.class);
		}
		public CondContext cond(int i) {
			return getRuleContext(CondContext.class,i);
		}
		public TerminalNode And() { return getToken(XQueryParser.And, 0); }
		public TerminalNode Or() { return getToken(XQueryParser.Or, 0); }
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitCond(this);
		}
	}

	public final CondContext cond() throws RecognitionException {
		return cond(0);
	}

	private CondContext cond(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CondContext _localctx = new CondContext(_ctx, _parentState);
		CondContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_cond, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(153);
				emptyCond();
				}
				break;
			case 2:
				{
				setState(154);
				equalityCond();
				}
				break;
			case 3:
				{
				setState(155);
				identicalCond();
				}
				break;
			case 4:
				{
				setState(156);
				someVarCond();
				}
				break;
			case 5:
				{
				setState(157);
				parenthesisCond();
				}
				break;
			case 6:
				{
				setState(158);
				notCond();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(169);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(167);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new CondContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_cond);
						setState(161);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(162);
						match(And);
						setState(163);
						cond(4);
						}
						break;
					case 2:
						{
						_localctx = new CondContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_cond);
						setState(164);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(165);
						match(Or);
						setState(166);
						cond(3);
						}
						break;
					}
					}
				}
				setState(171);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EmptyCondContext extends ParserRuleContext {
		public TerminalNode Empty() { return getToken(XQueryParser.Empty, 0); }
		public TerminalNode OpenParen() { return getToken(XQueryParser.OpenParen, 0); }
		public XqueryContext xquery() {
			return getRuleContext(XqueryContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(XQueryParser.CloseParen, 0); }
		public EmptyCondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyCond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterEmptyCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitEmptyCond(this);
		}
	}

	public final EmptyCondContext emptyCond() throws RecognitionException {
		EmptyCondContext _localctx = new EmptyCondContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_emptyCond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(Empty);
			setState(173);
			match(OpenParen);
			setState(174);
			xquery(0);
			setState(175);
			match(CloseParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EqualityCondContext extends ParserRuleContext {
		public List<XqueryContext> xquery() {
			return getRuleContexts(XqueryContext.class);
		}
		public XqueryContext xquery(int i) {
			return getRuleContext(XqueryContext.class,i);
		}
		public TerminalNode Equal() { return getToken(XQueryParser.Equal, 0); }
		public TerminalNode Eq() { return getToken(XQueryParser.Eq, 0); }
		public EqualityCondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityCond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterEqualityCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitEqualityCond(this);
		}
	}

	public final EqualityCondContext equalityCond() throws RecognitionException {
		EqualityCondContext _localctx = new EqualityCondContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_equalityCond);
		try {
			setState(185);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(177);
				xquery(0);
				setState(178);
				match(Equal);
				setState(179);
				xquery(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(181);
				xquery(0);
				setState(182);
				match(Eq);
				setState(183);
				xquery(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdenticalCondContext extends ParserRuleContext {
		public List<XqueryContext> xquery() {
			return getRuleContexts(XqueryContext.class);
		}
		public XqueryContext xquery(int i) {
			return getRuleContext(XqueryContext.class,i);
		}
		public TerminalNode Equals() { return getToken(XQueryParser.Equals, 0); }
		public TerminalNode Is() { return getToken(XQueryParser.Is, 0); }
		public IdenticalCondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identicalCond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterIdenticalCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitIdenticalCond(this);
		}
	}

	public final IdenticalCondContext identicalCond() throws RecognitionException {
		IdenticalCondContext _localctx = new IdenticalCondContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_identicalCond);
		try {
			setState(195);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(187);
				xquery(0);
				setState(188);
				match(Equals);
				setState(189);
				xquery(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(191);
				xquery(0);
				setState(192);
				match(Is);
				setState(193);
				xquery(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SomeVarCondContext extends ParserRuleContext {
		public TerminalNode Some() { return getToken(XQueryParser.Some, 0); }
		public ForVariablesContext forVariables() {
			return getRuleContext(ForVariablesContext.class,0);
		}
		public TerminalNode In() { return getToken(XQueryParser.In, 0); }
		public XqueryContext xquery() {
			return getRuleContext(XqueryContext.class,0);
		}
		public SomeVarCondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_someVarCond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterSomeVarCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitSomeVarCond(this);
		}
	}

	public final SomeVarCondContext someVarCond() throws RecognitionException {
		SomeVarCondContext _localctx = new SomeVarCondContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_someVarCond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(Some);
			setState(198);
			forVariables();
			setState(199);
			match(In);
			setState(200);
			xquery(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParenthesisCondContext extends ParserRuleContext {
		public TerminalNode OpenParen() { return getToken(XQueryParser.OpenParen, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(XQueryParser.CloseParen, 0); }
		public ParenthesisCondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parenthesisCond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterParenthesisCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitParenthesisCond(this);
		}
	}

	public final ParenthesisCondContext parenthesisCond() throws RecognitionException {
		ParenthesisCondContext _localctx = new ParenthesisCondContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_parenthesisCond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(OpenParen);
			setState(203);
			cond(0);
			setState(204);
			match(CloseParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NotCondContext extends ParserRuleContext {
		public TerminalNode Not() { return getToken(XQueryParser.Not, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public NotCondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notCond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterNotCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitNotCond(this);
		}
	}

	public final NotCondContext notCond() throws RecognitionException {
		NotCondContext _localctx = new NotCondContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_notCond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(Not);
			setState(207);
			cond(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnClauseContext extends ParserRuleContext {
		public TerminalNode Return() { return getToken(XQueryParser.Return, 0); }
		public XqueryContext xquery() {
			return getRuleContext(XqueryContext.class,0);
		}
		public ReturnClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterReturnClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitReturnClause(this);
		}
	}

	public final ReturnClauseContext returnClause() throws RecognitionException {
		ReturnClauseContext _localctx = new ReturnClauseContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_returnClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(Return);
			setState(210);
			xquery(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AbsolutePathContext extends ParserRuleContext {
		public TerminalNode DocOpen() { return getToken(XQueryParser.DocOpen, 0); }
		public FileNameContext fileName() {
			return getRuleContext(FileNameContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(XQueryParser.CloseParen, 0); }
		public TerminalNode ImmediateDescendent() { return getToken(XQueryParser.ImmediateDescendent, 0); }
		public RelativePathContext relativePath() {
			return getRuleContext(RelativePathContext.class,0);
		}
		public TerminalNode Descendent() { return getToken(XQueryParser.Descendent, 0); }
		public AbsolutePathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_absolutePath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterAbsolutePath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitAbsolutePath(this);
		}
	}

	public final AbsolutePathContext absolutePath() throws RecognitionException {
		AbsolutePathContext _localctx = new AbsolutePathContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_absolutePath);
		try {
			setState(224);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(212);
				match(DocOpen);
				setState(213);
				fileName();
				setState(214);
				match(CloseParen);
				setState(215);
				match(ImmediateDescendent);
				setState(216);
				relativePath(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(218);
				match(DocOpen);
				setState(219);
				fileName();
				setState(220);
				match(CloseParen);
				setState(221);
				match(Descendent);
				setState(222);
				relativePath(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RelativePathContext extends ParserRuleContext {
		public TagNameContext tagName() {
			return getRuleContext(TagNameContext.class,0);
		}
		public ChildrenContext children() {
			return getRuleContext(ChildrenContext.class,0);
		}
		public CurrentContext current() {
			return getRuleContext(CurrentContext.class,0);
		}
		public ParentContext parent() {
			return getRuleContext(ParentContext.class,0);
		}
		public TextFunctionContext textFunction() {
			return getRuleContext(TextFunctionContext.class,0);
		}
		public AttributeContext attribute() {
			return getRuleContext(AttributeContext.class,0);
		}
		public InParenthesisContext inParenthesis() {
			return getRuleContext(InParenthesisContext.class,0);
		}
		public List<RelativePathContext> relativePath() {
			return getRuleContexts(RelativePathContext.class);
		}
		public RelativePathContext relativePath(int i) {
			return getRuleContext(RelativePathContext.class,i);
		}
		public TerminalNode ImmediateDescendent() { return getToken(XQueryParser.ImmediateDescendent, 0); }
		public TerminalNode Descendent() { return getToken(XQueryParser.Descendent, 0); }
		public TerminalNode Comma() { return getToken(XQueryParser.Comma, 0); }
		public FilterContext filter() {
			return getRuleContext(FilterContext.class,0);
		}
		public RelativePathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relativePath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterRelativePath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitRelativePath(this);
		}
	}

	public final RelativePathContext relativePath() throws RecognitionException {
		return relativePath(0);
	}

	private RelativePathContext relativePath(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RelativePathContext _localctx = new RelativePathContext(_ctx, _parentState);
		RelativePathContext _prevctx = _localctx;
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_relativePath, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PathTag:
				{
				setState(227);
				tagName();
				}
				break;
			case Children:
				{
				setState(228);
				children();
				}
				break;
			case Current:
				{
				setState(229);
				current();
				}
				break;
			case Parent:
				{
				setState(230);
				parent();
				}
				break;
			case Text:
				{
				setState(231);
				textFunction();
				}
				break;
			case At:
				{
				setState(232);
				attribute();
				}
				break;
			case OpenParen:
				{
				setState(233);
				inParenthesis();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(249);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(247);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new RelativePathContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relativePath);
						setState(236);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(237);
						match(ImmediateDescendent);
						setState(238);
						relativePath(5);
						}
						break;
					case 2:
						{
						_localctx = new RelativePathContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relativePath);
						setState(239);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(240);
						match(Descendent);
						setState(241);
						relativePath(4);
						}
						break;
					case 3:
						{
						_localctx = new RelativePathContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relativePath);
						setState(242);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(243);
						match(Comma);
						setState(244);
						relativePath(2);
						}
						break;
					case 4:
						{
						_localctx = new RelativePathContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relativePath);
						setState(245);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(246);
						filter();
						}
						break;
					}
					}
				}
				setState(251);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ChildrenContext extends ParserRuleContext {
		public TerminalNode Children() { return getToken(XQueryParser.Children, 0); }
		public ChildrenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_children; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterChildren(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitChildren(this);
		}
	}

	public final ChildrenContext children() throws RecognitionException {
		ChildrenContext _localctx = new ChildrenContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_children);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(Children);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CurrentContext extends ParserRuleContext {
		public TerminalNode Current() { return getToken(XQueryParser.Current, 0); }
		public CurrentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_current; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterCurrent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitCurrent(this);
		}
	}

	public final CurrentContext current() throws RecognitionException {
		CurrentContext _localctx = new CurrentContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_current);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			match(Current);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParentContext extends ParserRuleContext {
		public TerminalNode Parent() { return getToken(XQueryParser.Parent, 0); }
		public ParentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterParent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitParent(this);
		}
	}

	public final ParentContext parent() throws RecognitionException {
		ParentContext _localctx = new ParentContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_parent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			match(Parent);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FilterContext extends ParserRuleContext {
		public TerminalNode OpenBracket() { return getToken(XQueryParser.OpenBracket, 0); }
		public FContext f() {
			return getRuleContext(FContext.class,0);
		}
		public TerminalNode CloseBracket() { return getToken(XQueryParser.CloseBracket, 0); }
		public FilterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterFilter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitFilter(this);
		}
	}

	public final FilterContext filter() throws RecognitionException {
		FilterContext _localctx = new FilterContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_filter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			match(OpenBracket);
			setState(259);
			f(0);
			setState(260);
			match(CloseBracket);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AttributeContext extends ParserRuleContext {
		public TerminalNode At() { return getToken(XQueryParser.At, 0); }
		public AttNameContext attName() {
			return getRuleContext(AttNameContext.class,0);
		}
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitAttribute(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(At);
			setState(263);
			attName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TextFunctionContext extends ParserRuleContext {
		public TerminalNode Text() { return getToken(XQueryParser.Text, 0); }
		public TerminalNode OpenParen() { return getToken(XQueryParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(XQueryParser.CloseParen, 0); }
		public TextFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterTextFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitTextFunction(this);
		}
	}

	public final TextFunctionContext textFunction() throws RecognitionException {
		TextFunctionContext _localctx = new TextFunctionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_textFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(Text);
			setState(266);
			match(OpenParen);
			setState(267);
			match(CloseParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InParenthesisContext extends ParserRuleContext {
		public TerminalNode OpenParen() { return getToken(XQueryParser.OpenParen, 0); }
		public RelativePathContext relativePath() {
			return getRuleContext(RelativePathContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(XQueryParser.CloseParen, 0); }
		public InParenthesisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inParenthesis; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterInParenthesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitInParenthesis(this);
		}
	}

	public final InParenthesisContext inParenthesis() throws RecognitionException {
		InParenthesisContext _localctx = new InParenthesisContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_inParenthesis);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			match(OpenParen);
			setState(270);
			relativePath(0);
			setState(271);
			match(CloseParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FContext extends ParserRuleContext {
		public List<RelativePathContext> relativePath() {
			return getRuleContexts(RelativePathContext.class);
		}
		public RelativePathContext relativePath(int i) {
			return getRuleContext(RelativePathContext.class,i);
		}
		public TerminalNode Equal() { return getToken(XQueryParser.Equal, 0); }
		public TerminalNode Eq() { return getToken(XQueryParser.Eq, 0); }
		public TerminalNode Equals() { return getToken(XQueryParser.Equals, 0); }
		public TerminalNode Is() { return getToken(XQueryParser.Is, 0); }
		public StringConstantTextContext stringConstantText() {
			return getRuleContext(StringConstantTextContext.class,0);
		}
		public TerminalNode OpenParen() { return getToken(XQueryParser.OpenParen, 0); }
		public List<FContext> f() {
			return getRuleContexts(FContext.class);
		}
		public FContext f(int i) {
			return getRuleContext(FContext.class,i);
		}
		public TerminalNode CloseParen() { return getToken(XQueryParser.CloseParen, 0); }
		public TerminalNode Not() { return getToken(XQueryParser.Not, 0); }
		public TerminalNode And() { return getToken(XQueryParser.And, 0); }
		public TerminalNode Or() { return getToken(XQueryParser.Or, 0); }
		public FContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_f; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitF(this);
		}
	}

	public final FContext f() throws RecognitionException {
		return f(0);
	}

	private FContext f(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		FContext _localctx = new FContext(_ctx, _parentState);
		FContext _prevctx = _localctx;
		int _startState = 62;
		enterRecursionRule(_localctx, 62, RULE_f, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(274);
				relativePath(0);
				}
				break;
			case 2:
				{
				setState(275);
				relativePath(0);
				setState(276);
				match(Equal);
				setState(277);
				relativePath(0);
				}
				break;
			case 3:
				{
				setState(279);
				relativePath(0);
				setState(280);
				match(Eq);
				setState(281);
				relativePath(0);
				}
				break;
			case 4:
				{
				setState(283);
				relativePath(0);
				setState(284);
				match(Equals);
				setState(285);
				relativePath(0);
				}
				break;
			case 5:
				{
				setState(287);
				relativePath(0);
				setState(288);
				match(Is);
				setState(289);
				relativePath(0);
				}
				break;
			case 6:
				{
				setState(291);
				relativePath(0);
				setState(292);
				match(Equal);
				setState(293);
				stringConstantText();
				}
				break;
			case 7:
				{
				setState(295);
				match(OpenParen);
				setState(296);
				f(0);
				setState(297);
				match(CloseParen);
				}
				break;
			case 8:
				{
				setState(299);
				match(Not);
				setState(300);
				f(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(311);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(309);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new FContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_f);
						setState(303);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(304);
						match(And);
						setState(305);
						f(4);
						}
						break;
					case 2:
						{
						_localctx = new FContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_f);
						setState(306);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(307);
						match(Or);
						setState(308);
						f(3);
						}
						break;
					}
					}
				}
				setState(313);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TagNameContext extends ParserRuleContext {
		public TerminalNode PathTag() { return getToken(XQueryParser.PathTag, 0); }
		public TagNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tagName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterTagName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitTagName(this);
		}
	}

	public final TagNameContext tagName() throws RecognitionException {
		TagNameContext _localctx = new TagNameContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_tagName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			match(PathTag);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AttNameContext extends ParserRuleContext {
		public TerminalNode StringConstant() { return getToken(XQueryParser.StringConstant, 0); }
		public AttNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterAttName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitAttName(this);
		}
	}

	public final AttNameContext attName() throws RecognitionException {
		AttNameContext _localctx = new AttNameContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_attName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			match(StringConstant);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FileNameContext extends ParserRuleContext {
		public TerminalNode StringConstant() { return getToken(XQueryParser.StringConstant, 0); }
		public FileNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterFileName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitFileName(this);
		}
	}

	public final FileNameContext fileName() throws RecognitionException {
		FileNameContext _localctx = new FileNameContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_fileName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			match(StringConstant);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StringConstantTextContext extends ParserRuleContext {
		public TerminalNode StringConstant() { return getToken(XQueryParser.StringConstant, 0); }
		public StringConstantTextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringConstantText; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterStringConstantText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitStringConstantText(this);
		}
	}

	public final StringConstantTextContext stringConstantText() throws RecognitionException {
		StringConstantTextContext _localctx = new StringConstantTextContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_stringConstantText);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			match(StringConstant);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return xquery_sempred((XqueryContext)_localctx, predIndex);
		case 14:
			return cond_sempred((CondContext)_localctx, predIndex);
		case 23:
			return relativePath_sempred((RelativePathContext)_localctx, predIndex);
		case 31:
			return f_sempred((FContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean xquery_sempred(XqueryContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean cond_sempred(CondContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean relativePath_sempred(RelativePathContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 4);
		case 6:
			return precpred(_ctx, 3);
		case 7:
			return precpred(_ctx, 1);
		case 8:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean f_sempred(FContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 3);
		case 10:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001$\u0143\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001S\b"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001^\b\u0001\n\u0001"+
		"\f\u0001a\t\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u0080"+
		"\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0003\n\u0088\b\n"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b"+
		"\u008f\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0003\r"+
		"\u0097\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0003\u000e\u00a0\b\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u00a8\b\u000e"+
		"\n\u000e\f\u000e\u00ab\t\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00ba\b\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0003\u0011\u00c4\b\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0003\u0016\u00e1\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u00eb"+
		"\b\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0005"+
		"\u0017\u00f8\b\u0017\n\u0017\f\u0017\u00fb\t\u0017\u0001\u0018\u0001\u0018"+
		"\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f"+
		"\u012e\b\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0005\u001f\u0136\b\u001f\n\u001f\f\u001f\u0139\t\u001f\u0001"+
		" \u0001 \u0001!\u0001!\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0000\u0004"+
		"\u0002\u001c.>$\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDF\u0000\u0000\u0148"+
		"\u0000H\u0001\u0000\u0000\u0000\u0002R\u0001\u0000\u0000\u0000\u0004b"+
		"\u0001\u0000\u0000\u0000\u0006d\u0001\u0000\u0000\u0000\bf\u0001\u0000"+
		"\u0000\u0000\nj\u0001\u0000\u0000\u0000\fp\u0001\u0000\u0000\u0000\u000e"+
		"u\u0001\u0000\u0000\u0000\u0010\u007f\u0001\u0000\u0000\u0000\u0012\u0081"+
		"\u0001\u0000\u0000\u0000\u0014\u0087\u0001\u0000\u0000\u0000\u0016\u008e"+
		"\u0001\u0000\u0000\u0000\u0018\u0090\u0001\u0000\u0000\u0000\u001a\u0096"+
		"\u0001\u0000\u0000\u0000\u001c\u009f\u0001\u0000\u0000\u0000\u001e\u00ac"+
		"\u0001\u0000\u0000\u0000 \u00b9\u0001\u0000\u0000\u0000\"\u00c3\u0001"+
		"\u0000\u0000\u0000$\u00c5\u0001\u0000\u0000\u0000&\u00ca\u0001\u0000\u0000"+
		"\u0000(\u00ce\u0001\u0000\u0000\u0000*\u00d1\u0001\u0000\u0000\u0000,"+
		"\u00e0\u0001\u0000\u0000\u0000.\u00ea\u0001\u0000\u0000\u00000\u00fc\u0001"+
		"\u0000\u0000\u00002\u00fe\u0001\u0000\u0000\u00004\u0100\u0001\u0000\u0000"+
		"\u00006\u0102\u0001\u0000\u0000\u00008\u0106\u0001\u0000\u0000\u0000:"+
		"\u0109\u0001\u0000\u0000\u0000<\u010d\u0001\u0000\u0000\u0000>\u012d\u0001"+
		"\u0000\u0000\u0000@\u013a\u0001\u0000\u0000\u0000B\u013c\u0001\u0000\u0000"+
		"\u0000D\u013e\u0001\u0000\u0000\u0000F\u0140\u0001\u0000\u0000\u0000H"+
		"I\u0003\u0002\u0001\u0000I\u0001\u0001\u0000\u0000\u0000JK\u0006\u0001"+
		"\uffff\uffff\u0000KS\u0003\u0006\u0003\u0000LS\u0003\u0004\u0002\u0000"+
		"MS\u0003,\u0016\u0000NS\u0003\b\u0004\u0000OS\u0003\n\u0005\u0000PS\u0003"+
		"\f\u0006\u0000QS\u0003\u0014\n\u0000RJ\u0001\u0000\u0000\u0000RL\u0001"+
		"\u0000\u0000\u0000RM\u0001\u0000\u0000\u0000RN\u0001\u0000\u0000\u0000"+
		"RO\u0001\u0000\u0000\u0000RP\u0001\u0000\u0000\u0000RQ\u0001\u0000\u0000"+
		"\u0000S_\u0001\u0000\u0000\u0000TU\n\u0006\u0000\u0000UV\u0005\u000b\u0000"+
		"\u0000V^\u0003\u0002\u0001\u0007WX\n\u0005\u0000\u0000XY\u0005\u0002\u0000"+
		"\u0000Y^\u0003.\u0017\u0000Z[\n\u0004\u0000\u0000[\\\u0005\u0003\u0000"+
		"\u0000\\^\u0003.\u0017\u0000]T\u0001\u0000\u0000\u0000]W\u0001\u0000\u0000"+
		"\u0000]Z\u0001\u0000\u0000\u0000^a\u0001\u0000\u0000\u0000_]\u0001\u0000"+
		"\u0000\u0000_`\u0001\u0000\u0000\u0000`\u0003\u0001\u0000\u0000\u0000"+
		"a_\u0001\u0000\u0000\u0000bc\u0003F#\u0000c\u0005\u0001\u0000\u0000\u0000"+
		"de\u0005\u0017\u0000\u0000e\u0007\u0001\u0000\u0000\u0000fg\u0005\u000e"+
		"\u0000\u0000gh\u0003\u0002\u0001\u0000hi\u0005\u000f\u0000\u0000i\t\u0001"+
		"\u0000\u0000\u0000jk\u0005\"\u0000\u0000kl\u0005\u001e\u0000\u0000lm\u0003"+
		"\u0002\u0001\u0000mn\u0005\u001f\u0000\u0000no\u0005#\u0000\u0000o\u000b"+
		"\u0001\u0000\u0000\u0000pq\u0003\u000e\u0007\u0000qr\u0003\u0014\n\u0000"+
		"rs\u0003\u001a\r\u0000st\u0003*\u0015\u0000t\r\u0001\u0000\u0000\u0000"+
		"uv\u0005\u0018\u0000\u0000vw\u0003\u0010\b\u0000wx\u0005\u001c\u0000\u0000"+
		"xy\u0003\u0002\u0001\u0000y\u000f\u0001\u0000\u0000\u0000z\u0080\u0003"+
		"\u0012\t\u0000{|\u0003\u0012\t\u0000|}\u0005\u000b\u0000\u0000}~\u0003"+
		"\u0010\b\u0000~\u0080\u0001\u0000\u0000\u0000\u007fz\u0001\u0000\u0000"+
		"\u0000\u007f{\u0001\u0000\u0000\u0000\u0080\u0011\u0001\u0000\u0000\u0000"+
		"\u0081\u0082\u0003\u0006\u0003\u0000\u0082\u0083\u0005\u001c\u0000\u0000"+
		"\u0083\u0084\u0003\u0002\u0001\u0000\u0084\u0013\u0001\u0000\u0000\u0000"+
		"\u0085\u0086\u0005\u0019\u0000\u0000\u0086\u0088\u0003\u0016\u000b\u0000"+
		"\u0087\u0085\u0001\u0000\u0000\u0000\u0087\u0088\u0001\u0000\u0000\u0000"+
		"\u0088\u0015\u0001\u0000\u0000\u0000\u0089\u008f\u0003\u0018\f\u0000\u008a"+
		"\u008b\u0003\u0018\f\u0000\u008b\u008c\u0005\u000b\u0000\u0000\u008c\u008d"+
		"\u0003\u0016\u000b\u0000\u008d\u008f\u0001\u0000\u0000\u0000\u008e\u0089"+
		"\u0001\u0000\u0000\u0000\u008e\u008a\u0001\u0000\u0000\u0000\u008f\u0017"+
		"\u0001\u0000\u0000\u0000\u0090\u0091\u0003\u0006\u0003\u0000\u0091\u0092"+
		"\u0005 \u0000\u0000\u0092\u0093\u0003\u0002\u0001\u0000\u0093\u0019\u0001"+
		"\u0000\u0000\u0000\u0094\u0095\u0005\u001d\u0000\u0000\u0095\u0097\u0003"+
		"\u001c\u000e\u0000\u0096\u0094\u0001\u0000\u0000\u0000\u0096\u0097\u0001"+
		"\u0000\u0000\u0000\u0097\u001b\u0001\u0000\u0000\u0000\u0098\u0099\u0006"+
		"\u000e\uffff\uffff\u0000\u0099\u00a0\u0003\u001e\u000f\u0000\u009a\u00a0"+
		"\u0003 \u0010\u0000\u009b\u00a0\u0003\"\u0011\u0000\u009c\u00a0\u0003"+
		"$\u0012\u0000\u009d\u00a0\u0003&\u0013\u0000\u009e\u00a0\u0003(\u0014"+
		"\u0000\u009f\u0098\u0001\u0000\u0000\u0000\u009f\u009a\u0001\u0000\u0000"+
		"\u0000\u009f\u009b\u0001\u0000\u0000\u0000\u009f\u009c\u0001\u0000\u0000"+
		"\u0000\u009f\u009d\u0001\u0000\u0000\u0000\u009f\u009e\u0001\u0000\u0000"+
		"\u0000\u00a0\u00a9\u0001\u0000\u0000\u0000\u00a1\u00a2\n\u0003\u0000\u0000"+
		"\u00a2\u00a3\u0005\b\u0000\u0000\u00a3\u00a8\u0003\u001c\u000e\u0004\u00a4"+
		"\u00a5\n\u0002\u0000\u0000\u00a5\u00a6\u0005\t\u0000\u0000\u00a6\u00a8"+
		"\u0003\u001c\u000e\u0003\u00a7\u00a1\u0001\u0000\u0000\u0000\u00a7\u00a4"+
		"\u0001\u0000\u0000\u0000\u00a8\u00ab\u0001\u0000\u0000\u0000\u00a9\u00a7"+
		"\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000\u0000\u0000\u00aa\u001d"+
		"\u0001\u0000\u0000\u0000\u00ab\u00a9\u0001\u0000\u0000\u0000\u00ac\u00ad"+
		"\u0005\u001b\u0000\u0000\u00ad\u00ae\u0005\u000e\u0000\u0000\u00ae\u00af"+
		"\u0003\u0002\u0001\u0000\u00af\u00b0\u0005\u000f\u0000\u0000\u00b0\u001f"+
		"\u0001\u0000\u0000\u0000\u00b1\u00b2\u0003\u0002\u0001\u0000\u00b2\u00b3"+
		"\u0005\u0004\u0000\u0000\u00b3\u00b4\u0003\u0002\u0001\u0000\u00b4\u00ba"+
		"\u0001\u0000\u0000\u0000\u00b5\u00b6\u0003\u0002\u0001\u0000\u00b6\u00b7"+
		"\u0005\u0007\u0000\u0000\u00b7\u00b8\u0003\u0002\u0001\u0000\u00b8\u00ba"+
		"\u0001\u0000\u0000\u0000\u00b9\u00b1\u0001\u0000\u0000\u0000\u00b9\u00b5"+
		"\u0001\u0000\u0000\u0000\u00ba!\u0001\u0000\u0000\u0000\u00bb\u00bc\u0003"+
		"\u0002\u0001\u0000\u00bc\u00bd\u0005\u0005\u0000\u0000\u00bd\u00be\u0003"+
		"\u0002\u0001\u0000\u00be\u00c4\u0001\u0000\u0000\u0000\u00bf\u00c0\u0003"+
		"\u0002\u0001\u0000\u00c0\u00c1\u0005\u0006\u0000\u0000\u00c1\u00c2\u0003"+
		"\u0002\u0001\u0000\u00c2\u00c4\u0001\u0000\u0000\u0000\u00c3\u00bb\u0001"+
		"\u0000\u0000\u0000\u00c3\u00bf\u0001\u0000\u0000\u0000\u00c4#\u0001\u0000"+
		"\u0000\u0000\u00c5\u00c6\u0005\u001a\u0000\u0000\u00c6\u00c7\u0003\u0010"+
		"\b\u0000\u00c7\u00c8\u0005\u001c\u0000\u0000\u00c8\u00c9\u0003\u0002\u0001"+
		"\u0000\u00c9%\u0001\u0000\u0000\u0000\u00ca\u00cb\u0005\u000e\u0000\u0000"+
		"\u00cb\u00cc\u0003\u001c\u000e\u0000\u00cc\u00cd\u0005\u000f\u0000\u0000"+
		"\u00cd\'\u0001\u0000\u0000\u0000\u00ce\u00cf\u0005\n\u0000\u0000\u00cf"+
		"\u00d0\u0003\u001c\u000e\u0000\u00d0)\u0001\u0000\u0000\u0000\u00d1\u00d2"+
		"\u0005!\u0000\u0000\u00d2\u00d3\u0003\u0002\u0001\u0000\u00d3+\u0001\u0000"+
		"\u0000\u0000\u00d4\u00d5\u0005\u0001\u0000\u0000\u00d5\u00d6\u0003D\""+
		"\u0000\u00d6\u00d7\u0005\u000f\u0000\u0000\u00d7\u00d8\u0005\u0002\u0000"+
		"\u0000\u00d8\u00d9\u0003.\u0017\u0000\u00d9\u00e1\u0001\u0000\u0000\u0000"+
		"\u00da\u00db\u0005\u0001\u0000\u0000\u00db\u00dc\u0003D\"\u0000\u00dc"+
		"\u00dd\u0005\u000f\u0000\u0000\u00dd\u00de\u0005\u0003\u0000\u0000\u00de"+
		"\u00df\u0003.\u0017\u0000\u00df\u00e1\u0001\u0000\u0000\u0000\u00e0\u00d4"+
		"\u0001\u0000\u0000\u0000\u00e0\u00da\u0001\u0000\u0000\u0000\u00e1-\u0001"+
		"\u0000\u0000\u0000\u00e2\u00e3\u0006\u0017\uffff\uffff\u0000\u00e3\u00eb"+
		"\u0003@ \u0000\u00e4\u00eb\u00030\u0018\u0000\u00e5\u00eb\u00032\u0019"+
		"\u0000\u00e6\u00eb\u00034\u001a\u0000\u00e7\u00eb\u0003:\u001d\u0000\u00e8"+
		"\u00eb\u00038\u001c\u0000\u00e9\u00eb\u0003<\u001e\u0000\u00ea\u00e2\u0001"+
		"\u0000\u0000\u0000\u00ea\u00e4\u0001\u0000\u0000\u0000\u00ea\u00e5\u0001"+
		"\u0000\u0000\u0000\u00ea\u00e6\u0001\u0000\u0000\u0000\u00ea\u00e7\u0001"+
		"\u0000\u0000\u0000\u00ea\u00e8\u0001\u0000\u0000\u0000\u00ea\u00e9\u0001"+
		"\u0000\u0000\u0000\u00eb\u00f9\u0001\u0000\u0000\u0000\u00ec\u00ed\n\u0004"+
		"\u0000\u0000\u00ed\u00ee\u0005\u0002\u0000\u0000\u00ee\u00f8\u0003.\u0017"+
		"\u0005\u00ef\u00f0\n\u0003\u0000\u0000\u00f0\u00f1\u0005\u0003\u0000\u0000"+
		"\u00f1\u00f8\u0003.\u0017\u0004\u00f2\u00f3\n\u0001\u0000\u0000\u00f3"+
		"\u00f4\u0005\u000b\u0000\u0000\u00f4\u00f8\u0003.\u0017\u0002\u00f5\u00f6"+
		"\n\u0002\u0000\u0000\u00f6\u00f8\u00036\u001b\u0000\u00f7\u00ec\u0001"+
		"\u0000\u0000\u0000\u00f7\u00ef\u0001\u0000\u0000\u0000\u00f7\u00f2\u0001"+
		"\u0000\u0000\u0000\u00f7\u00f5\u0001\u0000\u0000\u0000\u00f8\u00fb\u0001"+
		"\u0000\u0000\u0000\u00f9\u00f7\u0001\u0000\u0000\u0000\u00f9\u00fa\u0001"+
		"\u0000\u0000\u0000\u00fa/\u0001\u0000\u0000\u0000\u00fb\u00f9\u0001\u0000"+
		"\u0000\u0000\u00fc\u00fd\u0005\u0012\u0000\u0000\u00fd1\u0001\u0000\u0000"+
		"\u0000\u00fe\u00ff\u0005\u0013\u0000\u0000\u00ff3\u0001\u0000\u0000\u0000"+
		"\u0100\u0101\u0005\u0014\u0000\u0000\u01015\u0001\u0000\u0000\u0000\u0102"+
		"\u0103\u0005\f\u0000\u0000\u0103\u0104\u0003>\u001f\u0000\u0104\u0105"+
		"\u0005\r\u0000\u0000\u01057\u0001\u0000\u0000\u0000\u0106\u0107\u0005"+
		"\u0010\u0000\u0000\u0107\u0108\u0003B!\u0000\u01089\u0001\u0000\u0000"+
		"\u0000\u0109\u010a\u0005\u0011\u0000\u0000\u010a\u010b\u0005\u000e\u0000"+
		"\u0000\u010b\u010c\u0005\u000f\u0000\u0000\u010c;\u0001\u0000\u0000\u0000"+
		"\u010d\u010e\u0005\u000e\u0000\u0000\u010e\u010f\u0003.\u0017\u0000\u010f"+
		"\u0110\u0005\u000f\u0000\u0000\u0110=\u0001\u0000\u0000\u0000\u0111\u0112"+
		"\u0006\u001f\uffff\uffff\u0000\u0112\u012e\u0003.\u0017\u0000\u0113\u0114"+
		"\u0003.\u0017\u0000\u0114\u0115\u0005\u0004\u0000\u0000\u0115\u0116\u0003"+
		".\u0017\u0000\u0116\u012e\u0001\u0000\u0000\u0000\u0117\u0118\u0003.\u0017"+
		"\u0000\u0118\u0119\u0005\u0007\u0000\u0000\u0119\u011a\u0003.\u0017\u0000"+
		"\u011a\u012e\u0001\u0000\u0000\u0000\u011b\u011c\u0003.\u0017\u0000\u011c"+
		"\u011d\u0005\u0005\u0000\u0000\u011d\u011e\u0003.\u0017\u0000\u011e\u012e"+
		"\u0001\u0000\u0000\u0000\u011f\u0120\u0003.\u0017\u0000\u0120\u0121\u0005"+
		"\u0006\u0000\u0000\u0121\u0122\u0003.\u0017\u0000\u0122\u012e\u0001\u0000"+
		"\u0000\u0000\u0123\u0124\u0003.\u0017\u0000\u0124\u0125\u0005\u0004\u0000"+
		"\u0000\u0125\u0126\u0003F#\u0000\u0126\u012e\u0001\u0000\u0000\u0000\u0127"+
		"\u0128\u0005\u000e\u0000\u0000\u0128\u0129\u0003>\u001f\u0000\u0129\u012a"+
		"\u0005\u000f\u0000\u0000\u012a\u012e\u0001\u0000\u0000\u0000\u012b\u012c"+
		"\u0005\n\u0000\u0000\u012c\u012e\u0003>\u001f\u0001\u012d\u0111\u0001"+
		"\u0000\u0000\u0000\u012d\u0113\u0001\u0000\u0000\u0000\u012d\u0117\u0001"+
		"\u0000\u0000\u0000\u012d\u011b\u0001\u0000\u0000\u0000\u012d\u011f\u0001"+
		"\u0000\u0000\u0000\u012d\u0123\u0001\u0000\u0000\u0000\u012d\u0127\u0001"+
		"\u0000\u0000\u0000\u012d\u012b\u0001\u0000\u0000\u0000\u012e\u0137\u0001"+
		"\u0000\u0000\u0000\u012f\u0130\n\u0003\u0000\u0000\u0130\u0131\u0005\b"+
		"\u0000\u0000\u0131\u0136\u0003>\u001f\u0004\u0132\u0133\n\u0002\u0000"+
		"\u0000\u0133\u0134\u0005\t\u0000\u0000\u0134\u0136\u0003>\u001f\u0003"+
		"\u0135\u012f\u0001\u0000\u0000\u0000\u0135\u0132\u0001\u0000\u0000\u0000"+
		"\u0136\u0139\u0001\u0000\u0000\u0000\u0137\u0135\u0001\u0000\u0000\u0000"+
		"\u0137\u0138\u0001\u0000\u0000\u0000\u0138?\u0001\u0000\u0000\u0000\u0139"+
		"\u0137\u0001\u0000\u0000\u0000\u013a\u013b\u0005\u0016\u0000\u0000\u013b"+
		"A\u0001\u0000\u0000\u0000\u013c\u013d\u0005\u0015\u0000\u0000\u013dC\u0001"+
		"\u0000\u0000\u0000\u013e\u013f\u0005\u0015\u0000\u0000\u013fE\u0001\u0000"+
		"\u0000\u0000\u0140\u0141\u0005\u0015\u0000\u0000\u0141G\u0001\u0000\u0000"+
		"\u0000\u0013R]_\u007f\u0087\u008e\u0096\u009f\u00a7\u00a9\u00b9\u00c3"+
		"\u00e0\u00ea\u00f7\u00f9\u012d\u0135\u0137";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
