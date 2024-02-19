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
			setState(468);
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(467);
				match(Separators);
				}
				}
				setState(470);
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Separators );
			setState(472);
			forVariables();
			setState(476);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Separators) {
				{
				{
				setState(473);
				match(Separators);
				}
				}
				setState(478);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(479);
			match(Satisfies);
			setState(483);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Separators) {
				{
				{
				setState(480);
				match(Separators);
				}
				}
				setState(485);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(486);
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
			setState(488);
			match(OpenParen);
			setState(492);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Separators) {
				{
				{
				setState(489);
				match(Separators);
				}
				}
				setState(494);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(495);
			cond(0);
			setState(499);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Separators) {
				{
				{
				setState(496);
				match(Separators);
				}
				}
				setState(501);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(502);
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
			setState(504);
			match(Not);
			setState(508);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Separators) {
				{
				{
				setState(505);
				match(Separators);
				}
				}
				setState(510);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(511);
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
			setState(513);
			match(Return);
			setState(517);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Separators) {
				{
				{
				setState(514);
				match(Separators);
				}
				}
				setState(519);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(520);
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
			setState(582);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(522);
				match(DocOpen);
				setState(526);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Separators) {
					{
					{
					setState(523);
					match(Separators);
					}
					}
					setState(528);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(529);
				fileName();
				setState(533);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Separators) {
					{
					{
					setState(530);
					match(Separators);
					}
					}
					setState(535);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(536);
				match(CloseParen);
				setState(540);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Separators) {
					{
					{
					setState(537);
					match(Separators);
					}
					}
					setState(542);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(543);
				match(ImmediateDescendent);
				setState(547);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Separators) {
					{
					{
					setState(544);
					match(Separators);
					}
					}
					setState(549);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(550);
				relativePath(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(552);
				match(DocOpen);
				setState(556);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Separators) {
					{
					{
					setState(553);
					match(Separators);
					}
					}
					setState(558);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(559);
				fileName();
				setState(563);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Separators) {
					{
					{
					setState(560);
					match(Separators);
					}
					}
					setState(565);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(566);
				match(CloseParen);
				setState(570);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Separators) {
					{
					{
					setState(567);
					match(Separators);
					}
					}
					setState(572);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(573);
				match(Descendent);
				setState(577);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Separators) {
					{
					{
					setState(574);
					match(Separators);
					}
					}
					setState(579);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(580);
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
			setState(592);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PathTag:
				{
				setState(585);
				tagName();
				}
				break;
			case Children:
				{
				setState(586);
				children();
				}
				break;
			case Current:
				{
				setState(587);
				current();
				}
				break;
			case Parent:
				{
				setState(588);
				parent();
				}
				break;
			case Text:
				{
				setState(589);
				textFunction();
				}
				break;
			case At:
				{
				setState(590);
				attribute();
				}
				break;
			case OpenParen:
				{
				setState(591);
				inParenthesis();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(649);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(647);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
					case 1:
						{
						_localctx = new RelativePathContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relativePath);
						setState(594);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(598);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==Separators) {
							{
							{
							setState(595);
							match(Separators);
							}
							}
							setState(600);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(601);
						match(ImmediateDescendent);
						setState(605);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==Separators) {
							{
							{
							setState(602);
							match(Separators);
							}
							}
							setState(607);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(608);
						relativePath(5);
						}
						break;
					case 2:
						{
						_localctx = new RelativePathContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relativePath);
						setState(609);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(613);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==Separators) {
							{
							{
							setState(610);
							match(Separators);
							}
							}
							setState(615);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(616);
						match(Descendent);
						setState(620);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==Separators) {
							{
							{
							setState(617);
							match(Separators);
							}
							}
							setState(622);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(623);
						relativePath(4);
						}
						break;
					case 3:
						{
						_localctx = new RelativePathContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relativePath);
						setState(624);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(628);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==Separators) {
							{
							{
							setState(625);
							match(Separators);
							}
							}
							setState(630);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(631);
						match(Comma);
						setState(635);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==Separators) {
							{
							{
							setState(632);
							match(Separators);
							}
							}
							setState(637);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(638);
						relativePath(2);
						}
						break;
					case 4:
						{
						_localctx = new RelativePathContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relativePath);
						setState(639);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(643);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==Separators) {
							{
							{
							setState(640);
							match(Separators);
							}
							}
							setState(645);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(646);
						filter();
						}
						break;
					}
					}
				}
				setState(651);
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
			setState(652);
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
			setState(654);
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
			setState(656);
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
			setState(658);
			match(OpenBracket);
			setState(662);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Separators) {
				{
				{
				setState(659);
				match(Separators);
				}
				}
				setState(664);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(665);
			f(0);
			setState(669);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Separators) {
				{
				{
				setState(666);
				match(Separators);
				}
				}
				setState(671);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(672);
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
			setState(674);
			match(At);
			setState(675);
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
			setState(677);
			match(Text);
			setState(678);
			match(OpenParen);
			setState(679);
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
		enterRule(_localctx, 62, RULE_inParenthesis);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(681);
			match(OpenParen);
			setState(682);
			relativePath(0);
			setState(683);
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
			setState(779);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				{
				setState(686);
				relativePath(0);
				}
				break;
			case 2:
				{
				setState(687);
				relativePath(0);
				setState(691);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Separators) {
					{
					{
					setState(688);
					match(Separators);
					}
					}
					setState(693);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(694);
				match(Equal);
				setState(698);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Separators) {
					{
					{
					setState(695);
					match(Separators);
					}
					}
					setState(700);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(701);
				relativePath(0);
				}
				break;
			case 3:
				{
				setState(703);
				relativePath(0);
				setState(707);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Separators) {
					{
					{
					setState(704);
					match(Separators);
					}
					}
					setState(709);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(710);
				match(Eq);
				setState(714);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Separators) {
					{
					{
					setState(711);
					match(Separators);
					}
					}
					setState(716);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(717);
				relativePath(0);
				}
				break;
			case 4:
				{
				setState(719);
				relativePath(0);
				setState(723);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Separators) {
					{
					{
					setState(720);
					match(Separators);
					}
					}
					setState(725);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(726);
				match(Equals);
				setState(730);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Separators) {
					{
					{
					setState(727);
					match(Separators);
					}
					}
					setState(732);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(733);
				relativePath(0);
				}
				break;
			case 5:
				{
				setState(735);
				relativePath(0);
				setState(739);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Separators) {
					{
					{
					setState(736);
					match(Separators);
					}
					}
					setState(741);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(742);
				match(Is);
				setState(746);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Separators) {
					{
					{
					setState(743);
					match(Separators);
					}
					}
					setState(748);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(749);
				relativePath(0);
				}
				break;
			case 6:
				{
				setState(751);
				relativePath(0);
				setState(755);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Separators) {
					{
					{
					setState(752);
					match(Separators);
					}
					}
					setState(757);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(758);
				match(Equal);
				setState(762);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Separators) {
					{
					{
					setState(759);
					match(Separators);
					}
					}
					setState(764);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(765);
				stringConstantText();
				}
				break;
			case 7:
				{
				setState(767);
				match(OpenParen);
				setState(768);
				f(0);
				setState(769);
				match(CloseParen);
				}
				break;
			case 8:
				{
				setState(771);
				match(Not);
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
				f(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(813);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(811);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
					case 1:
						{
						_localctx = new FContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_f);
						setState(781);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(785);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==Separators) {
							{
							{
							setState(782);
							match(Separators);
							}
							}
							setState(787);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(788);
						match(And);
						setState(792);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==Separators) {
							{
							{
							setState(789);
							match(Separators);
							}
							}
							setState(794);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(795);
						f(4);
						}
						break;
					case 2:
						{
						_localctx = new FContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_f);
						setState(796);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(800);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==Separators) {
							{
							{
							setState(797);
							match(Separators);
							}
							}
							setState(802);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(803);
						match(Or);
						setState(807);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==Separators) {
							{
							{
							setState(804);
							match(Separators);
							}
							}
							setState(809);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(810);
						f(3);
						}
						break;
					}
					}
				}
				setState(815);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
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
			setState(816);
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
			setState(818);
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
			setState(820);
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
			setState(822);
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
			setState(824);
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
			setState(826);
			match(OpenAngular);
			setState(827);
			match(PathTag);
			setState(828);
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
			setState(830);
			match(OpenAngularwithforwardslash);
			setState(831);
			match(PathTag);
			setState(832);
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
		"\u0004\u0001(\u0343\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"\u0013\u0001\u0013\u0004\u0013\u01d5\b\u0013\u000b\u0013\f\u0013\u01d6"+
		"\u0001\u0013\u0001\u0013\u0005\u0013\u01db\b\u0013\n\u0013\f\u0013\u01de"+
		"\t\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u01e2\b\u0013\n\u0013\f\u0013"+
		"\u01e5\t\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0005\u0014"+
		"\u01eb\b\u0014\n\u0014\f\u0014\u01ee\t\u0014\u0001\u0014\u0001\u0014\u0005"+
		"\u0014\u01f2\b\u0014\n\u0014\f\u0014\u01f5\t\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0015\u0001\u0015\u0005\u0015\u01fb\b\u0015\n\u0015\f\u0015\u01fe"+
		"\t\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0005\u0016\u0204"+
		"\b\u0016\n\u0016\f\u0016\u0207\t\u0016\u0001\u0016\u0001\u0016\u0001\u0017"+
		"\u0001\u0017\u0005\u0017\u020d\b\u0017\n\u0017\f\u0017\u0210\t\u0017\u0001"+
		"\u0017\u0001\u0017\u0005\u0017\u0214\b\u0017\n\u0017\f\u0017\u0217\t\u0017"+
		"\u0001\u0017\u0001\u0017\u0005\u0017\u021b\b\u0017\n\u0017\f\u0017\u021e"+
		"\t\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u0222\b\u0017\n\u0017\f\u0017"+
		"\u0225\t\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017"+
		"\u022b\b\u0017\n\u0017\f\u0017\u022e\t\u0017\u0001\u0017\u0001\u0017\u0005"+
		"\u0017\u0232\b\u0017\n\u0017\f\u0017\u0235\t\u0017\u0001\u0017\u0001\u0017"+
		"\u0005\u0017\u0239\b\u0017\n\u0017\f\u0017\u023c\t\u0017\u0001\u0017\u0001"+
		"\u0017\u0005\u0017\u0240\b\u0017\n\u0017\f\u0017\u0243\t\u0017\u0001\u0017"+
		"\u0001\u0017\u0003\u0017\u0247\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018"+
		"\u0251\b\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u0255\b\u0018\n\u0018"+
		"\f\u0018\u0258\t\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u025c\b\u0018"+
		"\n\u0018\f\u0018\u025f\t\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0005"+
		"\u0018\u0264\b\u0018\n\u0018\f\u0018\u0267\t\u0018\u0001\u0018\u0001\u0018"+
		"\u0005\u0018\u026b\b\u0018\n\u0018\f\u0018\u026e\t\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0005\u0018\u0273\b\u0018\n\u0018\f\u0018\u0276\t\u0018"+
		"\u0001\u0018\u0001\u0018\u0005\u0018\u027a\b\u0018\n\u0018\f\u0018\u027d"+
		"\t\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u0282\b\u0018"+
		"\n\u0018\f\u0018\u0285\t\u0018\u0001\u0018\u0005\u0018\u0288\b\u0018\n"+
		"\u0018\f\u0018\u028b\t\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001"+
		"\u001a\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0005\u001c\u0295"+
		"\b\u001c\n\u001c\f\u001c\u0298\t\u001c\u0001\u001c\u0001\u001c\u0005\u001c"+
		"\u029c\b\u001c\n\u001c\f\u001c\u029f\t\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001"+
		" \u0001 \u0005 \u02b2\b \n \f \u02b5\t \u0001 \u0001 \u0005 \u02b9\b "+
		"\n \f \u02bc\t \u0001 \u0001 \u0001 \u0001 \u0005 \u02c2\b \n \f \u02c5"+
		"\t \u0001 \u0001 \u0005 \u02c9\b \n \f \u02cc\t \u0001 \u0001 \u0001 "+
		"\u0001 \u0005 \u02d2\b \n \f \u02d5\t \u0001 \u0001 \u0005 \u02d9\b \n"+
		" \f \u02dc\t \u0001 \u0001 \u0001 \u0001 \u0005 \u02e2\b \n \f \u02e5"+
		"\t \u0001 \u0001 \u0005 \u02e9\b \n \f \u02ec\t \u0001 \u0001 \u0001 "+
		"\u0001 \u0005 \u02f2\b \n \f \u02f5\t \u0001 \u0001 \u0005 \u02f9\b \n"+
		" \f \u02fc\t \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 "+
		"\u0005 \u0306\b \n \f \u0309\t \u0001 \u0003 \u030c\b \u0001 \u0001 \u0005"+
		" \u0310\b \n \f \u0313\t \u0001 \u0001 \u0005 \u0317\b \n \f \u031a\t"+
		" \u0001 \u0001 \u0001 \u0005 \u031f\b \n \f \u0322\t \u0001 \u0001 \u0005"+
		" \u0326\b \n \f \u0329\t \u0001 \u0005 \u032c\b \n \f \u032f\t \u0001"+
		"!\u0001!\u0001\"\u0001\"\u0001#\u0001#\u0001$\u0001$\u0001%\u0001%\u0001"+
		"&\u0001&\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0000\u0004"+
		"\u0002\u001e0@(\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLN\u0000\u0000\u0396"+
		"\u0000S\u0001\u0000\u0000\u0000\u0002g\u0001\u0000\u0000\u0000\u0004\u009b"+
		"\u0001\u0000\u0000\u0000\u0006\u009d\u0001\u0000\u0000\u0000\b\u00ad\u0001"+
		"\u0000\u0000\u0000\n\u00cb\u0001\u0000\u0000\u0000\f\u00e6\u0001\u0000"+
		"\u0000\u0000\u000e\u00f9\u0001\u0000\u0000\u0000\u0010\u00fb\u0001\u0000"+
		"\u0000\u0000\u0012\u0104\u0001\u0000\u0000\u0000\u0014\u0114\u0001\u0000"+
		"\u0000\u0000\u0016\u0127\u0001\u0000\u0000\u0000\u0018\u0129\u0001\u0000"+
		"\u0000\u0000\u001a\u0132\u0001\u0000\u0000\u0000\u001c\u0142\u0001\u0000"+
		"\u0000\u0000\u001e\u0152\u0001\u0000\u0000\u0000 \u0177\u0001\u0000\u0000"+
		"\u0000\"\u01ae\u0001\u0000\u0000\u0000$\u01d0\u0001\u0000\u0000\u0000"+
		"&\u01d2\u0001\u0000\u0000\u0000(\u01e8\u0001\u0000\u0000\u0000*\u01f8"+
		"\u0001\u0000\u0000\u0000,\u0201\u0001\u0000\u0000\u0000.\u0246\u0001\u0000"+
		"\u0000\u00000\u0250\u0001\u0000\u0000\u00002\u028c\u0001\u0000\u0000\u0000"+
		"4\u028e\u0001\u0000\u0000\u00006\u0290\u0001\u0000\u0000\u00008\u0292"+
		"\u0001\u0000\u0000\u0000:\u02a2\u0001\u0000\u0000\u0000<\u02a5\u0001\u0000"+
		"\u0000\u0000>\u02a9\u0001\u0000\u0000\u0000@\u030b\u0001\u0000\u0000\u0000"+
		"B\u0330\u0001\u0000\u0000\u0000D\u0332\u0001\u0000\u0000\u0000F\u0334"+
		"\u0001\u0000\u0000\u0000H\u0336\u0001\u0000\u0000\u0000J\u0338\u0001\u0000"+
		"\u0000\u0000L\u033a\u0001\u0000\u0000\u0000N\u033e\u0001\u0000\u0000\u0000"+
		"PR\u0005(\u0000\u0000QP\u0001\u0000\u0000\u0000RU\u0001\u0000\u0000\u0000"+
		"SQ\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000TV\u0001\u0000\u0000"+
		"\u0000US\u0001\u0000\u0000\u0000VZ\u0003\u0002\u0001\u0000WY\u0005(\u0000"+
		"\u0000XW\u0001\u0000\u0000\u0000Y\\\u0001\u0000\u0000\u0000ZX\u0001\u0000"+
		"\u0000\u0000Z[\u0001\u0000\u0000\u0000[]\u0001\u0000\u0000\u0000\\Z\u0001"+
		"\u0000\u0000\u0000]^\u0005\u0000\u0000\u0001^\u0001\u0001\u0000\u0000"+
		"\u0000_`\u0006\u0001\uffff\uffff\u0000`h\u0003\u0004\u0002\u0000ah\u0003"+
		"\u0006\u0003\u0000bh\u0003\b\u0004\u0000ch\u0003\n\u0005\u0000dh\u0003"+
		"\u0014\n\u0000eh\u0003.\u0017\u0000fh\u0003J%\u0000g_\u0001\u0000\u0000"+
		"\u0000ga\u0001\u0000\u0000\u0000gb\u0001\u0000\u0000\u0000gc\u0001\u0000"+
		"\u0000\u0000gd\u0001\u0000\u0000\u0000ge\u0001\u0000\u0000\u0000gf\u0001"+
		"\u0000\u0000\u0000h\u0098\u0001\u0000\u0000\u0000im\n\u0004\u0000\u0000"+
		"jl\u0005(\u0000\u0000kj\u0001\u0000\u0000\u0000lo\u0001\u0000\u0000\u0000"+
		"mk\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000np\u0001\u0000\u0000"+
		"\u0000om\u0001\u0000\u0000\u0000pt\u0005\u000b\u0000\u0000qs\u0005(\u0000"+
		"\u0000rq\u0001\u0000\u0000\u0000sv\u0001\u0000\u0000\u0000tr\u0001\u0000"+
		"\u0000\u0000tu\u0001\u0000\u0000\u0000uw\u0001\u0000\u0000\u0000vt\u0001"+
		"\u0000\u0000\u0000w\u0097\u0003\u0002\u0001\u0005x|\n\u0003\u0000\u0000"+
		"y{\u0005(\u0000\u0000zy\u0001\u0000\u0000\u0000{~\u0001\u0000\u0000\u0000"+
		"|z\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000}\u007f\u0001\u0000"+
		"\u0000\u0000~|\u0001\u0000\u0000\u0000\u007f\u0083\u0005\u0002\u0000\u0000"+
		"\u0080\u0082\u0005(\u0000\u0000\u0081\u0080\u0001\u0000\u0000\u0000\u0082"+
		"\u0085\u0001\u0000\u0000\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0083"+
		"\u0084\u0001\u0000\u0000\u0000\u0084\u0086\u0001\u0000\u0000\u0000\u0085"+
		"\u0083\u0001\u0000\u0000\u0000\u0086\u0097\u00030\u0018\u0000\u0087\u008b"+
		"\n\u0002\u0000\u0000\u0088\u008a\u0005(\u0000\u0000\u0089\u0088\u0001"+
		"\u0000\u0000\u0000\u008a\u008d\u0001\u0000\u0000\u0000\u008b\u0089\u0001"+
		"\u0000\u0000\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c\u008e\u0001"+
		"\u0000\u0000\u0000\u008d\u008b\u0001\u0000\u0000\u0000\u008e\u0092\u0005"+
		"\u0003\u0000\u0000\u008f\u0091\u0005(\u0000\u0000\u0090\u008f\u0001\u0000"+
		"\u0000\u0000\u0091\u0094\u0001\u0000\u0000\u0000\u0092\u0090\u0001\u0000"+
		"\u0000\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u0095\u0001\u0000"+
		"\u0000\u0000\u0094\u0092\u0001\u0000\u0000\u0000\u0095\u0097\u00030\u0018"+
		"\u0000\u0096i\u0001\u0000\u0000\u0000\u0096x\u0001\u0000\u0000\u0000\u0096"+
		"\u0087\u0001\u0000\u0000\u0000\u0097\u009a\u0001\u0000\u0000\u0000\u0098"+
		"\u0096\u0001\u0000\u0000\u0000\u0098\u0099\u0001\u0000\u0000\u0000\u0099"+
		"\u0003\u0001\u0000\u0000\u0000\u009a\u0098\u0001\u0000\u0000\u0000\u009b"+
		"\u009c\u0003H$\u0000\u009c\u0005\u0001\u0000\u0000\u0000\u009d\u00a1\u0005"+
		"\u000e\u0000\u0000\u009e\u00a0\u0005(\u0000\u0000\u009f\u009e\u0001\u0000"+
		"\u0000\u0000\u00a0\u00a3\u0001\u0000\u0000\u0000\u00a1\u009f\u0001\u0000"+
		"\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2\u00a4\u0001\u0000"+
		"\u0000\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a4\u00a8\u0003\u0002"+
		"\u0001\u0000\u00a5\u00a7\u0005(\u0000\u0000\u00a6\u00a5\u0001\u0000\u0000"+
		"\u0000\u00a7\u00aa\u0001\u0000\u0000\u0000\u00a8\u00a6\u0001\u0000\u0000"+
		"\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9\u00ab\u0001\u0000\u0000"+
		"\u0000\u00aa\u00a8\u0001\u0000\u0000\u0000\u00ab\u00ac\u0005\u000f\u0000"+
		"\u0000\u00ac\u0007\u0001\u0000\u0000\u0000\u00ad\u00b1\u0003L&\u0000\u00ae"+
		"\u00b0\u0005(\u0000\u0000\u00af\u00ae\u0001\u0000\u0000\u0000\u00b0\u00b3"+
		"\u0001\u0000\u0000\u0000\u00b1\u00af\u0001\u0000\u0000\u0000\u00b1\u00b2"+
		"\u0001\u0000\u0000\u0000\u00b2\u00b4\u0001\u0000\u0000\u0000\u00b3\u00b1"+
		"\u0001\u0000\u0000\u0000\u00b4\u00b8\u0005\u001e\u0000\u0000\u00b5\u00b7"+
		"\u0005(\u0000\u0000\u00b6\u00b5\u0001\u0000\u0000\u0000\u00b7\u00ba\u0001"+
		"\u0000\u0000\u0000\u00b8\u00b6\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001"+
		"\u0000\u0000\u0000\u00b9\u00bb\u0001\u0000\u0000\u0000\u00ba\u00b8\u0001"+
		"\u0000\u0000\u0000\u00bb\u00bf\u0003\u0002\u0001\u0000\u00bc\u00be\u0005"+
		"(\u0000\u0000\u00bd\u00bc\u0001\u0000\u0000\u0000\u00be\u00c1\u0001\u0000"+
		"\u0000\u0000\u00bf\u00bd\u0001\u0000\u0000\u0000\u00bf\u00c0\u0001\u0000"+
		"\u0000\u0000\u00c0\u00c2\u0001\u0000\u0000\u0000\u00c1\u00bf\u0001\u0000"+
		"\u0000\u0000\u00c2\u00c6\u0005\u001f\u0000\u0000\u00c3\u00c5\u0005(\u0000"+
		"\u0000\u00c4\u00c3\u0001\u0000\u0000\u0000\u00c5\u00c8\u0001\u0000\u0000"+
		"\u0000\u00c6\u00c4\u0001\u0000\u0000\u0000\u00c6\u00c7\u0001\u0000\u0000"+
		"\u0000\u00c7\u00c9\u0001\u0000\u0000\u0000\u00c8\u00c6\u0001\u0000\u0000"+
		"\u0000\u00c9\u00ca\u0003N\'\u0000\u00ca\t\u0001\u0000\u0000\u0000\u00cb"+
		"\u00cf\u0003\f\u0006\u0000\u00cc\u00ce\u0005(\u0000\u0000\u00cd\u00cc"+
		"\u0001\u0000\u0000\u0000\u00ce\u00d1\u0001\u0000\u0000\u0000\u00cf\u00cd"+
		"\u0001\u0000\u0000\u0000\u00cf\u00d0\u0001\u0000\u0000\u0000\u00d0\u00d3"+
		"\u0001\u0000\u0000\u0000\u00d1\u00cf\u0001\u0000\u0000\u0000\u00d2\u00d4"+
		"\u0003\u0014\n\u0000\u00d3\u00d2\u0001\u0000\u0000\u0000\u00d3\u00d4\u0001"+
		"\u0000\u0000\u0000\u00d4\u00d8\u0001\u0000\u0000\u0000\u00d5\u00d7\u0005"+
		"(\u0000\u0000\u00d6\u00d5\u0001\u0000\u0000\u0000\u00d7\u00da\u0001\u0000"+
		"\u0000\u0000\u00d8\u00d6\u0001\u0000\u0000\u0000\u00d8\u00d9\u0001\u0000"+
		"\u0000\u0000\u00d9\u00dc\u0001\u0000\u0000\u0000\u00da\u00d8\u0001\u0000"+
		"\u0000\u0000\u00db\u00dd\u0003\u001c\u000e\u0000\u00dc\u00db\u0001\u0000"+
		"\u0000\u0000\u00dc\u00dd\u0001\u0000\u0000\u0000\u00dd\u00e1\u0001\u0000"+
		"\u0000\u0000\u00de\u00e0\u0005(\u0000\u0000\u00df\u00de\u0001\u0000\u0000"+
		"\u0000\u00e0\u00e3\u0001\u0000\u0000\u0000\u00e1\u00df\u0001\u0000\u0000"+
		"\u0000\u00e1\u00e2\u0001\u0000\u0000\u0000\u00e2\u00e4\u0001\u0000\u0000"+
		"\u0000\u00e3\u00e1\u0001\u0000\u0000\u0000\u00e4\u00e5\u0003,\u0016\u0000"+
		"\u00e5\u000b\u0001\u0000\u0000\u0000\u00e6\u00ea\u0005\u0018\u0000\u0000"+
		"\u00e7\u00e9\u0005(\u0000\u0000\u00e8\u00e7\u0001\u0000\u0000\u0000\u00e9"+
		"\u00ec\u0001\u0000\u0000\u0000\u00ea\u00e8\u0001\u0000\u0000\u0000\u00ea"+
		"\u00eb\u0001\u0000\u0000\u0000\u00eb\u00ed\u0001\u0000\u0000\u0000\u00ec"+
		"\u00ea\u0001\u0000\u0000\u0000\u00ed\u00ee\u0003\u000e\u0007\u0000\u00ee"+
		"\r\u0001\u0000\u0000\u0000\u00ef\u00f3\u0003\u0012\t\u0000\u00f0\u00f2"+
		"\u0005(\u0000\u0000\u00f1\u00f0\u0001\u0000\u0000\u0000\u00f2\u00f5\u0001"+
		"\u0000\u0000\u0000\u00f3\u00f1\u0001\u0000\u0000\u0000\u00f3\u00f4\u0001"+
		"\u0000\u0000\u0000\u00f4\u00f6\u0001\u0000\u0000\u0000\u00f5\u00f3\u0001"+
		"\u0000\u0000\u0000\u00f6\u00f7\u0003\u0010\b\u0000\u00f7\u00fa\u0001\u0000"+
		"\u0000\u0000\u00f8\u00fa\u0003\u0012\t\u0000\u00f9\u00ef\u0001\u0000\u0000"+
		"\u0000\u00f9\u00f8\u0001\u0000\u0000\u0000\u00fa\u000f\u0001\u0000\u0000"+
		"\u0000\u00fb\u00ff\u0005\u000b\u0000\u0000\u00fc\u00fe\u0005(\u0000\u0000"+
		"\u00fd\u00fc\u0001\u0000\u0000\u0000\u00fe\u0101\u0001\u0000\u0000\u0000"+
		"\u00ff\u00fd\u0001\u0000\u0000\u0000\u00ff\u0100\u0001\u0000\u0000\u0000"+
		"\u0100\u0102\u0001\u0000\u0000\u0000\u0101\u00ff\u0001\u0000\u0000\u0000"+
		"\u0102\u0103\u0003\u000e\u0007\u0000\u0103\u0011\u0001\u0000\u0000\u0000"+
		"\u0104\u0108\u0003J%\u0000\u0105\u0107\u0005(\u0000\u0000\u0106\u0105"+
		"\u0001\u0000\u0000\u0000\u0107\u010a\u0001\u0000\u0000\u0000\u0108\u0106"+
		"\u0001\u0000\u0000\u0000\u0108\u0109\u0001\u0000\u0000\u0000\u0109\u010b"+
		"\u0001\u0000\u0000\u0000\u010a\u0108\u0001\u0000\u0000\u0000\u010b\u010f"+
		"\u0005\u001c\u0000\u0000\u010c\u010e\u0005(\u0000\u0000\u010d\u010c\u0001"+
		"\u0000\u0000\u0000\u010e\u0111\u0001\u0000\u0000\u0000\u010f\u010d\u0001"+
		"\u0000\u0000\u0000\u010f\u0110\u0001\u0000\u0000\u0000\u0110\u0112\u0001"+
		"\u0000\u0000\u0000\u0111\u010f\u0001\u0000\u0000\u0000\u0112\u0113\u0003"+
		"\u0002\u0001\u0000\u0113\u0013\u0001\u0000\u0000\u0000\u0114\u0118\u0005"+
		"\u0019\u0000\u0000\u0115\u0117\u0005(\u0000\u0000\u0116\u0115\u0001\u0000"+
		"\u0000\u0000\u0117\u011a\u0001\u0000\u0000\u0000\u0118\u0116\u0001\u0000"+
		"\u0000\u0000\u0118\u0119\u0001\u0000\u0000\u0000\u0119\u011b\u0001\u0000"+
		"\u0000\u0000\u011a\u0118\u0001\u0000\u0000\u0000\u011b\u011c\u0003\u0016"+
		"\u000b\u0000\u011c\u0015\u0001\u0000\u0000\u0000\u011d\u0121\u0003\u001a"+
		"\r\u0000\u011e\u0120\u0005(\u0000\u0000\u011f\u011e\u0001\u0000\u0000"+
		"\u0000\u0120\u0123\u0001\u0000\u0000\u0000\u0121\u011f\u0001\u0000\u0000"+
		"\u0000\u0121\u0122\u0001\u0000\u0000\u0000\u0122\u0124\u0001\u0000\u0000"+
		"\u0000\u0123\u0121\u0001\u0000\u0000\u0000\u0124\u0125\u0003\u0018\f\u0000"+
		"\u0125\u0128\u0001\u0000\u0000\u0000\u0126\u0128\u0003\u001a\r\u0000\u0127"+
		"\u011d\u0001\u0000\u0000\u0000\u0127\u0126\u0001\u0000\u0000\u0000\u0128"+
		"\u0017\u0001\u0000\u0000\u0000\u0129\u012d\u0005\u000b\u0000\u0000\u012a"+
		"\u012c\u0005(\u0000\u0000\u012b\u012a\u0001\u0000\u0000\u0000\u012c\u012f"+
		"\u0001\u0000\u0000\u0000\u012d\u012b\u0001\u0000\u0000\u0000\u012d\u012e"+
		"\u0001\u0000\u0000\u0000\u012e\u0130\u0001\u0000\u0000\u0000\u012f\u012d"+
		"\u0001\u0000\u0000\u0000\u0130\u0131\u0003\u0016\u000b\u0000\u0131\u0019"+
		"\u0001\u0000\u0000\u0000\u0132\u0136\u0003J%\u0000\u0133\u0135\u0005("+
		"\u0000\u0000\u0134\u0133\u0001\u0000\u0000\u0000\u0135\u0138\u0001\u0000"+
		"\u0000\u0000\u0136\u0134\u0001\u0000\u0000\u0000\u0136\u0137\u0001\u0000"+
		"\u0000\u0000\u0137\u0139\u0001\u0000\u0000\u0000\u0138\u0136\u0001\u0000"+
		"\u0000\u0000\u0139\u013d\u0005 \u0000\u0000\u013a\u013c\u0005(\u0000\u0000"+
		"\u013b\u013a\u0001\u0000\u0000\u0000\u013c\u013f\u0001\u0000\u0000\u0000"+
		"\u013d\u013b\u0001\u0000\u0000\u0000\u013d\u013e\u0001\u0000\u0000\u0000"+
		"\u013e\u0140\u0001\u0000\u0000\u0000\u013f\u013d\u0001\u0000\u0000\u0000"+
		"\u0140\u0141\u0003\u0002\u0001\u0000\u0141\u001b\u0001\u0000\u0000\u0000"+
		"\u0142\u0146\u0005\u001d\u0000\u0000\u0143\u0145\u0005(\u0000\u0000\u0144"+
		"\u0143\u0001\u0000\u0000\u0000\u0145\u0148\u0001\u0000\u0000\u0000\u0146"+
		"\u0144\u0001\u0000\u0000\u0000\u0146\u0147\u0001\u0000\u0000\u0000\u0147"+
		"\u0149\u0001\u0000\u0000\u0000\u0148\u0146\u0001\u0000\u0000\u0000\u0149"+
		"\u014a\u0003\u001e\u000f\u0000\u014a\u001d\u0001\u0000\u0000\u0000\u014b"+
		"\u014c\u0006\u000f\uffff\uffff\u0000\u014c\u0153\u0003 \u0010\u0000\u014d"+
		"\u0153\u0003\"\u0011\u0000\u014e\u0153\u0003$\u0012\u0000\u014f\u0153"+
		"\u0003&\u0013\u0000\u0150\u0153\u0003(\u0014\u0000\u0151\u0153\u0003*"+
		"\u0015\u0000\u0152\u014b\u0001\u0000\u0000\u0000\u0152\u014d\u0001\u0000"+
		"\u0000\u0000\u0152\u014e\u0001\u0000\u0000\u0000\u0152\u014f\u0001\u0000"+
		"\u0000\u0000\u0152\u0150\u0001\u0000\u0000\u0000\u0152\u0151\u0001\u0000"+
		"\u0000\u0000\u0153\u0174\u0001\u0000\u0000\u0000\u0154\u0158\n\u0003\u0000"+
		"\u0000\u0155\u0157\u0005(\u0000\u0000\u0156\u0155\u0001\u0000\u0000\u0000"+
		"\u0157\u015a\u0001\u0000\u0000\u0000\u0158\u0156\u0001\u0000\u0000\u0000"+
		"\u0158\u0159\u0001\u0000\u0000\u0000\u0159\u015b\u0001\u0000\u0000\u0000"+
		"\u015a\u0158\u0001\u0000\u0000\u0000\u015b\u015f\u0005\b\u0000\u0000\u015c"+
		"\u015e\u0005(\u0000\u0000\u015d\u015c\u0001\u0000\u0000\u0000\u015e\u0161"+
		"\u0001\u0000\u0000\u0000\u015f\u015d\u0001\u0000\u0000\u0000\u015f\u0160"+
		"\u0001\u0000\u0000\u0000\u0160\u0162\u0001\u0000\u0000\u0000\u0161\u015f"+
		"\u0001\u0000\u0000\u0000\u0162\u0173\u0003\u001e\u000f\u0004\u0163\u0167"+
		"\n\u0002\u0000\u0000\u0164\u0166\u0005(\u0000\u0000\u0165\u0164\u0001"+
		"\u0000\u0000\u0000\u0166\u0169\u0001\u0000\u0000\u0000\u0167\u0165\u0001"+
		"\u0000\u0000\u0000\u0167\u0168\u0001\u0000\u0000\u0000\u0168\u016a\u0001"+
		"\u0000\u0000\u0000\u0169\u0167\u0001\u0000\u0000\u0000\u016a\u016e\u0005"+
		"\t\u0000\u0000\u016b\u016d\u0005(\u0000\u0000\u016c\u016b\u0001\u0000"+
		"\u0000\u0000\u016d\u0170\u0001\u0000\u0000\u0000\u016e\u016c\u0001\u0000"+
		"\u0000\u0000\u016e\u016f\u0001\u0000\u0000\u0000\u016f\u0171\u0001\u0000"+
		"\u0000\u0000\u0170\u016e\u0001\u0000\u0000\u0000\u0171\u0173\u0003\u001e"+
		"\u000f\u0003\u0172\u0154\u0001\u0000\u0000\u0000\u0172\u0163\u0001\u0000"+
		"\u0000\u0000\u0173\u0176\u0001\u0000\u0000\u0000\u0174\u0172\u0001\u0000"+
		"\u0000\u0000\u0174\u0175\u0001\u0000\u0000\u0000\u0175\u001f\u0001\u0000"+
		"\u0000\u0000\u0176\u0174\u0001\u0000\u0000\u0000\u0177\u017b\u0005\u001b"+
		"\u0000\u0000\u0178\u017a\u0005(\u0000\u0000\u0179\u0178\u0001\u0000\u0000"+
		"\u0000\u017a\u017d\u0001\u0000\u0000\u0000\u017b\u0179\u0001\u0000\u0000"+
		"\u0000\u017b\u017c\u0001\u0000\u0000\u0000\u017c\u017e\u0001\u0000\u0000"+
		"\u0000\u017d\u017b\u0001\u0000\u0000\u0000\u017e\u0182\u0005\u000e\u0000"+
		"\u0000\u017f\u0181\u0005(\u0000\u0000\u0180\u017f\u0001\u0000\u0000\u0000"+
		"\u0181\u0184\u0001\u0000\u0000\u0000\u0182\u0180\u0001\u0000\u0000\u0000"+
		"\u0182\u0183\u0001\u0000\u0000\u0000\u0183\u0185\u0001\u0000\u0000\u0000"+
		"\u0184\u0182\u0001\u0000\u0000\u0000\u0185\u0189\u0003\u0002\u0001\u0000"+
		"\u0186\u0188\u0005(\u0000\u0000\u0187\u0186\u0001\u0000\u0000\u0000\u0188"+
		"\u018b\u0001\u0000\u0000\u0000\u0189\u0187\u0001\u0000\u0000\u0000\u0189"+
		"\u018a\u0001\u0000\u0000\u0000\u018a\u018c\u0001\u0000\u0000\u0000\u018b"+
		"\u0189\u0001\u0000\u0000\u0000\u018c\u018d\u0005\u000f\u0000\u0000\u018d"+
		"!\u0001\u0000\u0000\u0000\u018e\u0192\u0003\u0002\u0001\u0000\u018f\u0191"+
		"\u0005(\u0000\u0000\u0190\u018f\u0001\u0000\u0000\u0000\u0191\u0194\u0001"+
		"\u0000\u0000\u0000\u0192\u0190\u0001\u0000\u0000\u0000\u0192\u0193\u0001"+
		"\u0000\u0000\u0000\u0193\u0195\u0001\u0000\u0000\u0000\u0194\u0192\u0001"+
		"\u0000\u0000\u0000\u0195\u0199\u0005\u0004\u0000\u0000\u0196\u0198\u0005"+
		"(\u0000\u0000\u0197\u0196\u0001\u0000\u0000\u0000\u0198\u019b\u0001\u0000"+
		"\u0000\u0000\u0199\u0197\u0001\u0000\u0000\u0000\u0199\u019a\u0001\u0000"+
		"\u0000\u0000\u019a\u019c\u0001\u0000\u0000\u0000\u019b\u0199\u0001\u0000"+
		"\u0000\u0000\u019c\u019d\u0003\u0002\u0001\u0000\u019d\u01af\u0001\u0000"+
		"\u0000\u0000\u019e\u01a2\u0003\u0002\u0001\u0000\u019f\u01a1\u0005(\u0000"+
		"\u0000\u01a0\u019f\u0001\u0000\u0000\u0000\u01a1\u01a4\u0001\u0000\u0000"+
		"\u0000\u01a2\u01a0\u0001\u0000\u0000\u0000\u01a2\u01a3\u0001\u0000\u0000"+
		"\u0000\u01a3\u01a5\u0001\u0000\u0000\u0000\u01a4\u01a2\u0001\u0000\u0000"+
		"\u0000\u01a5\u01a9\u0005\u0007\u0000\u0000\u01a6\u01a8\u0005(\u0000\u0000"+
		"\u01a7\u01a6\u0001\u0000\u0000\u0000\u01a8\u01ab\u0001\u0000\u0000\u0000"+
		"\u01a9\u01a7\u0001\u0000\u0000\u0000\u01a9\u01aa\u0001\u0000\u0000\u0000"+
		"\u01aa\u01ac\u0001\u0000\u0000\u0000\u01ab\u01a9\u0001\u0000\u0000\u0000"+
		"\u01ac\u01ad\u0003\u0002\u0001\u0000\u01ad\u01af\u0001\u0000\u0000\u0000"+
		"\u01ae\u018e\u0001\u0000\u0000\u0000\u01ae\u019e\u0001\u0000\u0000\u0000"+
		"\u01af#\u0001\u0000\u0000\u0000\u01b0\u01b4\u0003\u0002\u0001\u0000\u01b1"+
		"\u01b3\u0005(\u0000\u0000\u01b2\u01b1\u0001\u0000\u0000\u0000\u01b3\u01b6"+
		"\u0001\u0000\u0000\u0000\u01b4\u01b2\u0001\u0000\u0000\u0000\u01b4\u01b5"+
		"\u0001\u0000\u0000\u0000\u01b5\u01b7\u0001\u0000\u0000\u0000\u01b6\u01b4"+
		"\u0001\u0000\u0000\u0000\u01b7\u01bb\u0005\u0005\u0000\u0000\u01b8\u01ba"+
		"\u0005(\u0000\u0000\u01b9\u01b8\u0001\u0000\u0000\u0000\u01ba\u01bd\u0001"+
		"\u0000\u0000\u0000\u01bb\u01b9\u0001\u0000\u0000\u0000\u01bb\u01bc\u0001"+
		"\u0000\u0000\u0000\u01bc\u01be\u0001\u0000\u0000\u0000\u01bd\u01bb\u0001"+
		"\u0000\u0000\u0000\u01be\u01bf\u0003\u0002\u0001\u0000\u01bf\u01d1\u0001"+
		"\u0000\u0000\u0000\u01c0\u01c4\u0003\u0002\u0001\u0000\u01c1\u01c3\u0005"+
		"(\u0000\u0000\u01c2\u01c1\u0001\u0000\u0000\u0000\u01c3\u01c6\u0001\u0000"+
		"\u0000\u0000\u01c4\u01c2\u0001\u0000\u0000\u0000\u01c4\u01c5\u0001\u0000"+
		"\u0000\u0000\u01c5\u01c7\u0001\u0000\u0000\u0000\u01c6\u01c4\u0001\u0000"+
		"\u0000\u0000\u01c7\u01cb\u0005\u0006\u0000\u0000\u01c8\u01ca\u0005(\u0000"+
		"\u0000\u01c9\u01c8\u0001\u0000\u0000\u0000\u01ca\u01cd\u0001\u0000\u0000"+
		"\u0000\u01cb\u01c9\u0001\u0000\u0000\u0000\u01cb\u01cc\u0001\u0000\u0000"+
		"\u0000\u01cc\u01ce\u0001\u0000\u0000\u0000\u01cd\u01cb\u0001\u0000\u0000"+
		"\u0000\u01ce\u01cf\u0003\u0002\u0001\u0000\u01cf\u01d1\u0001\u0000\u0000"+
		"\u0000\u01d0\u01b0\u0001\u0000\u0000\u0000\u01d0\u01c0\u0001\u0000\u0000"+
		"\u0000\u01d1%\u0001\u0000\u0000\u0000\u01d2\u01d4\u0005\u001a\u0000\u0000"+
		"\u01d3\u01d5\u0005(\u0000\u0000\u01d4\u01d3\u0001\u0000\u0000\u0000\u01d5"+
		"\u01d6\u0001\u0000\u0000\u0000\u01d6\u01d4\u0001\u0000\u0000\u0000\u01d6"+
		"\u01d7\u0001\u0000\u0000\u0000\u01d7\u01d8\u0001\u0000\u0000\u0000\u01d8"+
		"\u01dc\u0003\u000e\u0007\u0000\u01d9\u01db\u0005(\u0000\u0000\u01da\u01d9"+
		"\u0001\u0000\u0000\u0000\u01db\u01de\u0001\u0000\u0000\u0000\u01dc\u01da"+
		"\u0001\u0000\u0000\u0000\u01dc\u01dd\u0001\u0000\u0000\u0000\u01dd\u01df"+
		"\u0001\u0000\u0000\u0000\u01de\u01dc\u0001\u0000\u0000\u0000\u01df\u01e3"+
		"\u0005\"\u0000\u0000\u01e0\u01e2\u0005(\u0000\u0000\u01e1\u01e0\u0001"+
		"\u0000\u0000\u0000\u01e2\u01e5\u0001\u0000\u0000\u0000\u01e3\u01e1\u0001"+
		"\u0000\u0000\u0000\u01e3\u01e4\u0001\u0000\u0000\u0000\u01e4\u01e6\u0001"+
		"\u0000\u0000\u0000\u01e5\u01e3\u0001\u0000\u0000\u0000\u01e6\u01e7\u0003"+
		"\u001e\u000f\u0000\u01e7\'\u0001\u0000\u0000\u0000\u01e8\u01ec\u0005\u000e"+
		"\u0000\u0000\u01e9\u01eb\u0005(\u0000\u0000\u01ea\u01e9\u0001\u0000\u0000"+
		"\u0000\u01eb\u01ee\u0001\u0000\u0000\u0000\u01ec\u01ea\u0001\u0000\u0000"+
		"\u0000\u01ec\u01ed\u0001\u0000\u0000\u0000\u01ed\u01ef\u0001\u0000\u0000"+
		"\u0000\u01ee\u01ec\u0001\u0000\u0000\u0000\u01ef\u01f3\u0003\u001e\u000f"+
		"\u0000\u01f0\u01f2\u0005(\u0000\u0000\u01f1\u01f0\u0001\u0000\u0000\u0000"+
		"\u01f2\u01f5\u0001\u0000\u0000\u0000\u01f3\u01f1\u0001\u0000\u0000\u0000"+
		"\u01f3\u01f4\u0001\u0000\u0000\u0000\u01f4\u01f6\u0001\u0000\u0000\u0000"+
		"\u01f5\u01f3\u0001\u0000\u0000\u0000\u01f6\u01f7\u0005\u000f\u0000\u0000"+
		"\u01f7)\u0001\u0000\u0000\u0000\u01f8\u01fc\u0005\n\u0000\u0000\u01f9"+
		"\u01fb\u0005(\u0000\u0000\u01fa\u01f9\u0001\u0000\u0000\u0000\u01fb\u01fe"+
		"\u0001\u0000\u0000\u0000\u01fc\u01fa\u0001\u0000\u0000\u0000\u01fc\u01fd"+
		"\u0001\u0000\u0000\u0000\u01fd\u01ff\u0001\u0000\u0000\u0000\u01fe\u01fc"+
		"\u0001\u0000\u0000\u0000\u01ff\u0200\u0003\u001e\u000f\u0000\u0200+\u0001"+
		"\u0000\u0000\u0000\u0201\u0205\u0005!\u0000\u0000\u0202\u0204\u0005(\u0000"+
		"\u0000\u0203\u0202\u0001\u0000\u0000\u0000\u0204\u0207\u0001\u0000\u0000"+
		"\u0000\u0205\u0203\u0001\u0000\u0000\u0000\u0205\u0206\u0001\u0000\u0000"+
		"\u0000\u0206\u0208\u0001\u0000\u0000\u0000\u0207\u0205\u0001\u0000\u0000"+
		"\u0000\u0208\u0209\u0003\u0002\u0001\u0000\u0209-\u0001\u0000\u0000\u0000"+
		"\u020a\u020e\u0005\u0001\u0000\u0000\u020b\u020d\u0005(\u0000\u0000\u020c"+
		"\u020b\u0001\u0000\u0000\u0000\u020d\u0210\u0001\u0000\u0000\u0000\u020e"+
		"\u020c\u0001\u0000\u0000\u0000\u020e\u020f\u0001\u0000\u0000\u0000\u020f"+
		"\u0211\u0001\u0000\u0000\u0000\u0210\u020e\u0001\u0000\u0000\u0000\u0211"+
		"\u0215\u0003F#\u0000\u0212\u0214\u0005(\u0000\u0000\u0213\u0212\u0001"+
		"\u0000\u0000\u0000\u0214\u0217\u0001\u0000\u0000\u0000\u0215\u0213\u0001"+
		"\u0000\u0000\u0000\u0215\u0216\u0001\u0000\u0000\u0000\u0216\u0218\u0001"+
		"\u0000\u0000\u0000\u0217\u0215\u0001\u0000\u0000\u0000\u0218\u021c\u0005"+
		"\u000f\u0000\u0000\u0219\u021b\u0005(\u0000\u0000\u021a\u0219\u0001\u0000"+
		"\u0000\u0000\u021b\u021e\u0001\u0000\u0000\u0000\u021c\u021a\u0001\u0000"+
		"\u0000\u0000\u021c\u021d\u0001\u0000\u0000\u0000\u021d\u021f\u0001\u0000"+
		"\u0000\u0000\u021e\u021c\u0001\u0000\u0000\u0000\u021f\u0223\u0005\u0002"+
		"\u0000\u0000\u0220\u0222\u0005(\u0000\u0000\u0221\u0220\u0001\u0000\u0000"+
		"\u0000\u0222\u0225\u0001\u0000\u0000\u0000\u0223\u0221\u0001\u0000\u0000"+
		"\u0000\u0223\u0224\u0001\u0000\u0000\u0000\u0224\u0226\u0001\u0000\u0000"+
		"\u0000\u0225\u0223\u0001\u0000\u0000\u0000\u0226\u0227\u00030\u0018\u0000"+
		"\u0227\u0247\u0001\u0000\u0000\u0000\u0228\u022c\u0005\u0001\u0000\u0000"+
		"\u0229\u022b\u0005(\u0000\u0000\u022a\u0229\u0001\u0000\u0000\u0000\u022b"+
		"\u022e\u0001\u0000\u0000\u0000\u022c\u022a\u0001\u0000\u0000\u0000\u022c"+
		"\u022d\u0001\u0000\u0000\u0000\u022d\u022f\u0001\u0000\u0000\u0000\u022e"+
		"\u022c\u0001\u0000\u0000\u0000\u022f\u0233\u0003F#\u0000\u0230\u0232\u0005"+
		"(\u0000\u0000\u0231\u0230\u0001\u0000\u0000\u0000\u0232\u0235\u0001\u0000"+
		"\u0000\u0000\u0233\u0231\u0001\u0000\u0000\u0000\u0233\u0234\u0001\u0000"+
		"\u0000\u0000\u0234\u0236\u0001\u0000\u0000\u0000\u0235\u0233\u0001\u0000"+
		"\u0000\u0000\u0236\u023a\u0005\u000f\u0000\u0000\u0237\u0239\u0005(\u0000"+
		"\u0000\u0238\u0237\u0001\u0000\u0000\u0000\u0239\u023c\u0001\u0000\u0000"+
		"\u0000\u023a\u0238\u0001\u0000\u0000\u0000\u023a\u023b\u0001\u0000\u0000"+
		"\u0000\u023b\u023d\u0001\u0000\u0000\u0000\u023c\u023a\u0001\u0000\u0000"+
		"\u0000\u023d\u0241\u0005\u0003\u0000\u0000\u023e\u0240\u0005(\u0000\u0000"+
		"\u023f\u023e\u0001\u0000\u0000\u0000\u0240\u0243\u0001\u0000\u0000\u0000"+
		"\u0241\u023f\u0001\u0000\u0000\u0000\u0241\u0242\u0001\u0000\u0000\u0000"+
		"\u0242\u0244\u0001\u0000\u0000\u0000\u0243\u0241\u0001\u0000\u0000\u0000"+
		"\u0244\u0245\u00030\u0018\u0000\u0245\u0247\u0001\u0000\u0000\u0000\u0246"+
		"\u020a\u0001\u0000\u0000\u0000\u0246\u0228\u0001\u0000\u0000\u0000\u0247"+
		"/\u0001\u0000\u0000\u0000\u0248\u0249\u0006\u0018\uffff\uffff\u0000\u0249"+
		"\u0251\u0003B!\u0000\u024a\u0251\u00032\u0019\u0000\u024b\u0251\u0003"+
		"4\u001a\u0000\u024c\u0251\u00036\u001b\u0000\u024d\u0251\u0003<\u001e"+
		"\u0000\u024e\u0251\u0003:\u001d\u0000\u024f\u0251\u0003>\u001f\u0000\u0250"+
		"\u0248\u0001\u0000\u0000\u0000\u0250\u024a\u0001\u0000\u0000\u0000\u0250"+
		"\u024b\u0001\u0000\u0000\u0000\u0250\u024c\u0001\u0000\u0000\u0000\u0250"+
		"\u024d\u0001\u0000\u0000\u0000\u0250\u024e\u0001\u0000\u0000\u0000\u0250"+
		"\u024f\u0001\u0000\u0000\u0000\u0251\u0289\u0001\u0000\u0000\u0000\u0252"+
		"\u0256\n\u0004\u0000\u0000\u0253\u0255\u0005(\u0000\u0000\u0254\u0253"+
		"\u0001\u0000\u0000\u0000\u0255\u0258\u0001\u0000\u0000\u0000\u0256\u0254"+
		"\u0001\u0000\u0000\u0000\u0256\u0257\u0001\u0000\u0000\u0000\u0257\u0259"+
		"\u0001\u0000\u0000\u0000\u0258\u0256\u0001\u0000\u0000\u0000\u0259\u025d"+
		"\u0005\u0002\u0000\u0000\u025a\u025c\u0005(\u0000\u0000\u025b\u025a\u0001"+
		"\u0000\u0000\u0000\u025c\u025f\u0001\u0000\u0000\u0000\u025d\u025b\u0001"+
		"\u0000\u0000\u0000\u025d\u025e\u0001\u0000\u0000\u0000\u025e\u0260\u0001"+
		"\u0000\u0000\u0000\u025f\u025d\u0001\u0000\u0000\u0000\u0260\u0288\u0003"+
		"0\u0018\u0005\u0261\u0265\n\u0003\u0000\u0000\u0262\u0264\u0005(\u0000"+
		"\u0000\u0263\u0262\u0001\u0000\u0000\u0000\u0264\u0267\u0001\u0000\u0000"+
		"\u0000\u0265\u0263\u0001\u0000\u0000\u0000\u0265\u0266\u0001\u0000\u0000"+
		"\u0000\u0266\u0268\u0001\u0000\u0000\u0000\u0267\u0265\u0001\u0000\u0000"+
		"\u0000\u0268\u026c\u0005\u0003\u0000\u0000\u0269\u026b\u0005(\u0000\u0000"+
		"\u026a\u0269\u0001\u0000\u0000\u0000\u026b\u026e\u0001\u0000\u0000\u0000"+
		"\u026c\u026a\u0001\u0000\u0000\u0000\u026c\u026d\u0001\u0000\u0000\u0000"+
		"\u026d\u026f\u0001\u0000\u0000\u0000\u026e\u026c\u0001\u0000\u0000\u0000"+
		"\u026f\u0288\u00030\u0018\u0004\u0270\u0274\n\u0001\u0000\u0000\u0271"+
		"\u0273\u0005(\u0000\u0000\u0272\u0271\u0001\u0000\u0000\u0000\u0273\u0276"+
		"\u0001\u0000\u0000\u0000\u0274\u0272\u0001\u0000\u0000\u0000\u0274\u0275"+
		"\u0001\u0000\u0000\u0000\u0275\u0277\u0001\u0000\u0000\u0000\u0276\u0274"+
		"\u0001\u0000\u0000\u0000\u0277\u027b\u0005\u000b\u0000\u0000\u0278\u027a"+
		"\u0005(\u0000\u0000\u0279\u0278\u0001\u0000\u0000\u0000\u027a\u027d\u0001"+
		"\u0000\u0000\u0000\u027b\u0279\u0001\u0000\u0000\u0000\u027b\u027c\u0001"+
		"\u0000\u0000\u0000\u027c\u027e\u0001\u0000\u0000\u0000\u027d\u027b\u0001"+
		"\u0000\u0000\u0000\u027e\u0288\u00030\u0018\u0002\u027f\u0283\n\u0002"+
		"\u0000\u0000\u0280\u0282\u0005(\u0000\u0000\u0281\u0280\u0001\u0000\u0000"+
		"\u0000\u0282\u0285\u0001\u0000\u0000\u0000\u0283\u0281\u0001\u0000\u0000"+
		"\u0000\u0283\u0284\u0001\u0000\u0000\u0000\u0284\u0286\u0001\u0000\u0000"+
		"\u0000\u0285\u0283\u0001\u0000\u0000\u0000\u0286\u0288\u00038\u001c\u0000"+
		"\u0287\u0252\u0001\u0000\u0000\u0000\u0287\u0261\u0001\u0000\u0000\u0000"+
		"\u0287\u0270\u0001\u0000\u0000\u0000\u0287\u027f\u0001\u0000\u0000\u0000"+
		"\u0288\u028b\u0001\u0000\u0000\u0000\u0289\u0287\u0001\u0000\u0000\u0000"+
		"\u0289\u028a\u0001\u0000\u0000\u0000\u028a1\u0001\u0000\u0000\u0000\u028b"+
		"\u0289\u0001\u0000\u0000\u0000\u028c\u028d\u0005\u0012\u0000\u0000\u028d"+
		"3\u0001\u0000\u0000\u0000\u028e\u028f\u0005\u0013\u0000\u0000\u028f5\u0001"+
		"\u0000\u0000\u0000\u0290\u0291\u0005\u0014\u0000\u0000\u02917\u0001\u0000"+
		"\u0000\u0000\u0292\u0296\u0005\f\u0000\u0000\u0293\u0295\u0005(\u0000"+
		"\u0000\u0294\u0293\u0001\u0000\u0000\u0000\u0295\u0298\u0001\u0000\u0000"+
		"\u0000\u0296\u0294\u0001\u0000\u0000\u0000\u0296\u0297\u0001\u0000\u0000"+
		"\u0000\u0297\u0299\u0001\u0000\u0000\u0000\u0298\u0296\u0001\u0000\u0000"+
		"\u0000\u0299\u029d\u0003@ \u0000\u029a\u029c\u0005(\u0000\u0000\u029b"+
		"\u029a\u0001\u0000\u0000\u0000\u029c\u029f\u0001\u0000\u0000\u0000\u029d"+
		"\u029b\u0001\u0000\u0000\u0000\u029d\u029e\u0001\u0000\u0000\u0000\u029e"+
		"\u02a0\u0001\u0000\u0000\u0000\u029f\u029d\u0001\u0000\u0000\u0000\u02a0"+
		"\u02a1\u0005\r\u0000\u0000\u02a19\u0001\u0000\u0000\u0000\u02a2\u02a3"+
		"\u0005\u0010\u0000\u0000\u02a3\u02a4\u0003D\"\u0000\u02a4;\u0001\u0000"+
		"\u0000\u0000\u02a5\u02a6\u0005\u0011\u0000\u0000\u02a6\u02a7\u0005\u000e"+
		"\u0000\u0000\u02a7\u02a8\u0005\u000f\u0000\u0000\u02a8=\u0001\u0000\u0000"+
		"\u0000\u02a9\u02aa\u0005\u000e\u0000\u0000\u02aa\u02ab\u00030\u0018\u0000"+
		"\u02ab\u02ac\u0005\u000f\u0000\u0000\u02ac?\u0001\u0000\u0000\u0000\u02ad"+
		"\u02ae\u0006 \uffff\uffff\u0000\u02ae\u030c\u00030\u0018\u0000\u02af\u02b3"+
		"\u00030\u0018\u0000\u02b0\u02b2\u0005(\u0000\u0000\u02b1\u02b0\u0001\u0000"+
		"\u0000\u0000\u02b2\u02b5\u0001\u0000\u0000\u0000\u02b3\u02b1\u0001\u0000"+
		"\u0000\u0000\u02b3\u02b4\u0001\u0000\u0000\u0000\u02b4\u02b6\u0001\u0000"+
		"\u0000\u0000\u02b5\u02b3\u0001\u0000\u0000\u0000\u02b6\u02ba\u0005\u0004"+
		"\u0000\u0000\u02b7\u02b9\u0005(\u0000\u0000\u02b8\u02b7\u0001\u0000\u0000"+
		"\u0000\u02b9\u02bc\u0001\u0000\u0000\u0000\u02ba\u02b8\u0001\u0000\u0000"+
		"\u0000\u02ba\u02bb\u0001\u0000\u0000\u0000\u02bb\u02bd\u0001\u0000\u0000"+
		"\u0000\u02bc\u02ba\u0001\u0000\u0000\u0000\u02bd\u02be\u00030\u0018\u0000"+
		"\u02be\u030c\u0001\u0000\u0000\u0000\u02bf\u02c3\u00030\u0018\u0000\u02c0"+
		"\u02c2\u0005(\u0000\u0000\u02c1\u02c0\u0001\u0000\u0000\u0000\u02c2\u02c5"+
		"\u0001\u0000\u0000\u0000\u02c3\u02c1\u0001\u0000\u0000\u0000\u02c3\u02c4"+
		"\u0001\u0000\u0000\u0000\u02c4\u02c6\u0001\u0000\u0000\u0000\u02c5\u02c3"+
		"\u0001\u0000\u0000\u0000\u02c6\u02ca\u0005\u0007\u0000\u0000\u02c7\u02c9"+
		"\u0005(\u0000\u0000\u02c8\u02c7\u0001\u0000\u0000\u0000\u02c9\u02cc\u0001"+
		"\u0000\u0000\u0000\u02ca\u02c8\u0001\u0000\u0000\u0000\u02ca\u02cb\u0001"+
		"\u0000\u0000\u0000\u02cb\u02cd\u0001\u0000\u0000\u0000\u02cc\u02ca\u0001"+
		"\u0000\u0000\u0000\u02cd\u02ce\u00030\u0018\u0000\u02ce\u030c\u0001\u0000"+
		"\u0000\u0000\u02cf\u02d3\u00030\u0018\u0000\u02d0\u02d2\u0005(\u0000\u0000"+
		"\u02d1\u02d0\u0001\u0000\u0000\u0000\u02d2\u02d5\u0001\u0000\u0000\u0000"+
		"\u02d3\u02d1\u0001\u0000\u0000\u0000\u02d3\u02d4\u0001\u0000\u0000\u0000"+
		"\u02d4\u02d6\u0001\u0000\u0000\u0000\u02d5\u02d3\u0001\u0000\u0000\u0000"+
		"\u02d6\u02da\u0005\u0005\u0000\u0000\u02d7\u02d9\u0005(\u0000\u0000\u02d8"+
		"\u02d7\u0001\u0000\u0000\u0000\u02d9\u02dc\u0001\u0000\u0000\u0000\u02da"+
		"\u02d8\u0001\u0000\u0000\u0000\u02da\u02db\u0001\u0000\u0000\u0000\u02db"+
		"\u02dd\u0001\u0000\u0000\u0000\u02dc\u02da\u0001\u0000\u0000\u0000\u02dd"+
		"\u02de\u00030\u0018\u0000\u02de\u030c\u0001\u0000\u0000\u0000\u02df\u02e3"+
		"\u00030\u0018\u0000\u02e0\u02e2\u0005(\u0000\u0000\u02e1\u02e0\u0001\u0000"+
		"\u0000\u0000\u02e2\u02e5\u0001\u0000\u0000\u0000\u02e3\u02e1\u0001\u0000"+
		"\u0000\u0000\u02e3\u02e4\u0001\u0000\u0000\u0000\u02e4\u02e6\u0001\u0000"+
		"\u0000\u0000\u02e5\u02e3\u0001\u0000\u0000\u0000\u02e6\u02ea\u0005\u0006"+
		"\u0000\u0000\u02e7\u02e9\u0005(\u0000\u0000\u02e8\u02e7\u0001\u0000\u0000"+
		"\u0000\u02e9\u02ec\u0001\u0000\u0000\u0000\u02ea\u02e8\u0001\u0000\u0000"+
		"\u0000\u02ea\u02eb\u0001\u0000\u0000\u0000\u02eb\u02ed\u0001\u0000\u0000"+
		"\u0000\u02ec\u02ea\u0001\u0000\u0000\u0000\u02ed\u02ee\u00030\u0018\u0000"+
		"\u02ee\u030c\u0001\u0000\u0000\u0000\u02ef\u02f3\u00030\u0018\u0000\u02f0"+
		"\u02f2\u0005(\u0000\u0000\u02f1\u02f0\u0001\u0000\u0000\u0000\u02f2\u02f5"+
		"\u0001\u0000\u0000\u0000\u02f3\u02f1\u0001\u0000\u0000\u0000\u02f3\u02f4"+
		"\u0001\u0000\u0000\u0000\u02f4\u02f6\u0001\u0000\u0000\u0000\u02f5\u02f3"+
		"\u0001\u0000\u0000\u0000\u02f6\u02fa\u0005\u0004\u0000\u0000\u02f7\u02f9"+
		"\u0005(\u0000\u0000\u02f8\u02f7\u0001\u0000\u0000\u0000\u02f9\u02fc\u0001"+
		"\u0000\u0000\u0000\u02fa\u02f8\u0001\u0000\u0000\u0000\u02fa\u02fb\u0001"+
		"\u0000\u0000\u0000\u02fb\u02fd\u0001\u0000\u0000\u0000\u02fc\u02fa\u0001"+
		"\u0000\u0000\u0000\u02fd\u02fe\u0003H$\u0000\u02fe\u030c\u0001\u0000\u0000"+
		"\u0000\u02ff\u0300\u0005\u000e\u0000\u0000\u0300\u0301\u0003@ \u0000\u0301"+
		"\u0302\u0005\u000f\u0000\u0000\u0302\u030c\u0001\u0000\u0000\u0000\u0303"+
		"\u0307\u0005\n\u0000\u0000\u0304\u0306\u0005(\u0000\u0000\u0305\u0304"+
		"\u0001\u0000\u0000\u0000\u0306\u0309\u0001\u0000\u0000\u0000\u0307\u0305"+
		"\u0001\u0000\u0000\u0000\u0307\u0308\u0001\u0000\u0000\u0000\u0308\u030a"+
		"\u0001\u0000\u0000\u0000\u0309\u0307\u0001\u0000\u0000\u0000\u030a\u030c"+
		"\u0003@ \u0001\u030b\u02ad\u0001\u0000\u0000\u0000\u030b\u02af\u0001\u0000"+
		"\u0000\u0000\u030b\u02bf\u0001\u0000\u0000\u0000\u030b\u02cf\u0001\u0000"+
		"\u0000\u0000\u030b\u02df\u0001\u0000\u0000\u0000\u030b\u02ef\u0001\u0000"+
		"\u0000\u0000\u030b\u02ff\u0001\u0000\u0000\u0000\u030b\u0303\u0001\u0000"+
		"\u0000\u0000\u030c\u032d\u0001\u0000\u0000\u0000\u030d\u0311\n\u0003\u0000"+
		"\u0000\u030e\u0310\u0005(\u0000\u0000\u030f\u030e\u0001\u0000\u0000\u0000"+
		"\u0310\u0313\u0001\u0000\u0000\u0000\u0311\u030f\u0001\u0000\u0000\u0000"+
		"\u0311\u0312\u0001\u0000\u0000\u0000\u0312\u0314\u0001\u0000\u0000\u0000"+
		"\u0313\u0311\u0001\u0000\u0000\u0000\u0314\u0318\u0005\b\u0000\u0000\u0315"+
		"\u0317\u0005(\u0000\u0000\u0316\u0315\u0001\u0000\u0000\u0000\u0317\u031a"+
		"\u0001\u0000\u0000\u0000\u0318\u0316\u0001\u0000\u0000\u0000\u0318\u0319"+
		"\u0001\u0000\u0000\u0000\u0319\u031b\u0001\u0000\u0000\u0000\u031a\u0318"+
		"\u0001\u0000\u0000\u0000\u031b\u032c\u0003@ \u0004\u031c\u0320\n\u0002"+
		"\u0000\u0000\u031d\u031f\u0005(\u0000\u0000\u031e\u031d\u0001\u0000\u0000"+
		"\u0000\u031f\u0322\u0001\u0000\u0000\u0000\u0320\u031e\u0001\u0000\u0000"+
		"\u0000\u0320\u0321\u0001\u0000\u0000\u0000\u0321\u0323\u0001\u0000\u0000"+
		"\u0000\u0322\u0320\u0001\u0000\u0000\u0000\u0323\u0327\u0005\t\u0000\u0000"+
		"\u0324\u0326\u0005(\u0000\u0000\u0325\u0324\u0001\u0000\u0000\u0000\u0326"+
		"\u0329\u0001\u0000\u0000\u0000\u0327\u0325\u0001\u0000\u0000\u0000\u0327"+
		"\u0328\u0001\u0000\u0000\u0000\u0328\u032a\u0001\u0000\u0000\u0000\u0329"+
		"\u0327\u0001\u0000\u0000\u0000\u032a\u032c\u0003@ \u0003\u032b\u030d\u0001"+
		"\u0000\u0000\u0000\u032b\u031c\u0001\u0000\u0000\u0000\u032c\u032f\u0001"+
		"\u0000\u0000\u0000\u032d\u032b\u0001\u0000\u0000\u0000\u032d\u032e\u0001"+
		"\u0000\u0000\u0000\u032eA\u0001\u0000\u0000\u0000\u032f\u032d\u0001\u0000"+
		"\u0000\u0000\u0330\u0331\u0005&\u0000\u0000\u0331C\u0001\u0000\u0000\u0000"+
		"\u0332\u0333\u0005\u0016\u0000\u0000\u0333E\u0001\u0000\u0000\u0000\u0334"+
		"\u0335\u0005\u0015\u0000\u0000\u0335G\u0001\u0000\u0000\u0000\u0336\u0337"+
		"\u0005\u0016\u0000\u0000\u0337I\u0001\u0000\u0000\u0000\u0338\u0339\u0005"+
		"\'\u0000\u0000\u0339K\u0001\u0000\u0000\u0000\u033a\u033b\u0005$\u0000"+
		"\u0000\u033b\u033c\u0005&\u0000\u0000\u033c\u033d\u0005#\u0000\u0000\u033d"+
		"M\u0001\u0000\u0000\u0000\u033e\u033f\u0005%\u0000\u0000\u033f\u0340\u0005"+
		"&\u0000\u0000\u0340\u0341\u0005#\u0000\u0000\u0341O\u0001\u0000\u0000"+
		"\u0000eSZgmt|\u0083\u008b\u0092\u0096\u0098\u00a1\u00a8\u00b1\u00b8\u00bf"+
		"\u00c6\u00cf\u00d3\u00d8\u00dc\u00e1\u00ea\u00f3\u00f9\u00ff\u0108\u010f"+
		"\u0118\u0121\u0127\u012d\u0136\u013d\u0146\u0152\u0158\u015f\u0167\u016e"+
		"\u0172\u0174\u017b\u0182\u0189\u0192\u0199\u01a2\u01a9\u01ae\u01b4\u01bb"+
		"\u01c4\u01cb\u01d0\u01d6\u01dc\u01e3\u01ec\u01f3\u01fc\u0205\u020e\u0215"+
		"\u021c\u0223\u022c\u0233\u023a\u0241\u0246\u0250\u0256\u025d\u0265\u026c"+
		"\u0274\u027b\u0283\u0287\u0289\u0296\u029d\u02b3\u02ba\u02c3\u02ca\u02d3"+
		"\u02da\u02e3\u02ea\u02f3\u02fa\u0307\u030b\u0311\u0318\u0320\u0327\u032b"+
		"\u032d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
