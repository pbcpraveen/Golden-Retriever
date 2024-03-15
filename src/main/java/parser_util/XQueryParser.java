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
		Parent=20, FileName=21, StringConstant=22, Dollar=23, For=24, Let=25,
		Some=26, Empty=27, In=28, Where=29, OpenBrace=30, CloseBrace=31, Assign=32,
		Return=33, Satisfies=34, CloseAngular=35, OpenAngular=36, OpenAngularwithforwardslash=37,
		Join=38, PathTag=39, Variable=40, Separators=41;
	public static final int
		RULE_eval = 0, RULE_xq = 1, RULE_stringConstant = 2, RULE_xqInParenthesis = 3,
		RULE_newTag = 4, RULE_forBody = 5, RULE_forClause = 6, RULE_forVariables = 7,
		RULE_moreLoopVariables = 8, RULE_loopVariableAssignment = 9, RULE_letClauseAndXq = 10,
		RULE_letClause = 11, RULE_letVariables = 12, RULE_moreLetVariables = 13,
		RULE_letVariableAssignment = 14, RULE_whereClause = 15, RULE_cond = 16,
		RULE_emptyCond = 17, RULE_equalityCond = 18, RULE_identicalCond = 19,
		RULE_someVarCond = 20, RULE_parenthesisCond = 21, RULE_notCond = 22, RULE_returnClause = 23,
		RULE_joinBody = 24, RULE_joinCond = 25, RULE_multipleTags = 26, RULE_absolutePath = 27,
		RULE_relativePath = 28, RULE_children = 29, RULE_current = 30, RULE_parent = 31,
		RULE_filter = 32, RULE_attribute = 33, RULE_textFunction = 34, RULE_inParenthesis = 35,
		RULE_f = 36, RULE_tagName = 37, RULE_attName = 38, RULE_fileName = 39,
		RULE_stringConstantText = 40, RULE_variable = 41, RULE_openTag = 42, RULE_closeTag = 43;
	private static String[] makeRuleNames() {
		return new String[] {
			"eval", "xq", "stringConstant", "xqInParenthesis", "newTag", "forBody",
			"forClause", "forVariables", "moreLoopVariables", "loopVariableAssignment",
			"letClauseAndXq", "letClause", "letVariables", "moreLetVariables", "letVariableAssignment",
			"whereClause", "cond", "emptyCond", "equalityCond", "identicalCond",
			"someVarCond", "parenthesisCond", "notCond", "returnClause", "joinBody",
			"joinCond", "multipleTags", "absolutePath", "relativePath", "children",
			"current", "parent", "filter", "attribute", "textFunction", "inParenthesis",
			"f", "tagName", "attName", "fileName", "stringConstantText", "variable",
			"openTag", "closeTag"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'doc('", "'/'", "'//'", "'='", "'=='", "'is'", "'eq'", "'and'",
			"'or'", "'not'", "','", "'['", "']'", "'('", "')'", "'@'", "'text'",
			"'*'", "'.'", "'..'", null, null, "'$'", "'for'", "'let'", "'some'",
			"'empty'", "'in'", "'where'", "'{'", "'}'", "':='", "'return'", "'satisfies'",
			"'>'", "'<'", null, "'join'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DocOpen", "ImmediateDescendent", "Descendent", "Equal", "Equals",
			"Is", "Eq", "And", "Or", "Not", "Comma", "OpenBracket", "CloseBracket",
			"OpenParen", "CloseParen", "At", "Text", "Children", "Current", "Parent",
			"FileName", "StringConstant", "Dollar", "For", "Let", "Some", "Empty",
			"In", "Where", "OpenBrace", "CloseBrace", "Assign", "Return", "Satisfies",
			"CloseAngular", "OpenAngular", "OpenAngularwithforwardslash", "Join",
			"PathTag", "Variable", "Separators"
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
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public TerminalNode EOF() { return getToken(XQueryParser.EOF, 0); }
		public List<TerminalNode> Separators() { return getTokens(XQueryParser.Separators); }
		public TerminalNode Separators(int i) {
			return getToken(XQueryParser.Separators, i);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Separators) {
				{
				{
				setState(88);
				match(Separators);
				}
				}
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(94);
			xq(0);
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Separators) {
				{
				{
				setState(95);
				match(Separators);
				}
				}
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(101);
			match(EOF);
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
	public static class XqContext extends ParserRuleContext {
		public StringConstantContext stringConstant() {
			return getRuleContext(StringConstantContext.class,0);
		}
		public XqInParenthesisContext xqInParenthesis() {
			return getRuleContext(XqInParenthesisContext.class,0);
		}
		public NewTagContext newTag() {
			return getRuleContext(NewTagContext.class,0);
		}
		public ForBodyContext forBody() {
			return getRuleContext(ForBodyContext.class,0);
		}
		public LetClauseAndXqContext letClauseAndXq() {
			return getRuleContext(LetClauseAndXqContext.class,0);
		}
		public AbsolutePathContext absolutePath() {
			return getRuleContext(AbsolutePathContext.class,0);
		}
		public JoinBodyContext joinBody() {
			return getRuleContext(JoinBodyContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public TerminalNode Comma() { return getToken(XQueryParser.Comma, 0); }
		public List<TerminalNode> Separators() { return getTokens(XQueryParser.Separators); }
		public TerminalNode Separators(int i) {
			return getToken(XQueryParser.Separators, i);
		}
		public TerminalNode ImmediateDescendent() { return getToken(XQueryParser.ImmediateDescendent, 0); }
		public RelativePathContext relativePath() {
			return getRuleContext(RelativePathContext.class,0);
		}
		public TerminalNode Descendent() { return getToken(XQueryParser.Descendent, 0); }
		public XqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterXq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitXq(this);
		}
	}

	public final XqContext xq() throws RecognitionException {
		return xq(0);
	}

	private XqContext xq(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		XqContext _localctx = new XqContext(_ctx, _parentState);
		XqContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_xq, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StringConstant:
				{
				setState(104);
				stringConstant();
				}
				break;
			case OpenParen:
				{
				setState(105);
				xqInParenthesis();
				}
				break;
			case OpenAngular:
				{
				setState(106);
				newTag();
				}
				break;
			case For:
				{
				setState(107);
				forBody();
				}
				break;
			case Let:
				{
				setState(108);
				letClauseAndXq();
				}
				break;
			case DocOpen:
				{
				setState(109);
				absolutePath();
				}
				break;
			case Join:
				{
				setState(110);
				joinBody();
				}
				break;
			case Variable:
				{
				setState(111);
				variable();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(161);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(159);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new XqContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_xq);
						setState(114);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(118);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==Separators) {
							{
							{
							setState(115);
							match(Separators);
							}
							}
							setState(120);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(121);
						match(Comma);
						setState(125);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==Separators) {
							{
							{
							setState(122);
							match(Separators);
							}
							}
							setState(127);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(128);
						xq(5);
						}
						break;
					case 2:
						{
						_localctx = new XqContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_xq);
						setState(129);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(133);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==Separators) {
							{
							{
							setState(130);
							match(Separators);
							}
							}
							setState(135);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(136);
						match(ImmediateDescendent);
						setState(140);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==Separators) {
							{
							{
							setState(137);
							match(Separators);
							}
							}
							setState(142);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(143);
						relativePath(0);
						}
						break;
					case 3:
						{
						_localctx = new XqContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_xq);
						setState(144);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(148);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==Separators) {
							{
							{
							setState(145);
							match(Separators);
							}
							}
							setState(150);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(151);
						match(Descendent);
						setState(155);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==Separators) {
							{
							{
							setState(152);
							match(Separators);
							}
							}
							setState(157);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(158);
						relativePath(0);
						}
						break;
					}
					}
				}
				setState(163);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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
			setState(164);
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
	public static class XqInParenthesisContext extends ParserRuleContext {
		public TerminalNode OpenParen() { return getToken(XQueryParser.OpenParen, 0); }
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(XQueryParser.CloseParen, 0); }
		public List<TerminalNode> Separators() { return getTokens(XQueryParser.Separators); }
		public TerminalNode Separators(int i) {
			return getToken(XQueryParser.Separators, i);
		}
		public XqInParenthesisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xqInParenthesis; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterXqInParenthesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitXqInParenthesis(this);
		}
	}

	public final XqInParenthesisContext xqInParenthesis() throws RecognitionException {
		XqInParenthesisContext _localctx = new XqInParenthesisContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_xqInParenthesis);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(OpenParen);
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Separators) {
				{
				{
				setState(167);
				match(Separators);
				}
				}
				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(173);
			xq(0);
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Separators) {
				{
				{
				setState(174);
				match(Separators);
				}
				}
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(180);
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
		public OpenTagContext openTag() {
			return getRuleContext(OpenTagContext.class,0);
		}
		public TerminalNode OpenBrace() { return getToken(XQueryParser.OpenBrace, 0); }
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(XQueryParser.CloseBrace, 0); }
		public CloseTagContext closeTag() {
			return getRuleContext(CloseTagContext.class,0);
		}
		public List<TerminalNode> Separators() { return getTokens(XQueryParser.Separators); }
		public TerminalNode Separators(int i) {
			return getToken(XQueryParser.Separators, i);
		}
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
		enterRule(_localctx, 8, RULE_newTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			openTag();
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Separators) {
				{
				{
				setState(183);
				match(Separators);
				}
				}
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(189);
			match(OpenBrace);
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Separators) {
				{
				{
				setState(190);
				match(Separators);
				}
				}
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(196);
			xq(0);
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Separators) {
				{
				{
				setState(197);
				match(Separators);
				}
				}
				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(203);
			match(CloseBrace);
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Separators) {
				{
				{
				setState(204);
				match(Separators);
				}
				}
				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(210);
			closeTag();
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
		public ReturnClauseContext returnClause() {
			return getRuleContext(ReturnClauseContext.class,0);
		}
		public List<TerminalNode> Separators() { return getTokens(XQueryParser.Separators); }
		public TerminalNode Separators(int i) {
			return getToken(XQueryParser.Separators, i);
		}
		public LetClauseContext letClause() {
			return getRuleContext(LetClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
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
		enterRule(_localctx, 10, RULE_forBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			forClause();
			setState(216);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(213);
					match(Separators);
					}
					}
				}
				setState(218);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Let) {
				{
				setState(219);
				letClause();
				}
			}

			setState(225);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(222);
					match(Separators);
					}
					}
				}
				setState(227);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Where) {
				{
				setState(228);
				whereClause();
				}
			}

			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Separators) {
				{
				{
				setState(231);
				match(Separators);
				}
				}
				setState(236);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(237);
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
		public List<TerminalNode> Separators() { return getTokens(XQueryParser.Separators); }
		public TerminalNode Separators(int i) {
			return getToken(XQueryParser.Separators, i);
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
		enterRule(_localctx, 12, RULE_forClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(For);
			setState(243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Separators) {
				{
				{
				setState(240);
				match(Separators);
				}
				}
				setState(245);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(246);
			forVariables();
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
		public MoreLoopVariablesContext moreLoopVariables() {
			return getRuleContext(MoreLoopVariablesContext.class,0);
		}
		public List<TerminalNode> Separators() { return getTokens(XQueryParser.Separators); }
		public TerminalNode Separators(int i) {
			return getToken(XQueryParser.Separators, i);
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
		enterRule(_localctx, 14, RULE_forVariables);
		int _la;
		try {
			setState(258);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(248);
				loopVariableAssignment();
				setState(252);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Separators) {
					{
					{
					setState(249);
					match(Separators);
					}
					}
					setState(254);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(255);
				moreLoopVariables();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(257);
				loopVariableAssignment();
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
	public static class MoreLoopVariablesContext extends ParserRuleContext {
		public TerminalNode Comma() { return getToken(XQueryParser.Comma, 0); }
		public ForVariablesContext forVariables() {
			return getRuleContext(ForVariablesContext.class,0);
		}
		public List<TerminalNode> Separators() { return getTokens(XQueryParser.Separators); }
		public TerminalNode Separators(int i) {
			return getToken(XQueryParser.Separators, i);
		}
		public MoreLoopVariablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moreLoopVariables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterMoreLoopVariables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitMoreLoopVariables(this);
		}
	}

	public final MoreLoopVariablesContext moreLoopVariables() throws RecognitionException {
		MoreLoopVariablesContext _localctx = new MoreLoopVariablesContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_moreLoopVariables);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			match(Comma);
			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Separators) {
				{
				{
				setState(261);
				match(Separators);
				}
				}
				setState(266);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(267);
			forVariables();
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
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public List<TerminalNode> Separators() { return getTokens(XQueryParser.Separators); }
		public TerminalNode Separators(int i) {
			return getToken(XQueryParser.Separators, i);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			variable();
			setState(273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Separators) {
				{
				{
				setState(270);
				match(Separators);
				}
				}
				setState(275);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(276);
			match(In);
			setState(280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Separators) {
				{
				{
				setState(277);
				match(Separators);
				}
				}
				setState(282);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(283);
			xq(0);
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
	public static class LetClauseAndXqContext extends ParserRuleContext {
		public LetClauseContext letClause() {
			return getRuleContext(LetClauseContext.class,0);
		}
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public List<TerminalNode> Separators() { return getTokens(XQueryParser.Separators); }
		public TerminalNode Separators(int i) {
			return getToken(XQueryParser.Separators, i);
		}
		public LetClauseAndXqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letClauseAndXq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterLetClauseAndXq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitLetClauseAndXq(this);
		}
	}

	public final LetClauseAndXqContext letClauseAndXq() throws RecognitionException {
		LetClauseAndXqContext _localctx = new LetClauseAndXqContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_letClauseAndXq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			letClause();
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Separators) {
				{
				{
				setState(286);
				match(Separators);
				}
				}
				setState(291);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(292);
			xq(0);
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
		public List<TerminalNode> Separators() { return getTokens(XQueryParser.Separators); }
		public TerminalNode Separators(int i) {
			return getToken(XQueryParser.Separators, i);
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
		enterRule(_localctx, 22, RULE_letClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(Let);
			setState(298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Separators) {
				{
				{
				setState(295);
				match(Separators);
				}
				}
				setState(300);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(301);
			letVariables();
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
		public MoreLetVariablesContext moreLetVariables() {
			return getRuleContext(MoreLetVariablesContext.class,0);
		}
		public List<TerminalNode> Separators() { return getTokens(XQueryParser.Separators); }
		public TerminalNode Separators(int i) {
			return getToken(XQueryParser.Separators, i);
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
		enterRule(_localctx, 24, RULE_letVariables);
		int _la;
		try {
			setState(313);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(303);
				letVariableAssignment();
				setState(307);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Separators) {
					{
					{
					setState(304);
					match(Separators);
					}
					}
					setState(309);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(310);
				moreLetVariables();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(312);
				letVariableAssignment();
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
	public static class MoreLetVariablesContext extends ParserRuleContext {
		public TerminalNode Comma() { return getToken(XQueryParser.Comma, 0); }
		public LetVariablesContext letVariables() {
			return getRuleContext(LetVariablesContext.class,0);
		}
		public List<TerminalNode> Separators() { return getTokens(XQueryParser.Separators); }
		public TerminalNode Separators(int i) {
			return getToken(XQueryParser.Separators, i);
		}
		public MoreLetVariablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moreLetVariables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterMoreLetVariables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitMoreLetVariables(this);
		}
	}

	public final MoreLetVariablesContext moreLetVariables() throws RecognitionException {
		MoreLetVariablesContext _localctx = new MoreLetVariablesContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_moreLetVariables);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			match(Comma);
			setState(319);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Separators) {
				{
				{
				setState(316);
				match(Separators);
				}
				}
				setState(321);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(322);
			letVariables();
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
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public List<TerminalNode> Separators() { return getTokens(XQueryParser.Separators); }
		public TerminalNode Separators(int i) {
			return getToken(XQueryParser.Separators, i);
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
		enterRule(_localctx, 28, RULE_letVariableAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			variable();
			setState(328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Separators) {
				{
				{
				setState(325);
				match(Separators);
				}
				}
				setState(330);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(331);
			match(Assign);
			setState(335);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Separators) {
				{
				{
				setState(332);
				match(Separators);
				}
				}
				setState(337);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(338);
			xq(0);
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
		public List<TerminalNode> Separators() { return getTokens(XQueryParser.Separators); }
		public TerminalNode Separators(int i) {
			return getToken(XQueryParser.Separators, i);
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
		enterRule(_localctx, 30, RULE_whereClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			match(Where);
			setState(344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Separators) {
				{
				{
				setState(341);
				match(Separators);
				}
				}
				setState(346);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(347);
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
		public List<TerminalNode> Separators() { return getTokens(XQueryParser.Separators); }
		public TerminalNode Separators(int i) {
			return getToken(XQueryParser.Separators, i);
		}
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
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_cond, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(350);
				emptyCond();
				}
				break;
			case 2:
				{
				setState(351);
				equalityCond();
				}
				break;
			case 3:
				{
				setState(352);
				identicalCond();
				}
				break;
			case 4:
				{
				setState(353);
				someVarCond();
				}
				break;
			case 5:
				{
				setState(354);
				parenthesisCond();
				}
				break;
			case 6:
				{
				setState(355);
				notCond();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(390);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(388);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
					case 1:
						{
						_localctx = new CondContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_cond);
						setState(358);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(362);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==Separators) {
							{
							{
							setState(359);
							match(Separators);
							}
							}
							setState(364);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(365);
						match(And);
						setState(369);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==Separators) {
							{
							{
							setState(366);
							match(Separators);
							}
							}
							setState(371);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(372);
						cond(4);
						}
						break;
					case 2:
						{
						_localctx = new CondContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_cond);
						setState(373);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(377);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==Separators) {
							{
							{
							setState(374);
							match(Separators);
							}
							}
							setState(379);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(380);
						match(Or);
						setState(384);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==Separators) {
							{
							{
							setState(381);
							match(Separators);
							}
							}
							setState(386);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(387);
						cond(3);
						}
						break;
					}
					}
				}
				setState(392);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
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
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(XQueryParser.CloseParen, 0); }
		public List<TerminalNode> Separators() { return getTokens(XQueryParser.Separators); }
		public TerminalNode Separators(int i) {
			return getToken(XQueryParser.Separators, i);
		}
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
		enterRule(_localctx, 34, RULE_emptyCond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			match(Empty);
			setState(397);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Separators) {
				{
				{
				setState(394);
				match(Separators);
				}
				}
				setState(399);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(400);
			match(OpenParen);
			setState(404);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Separators) {
				{
				{
				setState(401);
				match(Separators);
				}
				}
				setState(406);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(407);
			xq(0);
			setState(411);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Separators) {
				{
				{
				setState(408);
				match(Separators);
				}
				}
				setState(413);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(414);
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
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public TerminalNode Equal() { return getToken(XQueryParser.Equal, 0); }
		public List<TerminalNode> Separators() { return getTokens(XQueryParser.Separators); }
		public TerminalNode Separators(int i) {
			return getToken(XQueryParser.Separators, i);
		}
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
		enterRule(_localctx, 36, RULE_equalityCond);
		int _la;
		try {
			setState(448);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(416);
				xq(0);
				setState(420);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Separators) {
					{
					{
					setState(417);
					match(Separators);
					}
					}
					setState(422);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(423);
				match(Equal);
				setState(427);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Separators) {
					{
					{
					setState(424);
					match(Separators);
					}
					}
					setState(429);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(430);
				xq(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(432);
				xq(0);
				setState(436);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Separators) {
					{
					{
					setState(433);
					match(Separators);
					}
					}
					setState(438);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(439);
				match(Eq);
				setState(443);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Separators) {
					{
					{
					setState(440);
					match(Separators);
					}
					}
					setState(445);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(446);
				xq(0);
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
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public TerminalNode Equals() { return getToken(XQueryParser.Equals, 0); }
		public List<TerminalNode> Separators() { return getTokens(XQueryParser.Separators); }
		public TerminalNode Separators(int i) {
			return getToken(XQueryParser.Separators, i);
		}
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
		enterRule(_localctx, 38, RULE_identicalCond);
		int _la;
		try {
			setState(482);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(450);
				xq(0);
				setState(454);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Separators) {
					{
					{
					setState(451);
					match(Separators);
					}
					}
					setState(456);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(457);
				match(Equals);
				setState(461);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Separators) {
					{
					{
					setState(458);
					match(Separators);
					}
					}
					setState(463);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(464);
				xq(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(466);
				xq(0);
				setState(470);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Separators) {
					{
					{
					setState(467);
					match(Separators);
					}
					}
					setState(472);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(473);
				match(Is);
				setState(477);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Separators) {
					{
					{
					setState(474);
					match(Separators);
					}
					}
					setState(479);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(480);
				xq(0);
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
		public TerminalNode Satisfies() { return getToken(XQueryParser.Satisfies, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public List<TerminalNode> Separators() { return getTokens(XQueryParser.Separators); }
		public TerminalNode Separators(int i) {
			return getToken(XQueryParser.Separators, i);
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
		enterRule(_localctx, 40, RULE_someVarCond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(484);
			match(Some);
			setState(488);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Separators) {
				{
				{
				setState(485);
				match(Separators);
				}
				}
				setState(490);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(491);
			forVariables();
			setState(495);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Separators) {
				{
				{
				setState(492);
				match(Separators);
				}
				}
				setState(497);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(498);
			match(Satisfies);
			setState(502);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Separators) {
				{
				{
				setState(499);
				match(Separators);
				}
				}
				setState(504);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(505);
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
	public static class ParenthesisCondContext extends ParserRuleContext {
		public TerminalNode OpenParen() { return getToken(XQueryParser.OpenParen, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(XQueryParser.CloseParen, 0); }
		public List<TerminalNode> Separators() { return getTokens(XQueryParser.Separators); }
		public TerminalNode Separators(int i) {
			return getToken(XQueryParser.Separators, i);
		}
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
		enterRule(_localctx, 42, RULE_parenthesisCond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(507);
			match(OpenParen);
			setState(511);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Separators) {
				{
				{
				setState(508);
				match(Separators);
				}
				}
				setState(513);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(514);
			cond(0);
			setState(518);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Separators) {
				{
				{
				setState(515);
				match(Separators);
				}
				}
				setState(520);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(521);
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
		public List<TerminalNode> Separators() { return getTokens(XQueryParser.Separators); }
		public TerminalNode Separators(int i) {
			return getToken(XQueryParser.Separators, i);
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
		enterRule(_localctx, 44, RULE_notCond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
			match(Not);
			setState(527);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Separators) {
				{
				{
				setState(524);
				match(Separators);
				}
				}
				setState(529);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(530);
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
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public List<TerminalNode> Separators() { return getTokens(XQueryParser.Separators); }
		public TerminalNode Separators(int i) {
			return getToken(XQueryParser.Separators, i);
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
		enterRule(_localctx, 46, RULE_returnClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(532);
			match(Return);
			setState(536);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Separators) {
				{
				{
				setState(533);
				match(Separators);
				}
				}
				setState(538);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(539);
			xq(0);
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
	public static class JoinBodyContext extends ParserRuleContext {
		public TerminalNode Join() { return getToken(XQueryParser.Join, 0); }
		public TerminalNode OpenParen() { return getToken(XQueryParser.OpenParen, 0); }
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(XQueryParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(XQueryParser.Comma, i);
		}
		public List<JoinCondContext> joinCond() {
			return getRuleContexts(JoinCondContext.class);
		}
		public JoinCondContext joinCond(int i) {
			return getRuleContext(JoinCondContext.class,i);
		}
		public TerminalNode CloseParen() { return getToken(XQueryParser.CloseParen, 0); }
		public List<TerminalNode> Separators() { return getTokens(XQueryParser.Separators); }
		public TerminalNode Separators(int i) {
			return getToken(XQueryParser.Separators, i);
		}
		public JoinBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterJoinBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitJoinBody(this);
		}
	}

	public final JoinBodyContext joinBody() throws RecognitionException {
		JoinBodyContext _localctx = new JoinBodyContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_joinBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(541);
			match(Join);
			setState(545);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Separators) {
				{
				{
				setState(542);
				match(Separators);
				}
				}
				setState(547);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(548);
			match(OpenParen);
			setState(552);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Separators) {
				{
				{
				setState(549);
				match(Separators);
				}
				}
				setState(554);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(555);
			xq(0);
			setState(559);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Separators) {
				{
				{
				setState(556);
				match(Separators);
				}
				}
				setState(561);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(562);
			match(Comma);
			setState(566);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Separators) {
				{
				{
				setState(563);
				match(Separators);
				}
				}
				setState(568);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(569);
			xq(0);
			setState(573);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Separators) {
				{
				{
				setState(570);
				match(Separators);
				}
				}
				setState(575);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(576);
			match(Comma);
			setState(580);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Separators) {
				{
				{
				setState(577);
				match(Separators);
				}
				}
				setState(582);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(583);
			joinCond();
			setState(587);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Separators) {
				{
				{
				setState(584);
				match(Separators);
				}
				}
				setState(589);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(590);
			match(Comma);
			setState(594);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Separators) {
				{
				{
				setState(591);
				match(Separators);
				}
				}
				setState(596);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(597);
			joinCond();
			setState(601);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Separators) {
				{
				{
				setState(598);
				match(Separators);
				}
				}
				setState(603);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(604);
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
	public static class JoinCondContext extends ParserRuleContext {
		public TerminalNode OpenBracket() { return getToken(XQueryParser.OpenBracket, 0); }
		public TerminalNode CloseBracket() { return getToken(XQueryParser.CloseBracket, 0); }
		public List<TerminalNode> Separators() { return getTokens(XQueryParser.Separators); }
		public TerminalNode Separators(int i) {
			return getToken(XQueryParser.Separators, i);
		}
		public List<MultipleTagsContext> multipleTags() {
			return getRuleContexts(MultipleTagsContext.class);
		}
		public MultipleTagsContext multipleTags(int i) {
			return getRuleContext(MultipleTagsContext.class,i);
		}
		public JoinCondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinCond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterJoinCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitJoinCond(this);
		}
	}

	public final JoinCondContext joinCond() throws RecognitionException {
		JoinCondContext _localctx = new JoinCondContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_joinCond);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(606);
			match(OpenBracket);
			setState(610);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(607);
					match(Separators);
					}
					}
				}
				setState(612);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
			}
			setState(616);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PathTag) {
				{
				{
				setState(613);
				multipleTags();
				}
				}
				setState(618);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(622);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Separators) {
				{
				{
				setState(619);
				match(Separators);
				}
				}
				setState(624);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(625);
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
	public static class MultipleTagsContext extends ParserRuleContext {
		public TagNameContext tagName() {
			return getRuleContext(TagNameContext.class,0);
		}
		public TerminalNode Comma() { return getToken(XQueryParser.Comma, 0); }
		public MultipleTagsContext multipleTags() {
			return getRuleContext(MultipleTagsContext.class,0);
		}
		public List<TerminalNode> Separators() { return getTokens(XQueryParser.Separators); }
		public TerminalNode Separators(int i) {
			return getToken(XQueryParser.Separators, i);
		}
		public MultipleTagsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multipleTags; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterMultipleTags(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitMultipleTags(this);
		}
	}

	public final MultipleTagsContext multipleTags() throws RecognitionException {
		MultipleTagsContext _localctx = new MultipleTagsContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_multipleTags);
		int _la;
		try {
			setState(644);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(627);
				tagName();
				setState(631);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Separators) {
					{
					{
					setState(628);
					match(Separators);
					}
					}
					setState(633);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(634);
				match(Comma);
				setState(638);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Separators) {
					{
					{
					setState(635);
					match(Separators);
					}
					}
					setState(640);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(641);
				multipleTags();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(643);
				tagName();
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
		public List<TerminalNode> Separators() { return getTokens(XQueryParser.Separators); }
		public TerminalNode Separators(int i) {
			return getToken(XQueryParser.Separators, i);
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
		enterRule(_localctx, 54, RULE_absolutePath);
		int _la;
		try {
			setState(706);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(646);
				match(DocOpen);
				setState(650);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Separators) {
					{
					{
					setState(647);
					match(Separators);
					}
					}
					setState(652);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(653);
				fileName();
				setState(657);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Separators) {
					{
					{
					setState(654);
					match(Separators);
					}
					}
					setState(659);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(660);
				match(CloseParen);
				setState(664);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Separators) {
					{
					{
					setState(661);
					match(Separators);
					}
					}
					setState(666);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(667);
				match(ImmediateDescendent);
				setState(671);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Separators) {
					{
					{
					setState(668);
					match(Separators);
					}
					}
					setState(673);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(674);
				relativePath(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(676);
				match(DocOpen);
				setState(680);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Separators) {
					{
					{
					setState(677);
					match(Separators);
					}
					}
					setState(682);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(683);
				fileName();
				setState(687);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Separators) {
					{
					{
					setState(684);
					match(Separators);
					}
					}
					setState(689);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(690);
				match(CloseParen);
				setState(694);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Separators) {
					{
					{
					setState(691);
					match(Separators);
					}
					}
					setState(696);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(697);
				match(Descendent);
				setState(701);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Separators) {
					{
					{
					setState(698);
					match(Separators);
					}
					}
					setState(703);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(704);
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
		public List<TerminalNode> Separators() { return getTokens(XQueryParser.Separators); }
		public TerminalNode Separators(int i) {
			return getToken(XQueryParser.Separators, i);
		}
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
		int _startState = 56;
		enterRecursionRule(_localctx, 56, RULE_relativePath, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(716);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PathTag:
				{
				setState(709);
				tagName();
				}
				break;
			case Children:
				{
				setState(710);
				children();
				}
				break;
			case Current:
				{
				setState(711);
				current();
				}
				break;
			case Parent:
				{
				setState(712);
				parent();
				}
				break;
			case Text:
				{
				setState(713);
				textFunction();
				}
				break;
			case At:
				{
				setState(714);
				attribute();
				}
				break;
			case OpenParen:
				{
				setState(715);
				inParenthesis();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(773);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(771);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
					case 1:
						{
						_localctx = new RelativePathContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relativePath);
						setState(718);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(722);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==Separators) {
							{
							{
							setState(719);
							match(Separators);
							}
							}
							setState(724);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(725);
						match(ImmediateDescendent);
						setState(729);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==Separators) {
							{
							{
							setState(726);
							match(Separators);
							}
							}
							setState(731);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(732);
						relativePath(5);
						}
						break;
					case 2:
						{
						_localctx = new RelativePathContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relativePath);
						setState(733);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(737);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==Separators) {
							{
							{
							setState(734);
							match(Separators);
							}
							}
							setState(739);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(740);
						match(Descendent);
						setState(744);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==Separators) {
							{
							{
							setState(741);
							match(Separators);
							}
							}
							setState(746);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(747);
						relativePath(4);
						}
						break;
					case 3:
						{
						_localctx = new RelativePathContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relativePath);
						setState(748);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(752);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==Separators) {
							{
							{
							setState(749);
							match(Separators);
							}
							}
							setState(754);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(755);
						match(Comma);
						setState(759);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==Separators) {
							{
							{
							setState(756);
							match(Separators);
							}
							}
							setState(761);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(762);
						relativePath(2);
						}
						break;
					case 4:
						{
						_localctx = new RelativePathContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relativePath);
						setState(763);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(767);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==Separators) {
							{
							{
							setState(764);
							match(Separators);
							}
							}
							setState(769);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(770);
						filter();
						}
						break;
					}
					}
				}
				setState(775);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
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
		enterRule(_localctx, 58, RULE_children);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(776);
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
		enterRule(_localctx, 60, RULE_current);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(778);
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
		enterRule(_localctx, 62, RULE_parent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(780);
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
		public List<TerminalNode> Separators() { return getTokens(XQueryParser.Separators); }
		public TerminalNode Separators(int i) {
			return getToken(XQueryParser.Separators, i);
		}
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
		enterRule(_localctx, 64, RULE_filter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(782);
			match(OpenBracket);
			setState(786);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Separators) {
				{
				{
				setState(783);
				match(Separators);
				}
				}
				setState(788);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(789);
			f(0);
			setState(793);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Separators) {
				{
				{
				setState(790);
				match(Separators);
				}
				}
				setState(795);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(796);
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
		enterRule(_localctx, 66, RULE_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(798);
			match(At);
			setState(799);
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
		enterRule(_localctx, 68, RULE_textFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(801);
			match(Text);
			setState(802);
			match(OpenParen);
			setState(803);
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
		public List<TerminalNode> Separators() { return getTokens(XQueryParser.Separators); }
		public TerminalNode Separators(int i) {
			return getToken(XQueryParser.Separators, i);
		}
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
		enterRule(_localctx, 70, RULE_inParenthesis);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(805);
			match(OpenParen);
			setState(809);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Separators) {
				{
				{
				setState(806);
				match(Separators);
				}
				}
				setState(811);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(812);
			relativePath(0);
			setState(816);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Separators) {
				{
				{
				setState(813);
				match(Separators);
				}
				}
				setState(818);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(819);
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
		public List<TerminalNode> Separators() { return getTokens(XQueryParser.Separators); }
		public TerminalNode Separators(int i) {
			return getToken(XQueryParser.Separators, i);
		}
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
		int _startState = 72;
		enterRecursionRule(_localctx, 72, RULE_f, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(915);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
			case 1:
				{
				setState(822);
				relativePath(0);
				}
				break;
			case 2:
				{
				setState(823);
				relativePath(0);
				setState(827);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Separators) {
					{
					{
					setState(824);
					match(Separators);
					}
					}
					setState(829);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(830);
				match(Equal);
				setState(834);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Separators) {
					{
					{
					setState(831);
					match(Separators);
					}
					}
					setState(836);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(837);
				relativePath(0);
				}
				break;
			case 3:
				{
				setState(839);
				relativePath(0);
				setState(843);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Separators) {
					{
					{
					setState(840);
					match(Separators);
					}
					}
					setState(845);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(846);
				match(Eq);
				setState(850);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Separators) {
					{
					{
					setState(847);
					match(Separators);
					}
					}
					setState(852);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(853);
				relativePath(0);
				}
				break;
			case 4:
				{
				setState(855);
				relativePath(0);
				setState(859);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Separators) {
					{
					{
					setState(856);
					match(Separators);
					}
					}
					setState(861);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(862);
				match(Equals);
				setState(866);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Separators) {
					{
					{
					setState(863);
					match(Separators);
					}
					}
					setState(868);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(869);
				relativePath(0);
				}
				break;
			case 5:
				{
				setState(871);
				relativePath(0);
				setState(875);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Separators) {
					{
					{
					setState(872);
					match(Separators);
					}
					}
					setState(877);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(878);
				match(Is);
				setState(882);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Separators) {
					{
					{
					setState(879);
					match(Separators);
					}
					}
					setState(884);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(885);
				relativePath(0);
				}
				break;
			case 6:
				{
				setState(887);
				relativePath(0);
				setState(891);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Separators) {
					{
					{
					setState(888);
					match(Separators);
					}
					}
					setState(893);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(894);
				match(Equal);
				setState(898);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Separators) {
					{
					{
					setState(895);
					match(Separators);
					}
					}
					setState(900);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(901);
				stringConstantText();
				}
				break;
			case 7:
				{
				setState(903);
				match(OpenParen);
				setState(904);
				f(0);
				setState(905);
				match(CloseParen);
				}
				break;
			case 8:
				{
				setState(907);
				match(Not);
				setState(911);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Separators) {
					{
					{
					setState(908);
					match(Separators);
					}
					}
					setState(913);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(914);
				f(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(949);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,118,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(947);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
					case 1:
						{
						_localctx = new FContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_f);
						setState(917);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(921);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==Separators) {
							{
							{
							setState(918);
							match(Separators);
							}
							}
							setState(923);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(924);
						match(And);
						setState(928);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==Separators) {
							{
							{
							setState(925);
							match(Separators);
							}
							}
							setState(930);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(931);
						f(4);
						}
						break;
					case 2:
						{
						_localctx = new FContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_f);
						setState(932);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(936);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==Separators) {
							{
							{
							setState(933);
							match(Separators);
							}
							}
							setState(938);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(939);
						match(Or);
						setState(943);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==Separators) {
							{
							{
							setState(940);
							match(Separators);
							}
							}
							setState(945);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(946);
						f(3);
						}
						break;
					}
					}
				}
				setState(951);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,118,_ctx);
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
		enterRule(_localctx, 74, RULE_tagName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(952);
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
		enterRule(_localctx, 76, RULE_attName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(954);
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
		public TerminalNode FileName() { return getToken(XQueryParser.FileName, 0); }
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
		enterRule(_localctx, 78, RULE_fileName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(956);
			match(FileName);
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
		enterRule(_localctx, 80, RULE_stringConstantText);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(958);
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
		enterRule(_localctx, 82, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(960);
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
	public static class OpenTagContext extends ParserRuleContext {
		public TerminalNode OpenAngular() { return getToken(XQueryParser.OpenAngular, 0); }
		public TerminalNode PathTag() { return getToken(XQueryParser.PathTag, 0); }
		public TerminalNode CloseAngular() { return getToken(XQueryParser.CloseAngular, 0); }
		public OpenTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_openTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterOpenTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitOpenTag(this);
		}
	}

	public final OpenTagContext openTag() throws RecognitionException {
		OpenTagContext _localctx = new OpenTagContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_openTag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(962);
			match(OpenAngular);
			setState(963);
			match(PathTag);
			setState(964);
			match(CloseAngular);
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
	public static class CloseTagContext extends ParserRuleContext {
		public TerminalNode OpenAngularwithforwardslash() { return getToken(XQueryParser.OpenAngularwithforwardslash, 0); }
		public TerminalNode PathTag() { return getToken(XQueryParser.PathTag, 0); }
		public TerminalNode CloseAngular() { return getToken(XQueryParser.CloseAngular, 0); }
		public CloseTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closeTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterCloseTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitCloseTag(this);
		}
	}

	public final CloseTagContext closeTag() throws RecognitionException {
		CloseTagContext _localctx = new CloseTagContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_closeTag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(966);
			match(OpenAngularwithforwardslash);
			setState(967);
			match(PathTag);
			setState(968);
			match(CloseAngular);
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
			return xq_sempred((XqContext)_localctx, predIndex);
		case 16:
			return cond_sempred((CondContext)_localctx, predIndex);
		case 28:
			return relativePath_sempred((RelativePathContext)_localctx, predIndex);
		case 36:
			return f_sempred((FContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean xq_sempred(XqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		case 2:
			return precpred(_ctx, 2);
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
		"\u0004\u0001)\u03cb\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0001\u0000\u0005\u0000"+
		"Z\b\u0000\n\u0000\f\u0000]\t\u0000\u0001\u0000\u0001\u0000\u0005\u0000"+
		"a\b\u0000\n\u0000\f\u0000d\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001q\b\u0001\u0001\u0001\u0001\u0001"+
		"\u0005\u0001u\b\u0001\n\u0001\f\u0001x\t\u0001\u0001\u0001\u0001\u0001"+
		"\u0005\u0001|\b\u0001\n\u0001\f\u0001\u007f\t\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0005\u0001\u0084\b\u0001\n\u0001\f\u0001\u0087\t\u0001"+
		"\u0001\u0001\u0001\u0001\u0005\u0001\u008b\b\u0001\n\u0001\f\u0001\u008e"+
		"\t\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001\u0093\b\u0001"+
		"\n\u0001\f\u0001\u0096\t\u0001\u0001\u0001\u0001\u0001\u0005\u0001\u009a"+
		"\b\u0001\n\u0001\f\u0001\u009d\t\u0001\u0001\u0001\u0005\u0001\u00a0\b"+
		"\u0001\n\u0001\f\u0001\u00a3\t\u0001\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0005\u0003\u00a9\b\u0003\n\u0003\f\u0003\u00ac\t\u0003\u0001"+
		"\u0003\u0001\u0003\u0005\u0003\u00b0\b\u0003\n\u0003\f\u0003\u00b3\t\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0005\u0004\u00b9\b\u0004"+
		"\n\u0004\f\u0004\u00bc\t\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u00c0"+
		"\b\u0004\n\u0004\f\u0004\u00c3\t\u0004\u0001\u0004\u0001\u0004\u0005\u0004"+
		"\u00c7\b\u0004\n\u0004\f\u0004\u00ca\t\u0004\u0001\u0004\u0001\u0004\u0005"+
		"\u0004\u00ce\b\u0004\n\u0004\f\u0004\u00d1\t\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0005\u0005\u00d7\b\u0005\n\u0005\f\u0005\u00da"+
		"\t\u0005\u0001\u0005\u0003\u0005\u00dd\b\u0005\u0001\u0005\u0005\u0005"+
		"\u00e0\b\u0005\n\u0005\f\u0005\u00e3\t\u0005\u0001\u0005\u0003\u0005\u00e6"+
		"\b\u0005\u0001\u0005\u0005\u0005\u00e9\b\u0005\n\u0005\f\u0005\u00ec\t"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0005\u0006\u00f2"+
		"\b\u0006\n\u0006\f\u0006\u00f5\t\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0005\u0007\u00fb\b\u0007\n\u0007\f\u0007\u00fe\t\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0103\b\u0007\u0001\b\u0001"+
		"\b\u0005\b\u0107\b\b\n\b\f\b\u010a\t\b\u0001\b\u0001\b\u0001\t\u0001\t"+
		"\u0005\t\u0110\b\t\n\t\f\t\u0113\t\t\u0001\t\u0001\t\u0005\t\u0117\b\t"+
		"\n\t\f\t\u011a\t\t\u0001\t\u0001\t\u0001\n\u0001\n\u0005\n\u0120\b\n\n"+
		"\n\f\n\u0123\t\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0005\u000b\u0129"+
		"\b\u000b\n\u000b\f\u000b\u012c\t\u000b\u0001\u000b\u0001\u000b\u0001\f"+
		"\u0001\f\u0005\f\u0132\b\f\n\f\f\f\u0135\t\f\u0001\f\u0001\f\u0001\f\u0003"+
		"\f\u013a\b\f\u0001\r\u0001\r\u0005\r\u013e\b\r\n\r\f\r\u0141\t\r\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0005\u000e\u0147\b\u000e\n\u000e\f"+
		"\u000e\u014a\t\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u014e\b\u000e"+
		"\n\u000e\f\u000e\u0151\t\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0005\u000f\u0157\b\u000f\n\u000f\f\u000f\u015a\t\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0003\u0010\u0165\b\u0010\u0001\u0010\u0001\u0010"+
		"\u0005\u0010\u0169\b\u0010\n\u0010\f\u0010\u016c\t\u0010\u0001\u0010\u0001"+
		"\u0010\u0005\u0010\u0170\b\u0010\n\u0010\f\u0010\u0173\t\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0005\u0010\u0178\b\u0010\n\u0010\f\u0010\u017b"+
		"\t\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u017f\b\u0010\n\u0010\f\u0010"+
		"\u0182\t\u0010\u0001\u0010\u0005\u0010\u0185\b\u0010\n\u0010\f\u0010\u0188"+
		"\t\u0010\u0001\u0011\u0001\u0011\u0005\u0011\u018c\b\u0011\n\u0011\f\u0011"+
		"\u018f\t\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u0193\b\u0011\n\u0011"+
		"\f\u0011\u0196\t\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u019a\b\u0011"+
		"\n\u0011\f\u0011\u019d\t\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001"+
		"\u0012\u0005\u0012\u01a3\b\u0012\n\u0012\f\u0012\u01a6\t\u0012\u0001\u0012"+
		"\u0001\u0012\u0005\u0012\u01aa\b\u0012\n\u0012\f\u0012\u01ad\t\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u01b3\b\u0012\n"+
		"\u0012\f\u0012\u01b6\t\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u01ba"+
		"\b\u0012\n\u0012\f\u0012\u01bd\t\u0012\u0001\u0012\u0001\u0012\u0003\u0012"+
		"\u01c1\b\u0012\u0001\u0013\u0001\u0013\u0005\u0013\u01c5\b\u0013\n\u0013"+
		"\f\u0013\u01c8\t\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u01cc\b\u0013"+
		"\n\u0013\f\u0013\u01cf\t\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0005\u0013\u01d5\b\u0013\n\u0013\f\u0013\u01d8\t\u0013\u0001\u0013"+
		"\u0001\u0013\u0005\u0013\u01dc\b\u0013\n\u0013\f\u0013\u01df\t\u0013\u0001"+
		"\u0013\u0001\u0013\u0003\u0013\u01e3\b\u0013\u0001\u0014\u0001\u0014\u0005"+
		"\u0014\u01e7\b\u0014\n\u0014\f\u0014\u01ea\t\u0014\u0001\u0014\u0001\u0014"+
		"\u0005\u0014\u01ee\b\u0014\n\u0014\f\u0014\u01f1\t\u0014\u0001\u0014\u0001"+
		"\u0014\u0005\u0014\u01f5\b\u0014\n\u0014\f\u0014\u01f8\t\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0015\u0001\u0015\u0005\u0015\u01fe\b\u0015\n\u0015"+
		"\f\u0015\u0201\t\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u0205\b\u0015"+
		"\n\u0015\f\u0015\u0208\t\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001"+
		"\u0016\u0005\u0016\u020e\b\u0016\n\u0016\f\u0016\u0211\t\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0017\u0001\u0017\u0005\u0017\u0217\b\u0017\n\u0017"+
		"\f\u0017\u021a\t\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018"+
		"\u0005\u0018\u0220\b\u0018\n\u0018\f\u0018\u0223\t\u0018\u0001\u0018\u0001"+
		"\u0018\u0005\u0018\u0227\b\u0018\n\u0018\f\u0018\u022a\t\u0018\u0001\u0018"+
		"\u0001\u0018\u0005\u0018\u022e\b\u0018\n\u0018\f\u0018\u0231\t\u0018\u0001"+
		"\u0018\u0001\u0018\u0005\u0018\u0235\b\u0018\n\u0018\f\u0018\u0238\t\u0018"+
		"\u0001\u0018\u0001\u0018\u0005\u0018\u023c\b\u0018\n\u0018\f\u0018\u023f"+
		"\t\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u0243\b\u0018\n\u0018\f\u0018"+
		"\u0246\t\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u024a\b\u0018\n\u0018"+
		"\f\u0018\u024d\t\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u0251\b\u0018"+
		"\n\u0018\f\u0018\u0254\t\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u0258"+
		"\b\u0018\n\u0018\f\u0018\u025b\t\u0018\u0001\u0018\u0001\u0018\u0001\u0019"+
		"\u0001\u0019\u0005\u0019\u0261\b\u0019\n\u0019\f\u0019\u0264\t\u0019\u0001"+
		"\u0019\u0005\u0019\u0267\b\u0019\n\u0019\f\u0019\u026a\t\u0019\u0001\u0019"+
		"\u0005\u0019\u026d\b\u0019\n\u0019\f\u0019\u0270\t\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u001a\u0001\u001a\u0005\u001a\u0276\b\u001a\n\u001a\f\u001a"+
		"\u0279\t\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u027d\b\u001a\n\u001a"+
		"\f\u001a\u0280\t\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a"+
		"\u0285\b\u001a\u0001\u001b\u0001\u001b\u0005\u001b\u0289\b\u001b\n\u001b"+
		"\f\u001b\u028c\t\u001b\u0001\u001b\u0001\u001b\u0005\u001b\u0290\b\u001b"+
		"\n\u001b\f\u001b\u0293\t\u001b\u0001\u001b\u0001\u001b\u0005\u001b\u0297"+
		"\b\u001b\n\u001b\f\u001b\u029a\t\u001b\u0001\u001b\u0001\u001b\u0005\u001b"+
		"\u029e\b\u001b\n\u001b\f\u001b\u02a1\t\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0005\u001b\u02a7\b\u001b\n\u001b\f\u001b\u02aa\t\u001b"+
		"\u0001\u001b\u0001\u001b\u0005\u001b\u02ae\b\u001b\n\u001b\f\u001b\u02b1"+
		"\t\u001b\u0001\u001b\u0001\u001b\u0005\u001b\u02b5\b\u001b\n\u001b\f\u001b"+
		"\u02b8\t\u001b\u0001\u001b\u0001\u001b\u0005\u001b\u02bc\b\u001b\n\u001b"+
		"\f\u001b\u02bf\t\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u02c3\b\u001b"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0003\u001c\u02cd\b\u001c\u0001\u001c\u0001\u001c"+
		"\u0005\u001c\u02d1\b\u001c\n\u001c\f\u001c\u02d4\t\u001c\u0001\u001c\u0001"+
		"\u001c\u0005\u001c\u02d8\b\u001c\n\u001c\f\u001c\u02db\t\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0005\u001c\u02e0\b\u001c\n\u001c\f\u001c\u02e3"+
		"\t\u001c\u0001\u001c\u0001\u001c\u0005\u001c\u02e7\b\u001c\n\u001c\f\u001c"+
		"\u02ea\t\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0005\u001c\u02ef\b"+
		"\u001c\n\u001c\f\u001c\u02f2\t\u001c\u0001\u001c\u0001\u001c\u0005\u001c"+
		"\u02f6\b\u001c\n\u001c\f\u001c\u02f9\t\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0005\u001c\u02fe\b\u001c\n\u001c\f\u001c\u0301\t\u001c\u0001\u001c"+
		"\u0005\u001c\u0304\b\u001c\n\u001c\f\u001c\u0307\t\u001c\u0001\u001d\u0001"+
		"\u001d\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001 \u0001 \u0005"+
		" \u0311\b \n \f \u0314\t \u0001 \u0001 \u0005 \u0318\b \n \f \u031b\t"+
		" \u0001 \u0001 \u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"#\u0001#\u0005#\u0328\b#\n#\f#\u032b\t#\u0001#\u0001#\u0005#\u032f\b#"+
		"\n#\f#\u0332\t#\u0001#\u0001#\u0001$\u0001$\u0001$\u0001$\u0005$\u033a"+
		"\b$\n$\f$\u033d\t$\u0001$\u0001$\u0005$\u0341\b$\n$\f$\u0344\t$\u0001"+
		"$\u0001$\u0001$\u0001$\u0005$\u034a\b$\n$\f$\u034d\t$\u0001$\u0001$\u0005"+
		"$\u0351\b$\n$\f$\u0354\t$\u0001$\u0001$\u0001$\u0001$\u0005$\u035a\b$"+
		"\n$\f$\u035d\t$\u0001$\u0001$\u0005$\u0361\b$\n$\f$\u0364\t$\u0001$\u0001"+
		"$\u0001$\u0001$\u0005$\u036a\b$\n$\f$\u036d\t$\u0001$\u0001$\u0005$\u0371"+
		"\b$\n$\f$\u0374\t$\u0001$\u0001$\u0001$\u0001$\u0005$\u037a\b$\n$\f$\u037d"+
		"\t$\u0001$\u0001$\u0005$\u0381\b$\n$\f$\u0384\t$\u0001$\u0001$\u0001$"+
		"\u0001$\u0001$\u0001$\u0001$\u0001$\u0005$\u038e\b$\n$\f$\u0391\t$\u0001"+
		"$\u0003$\u0394\b$\u0001$\u0001$\u0005$\u0398\b$\n$\f$\u039b\t$\u0001$"+
		"\u0001$\u0005$\u039f\b$\n$\f$\u03a2\t$\u0001$\u0001$\u0001$\u0005$\u03a7"+
		"\b$\n$\f$\u03aa\t$\u0001$\u0001$\u0005$\u03ae\b$\n$\f$\u03b1\t$\u0001"+
		"$\u0005$\u03b4\b$\n$\f$\u03b7\t$\u0001%\u0001%\u0001&\u0001&\u0001\'\u0001"+
		"\'\u0001(\u0001(\u0001)\u0001)\u0001*\u0001*\u0001*\u0001*\u0001+\u0001"+
		"+\u0001+\u0001+\u0001+\u0000\u0004\u0002 8H,\u0000\u0002\u0004\u0006\b"+
		"\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02"+
		"468:<>@BDFHJLNPRTV\u0000\u0000\u042d\u0000[\u0001\u0000\u0000\u0000\u0002"+
		"p\u0001\u0000\u0000\u0000\u0004\u00a4\u0001\u0000\u0000\u0000\u0006\u00a6"+
		"\u0001\u0000\u0000\u0000\b\u00b6\u0001\u0000\u0000\u0000\n\u00d4\u0001"+
		"\u0000\u0000\u0000\f\u00ef\u0001\u0000\u0000\u0000\u000e\u0102\u0001\u0000"+
		"\u0000\u0000\u0010\u0104\u0001\u0000\u0000\u0000\u0012\u010d\u0001\u0000"+
		"\u0000\u0000\u0014\u011d\u0001\u0000\u0000\u0000\u0016\u0126\u0001\u0000"+
		"\u0000\u0000\u0018\u0139\u0001\u0000\u0000\u0000\u001a\u013b\u0001\u0000"+
		"\u0000\u0000\u001c\u0144\u0001\u0000\u0000\u0000\u001e\u0154\u0001\u0000"+
		"\u0000\u0000 \u0164\u0001\u0000\u0000\u0000\"\u0189\u0001\u0000\u0000"+
		"\u0000$\u01c0\u0001\u0000\u0000\u0000&\u01e2\u0001\u0000\u0000\u0000("+
		"\u01e4\u0001\u0000\u0000\u0000*\u01fb\u0001\u0000\u0000\u0000,\u020b\u0001"+
		"\u0000\u0000\u0000.\u0214\u0001\u0000\u0000\u00000\u021d\u0001\u0000\u0000"+
		"\u00002\u025e\u0001\u0000\u0000\u00004\u0284\u0001\u0000\u0000\u00006"+
		"\u02c2\u0001\u0000\u0000\u00008\u02cc\u0001\u0000\u0000\u0000:\u0308\u0001"+
		"\u0000\u0000\u0000<\u030a\u0001\u0000\u0000\u0000>\u030c\u0001\u0000\u0000"+
		"\u0000@\u030e\u0001\u0000\u0000\u0000B\u031e\u0001\u0000\u0000\u0000D"+
		"\u0321\u0001\u0000\u0000\u0000F\u0325\u0001\u0000\u0000\u0000H\u0393\u0001"+
		"\u0000\u0000\u0000J\u03b8\u0001\u0000\u0000\u0000L\u03ba\u0001\u0000\u0000"+
		"\u0000N\u03bc\u0001\u0000\u0000\u0000P\u03be\u0001\u0000\u0000\u0000R"+
		"\u03c0\u0001\u0000\u0000\u0000T\u03c2\u0001\u0000\u0000\u0000V\u03c6\u0001"+
		"\u0000\u0000\u0000XZ\u0005)\u0000\u0000YX\u0001\u0000\u0000\u0000Z]\u0001"+
		"\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000"+
		"\\^\u0001\u0000\u0000\u0000][\u0001\u0000\u0000\u0000^b\u0003\u0002\u0001"+
		"\u0000_a\u0005)\u0000\u0000`_\u0001\u0000\u0000\u0000ad\u0001\u0000\u0000"+
		"\u0000b`\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000ce\u0001\u0000"+
		"\u0000\u0000db\u0001\u0000\u0000\u0000ef\u0005\u0000\u0000\u0001f\u0001"+
		"\u0001\u0000\u0000\u0000gh\u0006\u0001\uffff\uffff\u0000hq\u0003\u0004"+
		"\u0002\u0000iq\u0003\u0006\u0003\u0000jq\u0003\b\u0004\u0000kq\u0003\n"+
		"\u0005\u0000lq\u0003\u0014\n\u0000mq\u00036\u001b\u0000nq\u00030\u0018"+
		"\u0000oq\u0003R)\u0000pg\u0001\u0000\u0000\u0000pi\u0001\u0000\u0000\u0000"+
		"pj\u0001\u0000\u0000\u0000pk\u0001\u0000\u0000\u0000pl\u0001\u0000\u0000"+
		"\u0000pm\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000po\u0001\u0000"+
		"\u0000\u0000q\u00a1\u0001\u0000\u0000\u0000rv\n\u0004\u0000\u0000su\u0005"+
		")\u0000\u0000ts\u0001\u0000\u0000\u0000ux\u0001\u0000\u0000\u0000vt\u0001"+
		"\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000wy\u0001\u0000\u0000\u0000"+
		"xv\u0001\u0000\u0000\u0000y}\u0005\u000b\u0000\u0000z|\u0005)\u0000\u0000"+
		"{z\u0001\u0000\u0000\u0000|\u007f\u0001\u0000\u0000\u0000}{\u0001\u0000"+
		"\u0000\u0000}~\u0001\u0000\u0000\u0000~\u0080\u0001\u0000\u0000\u0000"+
		"\u007f}\u0001\u0000\u0000\u0000\u0080\u00a0\u0003\u0002\u0001\u0005\u0081"+
		"\u0085\n\u0003\u0000\u0000\u0082\u0084\u0005)\u0000\u0000\u0083\u0082"+
		"\u0001\u0000\u0000\u0000\u0084\u0087\u0001\u0000\u0000\u0000\u0085\u0083"+
		"\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086\u0088"+
		"\u0001\u0000\u0000\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0088\u008c"+
		"\u0005\u0002\u0000\u0000\u0089\u008b\u0005)\u0000\u0000\u008a\u0089\u0001"+
		"\u0000\u0000\u0000\u008b\u008e\u0001\u0000\u0000\u0000\u008c\u008a\u0001"+
		"\u0000\u0000\u0000\u008c\u008d\u0001\u0000\u0000\u0000\u008d\u008f\u0001"+
		"\u0000\u0000\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008f\u00a0\u0003"+
		"8\u001c\u0000\u0090\u0094\n\u0002\u0000\u0000\u0091\u0093\u0005)\u0000"+
		"\u0000\u0092\u0091\u0001\u0000\u0000\u0000\u0093\u0096\u0001\u0000\u0000"+
		"\u0000\u0094\u0092\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000\u0000"+
		"\u0000\u0095\u0097\u0001\u0000\u0000\u0000\u0096\u0094\u0001\u0000\u0000"+
		"\u0000\u0097\u009b\u0005\u0003\u0000\u0000\u0098\u009a\u0005)\u0000\u0000"+
		"\u0099\u0098\u0001\u0000\u0000\u0000\u009a\u009d\u0001\u0000\u0000\u0000"+
		"\u009b\u0099\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000\u0000\u0000"+
		"\u009c\u009e\u0001\u0000\u0000\u0000\u009d\u009b\u0001\u0000\u0000\u0000"+
		"\u009e\u00a0\u00038\u001c\u0000\u009fr\u0001\u0000\u0000\u0000\u009f\u0081"+
		"\u0001\u0000\u0000\u0000\u009f\u0090\u0001\u0000\u0000\u0000\u00a0\u00a3"+
		"\u0001\u0000\u0000\u0000\u00a1\u009f\u0001\u0000\u0000\u0000\u00a1\u00a2"+
		"\u0001\u0000\u0000\u0000\u00a2\u0003\u0001\u0000\u0000\u0000\u00a3\u00a1"+
		"\u0001\u0000\u0000\u0000\u00a4\u00a5\u0003P(\u0000\u00a5\u0005\u0001\u0000"+
		"\u0000\u0000\u00a6\u00aa\u0005\u000e\u0000\u0000\u00a7\u00a9\u0005)\u0000"+
		"\u0000\u00a8\u00a7\u0001\u0000\u0000\u0000\u00a9\u00ac\u0001\u0000\u0000"+
		"\u0000\u00aa\u00a8\u0001\u0000\u0000\u0000\u00aa\u00ab\u0001\u0000\u0000"+
		"\u0000\u00ab\u00ad\u0001\u0000\u0000\u0000\u00ac\u00aa\u0001\u0000\u0000"+
		"\u0000\u00ad\u00b1\u0003\u0002\u0001\u0000\u00ae\u00b0\u0005)\u0000\u0000"+
		"\u00af\u00ae\u0001\u0000\u0000\u0000\u00b0\u00b3\u0001\u0000\u0000\u0000"+
		"\u00b1\u00af\u0001\u0000\u0000\u0000\u00b1\u00b2\u0001\u0000\u0000\u0000"+
		"\u00b2\u00b4\u0001\u0000\u0000\u0000\u00b3\u00b1\u0001\u0000\u0000\u0000"+
		"\u00b4\u00b5\u0005\u000f\u0000\u0000\u00b5\u0007\u0001\u0000\u0000\u0000"+
		"\u00b6\u00ba\u0003T*\u0000\u00b7\u00b9\u0005)\u0000\u0000\u00b8\u00b7"+
		"\u0001\u0000\u0000\u0000\u00b9\u00bc\u0001\u0000\u0000\u0000\u00ba\u00b8"+
		"\u0001\u0000\u0000\u0000\u00ba\u00bb\u0001\u0000\u0000\u0000\u00bb\u00bd"+
		"\u0001\u0000\u0000\u0000\u00bc\u00ba\u0001\u0000\u0000\u0000\u00bd\u00c1"+
		"\u0005\u001e\u0000\u0000\u00be\u00c0\u0005)\u0000\u0000\u00bf\u00be\u0001"+
		"\u0000\u0000\u0000\u00c0\u00c3\u0001\u0000\u0000\u0000\u00c1\u00bf\u0001"+
		"\u0000\u0000\u0000\u00c1\u00c2\u0001\u0000\u0000\u0000\u00c2\u00c4\u0001"+
		"\u0000\u0000\u0000\u00c3\u00c1\u0001\u0000\u0000\u0000\u00c4\u00c8\u0003"+
		"\u0002\u0001\u0000\u00c5\u00c7\u0005)\u0000\u0000\u00c6\u00c5\u0001\u0000"+
		"\u0000\u0000\u00c7\u00ca\u0001\u0000\u0000\u0000\u00c8\u00c6\u0001\u0000"+
		"\u0000\u0000\u00c8\u00c9\u0001\u0000\u0000\u0000\u00c9\u00cb\u0001\u0000"+
		"\u0000\u0000\u00ca\u00c8\u0001\u0000\u0000\u0000\u00cb\u00cf\u0005\u001f"+
		"\u0000\u0000\u00cc\u00ce\u0005)\u0000\u0000\u00cd\u00cc\u0001\u0000\u0000"+
		"\u0000\u00ce\u00d1\u0001\u0000\u0000\u0000\u00cf\u00cd\u0001\u0000\u0000"+
		"\u0000\u00cf\u00d0\u0001\u0000\u0000\u0000\u00d0\u00d2\u0001\u0000\u0000"+
		"\u0000\u00d1\u00cf\u0001\u0000\u0000\u0000\u00d2\u00d3\u0003V+\u0000\u00d3"+
		"\t\u0001\u0000\u0000\u0000\u00d4\u00d8\u0003\f\u0006\u0000\u00d5\u00d7"+
		"\u0005)\u0000\u0000\u00d6\u00d5\u0001\u0000\u0000\u0000\u00d7\u00da\u0001"+
		"\u0000\u0000\u0000\u00d8\u00d6\u0001\u0000\u0000\u0000\u00d8\u00d9\u0001"+
		"\u0000\u0000\u0000\u00d9\u00dc\u0001\u0000\u0000\u0000\u00da\u00d8\u0001"+
		"\u0000\u0000\u0000\u00db\u00dd\u0003\u0016\u000b\u0000\u00dc\u00db\u0001"+
		"\u0000\u0000\u0000\u00dc\u00dd\u0001\u0000\u0000\u0000\u00dd\u00e1\u0001"+
		"\u0000\u0000\u0000\u00de\u00e0\u0005)\u0000\u0000\u00df\u00de\u0001\u0000"+
		"\u0000\u0000\u00e0\u00e3\u0001\u0000\u0000\u0000\u00e1\u00df\u0001\u0000"+
		"\u0000\u0000\u00e1\u00e2\u0001\u0000\u0000\u0000\u00e2\u00e5\u0001\u0000"+
		"\u0000\u0000\u00e3\u00e1\u0001\u0000\u0000\u0000\u00e4\u00e6\u0003\u001e"+
		"\u000f\u0000\u00e5\u00e4\u0001\u0000\u0000\u0000\u00e5\u00e6\u0001\u0000"+
		"\u0000\u0000\u00e6\u00ea\u0001\u0000\u0000\u0000\u00e7\u00e9\u0005)\u0000"+
		"\u0000\u00e8\u00e7\u0001\u0000\u0000\u0000\u00e9\u00ec\u0001\u0000\u0000"+
		"\u0000\u00ea\u00e8\u0001\u0000\u0000\u0000\u00ea\u00eb\u0001\u0000\u0000"+
		"\u0000\u00eb\u00ed\u0001\u0000\u0000\u0000\u00ec\u00ea\u0001\u0000\u0000"+
		"\u0000\u00ed\u00ee\u0003.\u0017\u0000\u00ee\u000b\u0001\u0000\u0000\u0000"+
		"\u00ef\u00f3\u0005\u0018\u0000\u0000\u00f0\u00f2\u0005)\u0000\u0000\u00f1"+
		"\u00f0\u0001\u0000\u0000\u0000\u00f2\u00f5\u0001\u0000\u0000\u0000\u00f3"+
		"\u00f1\u0001\u0000\u0000\u0000\u00f3\u00f4\u0001\u0000\u0000\u0000\u00f4"+
		"\u00f6\u0001\u0000\u0000\u0000\u00f5\u00f3\u0001\u0000\u0000\u0000\u00f6"+
		"\u00f7\u0003\u000e\u0007\u0000\u00f7\r\u0001\u0000\u0000\u0000\u00f8\u00fc"+
		"\u0003\u0012\t\u0000\u00f9\u00fb\u0005)\u0000\u0000\u00fa\u00f9\u0001"+
		"\u0000\u0000\u0000\u00fb\u00fe\u0001\u0000\u0000\u0000\u00fc\u00fa\u0001"+
		"\u0000\u0000\u0000\u00fc\u00fd\u0001\u0000\u0000\u0000\u00fd\u00ff\u0001"+
		"\u0000\u0000\u0000\u00fe\u00fc\u0001\u0000\u0000\u0000\u00ff\u0100\u0003"+
		"\u0010\b\u0000\u0100\u0103\u0001\u0000\u0000\u0000\u0101\u0103\u0003\u0012"+
		"\t\u0000\u0102\u00f8\u0001\u0000\u0000\u0000\u0102\u0101\u0001\u0000\u0000"+
		"\u0000\u0103\u000f\u0001\u0000\u0000\u0000\u0104\u0108\u0005\u000b\u0000"+
		"\u0000\u0105\u0107\u0005)\u0000\u0000\u0106\u0105\u0001\u0000\u0000\u0000"+
		"\u0107\u010a\u0001\u0000\u0000\u0000\u0108\u0106\u0001\u0000\u0000\u0000"+
		"\u0108\u0109\u0001\u0000\u0000\u0000\u0109\u010b\u0001\u0000\u0000\u0000"+
		"\u010a\u0108\u0001\u0000\u0000\u0000\u010b\u010c\u0003\u000e\u0007\u0000"+
		"\u010c\u0011\u0001\u0000\u0000\u0000\u010d\u0111\u0003R)\u0000\u010e\u0110"+
		"\u0005)\u0000\u0000\u010f\u010e\u0001\u0000\u0000\u0000\u0110\u0113\u0001"+
		"\u0000\u0000\u0000\u0111\u010f\u0001\u0000\u0000\u0000\u0111\u0112\u0001"+
		"\u0000\u0000\u0000\u0112\u0114\u0001\u0000\u0000\u0000\u0113\u0111\u0001"+
		"\u0000\u0000\u0000\u0114\u0118\u0005\u001c\u0000\u0000\u0115\u0117\u0005"+
		")\u0000\u0000\u0116\u0115\u0001\u0000\u0000\u0000\u0117\u011a\u0001\u0000"+
		"\u0000\u0000\u0118\u0116\u0001\u0000\u0000\u0000\u0118\u0119\u0001\u0000"+
		"\u0000\u0000\u0119\u011b\u0001\u0000\u0000\u0000\u011a\u0118\u0001\u0000"+
		"\u0000\u0000\u011b\u011c\u0003\u0002\u0001\u0000\u011c\u0013\u0001\u0000"+
		"\u0000\u0000\u011d\u0121\u0003\u0016\u000b\u0000\u011e\u0120\u0005)\u0000"+
		"\u0000\u011f\u011e\u0001\u0000\u0000\u0000\u0120\u0123\u0001\u0000\u0000"+
		"\u0000\u0121\u011f\u0001\u0000\u0000\u0000\u0121\u0122\u0001\u0000\u0000"+
		"\u0000\u0122\u0124\u0001\u0000\u0000\u0000\u0123\u0121\u0001\u0000\u0000"+
		"\u0000\u0124\u0125\u0003\u0002\u0001\u0000\u0125\u0015\u0001\u0000\u0000"+
		"\u0000\u0126\u012a\u0005\u0019\u0000\u0000\u0127\u0129\u0005)\u0000\u0000"+
		"\u0128\u0127\u0001\u0000\u0000\u0000\u0129\u012c\u0001\u0000\u0000\u0000"+
		"\u012a\u0128\u0001\u0000\u0000\u0000\u012a\u012b\u0001\u0000\u0000\u0000"+
		"\u012b\u012d\u0001\u0000\u0000\u0000\u012c\u012a\u0001\u0000\u0000\u0000"+
		"\u012d\u012e\u0003\u0018\f\u0000\u012e\u0017\u0001\u0000\u0000\u0000\u012f"+
		"\u0133\u0003\u001c\u000e\u0000\u0130\u0132\u0005)\u0000\u0000\u0131\u0130"+
		"\u0001\u0000\u0000\u0000\u0132\u0135\u0001\u0000\u0000\u0000\u0133\u0131"+
		"\u0001\u0000\u0000\u0000\u0133\u0134\u0001\u0000\u0000\u0000\u0134\u0136"+
		"\u0001\u0000\u0000\u0000\u0135\u0133\u0001\u0000\u0000\u0000\u0136\u0137"+
		"\u0003\u001a\r\u0000\u0137\u013a\u0001\u0000\u0000\u0000\u0138\u013a\u0003"+
		"\u001c\u000e\u0000\u0139\u012f\u0001\u0000\u0000\u0000\u0139\u0138\u0001"+
		"\u0000\u0000\u0000\u013a\u0019\u0001\u0000\u0000\u0000\u013b\u013f\u0005"+
		"\u000b\u0000\u0000\u013c\u013e\u0005)\u0000\u0000\u013d\u013c\u0001\u0000"+
		"\u0000\u0000\u013e\u0141\u0001\u0000\u0000\u0000\u013f\u013d\u0001\u0000"+
		"\u0000\u0000\u013f\u0140\u0001\u0000\u0000\u0000\u0140\u0142\u0001\u0000"+
		"\u0000\u0000\u0141\u013f\u0001\u0000\u0000\u0000\u0142\u0143\u0003\u0018"+
		"\f\u0000\u0143\u001b\u0001\u0000\u0000\u0000\u0144\u0148\u0003R)\u0000"+
		"\u0145\u0147\u0005)\u0000\u0000\u0146\u0145\u0001\u0000\u0000\u0000\u0147"+
		"\u014a\u0001\u0000\u0000\u0000\u0148\u0146\u0001\u0000\u0000\u0000\u0148"+
		"\u0149\u0001\u0000\u0000\u0000\u0149\u014b\u0001\u0000\u0000\u0000\u014a"+
		"\u0148\u0001\u0000\u0000\u0000\u014b\u014f\u0005 \u0000\u0000\u014c\u014e"+
		"\u0005)\u0000\u0000\u014d\u014c\u0001\u0000\u0000\u0000\u014e\u0151\u0001"+
		"\u0000\u0000\u0000\u014f\u014d\u0001\u0000\u0000\u0000\u014f\u0150\u0001"+
		"\u0000\u0000\u0000\u0150\u0152\u0001\u0000\u0000\u0000\u0151\u014f\u0001"+
		"\u0000\u0000\u0000\u0152\u0153\u0003\u0002\u0001\u0000\u0153\u001d\u0001"+
		"\u0000\u0000\u0000\u0154\u0158\u0005\u001d\u0000\u0000\u0155\u0157\u0005"+
		")\u0000\u0000\u0156\u0155\u0001\u0000\u0000\u0000\u0157\u015a\u0001\u0000"+
		"\u0000\u0000\u0158\u0156\u0001\u0000\u0000\u0000\u0158\u0159\u0001\u0000"+
		"\u0000\u0000\u0159\u015b\u0001\u0000\u0000\u0000\u015a\u0158\u0001\u0000"+
		"\u0000\u0000\u015b\u015c\u0003 \u0010\u0000\u015c\u001f\u0001\u0000\u0000"+
		"\u0000\u015d\u015e\u0006\u0010\uffff\uffff\u0000\u015e\u0165\u0003\"\u0011"+
		"\u0000\u015f\u0165\u0003$\u0012\u0000\u0160\u0165\u0003&\u0013\u0000\u0161"+
		"\u0165\u0003(\u0014\u0000\u0162\u0165\u0003*\u0015\u0000\u0163\u0165\u0003"+
		",\u0016\u0000\u0164\u015d\u0001\u0000\u0000\u0000\u0164\u015f\u0001\u0000"+
		"\u0000\u0000\u0164\u0160\u0001\u0000\u0000\u0000\u0164\u0161\u0001\u0000"+
		"\u0000\u0000\u0164\u0162\u0001\u0000\u0000\u0000\u0164\u0163\u0001\u0000"+
		"\u0000\u0000\u0165\u0186\u0001\u0000\u0000\u0000\u0166\u016a\n\u0003\u0000"+
		"\u0000\u0167\u0169\u0005)\u0000\u0000\u0168\u0167\u0001\u0000\u0000\u0000"+
		"\u0169\u016c\u0001\u0000\u0000\u0000\u016a\u0168\u0001\u0000\u0000\u0000"+
		"\u016a\u016b\u0001\u0000\u0000\u0000\u016b\u016d\u0001\u0000\u0000\u0000"+
		"\u016c\u016a\u0001\u0000\u0000\u0000\u016d\u0171\u0005\b\u0000\u0000\u016e"+
		"\u0170\u0005)\u0000\u0000\u016f\u016e\u0001\u0000\u0000\u0000\u0170\u0173"+
		"\u0001\u0000\u0000\u0000\u0171\u016f\u0001\u0000\u0000\u0000\u0171\u0172"+
		"\u0001\u0000\u0000\u0000\u0172\u0174\u0001\u0000\u0000\u0000\u0173\u0171"+
		"\u0001\u0000\u0000\u0000\u0174\u0185\u0003 \u0010\u0004\u0175\u0179\n"+
		"\u0002\u0000\u0000\u0176\u0178\u0005)\u0000\u0000\u0177\u0176\u0001\u0000"+
		"\u0000\u0000\u0178\u017b\u0001\u0000\u0000\u0000\u0179\u0177\u0001\u0000"+
		"\u0000\u0000\u0179\u017a\u0001\u0000\u0000\u0000\u017a\u017c\u0001\u0000"+
		"\u0000\u0000\u017b\u0179\u0001\u0000\u0000\u0000\u017c\u0180\u0005\t\u0000"+
		"\u0000\u017d\u017f\u0005)\u0000\u0000\u017e\u017d\u0001\u0000\u0000\u0000"+
		"\u017f\u0182\u0001\u0000\u0000\u0000\u0180\u017e\u0001\u0000\u0000\u0000"+
		"\u0180\u0181\u0001\u0000\u0000\u0000\u0181\u0183\u0001\u0000\u0000\u0000"+
		"\u0182\u0180\u0001\u0000\u0000\u0000\u0183\u0185\u0003 \u0010\u0003\u0184"+
		"\u0166\u0001\u0000\u0000\u0000\u0184\u0175\u0001\u0000\u0000\u0000\u0185"+
		"\u0188\u0001\u0000\u0000\u0000\u0186\u0184\u0001\u0000\u0000\u0000\u0186"+
		"\u0187\u0001\u0000\u0000\u0000\u0187!\u0001\u0000\u0000\u0000\u0188\u0186"+
		"\u0001\u0000\u0000\u0000\u0189\u018d\u0005\u001b\u0000\u0000\u018a\u018c"+
		"\u0005)\u0000\u0000\u018b\u018a\u0001\u0000\u0000\u0000\u018c\u018f\u0001"+
		"\u0000\u0000\u0000\u018d\u018b\u0001\u0000\u0000\u0000\u018d\u018e\u0001"+
		"\u0000\u0000\u0000\u018e\u0190\u0001\u0000\u0000\u0000\u018f\u018d\u0001"+
		"\u0000\u0000\u0000\u0190\u0194\u0005\u000e\u0000\u0000\u0191\u0193\u0005"+
		")\u0000\u0000\u0192\u0191\u0001\u0000\u0000\u0000\u0193\u0196\u0001\u0000"+
		"\u0000\u0000\u0194\u0192\u0001\u0000\u0000\u0000\u0194\u0195\u0001\u0000"+
		"\u0000\u0000\u0195\u0197\u0001\u0000\u0000\u0000\u0196\u0194\u0001\u0000"+
		"\u0000\u0000\u0197\u019b\u0003\u0002\u0001\u0000\u0198\u019a\u0005)\u0000"+
		"\u0000\u0199\u0198\u0001\u0000\u0000\u0000\u019a\u019d\u0001\u0000\u0000"+
		"\u0000\u019b\u0199\u0001\u0000\u0000\u0000\u019b\u019c\u0001\u0000\u0000"+
		"\u0000\u019c\u019e\u0001\u0000\u0000\u0000\u019d\u019b\u0001\u0000\u0000"+
		"\u0000\u019e\u019f\u0005\u000f\u0000\u0000\u019f#\u0001\u0000\u0000\u0000"+
		"\u01a0\u01a4\u0003\u0002\u0001\u0000\u01a1\u01a3\u0005)\u0000\u0000\u01a2"+
		"\u01a1\u0001\u0000\u0000\u0000\u01a3\u01a6\u0001\u0000\u0000\u0000\u01a4"+
		"\u01a2\u0001\u0000\u0000\u0000\u01a4\u01a5\u0001\u0000\u0000\u0000\u01a5"+
		"\u01a7\u0001\u0000\u0000\u0000\u01a6\u01a4\u0001\u0000\u0000\u0000\u01a7"+
		"\u01ab\u0005\u0004\u0000\u0000\u01a8\u01aa\u0005)\u0000\u0000\u01a9\u01a8"+
		"\u0001\u0000\u0000\u0000\u01aa\u01ad\u0001\u0000\u0000\u0000\u01ab\u01a9"+
		"\u0001\u0000\u0000\u0000\u01ab\u01ac\u0001\u0000\u0000\u0000\u01ac\u01ae"+
		"\u0001\u0000\u0000\u0000\u01ad\u01ab\u0001\u0000\u0000\u0000\u01ae\u01af"+
		"\u0003\u0002\u0001\u0000\u01af\u01c1\u0001\u0000\u0000\u0000\u01b0\u01b4"+
		"\u0003\u0002\u0001\u0000\u01b1\u01b3\u0005)\u0000\u0000\u01b2\u01b1\u0001"+
		"\u0000\u0000\u0000\u01b3\u01b6\u0001\u0000\u0000\u0000\u01b4\u01b2\u0001"+
		"\u0000\u0000\u0000\u01b4\u01b5\u0001\u0000\u0000\u0000\u01b5\u01b7\u0001"+
		"\u0000\u0000\u0000\u01b6\u01b4\u0001\u0000\u0000\u0000\u01b7\u01bb\u0005"+
		"\u0007\u0000\u0000\u01b8\u01ba\u0005)\u0000\u0000\u01b9\u01b8\u0001\u0000"+
		"\u0000\u0000\u01ba\u01bd\u0001\u0000\u0000\u0000\u01bb\u01b9\u0001\u0000"+
		"\u0000\u0000\u01bb\u01bc\u0001\u0000\u0000\u0000\u01bc\u01be\u0001\u0000"+
		"\u0000\u0000\u01bd\u01bb\u0001\u0000\u0000\u0000\u01be\u01bf\u0003\u0002"+
		"\u0001\u0000\u01bf\u01c1\u0001\u0000\u0000\u0000\u01c0\u01a0\u0001\u0000"+
		"\u0000\u0000\u01c0\u01b0\u0001\u0000\u0000\u0000\u01c1%\u0001\u0000\u0000"+
		"\u0000\u01c2\u01c6\u0003\u0002\u0001\u0000\u01c3\u01c5\u0005)\u0000\u0000"+
		"\u01c4\u01c3\u0001\u0000\u0000\u0000\u01c5\u01c8\u0001\u0000\u0000\u0000"+
		"\u01c6\u01c4\u0001\u0000\u0000\u0000\u01c6\u01c7\u0001\u0000\u0000\u0000"+
		"\u01c7\u01c9\u0001\u0000\u0000\u0000\u01c8\u01c6\u0001\u0000\u0000\u0000"+
		"\u01c9\u01cd\u0005\u0005\u0000\u0000\u01ca\u01cc\u0005)\u0000\u0000\u01cb"+
		"\u01ca\u0001\u0000\u0000\u0000\u01cc\u01cf\u0001\u0000\u0000\u0000\u01cd"+
		"\u01cb\u0001\u0000\u0000\u0000\u01cd\u01ce\u0001\u0000\u0000\u0000\u01ce"+
		"\u01d0\u0001\u0000\u0000\u0000\u01cf\u01cd\u0001\u0000\u0000\u0000\u01d0"+
		"\u01d1\u0003\u0002\u0001\u0000\u01d1\u01e3\u0001\u0000\u0000\u0000\u01d2"+
		"\u01d6\u0003\u0002\u0001\u0000\u01d3\u01d5\u0005)\u0000\u0000\u01d4\u01d3"+
		"\u0001\u0000\u0000\u0000\u01d5\u01d8\u0001\u0000\u0000\u0000\u01d6\u01d4"+
		"\u0001\u0000\u0000\u0000\u01d6\u01d7\u0001\u0000\u0000\u0000\u01d7\u01d9"+
		"\u0001\u0000\u0000\u0000\u01d8\u01d6\u0001\u0000\u0000\u0000\u01d9\u01dd"+
		"\u0005\u0006\u0000\u0000\u01da\u01dc\u0005)\u0000\u0000\u01db\u01da\u0001"+
		"\u0000\u0000\u0000\u01dc\u01df\u0001\u0000\u0000\u0000\u01dd\u01db\u0001"+
		"\u0000\u0000\u0000\u01dd\u01de\u0001\u0000\u0000\u0000\u01de\u01e0\u0001"+
		"\u0000\u0000\u0000\u01df\u01dd\u0001\u0000\u0000\u0000\u01e0\u01e1\u0003"+
		"\u0002\u0001\u0000\u01e1\u01e3\u0001\u0000\u0000\u0000\u01e2\u01c2\u0001"+
		"\u0000\u0000\u0000\u01e2\u01d2\u0001\u0000\u0000\u0000\u01e3\'\u0001\u0000"+
		"\u0000\u0000\u01e4\u01e8\u0005\u001a\u0000\u0000\u01e5\u01e7\u0005)\u0000"+
		"\u0000\u01e6\u01e5\u0001\u0000\u0000\u0000\u01e7\u01ea\u0001\u0000\u0000"+
		"\u0000\u01e8\u01e6\u0001\u0000\u0000\u0000\u01e8\u01e9\u0001\u0000\u0000"+
		"\u0000\u01e9\u01eb\u0001\u0000\u0000\u0000\u01ea\u01e8\u0001\u0000\u0000"+
		"\u0000\u01eb\u01ef\u0003\u000e\u0007\u0000\u01ec\u01ee\u0005)\u0000\u0000"+
		"\u01ed\u01ec\u0001\u0000\u0000\u0000\u01ee\u01f1\u0001\u0000\u0000\u0000"+
		"\u01ef\u01ed\u0001\u0000\u0000\u0000\u01ef\u01f0\u0001\u0000\u0000\u0000"+
		"\u01f0\u01f2\u0001\u0000\u0000\u0000\u01f1\u01ef\u0001\u0000\u0000\u0000"+
		"\u01f2\u01f6\u0005\"\u0000\u0000\u01f3\u01f5\u0005)\u0000\u0000\u01f4"+
		"\u01f3\u0001\u0000\u0000\u0000\u01f5\u01f8\u0001\u0000\u0000\u0000\u01f6"+
		"\u01f4\u0001\u0000\u0000\u0000\u01f6\u01f7\u0001\u0000\u0000\u0000\u01f7"+
		"\u01f9\u0001\u0000\u0000\u0000\u01f8\u01f6\u0001\u0000\u0000\u0000\u01f9"+
		"\u01fa\u0003 \u0010\u0000\u01fa)\u0001\u0000\u0000\u0000\u01fb\u01ff\u0005"+
		"\u000e\u0000\u0000\u01fc\u01fe\u0005)\u0000\u0000\u01fd\u01fc\u0001\u0000"+
		"\u0000\u0000\u01fe\u0201\u0001\u0000\u0000\u0000\u01ff\u01fd\u0001\u0000"+
		"\u0000\u0000\u01ff\u0200\u0001\u0000\u0000\u0000\u0200\u0202\u0001\u0000"+
		"\u0000\u0000\u0201\u01ff\u0001\u0000\u0000\u0000\u0202\u0206\u0003 \u0010"+
		"\u0000\u0203\u0205\u0005)\u0000\u0000\u0204\u0203\u0001\u0000\u0000\u0000"+
		"\u0205\u0208\u0001\u0000\u0000\u0000\u0206\u0204\u0001\u0000\u0000\u0000"+
		"\u0206\u0207\u0001\u0000\u0000\u0000\u0207\u0209\u0001\u0000\u0000\u0000"+
		"\u0208\u0206\u0001\u0000\u0000\u0000\u0209\u020a\u0005\u000f\u0000\u0000"+
		"\u020a+\u0001\u0000\u0000\u0000\u020b\u020f\u0005\n\u0000\u0000\u020c"+
		"\u020e\u0005)\u0000\u0000\u020d\u020c\u0001\u0000\u0000\u0000\u020e\u0211"+
		"\u0001\u0000\u0000\u0000\u020f\u020d\u0001\u0000\u0000\u0000\u020f\u0210"+
		"\u0001\u0000\u0000\u0000\u0210\u0212\u0001\u0000\u0000\u0000\u0211\u020f"+
		"\u0001\u0000\u0000\u0000\u0212\u0213\u0003 \u0010\u0000\u0213-\u0001\u0000"+
		"\u0000\u0000\u0214\u0218\u0005!\u0000\u0000\u0215\u0217\u0005)\u0000\u0000"+
		"\u0216\u0215\u0001\u0000\u0000\u0000\u0217\u021a\u0001\u0000\u0000\u0000"+
		"\u0218\u0216\u0001\u0000\u0000\u0000\u0218\u0219\u0001\u0000\u0000\u0000"+
		"\u0219\u021b\u0001\u0000\u0000\u0000\u021a\u0218\u0001\u0000\u0000\u0000"+
		"\u021b\u021c\u0003\u0002\u0001\u0000\u021c/\u0001\u0000\u0000\u0000\u021d"+
		"\u0221\u0005&\u0000\u0000\u021e\u0220\u0005)\u0000\u0000\u021f\u021e\u0001"+
		"\u0000\u0000\u0000\u0220\u0223\u0001\u0000\u0000\u0000\u0221\u021f\u0001"+
		"\u0000\u0000\u0000\u0221\u0222\u0001\u0000\u0000\u0000\u0222\u0224\u0001"+
		"\u0000\u0000\u0000\u0223\u0221\u0001\u0000\u0000\u0000\u0224\u0228\u0005"+
		"\u000e\u0000\u0000\u0225\u0227\u0005)\u0000\u0000\u0226\u0225\u0001\u0000"+
		"\u0000\u0000\u0227\u022a\u0001\u0000\u0000\u0000\u0228\u0226\u0001\u0000"+
		"\u0000\u0000\u0228\u0229\u0001\u0000\u0000\u0000\u0229\u022b\u0001\u0000"+
		"\u0000\u0000\u022a\u0228\u0001\u0000\u0000\u0000\u022b\u022f\u0003\u0002"+
		"\u0001\u0000\u022c\u022e\u0005)\u0000\u0000\u022d\u022c\u0001\u0000\u0000"+
		"\u0000\u022e\u0231\u0001\u0000\u0000\u0000\u022f\u022d\u0001\u0000\u0000"+
		"\u0000\u022f\u0230\u0001\u0000\u0000\u0000\u0230\u0232\u0001\u0000\u0000"+
		"\u0000\u0231\u022f\u0001\u0000\u0000\u0000\u0232\u0236\u0005\u000b\u0000"+
		"\u0000\u0233\u0235\u0005)\u0000\u0000\u0234\u0233\u0001\u0000\u0000\u0000"+
		"\u0235\u0238\u0001\u0000\u0000\u0000\u0236\u0234\u0001\u0000\u0000\u0000"+
		"\u0236\u0237\u0001\u0000\u0000\u0000\u0237\u0239\u0001\u0000\u0000\u0000"+
		"\u0238\u0236\u0001\u0000\u0000\u0000\u0239\u023d\u0003\u0002\u0001\u0000"+
		"\u023a\u023c\u0005)\u0000\u0000\u023b\u023a\u0001\u0000\u0000\u0000\u023c"+
		"\u023f\u0001\u0000\u0000\u0000\u023d\u023b\u0001\u0000\u0000\u0000\u023d"+
		"\u023e\u0001\u0000\u0000\u0000\u023e\u0240\u0001\u0000\u0000\u0000\u023f"+
		"\u023d\u0001\u0000\u0000\u0000\u0240\u0244\u0005\u000b\u0000\u0000\u0241"+
		"\u0243\u0005)\u0000\u0000\u0242\u0241\u0001\u0000\u0000\u0000\u0243\u0246"+
		"\u0001\u0000\u0000\u0000\u0244\u0242\u0001\u0000\u0000\u0000\u0244\u0245"+
		"\u0001\u0000\u0000\u0000\u0245\u0247\u0001\u0000\u0000\u0000\u0246\u0244"+
		"\u0001\u0000\u0000\u0000\u0247\u024b\u00032\u0019\u0000\u0248\u024a\u0005"+
		")\u0000\u0000\u0249\u0248\u0001\u0000\u0000\u0000\u024a\u024d\u0001\u0000"+
		"\u0000\u0000\u024b\u0249\u0001\u0000\u0000\u0000\u024b\u024c\u0001\u0000"+
		"\u0000\u0000\u024c\u024e\u0001\u0000\u0000\u0000\u024d\u024b\u0001\u0000"+
		"\u0000\u0000\u024e\u0252\u0005\u000b\u0000\u0000\u024f\u0251\u0005)\u0000"+
		"\u0000\u0250\u024f\u0001\u0000\u0000\u0000\u0251\u0254\u0001\u0000\u0000"+
		"\u0000\u0252\u0250\u0001\u0000\u0000\u0000\u0252\u0253\u0001\u0000\u0000"+
		"\u0000\u0253\u0255\u0001\u0000\u0000\u0000\u0254\u0252\u0001\u0000\u0000"+
		"\u0000\u0255\u0259\u00032\u0019\u0000\u0256\u0258\u0005)\u0000\u0000\u0257"+
		"\u0256\u0001\u0000\u0000\u0000\u0258\u025b\u0001\u0000\u0000\u0000\u0259"+
		"\u0257\u0001\u0000\u0000\u0000\u0259\u025a\u0001\u0000\u0000\u0000\u025a"+
		"\u025c\u0001\u0000\u0000\u0000\u025b\u0259\u0001\u0000\u0000\u0000\u025c"+
		"\u025d\u0005\u000f\u0000\u0000\u025d1\u0001\u0000\u0000\u0000\u025e\u0262"+
		"\u0005\f\u0000\u0000\u025f\u0261\u0005)\u0000\u0000\u0260\u025f\u0001"+
		"\u0000\u0000\u0000\u0261\u0264\u0001\u0000\u0000\u0000\u0262\u0260\u0001"+
		"\u0000\u0000\u0000\u0262\u0263\u0001\u0000\u0000\u0000\u0263\u0268\u0001"+
		"\u0000\u0000\u0000\u0264\u0262\u0001\u0000\u0000\u0000\u0265\u0267\u0003"+
		"4\u001a\u0000\u0266\u0265\u0001\u0000\u0000\u0000\u0267\u026a\u0001\u0000"+
		"\u0000\u0000\u0268\u0266\u0001\u0000\u0000\u0000\u0268\u0269\u0001\u0000"+
		"\u0000\u0000\u0269\u026e\u0001\u0000\u0000\u0000\u026a\u0268\u0001\u0000"+
		"\u0000\u0000\u026b\u026d\u0005)\u0000\u0000\u026c\u026b\u0001\u0000\u0000"+
		"\u0000\u026d\u0270\u0001\u0000\u0000\u0000\u026e\u026c\u0001\u0000\u0000"+
		"\u0000\u026e\u026f\u0001\u0000\u0000\u0000\u026f\u0271\u0001\u0000\u0000"+
		"\u0000\u0270\u026e\u0001\u0000\u0000\u0000\u0271\u0272\u0005\r\u0000\u0000"+
		"\u02723\u0001\u0000\u0000\u0000\u0273\u0277\u0003J%\u0000\u0274\u0276"+
		"\u0005)\u0000\u0000\u0275\u0274\u0001\u0000\u0000\u0000\u0276\u0279\u0001"+
		"\u0000\u0000\u0000\u0277\u0275\u0001\u0000\u0000\u0000\u0277\u0278\u0001"+
		"\u0000\u0000\u0000\u0278\u027a\u0001\u0000\u0000\u0000\u0279\u0277\u0001"+
		"\u0000\u0000\u0000\u027a\u027e\u0005\u000b\u0000\u0000\u027b\u027d\u0005"+
		")\u0000\u0000\u027c\u027b\u0001\u0000\u0000\u0000\u027d\u0280\u0001\u0000"+
		"\u0000\u0000\u027e\u027c\u0001\u0000\u0000\u0000\u027e\u027f\u0001\u0000"+
		"\u0000\u0000\u027f\u0281\u0001\u0000\u0000\u0000\u0280\u027e\u0001\u0000"+
		"\u0000\u0000\u0281\u0282\u00034\u001a\u0000\u0282\u0285\u0001\u0000\u0000"+
		"\u0000\u0283\u0285\u0003J%\u0000\u0284\u0273\u0001\u0000\u0000\u0000\u0284"+
		"\u0283\u0001\u0000\u0000\u0000\u02855\u0001\u0000\u0000\u0000\u0286\u028a"+
		"\u0005\u0001\u0000\u0000\u0287\u0289\u0005)\u0000\u0000\u0288\u0287\u0001"+
		"\u0000\u0000\u0000\u0289\u028c\u0001\u0000\u0000\u0000\u028a\u0288\u0001"+
		"\u0000\u0000\u0000\u028a\u028b\u0001\u0000\u0000\u0000\u028b\u028d\u0001"+
		"\u0000\u0000\u0000\u028c\u028a\u0001\u0000\u0000\u0000\u028d\u0291\u0003"+
		"N\'\u0000\u028e\u0290\u0005)\u0000\u0000\u028f\u028e\u0001\u0000\u0000"+
		"\u0000\u0290\u0293\u0001\u0000\u0000\u0000\u0291\u028f\u0001\u0000\u0000"+
		"\u0000\u0291\u0292\u0001\u0000\u0000\u0000\u0292\u0294\u0001\u0000\u0000"+
		"\u0000\u0293\u0291\u0001\u0000\u0000\u0000\u0294\u0298\u0005\u000f\u0000"+
		"\u0000\u0295\u0297\u0005)\u0000\u0000\u0296\u0295\u0001\u0000\u0000\u0000"+
		"\u0297\u029a\u0001\u0000\u0000\u0000\u0298\u0296\u0001\u0000\u0000\u0000"+
		"\u0298\u0299\u0001\u0000\u0000\u0000\u0299\u029b\u0001\u0000\u0000\u0000"+
		"\u029a\u0298\u0001\u0000\u0000\u0000\u029b\u029f\u0005\u0002\u0000\u0000"+
		"\u029c\u029e\u0005)\u0000\u0000\u029d\u029c\u0001\u0000\u0000\u0000\u029e"+
		"\u02a1\u0001\u0000\u0000\u0000\u029f\u029d\u0001\u0000\u0000\u0000\u029f"+
		"\u02a0\u0001\u0000\u0000\u0000\u02a0\u02a2\u0001\u0000\u0000\u0000\u02a1"+
		"\u029f\u0001\u0000\u0000\u0000\u02a2\u02a3\u00038\u001c\u0000\u02a3\u02c3"+
		"\u0001\u0000\u0000\u0000\u02a4\u02a8\u0005\u0001\u0000\u0000\u02a5\u02a7"+
		"\u0005)\u0000\u0000\u02a6\u02a5\u0001\u0000\u0000\u0000\u02a7\u02aa\u0001"+
		"\u0000\u0000\u0000\u02a8\u02a6\u0001\u0000\u0000\u0000\u02a8\u02a9\u0001"+
		"\u0000\u0000\u0000\u02a9\u02ab\u0001\u0000\u0000\u0000\u02aa\u02a8\u0001"+
		"\u0000\u0000\u0000\u02ab\u02af\u0003N\'\u0000\u02ac\u02ae\u0005)\u0000"+
		"\u0000\u02ad\u02ac\u0001\u0000\u0000\u0000\u02ae\u02b1\u0001\u0000\u0000"+
		"\u0000\u02af\u02ad\u0001\u0000\u0000\u0000\u02af\u02b0\u0001\u0000\u0000"+
		"\u0000\u02b0\u02b2\u0001\u0000\u0000\u0000\u02b1\u02af\u0001\u0000\u0000"+
		"\u0000\u02b2\u02b6\u0005\u000f\u0000\u0000\u02b3\u02b5\u0005)\u0000\u0000"+
		"\u02b4\u02b3\u0001\u0000\u0000\u0000\u02b5\u02b8\u0001\u0000\u0000\u0000"+
		"\u02b6\u02b4\u0001\u0000\u0000\u0000\u02b6\u02b7\u0001\u0000\u0000\u0000"+
		"\u02b7\u02b9\u0001\u0000\u0000\u0000\u02b8\u02b6\u0001\u0000\u0000\u0000"+
		"\u02b9\u02bd\u0005\u0003\u0000\u0000\u02ba\u02bc\u0005)\u0000\u0000\u02bb"+
		"\u02ba\u0001\u0000\u0000\u0000\u02bc\u02bf\u0001\u0000\u0000\u0000\u02bd"+
		"\u02bb\u0001\u0000\u0000\u0000\u02bd\u02be\u0001\u0000\u0000\u0000\u02be"+
		"\u02c0\u0001\u0000\u0000\u0000\u02bf\u02bd\u0001\u0000\u0000\u0000\u02c0"+
		"\u02c1\u00038\u001c\u0000\u02c1\u02c3\u0001\u0000\u0000\u0000\u02c2\u0286"+
		"\u0001\u0000\u0000\u0000\u02c2\u02a4\u0001\u0000\u0000\u0000\u02c37\u0001"+
		"\u0000\u0000\u0000\u02c4\u02c5\u0006\u001c\uffff\uffff\u0000\u02c5\u02cd"+
		"\u0003J%\u0000\u02c6\u02cd\u0003:\u001d\u0000\u02c7\u02cd\u0003<\u001e"+
		"\u0000\u02c8\u02cd\u0003>\u001f\u0000\u02c9\u02cd\u0003D\"\u0000\u02ca"+
		"\u02cd\u0003B!\u0000\u02cb\u02cd\u0003F#\u0000\u02cc\u02c4\u0001\u0000"+
		"\u0000\u0000\u02cc\u02c6\u0001\u0000\u0000\u0000\u02cc\u02c7\u0001\u0000"+
		"\u0000\u0000\u02cc\u02c8\u0001\u0000\u0000\u0000\u02cc\u02c9\u0001\u0000"+
		"\u0000\u0000\u02cc\u02ca\u0001\u0000\u0000\u0000\u02cc\u02cb\u0001\u0000"+
		"\u0000\u0000\u02cd\u0305\u0001\u0000\u0000\u0000\u02ce\u02d2\n\u0004\u0000"+
		"\u0000\u02cf\u02d1\u0005)\u0000\u0000\u02d0\u02cf\u0001\u0000\u0000\u0000"+
		"\u02d1\u02d4\u0001\u0000\u0000\u0000\u02d2\u02d0\u0001\u0000\u0000\u0000"+
		"\u02d2\u02d3\u0001\u0000\u0000\u0000\u02d3\u02d5\u0001\u0000\u0000\u0000"+
		"\u02d4\u02d2\u0001\u0000\u0000\u0000\u02d5\u02d9\u0005\u0002\u0000\u0000"+
		"\u02d6\u02d8\u0005)\u0000\u0000\u02d7\u02d6\u0001\u0000\u0000\u0000\u02d8"+
		"\u02db\u0001\u0000\u0000\u0000\u02d9\u02d7\u0001\u0000\u0000\u0000\u02d9"+
		"\u02da\u0001\u0000\u0000\u0000\u02da\u02dc\u0001\u0000\u0000\u0000\u02db"+
		"\u02d9\u0001\u0000\u0000\u0000\u02dc\u0304\u00038\u001c\u0005\u02dd\u02e1"+
		"\n\u0003\u0000\u0000\u02de\u02e0\u0005)\u0000\u0000\u02df\u02de\u0001"+
		"\u0000\u0000\u0000\u02e0\u02e3\u0001\u0000\u0000\u0000\u02e1\u02df\u0001"+
		"\u0000\u0000\u0000\u02e1\u02e2\u0001\u0000\u0000\u0000\u02e2\u02e4\u0001"+
		"\u0000\u0000\u0000\u02e3\u02e1\u0001\u0000\u0000\u0000\u02e4\u02e8\u0005"+
		"\u0003\u0000\u0000\u02e5\u02e7\u0005)\u0000\u0000\u02e6\u02e5\u0001\u0000"+
		"\u0000\u0000\u02e7\u02ea\u0001\u0000\u0000\u0000\u02e8\u02e6\u0001\u0000"+
		"\u0000\u0000\u02e8\u02e9\u0001\u0000\u0000\u0000\u02e9\u02eb\u0001\u0000"+
		"\u0000\u0000\u02ea\u02e8\u0001\u0000\u0000\u0000\u02eb\u0304\u00038\u001c"+
		"\u0004\u02ec\u02f0\n\u0001\u0000\u0000\u02ed\u02ef\u0005)\u0000\u0000"+
		"\u02ee\u02ed\u0001\u0000\u0000\u0000\u02ef\u02f2\u0001\u0000\u0000\u0000"+
		"\u02f0\u02ee\u0001\u0000\u0000\u0000\u02f0\u02f1\u0001\u0000\u0000\u0000"+
		"\u02f1\u02f3\u0001\u0000\u0000\u0000\u02f2\u02f0\u0001\u0000\u0000\u0000"+
		"\u02f3\u02f7\u0005\u000b\u0000\u0000\u02f4\u02f6\u0005)\u0000\u0000\u02f5"+
		"\u02f4\u0001\u0000\u0000\u0000\u02f6\u02f9\u0001\u0000\u0000\u0000\u02f7"+
		"\u02f5\u0001\u0000\u0000\u0000\u02f7\u02f8\u0001\u0000\u0000\u0000\u02f8"+
		"\u02fa\u0001\u0000\u0000\u0000\u02f9\u02f7\u0001\u0000\u0000\u0000\u02fa"+
		"\u0304\u00038\u001c\u0002\u02fb\u02ff\n\u0002\u0000\u0000\u02fc\u02fe"+
		"\u0005)\u0000\u0000\u02fd\u02fc\u0001\u0000\u0000\u0000\u02fe\u0301\u0001"+
		"\u0000\u0000\u0000\u02ff\u02fd\u0001\u0000\u0000\u0000\u02ff\u0300\u0001"+
		"\u0000\u0000\u0000\u0300\u0302\u0001\u0000\u0000\u0000\u0301\u02ff\u0001"+
		"\u0000\u0000\u0000\u0302\u0304\u0003@ \u0000\u0303\u02ce\u0001\u0000\u0000"+
		"\u0000\u0303\u02dd\u0001\u0000\u0000\u0000\u0303\u02ec\u0001\u0000\u0000"+
		"\u0000\u0303\u02fb\u0001\u0000\u0000\u0000\u0304\u0307\u0001\u0000\u0000"+
		"\u0000\u0305\u0303\u0001\u0000\u0000\u0000\u0305\u0306\u0001\u0000\u0000"+
		"\u0000\u03069\u0001\u0000\u0000\u0000\u0307\u0305\u0001\u0000\u0000\u0000"+
		"\u0308\u0309\u0005\u0012\u0000\u0000\u0309;\u0001\u0000\u0000\u0000\u030a"+
		"\u030b\u0005\u0013\u0000\u0000\u030b=\u0001\u0000\u0000\u0000\u030c\u030d"+
		"\u0005\u0014\u0000\u0000\u030d?\u0001\u0000\u0000\u0000\u030e\u0312\u0005"+
		"\f\u0000\u0000\u030f\u0311\u0005)\u0000\u0000\u0310\u030f\u0001\u0000"+
		"\u0000\u0000\u0311\u0314\u0001\u0000\u0000\u0000\u0312\u0310\u0001\u0000"+
		"\u0000\u0000\u0312\u0313\u0001\u0000\u0000\u0000\u0313\u0315\u0001\u0000"+
		"\u0000\u0000\u0314\u0312\u0001\u0000\u0000\u0000\u0315\u0319\u0003H$\u0000"+
		"\u0316\u0318\u0005)\u0000\u0000\u0317\u0316\u0001\u0000\u0000\u0000\u0318"+
		"\u031b\u0001\u0000\u0000\u0000\u0319\u0317\u0001\u0000\u0000\u0000\u0319"+
		"\u031a\u0001\u0000\u0000\u0000\u031a\u031c\u0001\u0000\u0000\u0000\u031b"+
		"\u0319\u0001\u0000\u0000\u0000\u031c\u031d\u0005\r\u0000\u0000\u031dA"+
		"\u0001\u0000\u0000\u0000\u031e\u031f\u0005\u0010\u0000\u0000\u031f\u0320"+
		"\u0003L&\u0000\u0320C\u0001\u0000\u0000\u0000\u0321\u0322\u0005\u0011"+
		"\u0000\u0000\u0322\u0323\u0005\u000e\u0000\u0000\u0323\u0324\u0005\u000f"+
		"\u0000\u0000\u0324E\u0001\u0000\u0000\u0000\u0325\u0329\u0005\u000e\u0000"+
		"\u0000\u0326\u0328\u0005)\u0000\u0000\u0327\u0326\u0001\u0000\u0000\u0000"+
		"\u0328\u032b\u0001\u0000\u0000\u0000\u0329\u0327\u0001\u0000\u0000\u0000"+
		"\u0329\u032a\u0001\u0000\u0000\u0000\u032a\u032c\u0001\u0000\u0000\u0000"+
		"\u032b\u0329\u0001\u0000\u0000\u0000\u032c\u0330\u00038\u001c\u0000\u032d"+
		"\u032f\u0005)\u0000\u0000\u032e\u032d\u0001\u0000\u0000\u0000\u032f\u0332"+
		"\u0001\u0000\u0000\u0000\u0330\u032e\u0001\u0000\u0000\u0000\u0330\u0331"+
		"\u0001\u0000\u0000\u0000\u0331\u0333\u0001\u0000\u0000\u0000\u0332\u0330"+
		"\u0001\u0000\u0000\u0000\u0333\u0334\u0005\u000f\u0000\u0000\u0334G\u0001"+
		"\u0000\u0000\u0000\u0335\u0336\u0006$\uffff\uffff\u0000\u0336\u0394\u0003"+
		"8\u001c\u0000\u0337\u033b\u00038\u001c\u0000\u0338\u033a\u0005)\u0000"+
		"\u0000\u0339\u0338\u0001\u0000\u0000\u0000\u033a\u033d\u0001\u0000\u0000"+
		"\u0000\u033b\u0339\u0001\u0000\u0000\u0000\u033b\u033c\u0001\u0000\u0000"+
		"\u0000\u033c\u033e\u0001\u0000\u0000\u0000\u033d\u033b\u0001\u0000\u0000"+
		"\u0000\u033e\u0342\u0005\u0004\u0000\u0000\u033f\u0341\u0005)\u0000\u0000"+
		"\u0340\u033f\u0001\u0000\u0000\u0000\u0341\u0344\u0001\u0000\u0000\u0000"+
		"\u0342\u0340\u0001\u0000\u0000\u0000\u0342\u0343\u0001\u0000\u0000\u0000"+
		"\u0343\u0345\u0001\u0000\u0000\u0000\u0344\u0342\u0001\u0000\u0000\u0000"+
		"\u0345\u0346\u00038\u001c\u0000\u0346\u0394\u0001\u0000\u0000\u0000\u0347"+
		"\u034b\u00038\u001c\u0000\u0348\u034a\u0005)\u0000\u0000\u0349\u0348\u0001"+
		"\u0000\u0000\u0000\u034a\u034d\u0001\u0000\u0000\u0000\u034b\u0349\u0001"+
		"\u0000\u0000\u0000\u034b\u034c\u0001\u0000\u0000\u0000\u034c\u034e\u0001"+
		"\u0000\u0000\u0000\u034d\u034b\u0001\u0000\u0000\u0000\u034e\u0352\u0005"+
		"\u0007\u0000\u0000\u034f\u0351\u0005)\u0000\u0000\u0350\u034f\u0001\u0000"+
		"\u0000\u0000\u0351\u0354\u0001\u0000\u0000\u0000\u0352\u0350\u0001\u0000"+
		"\u0000\u0000\u0352\u0353\u0001\u0000\u0000\u0000\u0353\u0355\u0001\u0000"+
		"\u0000\u0000\u0354\u0352\u0001\u0000\u0000\u0000\u0355\u0356\u00038\u001c"+
		"\u0000\u0356\u0394\u0001\u0000\u0000\u0000\u0357\u035b\u00038\u001c\u0000"+
		"\u0358\u035a\u0005)\u0000\u0000\u0359\u0358\u0001\u0000\u0000\u0000\u035a"+
		"\u035d\u0001\u0000\u0000\u0000\u035b\u0359\u0001\u0000\u0000\u0000\u035b"+
		"\u035c\u0001\u0000\u0000\u0000\u035c\u035e\u0001\u0000\u0000\u0000\u035d"+
		"\u035b\u0001\u0000\u0000\u0000\u035e\u0362\u0005\u0005\u0000\u0000\u035f"+
		"\u0361\u0005)\u0000\u0000\u0360\u035f\u0001\u0000\u0000\u0000\u0361\u0364"+
		"\u0001\u0000\u0000\u0000\u0362\u0360\u0001\u0000\u0000\u0000\u0362\u0363"+
		"\u0001\u0000\u0000\u0000\u0363\u0365\u0001\u0000\u0000\u0000\u0364\u0362"+
		"\u0001\u0000\u0000\u0000\u0365\u0366\u00038\u001c\u0000\u0366\u0394\u0001"+
		"\u0000\u0000\u0000\u0367\u036b\u00038\u001c\u0000\u0368\u036a\u0005)\u0000"+
		"\u0000\u0369\u0368\u0001\u0000\u0000\u0000\u036a\u036d\u0001\u0000\u0000"+
		"\u0000\u036b\u0369\u0001\u0000\u0000\u0000\u036b\u036c\u0001\u0000\u0000"+
		"\u0000\u036c\u036e\u0001\u0000\u0000\u0000\u036d\u036b\u0001\u0000\u0000"+
		"\u0000\u036e\u0372\u0005\u0006\u0000\u0000\u036f\u0371\u0005)\u0000\u0000"+
		"\u0370\u036f\u0001\u0000\u0000\u0000\u0371\u0374\u0001\u0000\u0000\u0000"+
		"\u0372\u0370\u0001\u0000\u0000\u0000\u0372\u0373\u0001\u0000\u0000\u0000"+
		"\u0373\u0375\u0001\u0000\u0000\u0000\u0374\u0372\u0001\u0000\u0000\u0000"+
		"\u0375\u0376\u00038\u001c\u0000\u0376\u0394\u0001\u0000\u0000\u0000\u0377"+
		"\u037b\u00038\u001c\u0000\u0378\u037a\u0005)\u0000\u0000\u0379\u0378\u0001"+
		"\u0000\u0000\u0000\u037a\u037d\u0001\u0000\u0000\u0000\u037b\u0379\u0001"+
		"\u0000\u0000\u0000\u037b\u037c\u0001\u0000\u0000\u0000\u037c\u037e\u0001"+
		"\u0000\u0000\u0000\u037d\u037b\u0001\u0000\u0000\u0000\u037e\u0382\u0005"+
		"\u0004\u0000\u0000\u037f\u0381\u0005)\u0000\u0000\u0380\u037f\u0001\u0000"+
		"\u0000\u0000\u0381\u0384\u0001\u0000\u0000\u0000\u0382\u0380\u0001\u0000"+
		"\u0000\u0000\u0382\u0383\u0001\u0000\u0000\u0000\u0383\u0385\u0001\u0000"+
		"\u0000\u0000\u0384\u0382\u0001\u0000\u0000\u0000\u0385\u0386\u0003P(\u0000"+
		"\u0386\u0394\u0001\u0000\u0000\u0000\u0387\u0388\u0005\u000e\u0000\u0000"+
		"\u0388\u0389\u0003H$\u0000\u0389\u038a\u0005\u000f\u0000\u0000\u038a\u0394"+
		"\u0001\u0000\u0000\u0000\u038b\u038f\u0005\n\u0000\u0000\u038c\u038e\u0005"+
		")\u0000\u0000\u038d\u038c\u0001\u0000\u0000\u0000\u038e\u0391\u0001\u0000"+
		"\u0000\u0000\u038f\u038d\u0001\u0000\u0000\u0000\u038f\u0390\u0001\u0000"+
		"\u0000\u0000\u0390\u0392\u0001\u0000\u0000\u0000\u0391\u038f\u0001\u0000"+
		"\u0000\u0000\u0392\u0394\u0003H$\u0001\u0393\u0335\u0001\u0000\u0000\u0000"+
		"\u0393\u0337\u0001\u0000\u0000\u0000\u0393\u0347\u0001\u0000\u0000\u0000"+
		"\u0393\u0357\u0001\u0000\u0000\u0000\u0393\u0367\u0001\u0000\u0000\u0000"+
		"\u0393\u0377\u0001\u0000\u0000\u0000\u0393\u0387\u0001\u0000\u0000\u0000"+
		"\u0393\u038b\u0001\u0000\u0000\u0000\u0394\u03b5\u0001\u0000\u0000\u0000"+
		"\u0395\u0399\n\u0003\u0000\u0000\u0396\u0398\u0005)\u0000\u0000\u0397"+
		"\u0396\u0001\u0000\u0000\u0000\u0398\u039b\u0001\u0000\u0000\u0000\u0399"+
		"\u0397\u0001\u0000\u0000\u0000\u0399\u039a\u0001\u0000\u0000\u0000\u039a"+
		"\u039c\u0001\u0000\u0000\u0000\u039b\u0399\u0001\u0000\u0000\u0000\u039c"+
		"\u03a0\u0005\b\u0000\u0000\u039d\u039f\u0005)\u0000\u0000\u039e\u039d"+
		"\u0001\u0000\u0000\u0000\u039f\u03a2\u0001\u0000\u0000\u0000\u03a0\u039e"+
		"\u0001\u0000\u0000\u0000\u03a0\u03a1\u0001\u0000\u0000\u0000\u03a1\u03a3"+
		"\u0001\u0000\u0000\u0000\u03a2\u03a0\u0001\u0000\u0000\u0000\u03a3\u03b4"+
		"\u0003H$\u0004\u03a4\u03a8\n\u0002\u0000\u0000\u03a5\u03a7\u0005)\u0000"+
		"\u0000\u03a6\u03a5\u0001\u0000\u0000\u0000\u03a7\u03aa\u0001\u0000\u0000"+
		"\u0000\u03a8\u03a6\u0001\u0000\u0000\u0000\u03a8\u03a9\u0001\u0000\u0000"+
		"\u0000\u03a9\u03ab\u0001\u0000\u0000\u0000\u03aa\u03a8\u0001\u0000\u0000"+
		"\u0000\u03ab\u03af\u0005\t\u0000\u0000\u03ac\u03ae\u0005)\u0000\u0000"+
		"\u03ad\u03ac\u0001\u0000\u0000\u0000\u03ae\u03b1\u0001\u0000\u0000\u0000"+
		"\u03af\u03ad\u0001\u0000\u0000\u0000\u03af\u03b0\u0001\u0000\u0000\u0000"+
		"\u03b0\u03b2\u0001\u0000\u0000\u0000\u03b1\u03af\u0001\u0000\u0000\u0000"+
		"\u03b2\u03b4\u0003H$\u0003\u03b3\u0395\u0001\u0000\u0000\u0000\u03b3\u03a4"+
		"\u0001\u0000\u0000\u0000\u03b4\u03b7\u0001\u0000\u0000\u0000\u03b5\u03b3"+
		"\u0001\u0000\u0000\u0000\u03b5\u03b6\u0001\u0000\u0000\u0000\u03b6I\u0001"+
		"\u0000\u0000\u0000\u03b7\u03b5\u0001\u0000\u0000\u0000\u03b8\u03b9\u0005"+
		"\'\u0000\u0000\u03b9K\u0001\u0000\u0000\u0000\u03ba\u03bb\u0005\u0016"+
		"\u0000\u0000\u03bbM\u0001\u0000\u0000\u0000\u03bc\u03bd\u0005\u0015\u0000"+
		"\u0000\u03bdO\u0001\u0000\u0000\u0000\u03be\u03bf\u0005\u0016\u0000\u0000"+
		"\u03bfQ\u0001\u0000\u0000\u0000\u03c0\u03c1\u0005(\u0000\u0000\u03c1S"+
		"\u0001\u0000\u0000\u0000\u03c2\u03c3\u0005$\u0000\u0000\u03c3\u03c4\u0005"+
		"\'\u0000\u0000\u03c4\u03c5\u0005#\u0000\u0000\u03c5U\u0001\u0000\u0000"+
		"\u0000\u03c6\u03c7\u0005%\u0000\u0000\u03c7\u03c8\u0005\'\u0000\u0000"+
		"\u03c8\u03c9\u0005#\u0000\u0000\u03c9W\u0001\u0000\u0000\u0000w[bpv}\u0085"+
		"\u008c\u0094\u009b\u009f\u00a1\u00aa\u00b1\u00ba\u00c1\u00c8\u00cf\u00d8"+
		"\u00dc\u00e1\u00e5\u00ea\u00f3\u00fc\u0102\u0108\u0111\u0118\u0121\u012a"+
		"\u0133\u0139\u013f\u0148\u014f\u0158\u0164\u016a\u0171\u0179\u0180\u0184"+
		"\u0186\u018d\u0194\u019b\u01a4\u01ab\u01b4\u01bb\u01c0\u01c6\u01cd\u01d6"+
		"\u01dd\u01e2\u01e8\u01ef\u01f6\u01ff\u0206\u020f\u0218\u0221\u0228\u022f"+
		"\u0236\u023d\u0244\u024b\u0252\u0259\u0262\u0268\u026e\u0277\u027e\u0284"+
		"\u028a\u0291\u0298\u029f\u02a8\u02af\u02b6\u02bd\u02c2\u02cc\u02d2\u02d9"+
		"\u02e1\u02e8\u02f0\u02f7\u02ff\u0303\u0305\u0312\u0319\u0329\u0330\u033b"+
		"\u0342\u034b\u0352\u035b\u0362\u036b\u0372\u037b\u0382\u038f\u0393\u0399"+
		"\u03a0\u03a8\u03af\u03b3\u03b5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
