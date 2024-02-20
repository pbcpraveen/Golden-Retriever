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
		PathTag=38, Variable=39, Separators=40;
	public static final int
		RULE_eval = 0, RULE_xq = 1, RULE_stringConstant = 2, RULE_xqInParenthesis = 3,
		RULE_newTag = 4, RULE_forBody = 5, RULE_forClause = 6, RULE_forVariables = 7,
		RULE_moreLoopVariables = 8, RULE_loopVariableAssignment = 9, RULE_letClause = 10,
		RULE_letVariables = 11, RULE_moreLetVariables = 12, RULE_letVariableAssignment = 13,
		RULE_whereClause = 14, RULE_cond = 15, RULE_emptyCond = 16, RULE_equalityCond = 17,
		RULE_identicalCond = 18, RULE_someVarCond = 19, RULE_parenthesisCond = 20,
		RULE_notCond = 21, RULE_returnClause = 22, RULE_absolutePath = 23, RULE_relativePath = 24,
		RULE_children = 25, RULE_current = 26, RULE_parent = 27, RULE_filter = 28,
		RULE_attribute = 29, RULE_textFunction = 30, RULE_inParenthesis = 31,
		RULE_f = 32, RULE_tagName = 33, RULE_attName = 34, RULE_fileName = 35,
		RULE_stringConstantText = 36, RULE_variable = 37, RULE_openTag = 38, RULE_closeTag = 39;
	private static String[] makeRuleNames() {
		return new String[] {
			"eval", "xq", "stringConstant", "xqInParenthesis", "newTag", "forBody",
			"forClause", "forVariables", "moreLoopVariables", "loopVariableAssignment",
			"letClause", "letVariables", "moreLetVariables", "letVariableAssignment",
			"whereClause", "cond", "emptyCond", "equalityCond", "identicalCond",
			"someVarCond", "parenthesisCond", "notCond", "returnClause", "absolutePath",
			"relativePath", "children", "current", "parent", "filter", "attribute",
			"textFunction", "inParenthesis", "f", "tagName", "attName", "fileName",
			"stringConstantText", "variable", "openTag", "closeTag"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'doc('", "'/'", "'//'", "'='", "'=='", "'is'", "'eq'", "'and'",
			"'or'", "'not'", "','", "'['", "']'", "'('", "')'", "'@'", "'text'",
			"'*'", "'.'", "'..'", null, null, "'$'", "'for'", "'let'", "'some'",
			"'empty'", "'in'", "'where'", "'{'", "'}'", "':='", "'return'", "'satisfies'",
			"'>'", "'<'"
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
			"CloseAngular", "OpenAngular", "OpenAngularwithforwardslash", "PathTag",
			"Variable", "Separators"
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
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Separators) {
				{
				{
				setState(80);
				match(Separators);
				}
				}
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(86);
			xq(0);
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Separators) {
				{
				{
				setState(87);
				match(Separators);
				}
				}
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(93);
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
		public LetClauseContext letClause() {
			return getRuleContext(LetClauseContext.class,0);
		}
		public AbsolutePathContext absolutePath() {
			return getRuleContext(AbsolutePathContext.class,0);
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
			setState(103);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StringConstant:
				{
				setState(96);
				stringConstant();
				}
				break;
			case OpenParen:
				{
				setState(97);
				xqInParenthesis();
				}
				break;
			case OpenAngular:
				{
				setState(98);
				newTag();
				}
				break;
			case For:
				{
				setState(99);
				forBody();
				}
				break;
			case Let:
				{
				setState(100);
				letClause();
				}
				break;
			case DocOpen:
				{
				setState(101);
				absolutePath();
				}
				break;
			case Variable:
				{
				setState(102);
				variable();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(152);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(150);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new XqContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_xq);
						setState(105);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(109);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==Separators) {
							{
							{
							setState(106);
							match(Separators);
							}
							}
							setState(111);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(112);
						match(Comma);
						setState(116);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==Separators) {
							{
							{
							setState(113);
							match(Separators);
							}
							}
							setState(118);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(119);
						xq(5);
						}
						break;
					case 2:
						{
						_localctx = new XqContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_xq);
						setState(120);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(124);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==Separators) {
							{
							{
							setState(121);
							match(Separators);
							}
							}
							setState(126);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(127);
						match(ImmediateDescendent);
						setState(131);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==Separators) {
							{
							{
							setState(128);
							match(Separators);
							}
							}
							setState(133);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(134);
						relativePath(0);
						}
						break;
					case 3:
						{
						_localctx = new XqContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_xq);
						setState(135);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(139);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==Separators) {
							{
							{
							setState(136);
							match(Separators);
							}
							}
							setState(141);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(142);
						match(Descendent);
						setState(146);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==Separators) {
							{
							{
							setState(143);
							match(Separators);
							}
							}
							setState(148);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(149);
						relativePath(0);
						}
						break;
					}
					}
				}
				setState(154);
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
			setState(155);
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
			setState(157);
			match(OpenParen);
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Separators) {
				{
				{
				setState(158);
				match(Separators);
				}
				}
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(164);
			xq(0);
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Separators) {
				{
				{
				setState(165);
				match(Separators);
				}
				}
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(171);
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
			setState(173);
			openTag();
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
			match(OpenBrace);
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Separators) {
				{
				{
				setState(181);
				match(Separators);
				}
				}
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(187);
			xq(0);
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Separators) {
				{
				{
				setState(188);
				match(Separators);
				}
				}
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(194);
			match(CloseBrace);
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Separators) {
				{
				{
				setState(195);
				match(Separators);
				}
				}
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(201);
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
			setState(203);
			forClause();
			setState(207);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(204);
					match(Separators);
					}
					}
				}
				setState(209);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Let) {
				{
				setState(210);
				letClause();
				}
			}

			setState(216);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Where) {
				{
				setState(219);
				whereClause();
				}
			}

			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Separators) {
				{
				{
				setState(222);
				match(Separators);
				}
				}
				setState(227);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(228);
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
			setState(230);
			match(For);
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
			setState(249);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(239);
				loopVariableAssignment();
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
				moreLoopVariables();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(248);
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
			setState(251);
			match(Comma);
			setState(255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Separators) {
				{
				{
				setState(252);
				match(Separators);
				}
				}
				setState(257);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(258);
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
			setState(260);
			variable();
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
			match(In);
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Separators) {
				{
				{
				setState(268);
				match(Separators);
				}
				}
				setState(273);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(274);
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
		enterRule(_localctx, 20, RULE_letClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(Let);
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
		enterRule(_localctx, 22, RULE_letVariables);
		int _la;
		try {
			setState(295);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(285);
				letVariableAssignment();
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
				moreLetVariables();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(294);
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
		enterRule(_localctx, 24, RULE_moreLetVariables);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			match(Comma);
			setState(301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Separators) {
				{
				{
				setState(298);
				match(Separators);
				}
				}
				setState(303);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(304);
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
		enterRule(_localctx, 26, RULE_letVariableAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			variable();
			setState(310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Separators) {
				{
				{
				setState(307);
				match(Separators);
				}
				}
				setState(312);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(313);
			match(Assign);
			setState(317);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Separators) {
				{
				{
				setState(314);
				match(Separators);
				}
				}
				setState(319);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(320);
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
		enterRule(_localctx, 28, RULE_whereClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			match(Where);
			setState(326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Separators) {
				{
				{
				setState(323);
				match(Separators);
				}
				}
				setState(328);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(329);
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
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_cond, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(332);
				emptyCond();
				}
				break;
			case 2:
				{
				setState(333);
				equalityCond();
				}
				break;
			case 3:
				{
				setState(334);
				identicalCond();
				}
				break;
			case 4:
				{
				setState(335);
				someVarCond();
				}
				break;
			case 5:
				{
				setState(336);
				parenthesisCond();
				}
				break;
			case 6:
				{
				setState(337);
				notCond();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(372);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(370);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
					case 1:
						{
						_localctx = new CondContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_cond);
						setState(340);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
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
						match(And);
						setState(351);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==Separators) {
							{
							{
							setState(348);
							match(Separators);
							}
							}
							setState(353);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(354);
						cond(4);
						}
						break;
					case 2:
						{
						_localctx = new CondContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_cond);
						setState(355);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(359);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==Separators) {
							{
							{
							setState(356);
							match(Separators);
							}
							}
							setState(361);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(362);
						match(Or);
						setState(366);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==Separators) {
							{
							{
							setState(363);
							match(Separators);
							}
							}
							setState(368);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(369);
						cond(3);
						}
						break;
					}
					}
				}
				setState(374);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
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
		enterRule(_localctx, 32, RULE_emptyCond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			match(Empty);
			setState(379);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Separators) {
				{
				{
				setState(376);
				match(Separators);
				}
				}
				setState(381);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(382);
			match(OpenParen);
			setState(386);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Separators) {
				{
				{
				setState(383);
				match(Separators);
				}
				}
				setState(388);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(389);
			xq(0);
			setState(393);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Separators) {
				{
				{
				setState(390);
				match(Separators);
				}
				}
				setState(395);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(396);
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
		enterRule(_localctx, 34, RULE_equalityCond);
		int _la;
		try {
			setState(430);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(398);
				xq(0);
				setState(402);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Separators) {
					{
					{
					setState(399);
					match(Separators);
					}
					}
					setState(404);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(405);
				match(Equal);
				setState(409);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Separators) {
					{
					{
					setState(406);
					match(Separators);
					}
					}
					setState(411);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(412);
				xq(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(414);
				xq(0);
				setState(418);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Separators) {
					{
					{
					setState(415);
					match(Separators);
					}
					}
					setState(420);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(421);
				match(Eq);
				setState(425);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Separators) {
					{
					{
					setState(422);
					match(Separators);
					}
					}
					setState(427);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(428);
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
		enterRule(_localctx, 36, RULE_identicalCond);
		int _la;
		try {
			setState(464);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
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
				match(Equals);
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
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(448);
				xq(0);
				setState(452);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Separators) {
					{
					{
					setState(449);
					match(Separators);
					}
					}
					setState(454);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(455);
				match(Is);
				setState(459);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Separators) {
					{
					{
					setState(456);
					match(Separators);
					}
					}
					setState(461);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(462);
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
		enterRule(_localctx, 38, RULE_someVarCond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(466);
			match(Some);
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
			forVariables();
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
			match(Satisfies);
			setState(484);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Separators) {
				{
				{
				setState(481);
				match(Separators);
				}
				}
				setState(486);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(487);
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
		enterRule(_localctx, 40, RULE_parenthesisCond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(489);
			match(OpenParen);
			setState(493);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Separators) {
				{
				{
				setState(490);
				match(Separators);
				}
				}
				setState(495);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(496);
			cond(0);
			setState(500);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Separators) {
				{
				{
				setState(497);
				match(Separators);
				}
				}
				setState(502);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(503);
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
		enterRule(_localctx, 42, RULE_notCond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(505);
			match(Not);
			setState(509);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Separators) {
				{
				{
				setState(506);
				match(Separators);
				}
				}
				setState(511);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(512);
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
		enterRule(_localctx, 44, RULE_returnClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(514);
			match(Return);
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
		enterRule(_localctx, 46, RULE_absolutePath);
		int _la;
		try {
			setState(583);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(523);
				match(DocOpen);
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
				fileName();
				setState(534);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Separators) {
					{
					{
					setState(531);
					match(Separators);
					}
					}
					setState(536);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(537);
				match(CloseParen);
				setState(541);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Separators) {
					{
					{
					setState(538);
					match(Separators);
					}
					}
					setState(543);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(544);
				match(ImmediateDescendent);
				setState(548);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Separators) {
					{
					{
					setState(545);
					match(Separators);
					}
					}
					setState(550);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(551);
				relativePath(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(553);
				match(DocOpen);
				setState(557);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Separators) {
					{
					{
					setState(554);
					match(Separators);
					}
					}
					setState(559);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(560);
				fileName();
				setState(564);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Separators) {
					{
					{
					setState(561);
					match(Separators);
					}
					}
					setState(566);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(567);
				match(CloseParen);
				setState(571);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Separators) {
					{
					{
					setState(568);
					match(Separators);
					}
					}
					setState(573);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(574);
				match(Descendent);
				setState(578);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Separators) {
					{
					{
					setState(575);
					match(Separators);
					}
					}
					setState(580);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(581);
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
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_relativePath, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(593);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PathTag:
				{
				setState(586);
				tagName();
				}
				break;
			case Children:
				{
				setState(587);
				children();
				}
				break;
			case Current:
				{
				setState(588);
				current();
				}
				break;
			case Parent:
				{
				setState(589);
				parent();
				}
				break;
			case Text:
				{
				setState(590);
				textFunction();
				}
				break;
			case At:
				{
				setState(591);
				attribute();
				}
				break;
			case OpenParen:
				{
				setState(592);
				inParenthesis();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(650);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(648);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
					case 1:
						{
						_localctx = new RelativePathContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relativePath);
						setState(595);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(599);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==Separators) {
							{
							{
							setState(596);
							match(Separators);
							}
							}
							setState(601);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(602);
						match(ImmediateDescendent);
						setState(606);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==Separators) {
							{
							{
							setState(603);
							match(Separators);
							}
							}
							setState(608);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(609);
						relativePath(5);
						}
						break;
					case 2:
						{
						_localctx = new RelativePathContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relativePath);
						setState(610);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(614);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==Separators) {
							{
							{
							setState(611);
							match(Separators);
							}
							}
							setState(616);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(617);
						match(Descendent);
						setState(621);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==Separators) {
							{
							{
							setState(618);
							match(Separators);
							}
							}
							setState(623);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(624);
						relativePath(4);
						}
						break;
					case 3:
						{
						_localctx = new RelativePathContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relativePath);
						setState(625);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(629);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==Separators) {
							{
							{
							setState(626);
							match(Separators);
							}
							}
							setState(631);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(632);
						match(Comma);
						setState(636);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==Separators) {
							{
							{
							setState(633);
							match(Separators);
							}
							}
							setState(638);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(639);
						relativePath(2);
						}
						break;
					case 4:
						{
						_localctx = new RelativePathContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relativePath);
						setState(640);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(644);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==Separators) {
							{
							{
							setState(641);
							match(Separators);
							}
							}
							setState(646);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(647);
						filter();
						}
						break;
					}
					}
				}
				setState(652);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
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
		enterRule(_localctx, 50, RULE_children);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(653);
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
		enterRule(_localctx, 52, RULE_current);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(655);
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
		enterRule(_localctx, 54, RULE_parent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(657);
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
		enterRule(_localctx, 56, RULE_filter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(659);
			match(OpenBracket);
			setState(663);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Separators) {
				{
				{
				setState(660);
				match(Separators);
				}
				}
				setState(665);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(666);
			f(0);
			setState(670);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Separators) {
				{
				{
				setState(667);
				match(Separators);
				}
				}
				setState(672);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(673);
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
		enterRule(_localctx, 58, RULE_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(675);
			match(At);
			setState(676);
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
		enterRule(_localctx, 60, RULE_textFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(678);
			match(Text);
			setState(679);
			match(OpenParen);
			setState(680);
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
		enterRule(_localctx, 62, RULE_inParenthesis);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(682);
			match(OpenParen);
			setState(686);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Separators) {
				{
				{
				setState(683);
				match(Separators);
				}
				}
				setState(688);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(689);
			relativePath(0);
			setState(693);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Separators) {
				{
				{
				setState(690);
				match(Separators);
				}
				}
				setState(695);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(696);
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
		int _startState = 64;
		enterRecursionRule(_localctx, 64, RULE_f, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(792);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				{
				setState(699);
				relativePath(0);
				}
				break;
			case 2:
				{
				setState(700);
				relativePath(0);
				setState(704);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Separators) {
					{
					{
					setState(701);
					match(Separators);
					}
					}
					setState(706);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(707);
				match(Equal);
				setState(711);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Separators) {
					{
					{
					setState(708);
					match(Separators);
					}
					}
					setState(713);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(714);
				relativePath(0);
				}
				break;
			case 3:
				{
				setState(716);
				relativePath(0);
				setState(720);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Separators) {
					{
					{
					setState(717);
					match(Separators);
					}
					}
					setState(722);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(723);
				match(Eq);
				setState(727);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Separators) {
					{
					{
					setState(724);
					match(Separators);
					}
					}
					setState(729);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(730);
				relativePath(0);
				}
				break;
			case 4:
				{
				setState(732);
				relativePath(0);
				setState(736);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Separators) {
					{
					{
					setState(733);
					match(Separators);
					}
					}
					setState(738);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(739);
				match(Equals);
				setState(743);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Separators) {
					{
					{
					setState(740);
					match(Separators);
					}
					}
					setState(745);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(746);
				relativePath(0);
				}
				break;
			case 5:
				{
				setState(748);
				relativePath(0);
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
				match(Is);
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
				relativePath(0);
				}
				break;
			case 6:
				{
				setState(764);
				relativePath(0);
				setState(768);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Separators) {
					{
					{
					setState(765);
					match(Separators);
					}
					}
					setState(770);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(771);
				match(Equal);
				setState(775);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Separators) {
					{
					{
					setState(772);
					match(Separators);
					}
					}
					setState(777);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(778);
				stringConstantText();
				}
				break;
			case 7:
				{
				setState(780);
				match(OpenParen);
				setState(781);
				f(0);
				setState(782);
				match(CloseParen);
				}
				break;
			case 8:
				{
				setState(784);
				match(Not);
				setState(788);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Separators) {
					{
					{
					setState(785);
					match(Separators);
					}
					}
					setState(790);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(791);
				f(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(826);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(824);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
					case 1:
						{
						_localctx = new FContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_f);
						setState(794);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(798);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==Separators) {
							{
							{
							setState(795);
							match(Separators);
							}
							}
							setState(800);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(801);
						match(And);
						setState(805);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==Separators) {
							{
							{
							setState(802);
							match(Separators);
							}
							}
							setState(807);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(808);
						f(4);
						}
						break;
					case 2:
						{
						_localctx = new FContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_f);
						setState(809);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(813);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==Separators) {
							{
							{
							setState(810);
							match(Separators);
							}
							}
							setState(815);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(816);
						match(Or);
						setState(820);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==Separators) {
							{
							{
							setState(817);
							match(Separators);
							}
							}
							setState(822);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(823);
						f(3);
						}
						break;
					}
					}
				}
				setState(828);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
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
		enterRule(_localctx, 66, RULE_tagName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(829);
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
		enterRule(_localctx, 68, RULE_attName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(831);
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
		enterRule(_localctx, 70, RULE_fileName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(833);
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
		enterRule(_localctx, 72, RULE_stringConstantText);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(835);
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
		enterRule(_localctx, 74, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(837);
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
		enterRule(_localctx, 76, RULE_openTag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(839);
			match(OpenAngular);
			setState(840);
			match(PathTag);
			setState(841);
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
		enterRule(_localctx, 78, RULE_closeTag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(843);
			match(OpenAngularwithforwardslash);
			setState(844);
			match(PathTag);
			setState(845);
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
		case 15:
			return cond_sempred((CondContext)_localctx, predIndex);
		case 24:
			return relativePath_sempred((RelativePathContext)_localctx, predIndex);
		case 32:
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
		"\u0004\u0001(\u0350\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0001"+
		"\u0000\u0005\u0000R\b\u0000\n\u0000\f\u0000U\t\u0000\u0001\u0000\u0001"+
		"\u0000\u0005\u0000Y\b\u0000\n\u0000\f\u0000\\\t\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u0001h\b\u0001\u0001\u0001\u0001"+
		"\u0001\u0005\u0001l\b\u0001\n\u0001\f\u0001o\t\u0001\u0001\u0001\u0001"+
		"\u0001\u0005\u0001s\b\u0001\n\u0001\f\u0001v\t\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0005\u0001{\b\u0001\n\u0001\f\u0001~\t\u0001\u0001"+
		"\u0001\u0001\u0001\u0005\u0001\u0082\b\u0001\n\u0001\f\u0001\u0085\t\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001\u008a\b\u0001\n\u0001"+
		"\f\u0001\u008d\t\u0001\u0001\u0001\u0001\u0001\u0005\u0001\u0091\b\u0001"+
		"\n\u0001\f\u0001\u0094\t\u0001\u0001\u0001\u0005\u0001\u0097\b\u0001\n"+
		"\u0001\f\u0001\u009a\t\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0005\u0003\u00a0\b\u0003\n\u0003\f\u0003\u00a3\t\u0003\u0001\u0003"+
		"\u0001\u0003\u0005\u0003\u00a7\b\u0003\n\u0003\f\u0003\u00aa\t\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0005\u0004\u00b0\b\u0004\n"+
		"\u0004\f\u0004\u00b3\t\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u00b7"+
		"\b\u0004\n\u0004\f\u0004\u00ba\t\u0004\u0001\u0004\u0001\u0004\u0005\u0004"+
		"\u00be\b\u0004\n\u0004\f\u0004\u00c1\t\u0004\u0001\u0004\u0001\u0004\u0005"+
		"\u0004\u00c5\b\u0004\n\u0004\f\u0004\u00c8\t\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0005\u0005\u00ce\b\u0005\n\u0005\f\u0005\u00d1"+
		"\t\u0005\u0001\u0005\u0003\u0005\u00d4\b\u0005\u0001\u0005\u0005\u0005"+
		"\u00d7\b\u0005\n\u0005\f\u0005\u00da\t\u0005\u0001\u0005\u0003\u0005\u00dd"+
		"\b\u0005\u0001\u0005\u0005\u0005\u00e0\b\u0005\n\u0005\f\u0005\u00e3\t"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0005\u0006\u00e9"+
		"\b\u0006\n\u0006\f\u0006\u00ec\t\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0005\u0007\u00f2\b\u0007\n\u0007\f\u0007\u00f5\t\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00fa\b\u0007\u0001\b\u0001"+
		"\b\u0005\b\u00fe\b\b\n\b\f\b\u0101\t\b\u0001\b\u0001\b\u0001\t\u0001\t"+
		"\u0005\t\u0107\b\t\n\t\f\t\u010a\t\t\u0001\t\u0001\t\u0005\t\u010e\b\t"+
		"\n\t\f\t\u0111\t\t\u0001\t\u0001\t\u0001\n\u0001\n\u0005\n\u0117\b\n\n"+
		"\n\f\n\u011a\t\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0005\u000b\u0120"+
		"\b\u000b\n\u000b\f\u000b\u0123\t\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0003\u000b\u0128\b\u000b\u0001\f\u0001\f\u0005\f\u012c\b\f\n\f\f\f\u012f"+
		"\t\f\u0001\f\u0001\f\u0001\r\u0001\r\u0005\r\u0135\b\r\n\r\f\r\u0138\t"+
		"\r\u0001\r\u0001\r\u0005\r\u013c\b\r\n\r\f\r\u013f\t\r\u0001\r\u0001\r"+
		"\u0001\u000e\u0001\u000e\u0005\u000e\u0145\b\u000e\n\u000e\f\u000e\u0148"+
		"\t\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u0153\b\u000f\u0001"+
		"\u000f\u0001\u000f\u0005\u000f\u0157\b\u000f\n\u000f\f\u000f\u015a\t\u000f"+
		"\u0001\u000f\u0001\u000f\u0005\u000f\u015e\b\u000f\n\u000f\f\u000f\u0161"+
		"\t\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u0166\b\u000f"+
		"\n\u000f\f\u000f\u0169\t\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u016d"+
		"\b\u000f\n\u000f\f\u000f\u0170\t\u000f\u0001\u000f\u0005\u000f\u0173\b"+
		"\u000f\n\u000f\f\u000f\u0176\t\u000f\u0001\u0010\u0001\u0010\u0005\u0010"+
		"\u017a\b\u0010\n\u0010\f\u0010\u017d\t\u0010\u0001\u0010\u0001\u0010\u0005"+
		"\u0010\u0181\b\u0010\n\u0010\f\u0010\u0184\t\u0010\u0001\u0010\u0001\u0010"+
		"\u0005\u0010\u0188\b\u0010\n\u0010\f\u0010\u018b\t\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0011\u0001\u0011\u0005\u0011\u0191\b\u0011\n\u0011\f\u0011"+
		"\u0194\t\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u0198\b\u0011\n\u0011"+
		"\f\u0011\u019b\t\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0005\u0011\u01a1\b\u0011\n\u0011\f\u0011\u01a4\t\u0011\u0001\u0011\u0001"+
		"\u0011\u0005\u0011\u01a8\b\u0011\n\u0011\f\u0011\u01ab\t\u0011\u0001\u0011"+
		"\u0001\u0011\u0003\u0011\u01af\b\u0011\u0001\u0012\u0001\u0012\u0005\u0012"+
		"\u01b3\b\u0012\n\u0012\f\u0012\u01b6\t\u0012\u0001\u0012\u0001\u0012\u0005"+
		"\u0012\u01ba\b\u0012\n\u0012\f\u0012\u01bd\t\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0005\u0012\u01c3\b\u0012\n\u0012\f\u0012\u01c6"+
		"\t\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u01ca\b\u0012\n\u0012\f\u0012"+
		"\u01cd\t\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u01d1\b\u0012\u0001"+
		"\u0013\u0001\u0013\u0005\u0013\u01d5\b\u0013\n\u0013\f\u0013\u01d8\t\u0013"+
		"\u0001\u0013\u0001\u0013\u0005\u0013\u01dc\b\u0013\n\u0013\f\u0013\u01df"+
		"\t\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u01e3\b\u0013\n\u0013\f\u0013"+
		"\u01e6\t\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0005\u0014"+
		"\u01ec\b\u0014\n\u0014\f\u0014\u01ef\t\u0014\u0001\u0014\u0001\u0014\u0005"+
		"\u0014\u01f3\b\u0014\n\u0014\f\u0014\u01f6\t\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0015\u0001\u0015\u0005\u0015\u01fc\b\u0015\n\u0015\f\u0015\u01ff"+
		"\t\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0005\u0016\u0205"+
		"\b\u0016\n\u0016\f\u0016\u0208\t\u0016\u0001\u0016\u0001\u0016\u0001\u0017"+
		"\u0001\u0017\u0005\u0017\u020e\b\u0017\n\u0017\f\u0017\u0211\t\u0017\u0001"+
		"\u0017\u0001\u0017\u0005\u0017\u0215\b\u0017\n\u0017\f\u0017\u0218\t\u0017"+
		"\u0001\u0017\u0001\u0017\u0005\u0017\u021c\b\u0017\n\u0017\f\u0017\u021f"+
		"\t\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u0223\b\u0017\n\u0017\f\u0017"+
		"\u0226\t\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017"+
		"\u022c\b\u0017\n\u0017\f\u0017\u022f\t\u0017\u0001\u0017\u0001\u0017\u0005"+
		"\u0017\u0233\b\u0017\n\u0017\f\u0017\u0236\t\u0017\u0001\u0017\u0001\u0017"+
		"\u0005\u0017\u023a\b\u0017\n\u0017\f\u0017\u023d\t\u0017\u0001\u0017\u0001"+
		"\u0017\u0005\u0017\u0241\b\u0017\n\u0017\f\u0017\u0244\t\u0017\u0001\u0017"+
		"\u0001\u0017\u0003\u0017\u0248\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018"+
		"\u0252\b\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u0256\b\u0018\n\u0018"+
		"\f\u0018\u0259\t\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u025d\b\u0018"+
		"\n\u0018\f\u0018\u0260\t\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0005"+
		"\u0018\u0265\b\u0018\n\u0018\f\u0018\u0268\t\u0018\u0001\u0018\u0001\u0018"+
		"\u0005\u0018\u026c\b\u0018\n\u0018\f\u0018\u026f\t\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0005\u0018\u0274\b\u0018\n\u0018\f\u0018\u0277\t\u0018"+
		"\u0001\u0018\u0001\u0018\u0005\u0018\u027b\b\u0018\n\u0018\f\u0018\u027e"+
		"\t\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u0283\b\u0018"+
		"\n\u0018\f\u0018\u0286\t\u0018\u0001\u0018\u0005\u0018\u0289\b\u0018\n"+
		"\u0018\f\u0018\u028c\t\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001"+
		"\u001a\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0005\u001c\u0296"+
		"\b\u001c\n\u001c\f\u001c\u0299\t\u001c\u0001\u001c\u0001\u001c\u0005\u001c"+
		"\u029d\b\u001c\n\u001c\f\u001c\u02a0\t\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001f\u0001\u001f\u0005\u001f\u02ad\b\u001f\n\u001f\f\u001f"+
		"\u02b0\t\u001f\u0001\u001f\u0001\u001f\u0005\u001f\u02b4\b\u001f\n\u001f"+
		"\f\u001f\u02b7\t\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001"+
		" \u0005 \u02bf\b \n \f \u02c2\t \u0001 \u0001 \u0005 \u02c6\b \n \f \u02c9"+
		"\t \u0001 \u0001 \u0001 \u0001 \u0005 \u02cf\b \n \f \u02d2\t \u0001 "+
		"\u0001 \u0005 \u02d6\b \n \f \u02d9\t \u0001 \u0001 \u0001 \u0001 \u0005"+
		" \u02df\b \n \f \u02e2\t \u0001 \u0001 \u0005 \u02e6\b \n \f \u02e9\t"+
		" \u0001 \u0001 \u0001 \u0001 \u0005 \u02ef\b \n \f \u02f2\t \u0001 \u0001"+
		" \u0005 \u02f6\b \n \f \u02f9\t \u0001 \u0001 \u0001 \u0001 \u0005 \u02ff"+
		"\b \n \f \u0302\t \u0001 \u0001 \u0005 \u0306\b \n \f \u0309\t \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0005 \u0313\b \n "+
		"\f \u0316\t \u0001 \u0003 \u0319\b \u0001 \u0001 \u0005 \u031d\b \n \f"+
		" \u0320\t \u0001 \u0001 \u0005 \u0324\b \n \f \u0327\t \u0001 \u0001 "+
		"\u0001 \u0005 \u032c\b \n \f \u032f\t \u0001 \u0001 \u0005 \u0333\b \n"+
		" \f \u0336\t \u0001 \u0005 \u0339\b \n \f \u033c\t \u0001!\u0001!\u0001"+
		"\"\u0001\"\u0001#\u0001#\u0001$\u0001$\u0001%\u0001%\u0001&\u0001&\u0001"+
		"&\u0001&\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0000\u0004\u0002\u001e"+
		"0@(\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLN\u0000\u0000\u03a5\u0000S\u0001"+
		"\u0000\u0000\u0000\u0002g\u0001\u0000\u0000\u0000\u0004\u009b\u0001\u0000"+
		"\u0000\u0000\u0006\u009d\u0001\u0000\u0000\u0000\b\u00ad\u0001\u0000\u0000"+
		"\u0000\n\u00cb\u0001\u0000\u0000\u0000\f\u00e6\u0001\u0000\u0000\u0000"+
		"\u000e\u00f9\u0001\u0000\u0000\u0000\u0010\u00fb\u0001\u0000\u0000\u0000"+
		"\u0012\u0104\u0001\u0000\u0000\u0000\u0014\u0114\u0001\u0000\u0000\u0000"+
		"\u0016\u0127\u0001\u0000\u0000\u0000\u0018\u0129\u0001\u0000\u0000\u0000"+
		"\u001a\u0132\u0001\u0000\u0000\u0000\u001c\u0142\u0001\u0000\u0000\u0000"+
		"\u001e\u0152\u0001\u0000\u0000\u0000 \u0177\u0001\u0000\u0000\u0000\""+
		"\u01ae\u0001\u0000\u0000\u0000$\u01d0\u0001\u0000\u0000\u0000&\u01d2\u0001"+
		"\u0000\u0000\u0000(\u01e9\u0001\u0000\u0000\u0000*\u01f9\u0001\u0000\u0000"+
		"\u0000,\u0202\u0001\u0000\u0000\u0000.\u0247\u0001\u0000\u0000\u00000"+
		"\u0251\u0001\u0000\u0000\u00002\u028d\u0001\u0000\u0000\u00004\u028f\u0001"+
		"\u0000\u0000\u00006\u0291\u0001\u0000\u0000\u00008\u0293\u0001\u0000\u0000"+
		"\u0000:\u02a3\u0001\u0000\u0000\u0000<\u02a6\u0001\u0000\u0000\u0000>"+
		"\u02aa\u0001\u0000\u0000\u0000@\u0318\u0001\u0000\u0000\u0000B\u033d\u0001"+
		"\u0000\u0000\u0000D\u033f\u0001\u0000\u0000\u0000F\u0341\u0001\u0000\u0000"+
		"\u0000H\u0343\u0001\u0000\u0000\u0000J\u0345\u0001\u0000\u0000\u0000L"+
		"\u0347\u0001\u0000\u0000\u0000N\u034b\u0001\u0000\u0000\u0000PR\u0005"+
		"(\u0000\u0000QP\u0001\u0000\u0000\u0000RU\u0001\u0000\u0000\u0000SQ\u0001"+
		"\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000TV\u0001\u0000\u0000\u0000"+
		"US\u0001\u0000\u0000\u0000VZ\u0003\u0002\u0001\u0000WY\u0005(\u0000\u0000"+
		"XW\u0001\u0000\u0000\u0000Y\\\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000"+
		"\u0000Z[\u0001\u0000\u0000\u0000[]\u0001\u0000\u0000\u0000\\Z\u0001\u0000"+
		"\u0000\u0000]^\u0005\u0000\u0000\u0001^\u0001\u0001\u0000\u0000\u0000"+
		"_`\u0006\u0001\uffff\uffff\u0000`h\u0003\u0004\u0002\u0000ah\u0003\u0006"+
		"\u0003\u0000bh\u0003\b\u0004\u0000ch\u0003\n\u0005\u0000dh\u0003\u0014"+
		"\n\u0000eh\u0003.\u0017\u0000fh\u0003J%\u0000g_\u0001\u0000\u0000\u0000"+
		"ga\u0001\u0000\u0000\u0000gb\u0001\u0000\u0000\u0000gc\u0001\u0000\u0000"+
		"\u0000gd\u0001\u0000\u0000\u0000ge\u0001\u0000\u0000\u0000gf\u0001\u0000"+
		"\u0000\u0000h\u0098\u0001\u0000\u0000\u0000im\n\u0004\u0000\u0000jl\u0005"+
		"(\u0000\u0000kj\u0001\u0000\u0000\u0000lo\u0001\u0000\u0000\u0000mk\u0001"+
		"\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000np\u0001\u0000\u0000\u0000"+
		"om\u0001\u0000\u0000\u0000pt\u0005\u000b\u0000\u0000qs\u0005(\u0000\u0000"+
		"rq\u0001\u0000\u0000\u0000sv\u0001\u0000\u0000\u0000tr\u0001\u0000\u0000"+
		"\u0000tu\u0001\u0000\u0000\u0000uw\u0001\u0000\u0000\u0000vt\u0001\u0000"+
		"\u0000\u0000w\u0097\u0003\u0002\u0001\u0005x|\n\u0003\u0000\u0000y{\u0005"+
		"(\u0000\u0000zy\u0001\u0000\u0000\u0000{~\u0001\u0000\u0000\u0000|z\u0001"+
		"\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000}\u007f\u0001\u0000\u0000"+
		"\u0000~|\u0001\u0000\u0000\u0000\u007f\u0083\u0005\u0002\u0000\u0000\u0080"+
		"\u0082\u0005(\u0000\u0000\u0081\u0080\u0001\u0000\u0000\u0000\u0082\u0085"+
		"\u0001\u0000\u0000\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0083\u0084"+
		"\u0001\u0000\u0000\u0000\u0084\u0086\u0001\u0000\u0000\u0000\u0085\u0083"+
		"\u0001\u0000\u0000\u0000\u0086\u0097\u00030\u0018\u0000\u0087\u008b\n"+
		"\u0002\u0000\u0000\u0088\u008a\u0005(\u0000\u0000\u0089\u0088\u0001\u0000"+
		"\u0000\u0000\u008a\u008d\u0001\u0000\u0000\u0000\u008b\u0089\u0001\u0000"+
		"\u0000\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c\u008e\u0001\u0000"+
		"\u0000\u0000\u008d\u008b\u0001\u0000\u0000\u0000\u008e\u0092\u0005\u0003"+
		"\u0000\u0000\u008f\u0091\u0005(\u0000\u0000\u0090\u008f\u0001\u0000\u0000"+
		"\u0000\u0091\u0094\u0001\u0000\u0000\u0000\u0092\u0090\u0001\u0000\u0000"+
		"\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u0095\u0001\u0000\u0000"+
		"\u0000\u0094\u0092\u0001\u0000\u0000\u0000\u0095\u0097\u00030\u0018\u0000"+
		"\u0096i\u0001\u0000\u0000\u0000\u0096x\u0001\u0000\u0000\u0000\u0096\u0087"+
		"\u0001\u0000\u0000\u0000\u0097\u009a\u0001\u0000\u0000\u0000\u0098\u0096"+
		"\u0001\u0000\u0000\u0000\u0098\u0099\u0001\u0000\u0000\u0000\u0099\u0003"+
		"\u0001\u0000\u0000\u0000\u009a\u0098\u0001\u0000\u0000\u0000\u009b\u009c"+
		"\u0003H$\u0000\u009c\u0005\u0001\u0000\u0000\u0000\u009d\u00a1\u0005\u000e"+
		"\u0000\u0000\u009e\u00a0\u0005(\u0000\u0000\u009f\u009e\u0001\u0000\u0000"+
		"\u0000\u00a0\u00a3\u0001\u0000\u0000\u0000\u00a1\u009f\u0001\u0000\u0000"+
		"\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2\u00a4\u0001\u0000\u0000"+
		"\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a4\u00a8\u0003\u0002\u0001"+
		"\u0000\u00a5\u00a7\u0005(\u0000\u0000\u00a6\u00a5\u0001\u0000\u0000\u0000"+
		"\u00a7\u00aa\u0001\u0000\u0000\u0000\u00a8\u00a6\u0001\u0000\u0000\u0000"+
		"\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9\u00ab\u0001\u0000\u0000\u0000"+
		"\u00aa\u00a8\u0001\u0000\u0000\u0000\u00ab\u00ac\u0005\u000f\u0000\u0000"+
		"\u00ac\u0007\u0001\u0000\u0000\u0000\u00ad\u00b1\u0003L&\u0000\u00ae\u00b0"+
		"\u0005(\u0000\u0000\u00af\u00ae\u0001\u0000\u0000\u0000\u00b0\u00b3\u0001"+
		"\u0000\u0000\u0000\u00b1\u00af\u0001\u0000\u0000\u0000\u00b1\u00b2\u0001"+
		"\u0000\u0000\u0000\u00b2\u00b4\u0001\u0000\u0000\u0000\u00b3\u00b1\u0001"+
		"\u0000\u0000\u0000\u00b4\u00b8\u0005\u001e\u0000\u0000\u00b5\u00b7\u0005"+
		"(\u0000\u0000\u00b6\u00b5\u0001\u0000\u0000\u0000\u00b7\u00ba\u0001\u0000"+
		"\u0000\u0000\u00b8\u00b6\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001\u0000"+
		"\u0000\u0000\u00b9\u00bb\u0001\u0000\u0000\u0000\u00ba\u00b8\u0001\u0000"+
		"\u0000\u0000\u00bb\u00bf\u0003\u0002\u0001\u0000\u00bc\u00be\u0005(\u0000"+
		"\u0000\u00bd\u00bc\u0001\u0000\u0000\u0000\u00be\u00c1\u0001\u0000\u0000"+
		"\u0000\u00bf\u00bd\u0001\u0000\u0000\u0000\u00bf\u00c0\u0001\u0000\u0000"+
		"\u0000\u00c0\u00c2\u0001\u0000\u0000\u0000\u00c1\u00bf\u0001\u0000\u0000"+
		"\u0000\u00c2\u00c6\u0005\u001f\u0000\u0000\u00c3\u00c5\u0005(\u0000\u0000"+
		"\u00c4\u00c3\u0001\u0000\u0000\u0000\u00c5\u00c8\u0001\u0000\u0000\u0000"+
		"\u00c6\u00c4\u0001\u0000\u0000\u0000\u00c6\u00c7\u0001\u0000\u0000\u0000"+
		"\u00c7\u00c9\u0001\u0000\u0000\u0000\u00c8\u00c6\u0001\u0000\u0000\u0000"+
		"\u00c9\u00ca\u0003N\'\u0000\u00ca\t\u0001\u0000\u0000\u0000\u00cb\u00cf"+
		"\u0003\f\u0006\u0000\u00cc\u00ce\u0005(\u0000\u0000\u00cd\u00cc\u0001"+
		"\u0000\u0000\u0000\u00ce\u00d1\u0001\u0000\u0000\u0000\u00cf\u00cd\u0001"+
		"\u0000\u0000\u0000\u00cf\u00d0\u0001\u0000\u0000\u0000\u00d0\u00d3\u0001"+
		"\u0000\u0000\u0000\u00d1\u00cf\u0001\u0000\u0000\u0000\u00d2\u00d4\u0003"+
		"\u0014\n\u0000\u00d3\u00d2\u0001\u0000\u0000\u0000\u00d3\u00d4\u0001\u0000"+
		"\u0000\u0000\u00d4\u00d8\u0001\u0000\u0000\u0000\u00d5\u00d7\u0005(\u0000"+
		"\u0000\u00d6\u00d5\u0001\u0000\u0000\u0000\u00d7\u00da\u0001\u0000\u0000"+
		"\u0000\u00d8\u00d6\u0001\u0000\u0000\u0000\u00d8\u00d9\u0001\u0000\u0000"+
		"\u0000\u00d9\u00dc\u0001\u0000\u0000\u0000\u00da\u00d8\u0001\u0000\u0000"+
		"\u0000\u00db\u00dd\u0003\u001c\u000e\u0000\u00dc\u00db\u0001\u0000\u0000"+
		"\u0000\u00dc\u00dd\u0001\u0000\u0000\u0000\u00dd\u00e1\u0001\u0000\u0000"+
		"\u0000\u00de\u00e0\u0005(\u0000\u0000\u00df\u00de\u0001\u0000\u0000\u0000"+
		"\u00e0\u00e3\u0001\u0000\u0000\u0000\u00e1\u00df\u0001\u0000\u0000\u0000"+
		"\u00e1\u00e2\u0001\u0000\u0000\u0000\u00e2\u00e4\u0001\u0000\u0000\u0000"+
		"\u00e3\u00e1\u0001\u0000\u0000\u0000\u00e4\u00e5\u0003,\u0016\u0000\u00e5"+
		"\u000b\u0001\u0000\u0000\u0000\u00e6\u00ea\u0005\u0018\u0000\u0000\u00e7"+
		"\u00e9\u0005(\u0000\u0000\u00e8\u00e7\u0001\u0000\u0000\u0000\u00e9\u00ec"+
		"\u0001\u0000\u0000\u0000\u00ea\u00e8\u0001\u0000\u0000\u0000\u00ea\u00eb"+
		"\u0001\u0000\u0000\u0000\u00eb\u00ed\u0001\u0000\u0000\u0000\u00ec\u00ea"+
		"\u0001\u0000\u0000\u0000\u00ed\u00ee\u0003\u000e\u0007\u0000\u00ee\r\u0001"+
		"\u0000\u0000\u0000\u00ef\u00f3\u0003\u0012\t\u0000\u00f0\u00f2\u0005("+
		"\u0000\u0000\u00f1\u00f0\u0001\u0000\u0000\u0000\u00f2\u00f5\u0001\u0000"+
		"\u0000\u0000\u00f3\u00f1\u0001\u0000\u0000\u0000\u00f3\u00f4\u0001\u0000"+
		"\u0000\u0000\u00f4\u00f6\u0001\u0000\u0000\u0000\u00f5\u00f3\u0001\u0000"+
		"\u0000\u0000\u00f6\u00f7\u0003\u0010\b\u0000\u00f7\u00fa\u0001\u0000\u0000"+
		"\u0000\u00f8\u00fa\u0003\u0012\t\u0000\u00f9\u00ef\u0001\u0000\u0000\u0000"+
		"\u00f9\u00f8\u0001\u0000\u0000\u0000\u00fa\u000f\u0001\u0000\u0000\u0000"+
		"\u00fb\u00ff\u0005\u000b\u0000\u0000\u00fc\u00fe\u0005(\u0000\u0000\u00fd"+
		"\u00fc\u0001\u0000\u0000\u0000\u00fe\u0101\u0001\u0000\u0000\u0000\u00ff"+
		"\u00fd\u0001\u0000\u0000\u0000\u00ff\u0100\u0001\u0000\u0000\u0000\u0100"+
		"\u0102\u0001\u0000\u0000\u0000\u0101\u00ff\u0001\u0000\u0000\u0000\u0102"+
		"\u0103\u0003\u000e\u0007\u0000\u0103\u0011\u0001\u0000\u0000\u0000\u0104"+
		"\u0108\u0003J%\u0000\u0105\u0107\u0005(\u0000\u0000\u0106\u0105\u0001"+
		"\u0000\u0000\u0000\u0107\u010a\u0001\u0000\u0000\u0000\u0108\u0106\u0001"+
		"\u0000\u0000\u0000\u0108\u0109\u0001\u0000\u0000\u0000\u0109\u010b\u0001"+
		"\u0000\u0000\u0000\u010a\u0108\u0001\u0000\u0000\u0000\u010b\u010f\u0005"+
		"\u001c\u0000\u0000\u010c\u010e\u0005(\u0000\u0000\u010d\u010c\u0001\u0000"+
		"\u0000\u0000\u010e\u0111\u0001\u0000\u0000\u0000\u010f\u010d\u0001\u0000"+
		"\u0000\u0000\u010f\u0110\u0001\u0000\u0000\u0000\u0110\u0112\u0001\u0000"+
		"\u0000\u0000\u0111\u010f\u0001\u0000\u0000\u0000\u0112\u0113\u0003\u0002"+
		"\u0001\u0000\u0113\u0013\u0001\u0000\u0000\u0000\u0114\u0118\u0005\u0019"+
		"\u0000\u0000\u0115\u0117\u0005(\u0000\u0000\u0116\u0115\u0001\u0000\u0000"+
		"\u0000\u0117\u011a\u0001\u0000\u0000\u0000\u0118\u0116\u0001\u0000\u0000"+
		"\u0000\u0118\u0119\u0001\u0000\u0000\u0000\u0119\u011b\u0001\u0000\u0000"+
		"\u0000\u011a\u0118\u0001\u0000\u0000\u0000\u011b\u011c\u0003\u0016\u000b"+
		"\u0000\u011c\u0015\u0001\u0000\u0000\u0000\u011d\u0121\u0003\u001a\r\u0000"+
		"\u011e\u0120\u0005(\u0000\u0000\u011f\u011e\u0001\u0000\u0000\u0000\u0120"+
		"\u0123\u0001\u0000\u0000\u0000\u0121\u011f\u0001\u0000\u0000\u0000\u0121"+
		"\u0122\u0001\u0000\u0000\u0000\u0122\u0124\u0001\u0000\u0000\u0000\u0123"+
		"\u0121\u0001\u0000\u0000\u0000\u0124\u0125\u0003\u0018\f\u0000\u0125\u0128"+
		"\u0001\u0000\u0000\u0000\u0126\u0128\u0003\u001a\r\u0000\u0127\u011d\u0001"+
		"\u0000\u0000\u0000\u0127\u0126\u0001\u0000\u0000\u0000\u0128\u0017\u0001"+
		"\u0000\u0000\u0000\u0129\u012d\u0005\u000b\u0000\u0000\u012a\u012c\u0005"+
		"(\u0000\u0000\u012b\u012a\u0001\u0000\u0000\u0000\u012c\u012f\u0001\u0000"+
		"\u0000\u0000\u012d\u012b\u0001\u0000\u0000\u0000\u012d\u012e\u0001\u0000"+
		"\u0000\u0000\u012e\u0130\u0001\u0000\u0000\u0000\u012f\u012d\u0001\u0000"+
		"\u0000\u0000\u0130\u0131\u0003\u0016\u000b\u0000\u0131\u0019\u0001\u0000"+
		"\u0000\u0000\u0132\u0136\u0003J%\u0000\u0133\u0135\u0005(\u0000\u0000"+
		"\u0134\u0133\u0001\u0000\u0000\u0000\u0135\u0138\u0001\u0000\u0000\u0000"+
		"\u0136\u0134\u0001\u0000\u0000\u0000\u0136\u0137\u0001\u0000\u0000\u0000"+
		"\u0137\u0139\u0001\u0000\u0000\u0000\u0138\u0136\u0001\u0000\u0000\u0000"+
		"\u0139\u013d\u0005 \u0000\u0000\u013a\u013c\u0005(\u0000\u0000\u013b\u013a"+
		"\u0001\u0000\u0000\u0000\u013c\u013f\u0001\u0000\u0000\u0000\u013d\u013b"+
		"\u0001\u0000\u0000\u0000\u013d\u013e\u0001\u0000\u0000\u0000\u013e\u0140"+
		"\u0001\u0000\u0000\u0000\u013f\u013d\u0001\u0000\u0000\u0000\u0140\u0141"+
		"\u0003\u0002\u0001\u0000\u0141\u001b\u0001\u0000\u0000\u0000\u0142\u0146"+
		"\u0005\u001d\u0000\u0000\u0143\u0145\u0005(\u0000\u0000\u0144\u0143\u0001"+
		"\u0000\u0000\u0000\u0145\u0148\u0001\u0000\u0000\u0000\u0146\u0144\u0001"+
		"\u0000\u0000\u0000\u0146\u0147\u0001\u0000\u0000\u0000\u0147\u0149\u0001"+
		"\u0000\u0000\u0000\u0148\u0146\u0001\u0000\u0000\u0000\u0149\u014a\u0003"+
		"\u001e\u000f\u0000\u014a\u001d\u0001\u0000\u0000\u0000\u014b\u014c\u0006"+
		"\u000f\uffff\uffff\u0000\u014c\u0153\u0003 \u0010\u0000\u014d\u0153\u0003"+
		"\"\u0011\u0000\u014e\u0153\u0003$\u0012\u0000\u014f\u0153\u0003&\u0013"+
		"\u0000\u0150\u0153\u0003(\u0014\u0000\u0151\u0153\u0003*\u0015\u0000\u0152"+
		"\u014b\u0001\u0000\u0000\u0000\u0152\u014d\u0001\u0000\u0000\u0000\u0152"+
		"\u014e\u0001\u0000\u0000\u0000\u0152\u014f\u0001\u0000\u0000\u0000\u0152"+
		"\u0150\u0001\u0000\u0000\u0000\u0152\u0151\u0001\u0000\u0000\u0000\u0153"+
		"\u0174\u0001\u0000\u0000\u0000\u0154\u0158\n\u0003\u0000\u0000\u0155\u0157"+
		"\u0005(\u0000\u0000\u0156\u0155\u0001\u0000\u0000\u0000\u0157\u015a\u0001"+
		"\u0000\u0000\u0000\u0158\u0156\u0001\u0000\u0000\u0000\u0158\u0159\u0001"+
		"\u0000\u0000\u0000\u0159\u015b\u0001\u0000\u0000\u0000\u015a\u0158\u0001"+
		"\u0000\u0000\u0000\u015b\u015f\u0005\b\u0000\u0000\u015c\u015e\u0005("+
		"\u0000\u0000\u015d\u015c\u0001\u0000\u0000\u0000\u015e\u0161\u0001\u0000"+
		"\u0000\u0000\u015f\u015d\u0001\u0000\u0000\u0000\u015f\u0160\u0001\u0000"+
		"\u0000\u0000\u0160\u0162\u0001\u0000\u0000\u0000\u0161\u015f\u0001\u0000"+
		"\u0000\u0000\u0162\u0173\u0003\u001e\u000f\u0004\u0163\u0167\n\u0002\u0000"+
		"\u0000\u0164\u0166\u0005(\u0000\u0000\u0165\u0164\u0001\u0000\u0000\u0000"+
		"\u0166\u0169\u0001\u0000\u0000\u0000\u0167\u0165\u0001\u0000\u0000\u0000"+
		"\u0167\u0168\u0001\u0000\u0000\u0000\u0168\u016a\u0001\u0000\u0000\u0000"+
		"\u0169\u0167\u0001\u0000\u0000\u0000\u016a\u016e\u0005\t\u0000\u0000\u016b"+
		"\u016d\u0005(\u0000\u0000\u016c\u016b\u0001\u0000\u0000\u0000\u016d\u0170"+
		"\u0001\u0000\u0000\u0000\u016e\u016c\u0001\u0000\u0000\u0000\u016e\u016f"+
		"\u0001\u0000\u0000\u0000\u016f\u0171\u0001\u0000\u0000\u0000\u0170\u016e"+
		"\u0001\u0000\u0000\u0000\u0171\u0173\u0003\u001e\u000f\u0003\u0172\u0154"+
		"\u0001\u0000\u0000\u0000\u0172\u0163\u0001\u0000\u0000\u0000\u0173\u0176"+
		"\u0001\u0000\u0000\u0000\u0174\u0172\u0001\u0000\u0000\u0000\u0174\u0175"+
		"\u0001\u0000\u0000\u0000\u0175\u001f\u0001\u0000\u0000\u0000\u0176\u0174"+
		"\u0001\u0000\u0000\u0000\u0177\u017b\u0005\u001b\u0000\u0000\u0178\u017a"+
		"\u0005(\u0000\u0000\u0179\u0178\u0001\u0000\u0000\u0000\u017a\u017d\u0001"+
		"\u0000\u0000\u0000\u017b\u0179\u0001\u0000\u0000\u0000\u017b\u017c\u0001"+
		"\u0000\u0000\u0000\u017c\u017e\u0001\u0000\u0000\u0000\u017d\u017b\u0001"+
		"\u0000\u0000\u0000\u017e\u0182\u0005\u000e\u0000\u0000\u017f\u0181\u0005"+
		"(\u0000\u0000\u0180\u017f\u0001\u0000\u0000\u0000\u0181\u0184\u0001\u0000"+
		"\u0000\u0000\u0182\u0180\u0001\u0000\u0000\u0000\u0182\u0183\u0001\u0000"+
		"\u0000\u0000\u0183\u0185\u0001\u0000\u0000\u0000\u0184\u0182\u0001\u0000"+
		"\u0000\u0000\u0185\u0189\u0003\u0002\u0001\u0000\u0186\u0188\u0005(\u0000"+
		"\u0000\u0187\u0186\u0001\u0000\u0000\u0000\u0188\u018b\u0001\u0000\u0000"+
		"\u0000\u0189\u0187\u0001\u0000\u0000\u0000\u0189\u018a\u0001\u0000\u0000"+
		"\u0000\u018a\u018c\u0001\u0000\u0000\u0000\u018b\u0189\u0001\u0000\u0000"+
		"\u0000\u018c\u018d\u0005\u000f\u0000\u0000\u018d!\u0001\u0000\u0000\u0000"+
		"\u018e\u0192\u0003\u0002\u0001\u0000\u018f\u0191\u0005(\u0000\u0000\u0190"+
		"\u018f\u0001\u0000\u0000\u0000\u0191\u0194\u0001\u0000\u0000\u0000\u0192"+
		"\u0190\u0001\u0000\u0000\u0000\u0192\u0193\u0001\u0000\u0000\u0000\u0193"+
		"\u0195\u0001\u0000\u0000\u0000\u0194\u0192\u0001\u0000\u0000\u0000\u0195"+
		"\u0199\u0005\u0004\u0000\u0000\u0196\u0198\u0005(\u0000\u0000\u0197\u0196"+
		"\u0001\u0000\u0000\u0000\u0198\u019b\u0001\u0000\u0000\u0000\u0199\u0197"+
		"\u0001\u0000\u0000\u0000\u0199\u019a\u0001\u0000\u0000\u0000\u019a\u019c"+
		"\u0001\u0000\u0000\u0000\u019b\u0199\u0001\u0000\u0000\u0000\u019c\u019d"+
		"\u0003\u0002\u0001\u0000\u019d\u01af\u0001\u0000\u0000\u0000\u019e\u01a2"+
		"\u0003\u0002\u0001\u0000\u019f\u01a1\u0005(\u0000\u0000\u01a0\u019f\u0001"+
		"\u0000\u0000\u0000\u01a1\u01a4\u0001\u0000\u0000\u0000\u01a2\u01a0\u0001"+
		"\u0000\u0000\u0000\u01a2\u01a3\u0001\u0000\u0000\u0000\u01a3\u01a5\u0001"+
		"\u0000\u0000\u0000\u01a4\u01a2\u0001\u0000\u0000\u0000\u01a5\u01a9\u0005"+
		"\u0007\u0000\u0000\u01a6\u01a8\u0005(\u0000\u0000\u01a7\u01a6\u0001\u0000"+
		"\u0000\u0000\u01a8\u01ab\u0001\u0000\u0000\u0000\u01a9\u01a7\u0001\u0000"+
		"\u0000\u0000\u01a9\u01aa\u0001\u0000\u0000\u0000\u01aa\u01ac\u0001\u0000"+
		"\u0000\u0000\u01ab\u01a9\u0001\u0000\u0000\u0000\u01ac\u01ad\u0003\u0002"+
		"\u0001\u0000\u01ad\u01af\u0001\u0000\u0000\u0000\u01ae\u018e\u0001\u0000"+
		"\u0000\u0000\u01ae\u019e\u0001\u0000\u0000\u0000\u01af#\u0001\u0000\u0000"+
		"\u0000\u01b0\u01b4\u0003\u0002\u0001\u0000\u01b1\u01b3\u0005(\u0000\u0000"+
		"\u01b2\u01b1\u0001\u0000\u0000\u0000\u01b3\u01b6\u0001\u0000\u0000\u0000"+
		"\u01b4\u01b2\u0001\u0000\u0000\u0000\u01b4\u01b5\u0001\u0000\u0000\u0000"+
		"\u01b5\u01b7\u0001\u0000\u0000\u0000\u01b6\u01b4\u0001\u0000\u0000\u0000"+
		"\u01b7\u01bb\u0005\u0005\u0000\u0000\u01b8\u01ba\u0005(\u0000\u0000\u01b9"+
		"\u01b8\u0001\u0000\u0000\u0000\u01ba\u01bd\u0001\u0000\u0000\u0000\u01bb"+
		"\u01b9\u0001\u0000\u0000\u0000\u01bb\u01bc\u0001\u0000\u0000\u0000\u01bc"+
		"\u01be\u0001\u0000\u0000\u0000\u01bd\u01bb\u0001\u0000\u0000\u0000\u01be"+
		"\u01bf\u0003\u0002\u0001\u0000\u01bf\u01d1\u0001\u0000\u0000\u0000\u01c0"+
		"\u01c4\u0003\u0002\u0001\u0000\u01c1\u01c3\u0005(\u0000\u0000\u01c2\u01c1"+
		"\u0001\u0000\u0000\u0000\u01c3\u01c6\u0001\u0000\u0000\u0000\u01c4\u01c2"+
		"\u0001\u0000\u0000\u0000\u01c4\u01c5\u0001\u0000\u0000\u0000\u01c5\u01c7"+
		"\u0001\u0000\u0000\u0000\u01c6\u01c4\u0001\u0000\u0000\u0000\u01c7\u01cb"+
		"\u0005\u0006\u0000\u0000\u01c8\u01ca\u0005(\u0000\u0000\u01c9\u01c8\u0001"+
		"\u0000\u0000\u0000\u01ca\u01cd\u0001\u0000\u0000\u0000\u01cb\u01c9\u0001"+
		"\u0000\u0000\u0000\u01cb\u01cc\u0001\u0000\u0000\u0000\u01cc\u01ce\u0001"+
		"\u0000\u0000\u0000\u01cd\u01cb\u0001\u0000\u0000\u0000\u01ce\u01cf\u0003"+
		"\u0002\u0001\u0000\u01cf\u01d1\u0001\u0000\u0000\u0000\u01d0\u01b0\u0001"+
		"\u0000\u0000\u0000\u01d0\u01c0\u0001\u0000\u0000\u0000\u01d1%\u0001\u0000"+
		"\u0000\u0000\u01d2\u01d6\u0005\u001a\u0000\u0000\u01d3\u01d5\u0005(\u0000"+
		"\u0000\u01d4\u01d3\u0001\u0000\u0000\u0000\u01d5\u01d8\u0001\u0000\u0000"+
		"\u0000\u01d6\u01d4\u0001\u0000\u0000\u0000\u01d6\u01d7\u0001\u0000\u0000"+
		"\u0000\u01d7\u01d9\u0001\u0000\u0000\u0000\u01d8\u01d6\u0001\u0000\u0000"+
		"\u0000\u01d9\u01dd\u0003\u000e\u0007\u0000\u01da\u01dc\u0005(\u0000\u0000"+
		"\u01db\u01da\u0001\u0000\u0000\u0000\u01dc\u01df\u0001\u0000\u0000\u0000"+
		"\u01dd\u01db\u0001\u0000\u0000\u0000\u01dd\u01de\u0001\u0000\u0000\u0000"+
		"\u01de\u01e0\u0001\u0000\u0000\u0000\u01df\u01dd\u0001\u0000\u0000\u0000"+
		"\u01e0\u01e4\u0005\"\u0000\u0000\u01e1\u01e3\u0005(\u0000\u0000\u01e2"+
		"\u01e1\u0001\u0000\u0000\u0000\u01e3\u01e6\u0001\u0000\u0000\u0000\u01e4"+
		"\u01e2\u0001\u0000\u0000\u0000\u01e4\u01e5\u0001\u0000\u0000\u0000\u01e5"+
		"\u01e7\u0001\u0000\u0000\u0000\u01e6\u01e4\u0001\u0000\u0000\u0000\u01e7"+
		"\u01e8\u0003\u001e\u000f\u0000\u01e8\'\u0001\u0000\u0000\u0000\u01e9\u01ed"+
		"\u0005\u000e\u0000\u0000\u01ea\u01ec\u0005(\u0000\u0000\u01eb\u01ea\u0001"+
		"\u0000\u0000\u0000\u01ec\u01ef\u0001\u0000\u0000\u0000\u01ed\u01eb\u0001"+
		"\u0000\u0000\u0000\u01ed\u01ee\u0001\u0000\u0000\u0000\u01ee\u01f0\u0001"+
		"\u0000\u0000\u0000\u01ef\u01ed\u0001\u0000\u0000\u0000\u01f0\u01f4\u0003"+
		"\u001e\u000f\u0000\u01f1\u01f3\u0005(\u0000\u0000\u01f2\u01f1\u0001\u0000"+
		"\u0000\u0000\u01f3\u01f6\u0001\u0000\u0000\u0000\u01f4\u01f2\u0001\u0000"+
		"\u0000\u0000\u01f4\u01f5\u0001\u0000\u0000\u0000\u01f5\u01f7\u0001\u0000"+
		"\u0000\u0000\u01f6\u01f4\u0001\u0000\u0000\u0000\u01f7\u01f8\u0005\u000f"+
		"\u0000\u0000\u01f8)\u0001\u0000\u0000\u0000\u01f9\u01fd\u0005\n\u0000"+
		"\u0000\u01fa\u01fc\u0005(\u0000\u0000\u01fb\u01fa\u0001\u0000\u0000\u0000"+
		"\u01fc\u01ff\u0001\u0000\u0000\u0000\u01fd\u01fb\u0001\u0000\u0000\u0000"+
		"\u01fd\u01fe\u0001\u0000\u0000\u0000\u01fe\u0200\u0001\u0000\u0000\u0000"+
		"\u01ff\u01fd\u0001\u0000\u0000\u0000\u0200\u0201\u0003\u001e\u000f\u0000"+
		"\u0201+\u0001\u0000\u0000\u0000\u0202\u0206\u0005!\u0000\u0000\u0203\u0205"+
		"\u0005(\u0000\u0000\u0204\u0203\u0001\u0000\u0000\u0000\u0205\u0208\u0001"+
		"\u0000\u0000\u0000\u0206\u0204\u0001\u0000\u0000\u0000\u0206\u0207\u0001"+
		"\u0000\u0000\u0000\u0207\u0209\u0001\u0000\u0000\u0000\u0208\u0206\u0001"+
		"\u0000\u0000\u0000\u0209\u020a\u0003\u0002\u0001\u0000\u020a-\u0001\u0000"+
		"\u0000\u0000\u020b\u020f\u0005\u0001\u0000\u0000\u020c\u020e\u0005(\u0000"+
		"\u0000\u020d\u020c\u0001\u0000\u0000\u0000\u020e\u0211\u0001\u0000\u0000"+
		"\u0000\u020f\u020d\u0001\u0000\u0000\u0000\u020f\u0210\u0001\u0000\u0000"+
		"\u0000\u0210\u0212\u0001\u0000\u0000\u0000\u0211\u020f\u0001\u0000\u0000"+
		"\u0000\u0212\u0216\u0003F#\u0000\u0213\u0215\u0005(\u0000\u0000\u0214"+
		"\u0213\u0001\u0000\u0000\u0000\u0215\u0218\u0001\u0000\u0000\u0000\u0216"+
		"\u0214\u0001\u0000\u0000\u0000\u0216\u0217\u0001\u0000\u0000\u0000\u0217"+
		"\u0219\u0001\u0000\u0000\u0000\u0218\u0216\u0001\u0000\u0000\u0000\u0219"+
		"\u021d\u0005\u000f\u0000\u0000\u021a\u021c\u0005(\u0000\u0000\u021b\u021a"+
		"\u0001\u0000\u0000\u0000\u021c\u021f\u0001\u0000\u0000\u0000\u021d\u021b"+
		"\u0001\u0000\u0000\u0000\u021d\u021e\u0001\u0000\u0000\u0000\u021e\u0220"+
		"\u0001\u0000\u0000\u0000\u021f\u021d\u0001\u0000\u0000\u0000\u0220\u0224"+
		"\u0005\u0002\u0000\u0000\u0221\u0223\u0005(\u0000\u0000\u0222\u0221\u0001"+
		"\u0000\u0000\u0000\u0223\u0226\u0001\u0000\u0000\u0000\u0224\u0222\u0001"+
		"\u0000\u0000\u0000\u0224\u0225\u0001\u0000\u0000\u0000\u0225\u0227\u0001"+
		"\u0000\u0000\u0000\u0226\u0224\u0001\u0000\u0000\u0000\u0227\u0228\u0003"+
		"0\u0018\u0000\u0228\u0248\u0001\u0000\u0000\u0000\u0229\u022d\u0005\u0001"+
		"\u0000\u0000\u022a\u022c\u0005(\u0000\u0000\u022b\u022a\u0001\u0000\u0000"+
		"\u0000\u022c\u022f\u0001\u0000\u0000\u0000\u022d\u022b\u0001\u0000\u0000"+
		"\u0000\u022d\u022e\u0001\u0000\u0000\u0000\u022e\u0230\u0001\u0000\u0000"+
		"\u0000\u022f\u022d\u0001\u0000\u0000\u0000\u0230\u0234\u0003F#\u0000\u0231"+
		"\u0233\u0005(\u0000\u0000\u0232\u0231\u0001\u0000\u0000\u0000\u0233\u0236"+
		"\u0001\u0000\u0000\u0000\u0234\u0232\u0001\u0000\u0000\u0000\u0234\u0235"+
		"\u0001\u0000\u0000\u0000\u0235\u0237\u0001\u0000\u0000\u0000\u0236\u0234"+
		"\u0001\u0000\u0000\u0000\u0237\u023b\u0005\u000f\u0000\u0000\u0238\u023a"+
		"\u0005(\u0000\u0000\u0239\u0238\u0001\u0000\u0000\u0000\u023a\u023d\u0001"+
		"\u0000\u0000\u0000\u023b\u0239\u0001\u0000\u0000\u0000\u023b\u023c\u0001"+
		"\u0000\u0000\u0000\u023c\u023e\u0001\u0000\u0000\u0000\u023d\u023b\u0001"+
		"\u0000\u0000\u0000\u023e\u0242\u0005\u0003\u0000\u0000\u023f\u0241\u0005"+
		"(\u0000\u0000\u0240\u023f\u0001\u0000\u0000\u0000\u0241\u0244\u0001\u0000"+
		"\u0000\u0000\u0242\u0240\u0001\u0000\u0000\u0000\u0242\u0243\u0001\u0000"+
		"\u0000\u0000\u0243\u0245\u0001\u0000\u0000\u0000\u0244\u0242\u0001\u0000"+
		"\u0000\u0000\u0245\u0246\u00030\u0018\u0000\u0246\u0248\u0001\u0000\u0000"+
		"\u0000\u0247\u020b\u0001\u0000\u0000\u0000\u0247\u0229\u0001\u0000\u0000"+
		"\u0000\u0248/\u0001\u0000\u0000\u0000\u0249\u024a\u0006\u0018\uffff\uffff"+
		"\u0000\u024a\u0252\u0003B!\u0000\u024b\u0252\u00032\u0019\u0000\u024c"+
		"\u0252\u00034\u001a\u0000\u024d\u0252\u00036\u001b\u0000\u024e\u0252\u0003"+
		"<\u001e\u0000\u024f\u0252\u0003:\u001d\u0000\u0250\u0252\u0003>\u001f"+
		"\u0000\u0251\u0249\u0001\u0000\u0000\u0000\u0251\u024b\u0001\u0000\u0000"+
		"\u0000\u0251\u024c\u0001\u0000\u0000\u0000\u0251\u024d\u0001\u0000\u0000"+
		"\u0000\u0251\u024e\u0001\u0000\u0000\u0000\u0251\u024f\u0001\u0000\u0000"+
		"\u0000\u0251\u0250\u0001\u0000\u0000\u0000\u0252\u028a\u0001\u0000\u0000"+
		"\u0000\u0253\u0257\n\u0004\u0000\u0000\u0254\u0256\u0005(\u0000\u0000"+
		"\u0255\u0254\u0001\u0000\u0000\u0000\u0256\u0259\u0001\u0000\u0000\u0000"+
		"\u0257\u0255\u0001\u0000\u0000\u0000\u0257\u0258\u0001\u0000\u0000\u0000"+
		"\u0258\u025a\u0001\u0000\u0000\u0000\u0259\u0257\u0001\u0000\u0000\u0000"+
		"\u025a\u025e\u0005\u0002\u0000\u0000\u025b\u025d\u0005(\u0000\u0000\u025c"+
		"\u025b\u0001\u0000\u0000\u0000\u025d\u0260\u0001\u0000\u0000\u0000\u025e"+
		"\u025c\u0001\u0000\u0000\u0000\u025e\u025f\u0001\u0000\u0000\u0000\u025f"+
		"\u0261\u0001\u0000\u0000\u0000\u0260\u025e\u0001\u0000\u0000\u0000\u0261"+
		"\u0289\u00030\u0018\u0005\u0262\u0266\n\u0003\u0000\u0000\u0263\u0265"+
		"\u0005(\u0000\u0000\u0264\u0263\u0001\u0000\u0000\u0000\u0265\u0268\u0001"+
		"\u0000\u0000\u0000\u0266\u0264\u0001\u0000\u0000\u0000\u0266\u0267\u0001"+
		"\u0000\u0000\u0000\u0267\u0269\u0001\u0000\u0000\u0000\u0268\u0266\u0001"+
		"\u0000\u0000\u0000\u0269\u026d\u0005\u0003\u0000\u0000\u026a\u026c\u0005"+
		"(\u0000\u0000\u026b\u026a\u0001\u0000\u0000\u0000\u026c\u026f\u0001\u0000"+
		"\u0000\u0000\u026d\u026b\u0001\u0000\u0000\u0000\u026d\u026e\u0001\u0000"+
		"\u0000\u0000\u026e\u0270\u0001\u0000\u0000\u0000\u026f\u026d\u0001\u0000"+
		"\u0000\u0000\u0270\u0289\u00030\u0018\u0004\u0271\u0275\n\u0001\u0000"+
		"\u0000\u0272\u0274\u0005(\u0000\u0000\u0273\u0272\u0001\u0000\u0000\u0000"+
		"\u0274\u0277\u0001\u0000\u0000\u0000\u0275\u0273\u0001\u0000\u0000\u0000"+
		"\u0275\u0276\u0001\u0000\u0000\u0000\u0276\u0278\u0001\u0000\u0000\u0000"+
		"\u0277\u0275\u0001\u0000\u0000\u0000\u0278\u027c\u0005\u000b\u0000\u0000"+
		"\u0279\u027b\u0005(\u0000\u0000\u027a\u0279\u0001\u0000\u0000\u0000\u027b"+
		"\u027e\u0001\u0000\u0000\u0000\u027c\u027a\u0001\u0000\u0000\u0000\u027c"+
		"\u027d\u0001\u0000\u0000\u0000\u027d\u027f\u0001\u0000\u0000\u0000\u027e"+
		"\u027c\u0001\u0000\u0000\u0000\u027f\u0289\u00030\u0018\u0002\u0280\u0284"+
		"\n\u0002\u0000\u0000\u0281\u0283\u0005(\u0000\u0000\u0282\u0281\u0001"+
		"\u0000\u0000\u0000\u0283\u0286\u0001\u0000\u0000\u0000\u0284\u0282\u0001"+
		"\u0000\u0000\u0000\u0284\u0285\u0001\u0000\u0000\u0000\u0285\u0287\u0001"+
		"\u0000\u0000\u0000\u0286\u0284\u0001\u0000\u0000\u0000\u0287\u0289\u0003"+
		"8\u001c\u0000\u0288\u0253\u0001\u0000\u0000\u0000\u0288\u0262\u0001\u0000"+
		"\u0000\u0000\u0288\u0271\u0001\u0000\u0000\u0000\u0288\u0280\u0001\u0000"+
		"\u0000\u0000\u0289\u028c\u0001\u0000\u0000\u0000\u028a\u0288\u0001\u0000"+
		"\u0000\u0000\u028a\u028b\u0001\u0000\u0000\u0000\u028b1\u0001\u0000\u0000"+
		"\u0000\u028c\u028a\u0001\u0000\u0000\u0000\u028d\u028e\u0005\u0012\u0000"+
		"\u0000\u028e3\u0001\u0000\u0000\u0000\u028f\u0290\u0005\u0013\u0000\u0000"+
		"\u02905\u0001\u0000\u0000\u0000\u0291\u0292\u0005\u0014\u0000\u0000\u0292"+
		"7\u0001\u0000\u0000\u0000\u0293\u0297\u0005\f\u0000\u0000\u0294\u0296"+
		"\u0005(\u0000\u0000\u0295\u0294\u0001\u0000\u0000\u0000\u0296\u0299\u0001"+
		"\u0000\u0000\u0000\u0297\u0295\u0001\u0000\u0000\u0000\u0297\u0298\u0001"+
		"\u0000\u0000\u0000\u0298\u029a\u0001\u0000\u0000\u0000\u0299\u0297\u0001"+
		"\u0000\u0000\u0000\u029a\u029e\u0003@ \u0000\u029b\u029d\u0005(\u0000"+
		"\u0000\u029c\u029b\u0001\u0000\u0000\u0000\u029d\u02a0\u0001\u0000\u0000"+
		"\u0000\u029e\u029c\u0001\u0000\u0000\u0000\u029e\u029f\u0001\u0000\u0000"+
		"\u0000\u029f\u02a1\u0001\u0000\u0000\u0000\u02a0\u029e\u0001\u0000\u0000"+
		"\u0000\u02a1\u02a2\u0005\r\u0000\u0000\u02a29\u0001\u0000\u0000\u0000"+
		"\u02a3\u02a4\u0005\u0010\u0000\u0000\u02a4\u02a5\u0003D\"\u0000\u02a5"+
		";\u0001\u0000\u0000\u0000\u02a6\u02a7\u0005\u0011\u0000\u0000\u02a7\u02a8"+
		"\u0005\u000e\u0000\u0000\u02a8\u02a9\u0005\u000f\u0000\u0000\u02a9=\u0001"+
		"\u0000\u0000\u0000\u02aa\u02ae\u0005\u000e\u0000\u0000\u02ab\u02ad\u0005"+
		"(\u0000\u0000\u02ac\u02ab\u0001\u0000\u0000\u0000\u02ad\u02b0\u0001\u0000"+
		"\u0000\u0000\u02ae\u02ac\u0001\u0000\u0000\u0000\u02ae\u02af\u0001\u0000"+
		"\u0000\u0000\u02af\u02b1\u0001\u0000\u0000\u0000\u02b0\u02ae\u0001\u0000"+
		"\u0000\u0000\u02b1\u02b5\u00030\u0018\u0000\u02b2\u02b4\u0005(\u0000\u0000"+
		"\u02b3\u02b2\u0001\u0000\u0000\u0000\u02b4\u02b7\u0001\u0000\u0000\u0000"+
		"\u02b5\u02b3\u0001\u0000\u0000\u0000\u02b5\u02b6\u0001\u0000\u0000\u0000"+
		"\u02b6\u02b8\u0001\u0000\u0000\u0000\u02b7\u02b5\u0001\u0000\u0000\u0000"+
		"\u02b8\u02b9\u0005\u000f\u0000\u0000\u02b9?\u0001\u0000\u0000\u0000\u02ba"+
		"\u02bb\u0006 \uffff\uffff\u0000\u02bb\u0319\u00030\u0018\u0000\u02bc\u02c0"+
		"\u00030\u0018\u0000\u02bd\u02bf\u0005(\u0000\u0000\u02be\u02bd\u0001\u0000"+
		"\u0000\u0000\u02bf\u02c2\u0001\u0000\u0000\u0000\u02c0\u02be\u0001\u0000"+
		"\u0000\u0000\u02c0\u02c1\u0001\u0000\u0000\u0000\u02c1\u02c3\u0001\u0000"+
		"\u0000\u0000\u02c2\u02c0\u0001\u0000\u0000\u0000\u02c3\u02c7\u0005\u0004"+
		"\u0000\u0000\u02c4\u02c6\u0005(\u0000\u0000\u02c5\u02c4\u0001\u0000\u0000"+
		"\u0000\u02c6\u02c9\u0001\u0000\u0000\u0000\u02c7\u02c5\u0001\u0000\u0000"+
		"\u0000\u02c7\u02c8\u0001\u0000\u0000\u0000\u02c8\u02ca\u0001\u0000\u0000"+
		"\u0000\u02c9\u02c7\u0001\u0000\u0000\u0000\u02ca\u02cb\u00030\u0018\u0000"+
		"\u02cb\u0319\u0001\u0000\u0000\u0000\u02cc\u02d0\u00030\u0018\u0000\u02cd"+
		"\u02cf\u0005(\u0000\u0000\u02ce\u02cd\u0001\u0000\u0000\u0000\u02cf\u02d2"+
		"\u0001\u0000\u0000\u0000\u02d0\u02ce\u0001\u0000\u0000\u0000\u02d0\u02d1"+
		"\u0001\u0000\u0000\u0000\u02d1\u02d3\u0001\u0000\u0000\u0000\u02d2\u02d0"+
		"\u0001\u0000\u0000\u0000\u02d3\u02d7\u0005\u0007\u0000\u0000\u02d4\u02d6"+
		"\u0005(\u0000\u0000\u02d5\u02d4\u0001\u0000\u0000\u0000\u02d6\u02d9\u0001"+
		"\u0000\u0000\u0000\u02d7\u02d5\u0001\u0000\u0000\u0000\u02d7\u02d8\u0001"+
		"\u0000\u0000\u0000\u02d8\u02da\u0001\u0000\u0000\u0000\u02d9\u02d7\u0001"+
		"\u0000\u0000\u0000\u02da\u02db\u00030\u0018\u0000\u02db\u0319\u0001\u0000"+
		"\u0000\u0000\u02dc\u02e0\u00030\u0018\u0000\u02dd\u02df\u0005(\u0000\u0000"+
		"\u02de\u02dd\u0001\u0000\u0000\u0000\u02df\u02e2\u0001\u0000\u0000\u0000"+
		"\u02e0\u02de\u0001\u0000\u0000\u0000\u02e0\u02e1\u0001\u0000\u0000\u0000"+
		"\u02e1\u02e3\u0001\u0000\u0000\u0000\u02e2\u02e0\u0001\u0000\u0000\u0000"+
		"\u02e3\u02e7\u0005\u0005\u0000\u0000\u02e4\u02e6\u0005(\u0000\u0000\u02e5"+
		"\u02e4\u0001\u0000\u0000\u0000\u02e6\u02e9\u0001\u0000\u0000\u0000\u02e7"+
		"\u02e5\u0001\u0000\u0000\u0000\u02e7\u02e8\u0001\u0000\u0000\u0000\u02e8"+
		"\u02ea\u0001\u0000\u0000\u0000\u02e9\u02e7\u0001\u0000\u0000\u0000\u02ea"+
		"\u02eb\u00030\u0018\u0000\u02eb\u0319\u0001\u0000\u0000\u0000\u02ec\u02f0"+
		"\u00030\u0018\u0000\u02ed\u02ef\u0005(\u0000\u0000\u02ee\u02ed\u0001\u0000"+
		"\u0000\u0000\u02ef\u02f2\u0001\u0000\u0000\u0000\u02f0\u02ee\u0001\u0000"+
		"\u0000\u0000\u02f0\u02f1\u0001\u0000\u0000\u0000\u02f1\u02f3\u0001\u0000"+
		"\u0000\u0000\u02f2\u02f0\u0001\u0000\u0000\u0000\u02f3\u02f7\u0005\u0006"+
		"\u0000\u0000\u02f4\u02f6\u0005(\u0000\u0000\u02f5\u02f4\u0001\u0000\u0000"+
		"\u0000\u02f6\u02f9\u0001\u0000\u0000\u0000\u02f7\u02f5\u0001\u0000\u0000"+
		"\u0000\u02f7\u02f8\u0001\u0000\u0000\u0000\u02f8\u02fa\u0001\u0000\u0000"+
		"\u0000\u02f9\u02f7\u0001\u0000\u0000\u0000\u02fa\u02fb\u00030\u0018\u0000"+
		"\u02fb\u0319\u0001\u0000\u0000\u0000\u02fc\u0300\u00030\u0018\u0000\u02fd"+
		"\u02ff\u0005(\u0000\u0000\u02fe\u02fd\u0001\u0000\u0000\u0000\u02ff\u0302"+
		"\u0001\u0000\u0000\u0000\u0300\u02fe\u0001\u0000\u0000\u0000\u0300\u0301"+
		"\u0001\u0000\u0000\u0000\u0301\u0303\u0001\u0000\u0000\u0000\u0302\u0300"+
		"\u0001\u0000\u0000\u0000\u0303\u0307\u0005\u0004\u0000\u0000\u0304\u0306"+
		"\u0005(\u0000\u0000\u0305\u0304\u0001\u0000\u0000\u0000\u0306\u0309\u0001"+
		"\u0000\u0000\u0000\u0307\u0305\u0001\u0000\u0000\u0000\u0307\u0308\u0001"+
		"\u0000\u0000\u0000\u0308\u030a\u0001\u0000\u0000\u0000\u0309\u0307\u0001"+
		"\u0000\u0000\u0000\u030a\u030b\u0003H$\u0000\u030b\u0319\u0001\u0000\u0000"+
		"\u0000\u030c\u030d\u0005\u000e\u0000\u0000\u030d\u030e\u0003@ \u0000\u030e"+
		"\u030f\u0005\u000f\u0000\u0000\u030f\u0319\u0001\u0000\u0000\u0000\u0310"+
		"\u0314\u0005\n\u0000\u0000\u0311\u0313\u0005(\u0000\u0000\u0312\u0311"+
		"\u0001\u0000\u0000\u0000\u0313\u0316\u0001\u0000\u0000\u0000\u0314\u0312"+
		"\u0001\u0000\u0000\u0000\u0314\u0315\u0001\u0000\u0000\u0000\u0315\u0317"+
		"\u0001\u0000\u0000\u0000\u0316\u0314\u0001\u0000\u0000\u0000\u0317\u0319"+
		"\u0003@ \u0001\u0318\u02ba\u0001\u0000\u0000\u0000\u0318\u02bc\u0001\u0000"+
		"\u0000\u0000\u0318\u02cc\u0001\u0000\u0000\u0000\u0318\u02dc\u0001\u0000"+
		"\u0000\u0000\u0318\u02ec\u0001\u0000\u0000\u0000\u0318\u02fc\u0001\u0000"+
		"\u0000\u0000\u0318\u030c\u0001\u0000\u0000\u0000\u0318\u0310\u0001\u0000"+
		"\u0000\u0000\u0319\u033a\u0001\u0000\u0000\u0000\u031a\u031e\n\u0003\u0000"+
		"\u0000\u031b\u031d\u0005(\u0000\u0000\u031c\u031b\u0001\u0000\u0000\u0000"+
		"\u031d\u0320\u0001\u0000\u0000\u0000\u031e\u031c\u0001\u0000\u0000\u0000"+
		"\u031e\u031f\u0001\u0000\u0000\u0000\u031f\u0321\u0001\u0000\u0000\u0000"+
		"\u0320\u031e\u0001\u0000\u0000\u0000\u0321\u0325\u0005\b\u0000\u0000\u0322"+
		"\u0324\u0005(\u0000\u0000\u0323\u0322\u0001\u0000\u0000\u0000\u0324\u0327"+
		"\u0001\u0000\u0000\u0000\u0325\u0323\u0001\u0000\u0000\u0000\u0325\u0326"+
		"\u0001\u0000\u0000\u0000\u0326\u0328\u0001\u0000\u0000\u0000\u0327\u0325"+
		"\u0001\u0000\u0000\u0000\u0328\u0339\u0003@ \u0004\u0329\u032d\n\u0002"+
		"\u0000\u0000\u032a\u032c\u0005(\u0000\u0000\u032b\u032a\u0001\u0000\u0000"+
		"\u0000\u032c\u032f\u0001\u0000\u0000\u0000\u032d\u032b\u0001\u0000\u0000"+
		"\u0000\u032d\u032e\u0001\u0000\u0000\u0000\u032e\u0330\u0001\u0000\u0000"+
		"\u0000\u032f\u032d\u0001\u0000\u0000\u0000\u0330\u0334\u0005\t\u0000\u0000"+
		"\u0331\u0333\u0005(\u0000\u0000\u0332\u0331\u0001\u0000\u0000\u0000\u0333"+
		"\u0336\u0001\u0000\u0000\u0000\u0334\u0332\u0001\u0000\u0000\u0000\u0334"+
		"\u0335\u0001\u0000\u0000\u0000\u0335\u0337\u0001\u0000\u0000\u0000\u0336"+
		"\u0334\u0001\u0000\u0000\u0000\u0337\u0339\u0003@ \u0003\u0338\u031a\u0001"+
		"\u0000\u0000\u0000\u0338\u0329\u0001\u0000\u0000\u0000\u0339\u033c\u0001"+
		"\u0000\u0000\u0000\u033a\u0338\u0001\u0000\u0000\u0000\u033a\u033b\u0001"+
		"\u0000\u0000\u0000\u033bA\u0001\u0000\u0000\u0000\u033c\u033a\u0001\u0000"+
		"\u0000\u0000\u033d\u033e\u0005&\u0000\u0000\u033eC\u0001\u0000\u0000\u0000"+
		"\u033f\u0340\u0005\u0016\u0000\u0000\u0340E\u0001\u0000\u0000\u0000\u0341"+
		"\u0342\u0005\u0015\u0000\u0000\u0342G\u0001\u0000\u0000\u0000\u0343\u0344"+
		"\u0005\u0016\u0000\u0000\u0344I\u0001\u0000\u0000\u0000\u0345\u0346\u0005"+
		"\'\u0000\u0000\u0346K\u0001\u0000\u0000\u0000\u0347\u0348\u0005$\u0000"+
		"\u0000\u0348\u0349\u0005&\u0000\u0000\u0349\u034a\u0005#\u0000\u0000\u034a"+
		"M\u0001\u0000\u0000\u0000\u034b\u034c\u0005%\u0000\u0000\u034c\u034d\u0005"+
		"&\u0000\u0000\u034d\u034e\u0005#\u0000\u0000\u034eO\u0001\u0000\u0000"+
		"\u0000gSZgmt|\u0083\u008b\u0092\u0096\u0098\u00a1\u00a8\u00b1\u00b8\u00bf"+
		"\u00c6\u00cf\u00d3\u00d8\u00dc\u00e1\u00ea\u00f3\u00f9\u00ff\u0108\u010f"+
		"\u0118\u0121\u0127\u012d\u0136\u013d\u0146\u0152\u0158\u015f\u0167\u016e"+
		"\u0172\u0174\u017b\u0182\u0189\u0192\u0199\u01a2\u01a9\u01ae\u01b4\u01bb"+
		"\u01c4\u01cb\u01d0\u01d6\u01dd\u01e4\u01ed\u01f4\u01fd\u0206\u020f\u0216"+
		"\u021d\u0224\u022d\u0234\u023b\u0242\u0247\u0251\u0257\u025e\u0266\u026d"+
		"\u0275\u027c\u0284\u0288\u028a\u0297\u029e\u02ae\u02b5\u02c0\u02c7\u02d0"+
		"\u02d7\u02e0\u02e7\u02f0\u02f7\u0300\u0307\u0314\u0318\u031e\u0325\u032d"+
		"\u0334\u0338\u033a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
