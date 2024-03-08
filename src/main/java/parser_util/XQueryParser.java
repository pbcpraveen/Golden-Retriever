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
		RULE_moreLoopVariables = 8, RULE_loopVariableAssignment = 9, RULE_letClauseAndXq = 10,
		RULE_letClause = 11, RULE_letVariables = 12, RULE_moreLetVariables = 13,
		RULE_letVariableAssignment = 14, RULE_whereClause = 15, RULE_cond = 16,
		RULE_emptyCond = 17, RULE_equalityCond = 18, RULE_identicalCond = 19,
		RULE_someVarCond = 20, RULE_parenthesisCond = 21, RULE_notCond = 22, RULE_returnClause = 23,
		RULE_absolutePath = 24, RULE_relativePath = 25, RULE_children = 26, RULE_current = 27,
		RULE_parent = 28, RULE_filter = 29, RULE_attribute = 30, RULE_textFunction = 31,
		RULE_inParenthesis = 32, RULE_f = 33, RULE_tagName = 34, RULE_attName = 35,
		RULE_fileName = 36, RULE_stringConstantText = 37, RULE_variable = 38,
		RULE_openTag = 39, RULE_closeTag = 40;
	private static String[] makeRuleNames() {
		return new String[] {
			"eval", "xq", "stringConstant", "xqInParenthesis", "newTag", "forBody",
			"forClause", "forVariables", "moreLoopVariables", "loopVariableAssignment",
			"letClauseAndXq", "letClause", "letVariables", "moreLetVariables", "letVariableAssignment",
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
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Separators) {
				{
				{
				setState(82);
				match(Separators);
				}
				}
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(88);
			xq(0);
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Separators) {
				{
				{
				setState(89);
				match(Separators);
				}
				}
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(95);
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
			setState(105);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StringConstant:
				{
				setState(98);
				stringConstant();
				}
				break;
			case OpenParen:
				{
				setState(99);
				xqInParenthesis();
				}
				break;
			case OpenAngular:
				{
				setState(100);
				newTag();
				}
				break;
			case For:
				{
				setState(101);
				forBody();
				}
				break;
			case Let:
				{
				setState(102);
				letClauseAndXq();
				}
				break;
			case DocOpen:
				{
				setState(103);
				absolutePath();
				}
				break;
			case Variable:
				{
				setState(104);
				variable();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(154);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(152);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new XqContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_xq);
						setState(107);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(111);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==Separators) {
							{
							{
							setState(108);
							match(Separators);
							}
							}
							setState(113);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(114);
						match(Comma);
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
						xq(5);
						}
						break;
					case 2:
						{
						_localctx = new XqContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_xq);
						setState(122);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(126);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==Separators) {
							{
							{
							setState(123);
							match(Separators);
							}
							}
							setState(128);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(129);
						match(ImmediateDescendent);
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
						relativePath(0);
						}
						break;
					case 3:
						{
						_localctx = new XqContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_xq);
						setState(137);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(141);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==Separators) {
							{
							{
							setState(138);
							match(Separators);
							}
							}
							setState(143);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(144);
						match(Descendent);
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
						relativePath(0);
						}
						break;
					}
					}
				}
				setState(156);
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
			setState(157);
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
			setState(159);
			match(OpenParen);
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Separators) {
				{
				{
				setState(160);
				match(Separators);
				}
				}
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(166);
			xq(0);
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
			setState(175);
			openTag();
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Separators) {
				{
				{
				setState(176);
				match(Separators);
				}
				}
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(182);
			match(OpenBrace);
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
			xq(0);
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
			match(CloseBrace);
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
			setState(205);
			forClause();
			setState(209);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(206);
					match(Separators);
					}
					}
				}
				setState(211);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Let) {
				{
				setState(212);
				letClause();
				}
			}

			setState(218);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(215);
					match(Separators);
					}
					}
				}
				setState(220);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Where) {
				{
				setState(221);
				whereClause();
				}
			}

			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Separators) {
				{
				{
				setState(224);
				match(Separators);
				}
				}
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(230);
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
			setState(232);
			match(For);
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Separators) {
				{
				{
				setState(233);
				match(Separators);
				}
				}
				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(239);
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
			setState(251);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(241);
				loopVariableAssignment();
				setState(245);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Separators) {
					{
					{
					setState(242);
					match(Separators);
					}
					}
					setState(247);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(248);
				moreLoopVariables();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(250);
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
			setState(253);
			match(Comma);
			setState(257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Separators) {
				{
				{
				setState(254);
				match(Separators);
				}
				}
				setState(259);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(260);
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
			setState(262);
			variable();
			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Separators) {
				{
				{
				setState(263);
				match(Separators);
				}
				}
				setState(268);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(269);
			match(In);
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
			setState(278);
			letClause();
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Separators) {
				{
				{
				setState(279);
				match(Separators);
				}
				}
				setState(284);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(285);
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
			setState(287);
			match(Let);
			setState(291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Separators) {
				{
				{
				setState(288);
				match(Separators);
				}
				}
				setState(293);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(294);
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
			setState(306);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(296);
				letVariableAssignment();
				setState(300);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Separators) {
					{
					{
					setState(297);
					match(Separators);
					}
					}
					setState(302);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(303);
				moreLetVariables();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(305);
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
			setState(308);
			match(Comma);
			setState(312);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Separators) {
				{
				{
				setState(309);
				match(Separators);
				}
				}
				setState(314);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(315);
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
			setState(317);
			variable();
			setState(321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Separators) {
				{
				{
				setState(318);
				match(Separators);
				}
				}
				setState(323);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(324);
			match(Assign);
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
			setState(333);
			match(Where);
			setState(337);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Separators) {
				{
				{
				setState(334);
				match(Separators);
				}
				}
				setState(339);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(340);
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
			setState(349);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(343);
				emptyCond();
				}
				break;
			case 2:
				{
				setState(344);
				equalityCond();
				}
				break;
			case 3:
				{
				setState(345);
				identicalCond();
				}
				break;
			case 4:
				{
				setState(346);
				someVarCond();
				}
				break;
			case 5:
				{
				setState(347);
				parenthesisCond();
				}
				break;
			case 6:
				{
				setState(348);
				notCond();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(383);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(381);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
					case 1:
						{
						_localctx = new CondContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_cond);
						setState(351);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(355);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==Separators) {
							{
							{
							setState(352);
							match(Separators);
							}
							}
							setState(357);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(358);
						match(And);
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
						cond(4);
						}
						break;
					case 2:
						{
						_localctx = new CondContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_cond);
						setState(366);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(370);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==Separators) {
							{
							{
							setState(367);
							match(Separators);
							}
							}
							setState(372);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(373);
						match(Or);
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
						cond(3);
						}
						break;
					}
					}
				}
				setState(385);
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
			setState(386);
			match(Empty);
			setState(390);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Separators) {
				{
				{
				setState(387);
				match(Separators);
				}
				}
				setState(392);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(393);
			match(OpenParen);
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
			xq(0);
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
			setState(441);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(409);
				xq(0);
				setState(413);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Separators) {
					{
					{
					setState(410);
					match(Separators);
					}
					}
					setState(415);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(416);
				match(Equal);
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
				xq(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(425);
				xq(0);
				setState(429);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Separators) {
					{
					{
					setState(426);
					match(Separators);
					}
					}
					setState(431);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(432);
				match(Eq);
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
			setState(475);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(443);
				xq(0);
				setState(447);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Separators) {
					{
					{
					setState(444);
					match(Separators);
					}
					}
					setState(449);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(450);
				match(Equals);
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
				xq(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(459);
				xq(0);
				setState(463);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Separators) {
					{
					{
					setState(460);
					match(Separators);
					}
					}
					setState(465);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(466);
				match(Is);
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
			setState(477);
			match(Some);
			setState(481);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Separators) {
				{
				{
				setState(478);
				match(Separators);
				}
				}
				setState(483);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(484);
			forVariables();
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
			match(Satisfies);
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
			setState(500);
			match(OpenParen);
			setState(504);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Separators) {
				{
				{
				setState(501);
				match(Separators);
				}
				}
				setState(506);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(507);
			cond(0);
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
			setState(516);
			match(Not);
			setState(520);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Separators) {
				{
				{
				setState(517);
				match(Separators);
				}
				}
				setState(522);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(523);
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
			setState(525);
			match(Return);
			setState(529);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Separators) {
				{
				{
				setState(526);
				match(Separators);
				}
				}
				setState(531);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(532);
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
		enterRule(_localctx, 48, RULE_absolutePath);
		int _la;
		try {
			setState(594);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(534);
				match(DocOpen);
				setState(538);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Separators) {
					{
					{
					setState(535);
					match(Separators);
					}
					}
					setState(540);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(541);
				fileName();
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
				match(CloseParen);
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
				match(ImmediateDescendent);
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
				relativePath(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(564);
				match(DocOpen);
				setState(568);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Separators) {
					{
					{
					setState(565);
					match(Separators);
					}
					}
					setState(570);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(571);
				fileName();
				setState(575);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Separators) {
					{
					{
					setState(572);
					match(Separators);
					}
					}
					setState(577);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(578);
				match(CloseParen);
				setState(582);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Separators) {
					{
					{
					setState(579);
					match(Separators);
					}
					}
					setState(584);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(585);
				match(Descendent);
				setState(589);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Separators) {
					{
					{
					setState(586);
					match(Separators);
					}
					}
					setState(591);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(592);
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
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_relativePath, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(604);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PathTag:
				{
				setState(597);
				tagName();
				}
				break;
			case Children:
				{
				setState(598);
				children();
				}
				break;
			case Current:
				{
				setState(599);
				current();
				}
				break;
			case Parent:
				{
				setState(600);
				parent();
				}
				break;
			case Text:
				{
				setState(601);
				textFunction();
				}
				break;
			case At:
				{
				setState(602);
				attribute();
				}
				break;
			case OpenParen:
				{
				setState(603);
				inParenthesis();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(661);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(659);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
					case 1:
						{
						_localctx = new RelativePathContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relativePath);
						setState(606);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(610);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==Separators) {
							{
							{
							setState(607);
							match(Separators);
							}
							}
							setState(612);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(613);
						match(ImmediateDescendent);
						setState(617);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==Separators) {
							{
							{
							setState(614);
							match(Separators);
							}
							}
							setState(619);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(620);
						relativePath(5);
						}
						break;
					case 2:
						{
						_localctx = new RelativePathContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relativePath);
						setState(621);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(625);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==Separators) {
							{
							{
							setState(622);
							match(Separators);
							}
							}
							setState(627);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(628);
						match(Descendent);
						setState(632);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==Separators) {
							{
							{
							setState(629);
							match(Separators);
							}
							}
							setState(634);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(635);
						relativePath(4);
						}
						break;
					case 3:
						{
						_localctx = new RelativePathContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relativePath);
						setState(636);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(640);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==Separators) {
							{
							{
							setState(637);
							match(Separators);
							}
							}
							setState(642);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(643);
						match(Comma);
						setState(647);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==Separators) {
							{
							{
							setState(644);
							match(Separators);
							}
							}
							setState(649);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(650);
						relativePath(2);
						}
						break;
					case 4:
						{
						_localctx = new RelativePathContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relativePath);
						setState(651);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(655);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==Separators) {
							{
							{
							setState(652);
							match(Separators);
							}
							}
							setState(657);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(658);
						filter();
						}
						break;
					}
					}
				}
				setState(663);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
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
		enterRule(_localctx, 52, RULE_children);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(664);
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
		enterRule(_localctx, 54, RULE_current);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(666);
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
		enterRule(_localctx, 56, RULE_parent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(668);
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
		enterRule(_localctx, 58, RULE_filter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(670);
			match(OpenBracket);
			setState(674);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Separators) {
				{
				{
				setState(671);
				match(Separators);
				}
				}
				setState(676);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(677);
			f(0);
			setState(681);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Separators) {
				{
				{
				setState(678);
				match(Separators);
				}
				}
				setState(683);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(684);
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
		enterRule(_localctx, 60, RULE_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(686);
			match(At);
			setState(687);
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
		enterRule(_localctx, 62, RULE_textFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(689);
			match(Text);
			setState(690);
			match(OpenParen);
			setState(691);
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
		enterRule(_localctx, 64, RULE_inParenthesis);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(693);
			match(OpenParen);
			setState(697);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Separators) {
				{
				{
				setState(694);
				match(Separators);
				}
				}
				setState(699);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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
		int _startState = 66;
		enterRecursionRule(_localctx, 66, RULE_f, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(803);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				{
				setState(710);
				relativePath(0);
				}
				break;
			case 2:
				{
				setState(711);
				relativePath(0);
				setState(715);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Separators) {
					{
					{
					setState(712);
					match(Separators);
					}
					}
					setState(717);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(718);
				match(Equal);
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
				relativePath(0);
				}
				break;
			case 3:
				{
				setState(727);
				relativePath(0);
				setState(731);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Separators) {
					{
					{
					setState(728);
					match(Separators);
					}
					}
					setState(733);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(734);
				match(Eq);
				setState(738);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Separators) {
					{
					{
					setState(735);
					match(Separators);
					}
					}
					setState(740);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(741);
				relativePath(0);
				}
				break;
			case 4:
				{
				setState(743);
				relativePath(0);
				setState(747);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Separators) {
					{
					{
					setState(744);
					match(Separators);
					}
					}
					setState(749);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(750);
				match(Equals);
				setState(754);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Separators) {
					{
					{
					setState(751);
					match(Separators);
					}
					}
					setState(756);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(757);
				relativePath(0);
				}
				break;
			case 5:
				{
				setState(759);
				relativePath(0);
				setState(763);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Separators) {
					{
					{
					setState(760);
					match(Separators);
					}
					}
					setState(765);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(766);
				match(Is);
				setState(770);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Separators) {
					{
					{
					setState(767);
					match(Separators);
					}
					}
					setState(772);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(773);
				relativePath(0);
				}
				break;
			case 6:
				{
				setState(775);
				relativePath(0);
				setState(779);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Separators) {
					{
					{
					setState(776);
					match(Separators);
					}
					}
					setState(781);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(782);
				match(Equal);
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
				stringConstantText();
				}
				break;
			case 7:
				{
				setState(791);
				match(OpenParen);
				setState(792);
				f(0);
				setState(793);
				match(CloseParen);
				}
				break;
			case 8:
				{
				setState(795);
				match(Not);
				setState(799);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Separators) {
					{
					{
					setState(796);
					match(Separators);
					}
					}
					setState(801);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(802);
				f(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(837);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(835);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
					case 1:
						{
						_localctx = new FContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_f);
						setState(805);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
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
						match(And);
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
						f(4);
						}
						break;
					case 2:
						{
						_localctx = new FContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_f);
						setState(820);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(824);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==Separators) {
							{
							{
							setState(821);
							match(Separators);
							}
							}
							setState(826);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(827);
						match(Or);
						setState(831);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==Separators) {
							{
							{
							setState(828);
							match(Separators);
							}
							}
							setState(833);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(834);
						f(3);
						}
						break;
					}
					}
				}
				setState(839);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
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
		enterRule(_localctx, 68, RULE_tagName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(840);
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
		enterRule(_localctx, 70, RULE_attName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(842);
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
		enterRule(_localctx, 72, RULE_fileName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(844);
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
		enterRule(_localctx, 74, RULE_stringConstantText);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(846);
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
		enterRule(_localctx, 76, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(848);
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
		enterRule(_localctx, 78, RULE_openTag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(850);
			match(OpenAngular);
			setState(851);
			match(PathTag);
			setState(852);
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
		enterRule(_localctx, 80, RULE_closeTag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(854);
			match(OpenAngularwithforwardslash);
			setState(855);
			match(PathTag);
			setState(856);
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
		case 25:
			return relativePath_sempred((RelativePathContext)_localctx, predIndex);
		case 33:
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
		"\u0004\u0001(\u035b\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"(\u0007(\u0001\u0000\u0005\u0000T\b\u0000\n\u0000\f\u0000W\t\u0000\u0001"+
		"\u0000\u0001\u0000\u0005\u0000[\b\u0000\n\u0000\f\u0000^\t\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001j\b\u0001\u0001"+
		"\u0001\u0001\u0001\u0005\u0001n\b\u0001\n\u0001\f\u0001q\t\u0001\u0001"+
		"\u0001\u0001\u0001\u0005\u0001u\b\u0001\n\u0001\f\u0001x\t\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0005\u0001}\b\u0001\n\u0001\f\u0001\u0080"+
		"\t\u0001\u0001\u0001\u0001\u0001\u0005\u0001\u0084\b\u0001\n\u0001\f\u0001"+
		"\u0087\t\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001\u008c\b"+
		"\u0001\n\u0001\f\u0001\u008f\t\u0001\u0001\u0001\u0001\u0001\u0005\u0001"+
		"\u0093\b\u0001\n\u0001\f\u0001\u0096\t\u0001\u0001\u0001\u0005\u0001\u0099"+
		"\b\u0001\n\u0001\f\u0001\u009c\t\u0001\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0005\u0003\u00a2\b\u0003\n\u0003\f\u0003\u00a5\t\u0003\u0001"+
		"\u0003\u0001\u0003\u0005\u0003\u00a9\b\u0003\n\u0003\f\u0003\u00ac\t\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0005\u0004\u00b2\b\u0004"+
		"\n\u0004\f\u0004\u00b5\t\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u00b9"+
		"\b\u0004\n\u0004\f\u0004\u00bc\t\u0004\u0001\u0004\u0001\u0004\u0005\u0004"+
		"\u00c0\b\u0004\n\u0004\f\u0004\u00c3\t\u0004\u0001\u0004\u0001\u0004\u0005"+
		"\u0004\u00c7\b\u0004\n\u0004\f\u0004\u00ca\t\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0005\u0005\u00d0\b\u0005\n\u0005\f\u0005\u00d3"+
		"\t\u0005\u0001\u0005\u0003\u0005\u00d6\b\u0005\u0001\u0005\u0005\u0005"+
		"\u00d9\b\u0005\n\u0005\f\u0005\u00dc\t\u0005\u0001\u0005\u0003\u0005\u00df"+
		"\b\u0005\u0001\u0005\u0005\u0005\u00e2\b\u0005\n\u0005\f\u0005\u00e5\t"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0005\u0006\u00eb"+
		"\b\u0006\n\u0006\f\u0006\u00ee\t\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0005\u0007\u00f4\b\u0007\n\u0007\f\u0007\u00f7\t\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00fc\b\u0007\u0001\b\u0001"+
		"\b\u0005\b\u0100\b\b\n\b\f\b\u0103\t\b\u0001\b\u0001\b\u0001\t\u0001\t"+
		"\u0005\t\u0109\b\t\n\t\f\t\u010c\t\t\u0001\t\u0001\t\u0005\t\u0110\b\t"+
		"\n\t\f\t\u0113\t\t\u0001\t\u0001\t\u0001\n\u0001\n\u0005\n\u0119\b\n\n"+
		"\n\f\n\u011c\t\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0005\u000b\u0122"+
		"\b\u000b\n\u000b\f\u000b\u0125\t\u000b\u0001\u000b\u0001\u000b\u0001\f"+
		"\u0001\f\u0005\f\u012b\b\f\n\f\f\f\u012e\t\f\u0001\f\u0001\f\u0001\f\u0003"+
		"\f\u0133\b\f\u0001\r\u0001\r\u0005\r\u0137\b\r\n\r\f\r\u013a\t\r\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0005\u000e\u0140\b\u000e\n\u000e\f"+
		"\u000e\u0143\t\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u0147\b\u000e"+
		"\n\u000e\f\u000e\u014a\t\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0005\u000f\u0150\b\u000f\n\u000f\f\u000f\u0153\t\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0003\u0010\u015e\b\u0010\u0001\u0010\u0001\u0010"+
		"\u0005\u0010\u0162\b\u0010\n\u0010\f\u0010\u0165\t\u0010\u0001\u0010\u0001"+
		"\u0010\u0005\u0010\u0169\b\u0010\n\u0010\f\u0010\u016c\t\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0005\u0010\u0171\b\u0010\n\u0010\f\u0010\u0174"+
		"\t\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u0178\b\u0010\n\u0010\f\u0010"+
		"\u017b\t\u0010\u0001\u0010\u0005\u0010\u017e\b\u0010\n\u0010\f\u0010\u0181"+
		"\t\u0010\u0001\u0011\u0001\u0011\u0005\u0011\u0185\b\u0011\n\u0011\f\u0011"+
		"\u0188\t\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u018c\b\u0011\n\u0011"+
		"\f\u0011\u018f\t\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u0193\b\u0011"+
		"\n\u0011\f\u0011\u0196\t\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001"+
		"\u0012\u0005\u0012\u019c\b\u0012\n\u0012\f\u0012\u019f\t\u0012\u0001\u0012"+
		"\u0001\u0012\u0005\u0012\u01a3\b\u0012\n\u0012\f\u0012\u01a6\t\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u01ac\b\u0012\n"+
		"\u0012\f\u0012\u01af\t\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u01b3"+
		"\b\u0012\n\u0012\f\u0012\u01b6\t\u0012\u0001\u0012\u0001\u0012\u0003\u0012"+
		"\u01ba\b\u0012\u0001\u0013\u0001\u0013\u0005\u0013\u01be\b\u0013\n\u0013"+
		"\f\u0013\u01c1\t\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u01c5\b\u0013"+
		"\n\u0013\f\u0013\u01c8\t\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0005\u0013\u01ce\b\u0013\n\u0013\f\u0013\u01d1\t\u0013\u0001\u0013"+
		"\u0001\u0013\u0005\u0013\u01d5\b\u0013\n\u0013\f\u0013\u01d8\t\u0013\u0001"+
		"\u0013\u0001\u0013\u0003\u0013\u01dc\b\u0013\u0001\u0014\u0001\u0014\u0005"+
		"\u0014\u01e0\b\u0014\n\u0014\f\u0014\u01e3\t\u0014\u0001\u0014\u0001\u0014"+
		"\u0005\u0014\u01e7\b\u0014\n\u0014\f\u0014\u01ea\t\u0014\u0001\u0014\u0001"+
		"\u0014\u0005\u0014\u01ee\b\u0014\n\u0014\f\u0014\u01f1\t\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0015\u0001\u0015\u0005\u0015\u01f7\b\u0015\n\u0015"+
		"\f\u0015\u01fa\t\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u01fe\b\u0015"+
		"\n\u0015\f\u0015\u0201\t\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001"+
		"\u0016\u0005\u0016\u0207\b\u0016\n\u0016\f\u0016\u020a\t\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0017\u0001\u0017\u0005\u0017\u0210\b\u0017\n\u0017"+
		"\f\u0017\u0213\t\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018"+
		"\u0005\u0018\u0219\b\u0018\n\u0018\f\u0018\u021c\t\u0018\u0001\u0018\u0001"+
		"\u0018\u0005\u0018\u0220\b\u0018\n\u0018\f\u0018\u0223\t\u0018\u0001\u0018"+
		"\u0001\u0018\u0005\u0018\u0227\b\u0018\n\u0018\f\u0018\u022a\t\u0018\u0001"+
		"\u0018\u0001\u0018\u0005\u0018\u022e\b\u0018\n\u0018\f\u0018\u0231\t\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u0237\b\u0018"+
		"\n\u0018\f\u0018\u023a\t\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u023e"+
		"\b\u0018\n\u0018\f\u0018\u0241\t\u0018\u0001\u0018\u0001\u0018\u0005\u0018"+
		"\u0245\b\u0018\n\u0018\f\u0018\u0248\t\u0018\u0001\u0018\u0001\u0018\u0005"+
		"\u0018\u024c\b\u0018\n\u0018\f\u0018\u024f\t\u0018\u0001\u0018\u0001\u0018"+
		"\u0003\u0018\u0253\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u025d\b\u0019"+
		"\u0001\u0019\u0001\u0019\u0005\u0019\u0261\b\u0019\n\u0019\f\u0019\u0264"+
		"\t\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u0268\b\u0019\n\u0019\f\u0019"+
		"\u026b\t\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u0270\b"+
		"\u0019\n\u0019\f\u0019\u0273\t\u0019\u0001\u0019\u0001\u0019\u0005\u0019"+
		"\u0277\b\u0019\n\u0019\f\u0019\u027a\t\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0005\u0019\u027f\b\u0019\n\u0019\f\u0019\u0282\t\u0019\u0001\u0019"+
		"\u0001\u0019\u0005\u0019\u0286\b\u0019\n\u0019\f\u0019\u0289\t\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u028e\b\u0019\n\u0019\f\u0019"+
		"\u0291\t\u0019\u0001\u0019\u0005\u0019\u0294\b\u0019\n\u0019\f\u0019\u0297"+
		"\t\u0019\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001c\u0001"+
		"\u001c\u0001\u001d\u0001\u001d\u0005\u001d\u02a1\b\u001d\n\u001d\f\u001d"+
		"\u02a4\t\u001d\u0001\u001d\u0001\u001d\u0005\u001d\u02a8\b\u001d\n\u001d"+
		"\f\u001d\u02ab\t\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001"+
		" \u0005 \u02b8\b \n \f \u02bb\t \u0001 \u0001 \u0005 \u02bf\b \n \f \u02c2"+
		"\t \u0001 \u0001 \u0001!\u0001!\u0001!\u0001!\u0005!\u02ca\b!\n!\f!\u02cd"+
		"\t!\u0001!\u0001!\u0005!\u02d1\b!\n!\f!\u02d4\t!\u0001!\u0001!\u0001!"+
		"\u0001!\u0005!\u02da\b!\n!\f!\u02dd\t!\u0001!\u0001!\u0005!\u02e1\b!\n"+
		"!\f!\u02e4\t!\u0001!\u0001!\u0001!\u0001!\u0005!\u02ea\b!\n!\f!\u02ed"+
		"\t!\u0001!\u0001!\u0005!\u02f1\b!\n!\f!\u02f4\t!\u0001!\u0001!\u0001!"+
		"\u0001!\u0005!\u02fa\b!\n!\f!\u02fd\t!\u0001!\u0001!\u0005!\u0301\b!\n"+
		"!\f!\u0304\t!\u0001!\u0001!\u0001!\u0001!\u0005!\u030a\b!\n!\f!\u030d"+
		"\t!\u0001!\u0001!\u0005!\u0311\b!\n!\f!\u0314\t!\u0001!\u0001!\u0001!"+
		"\u0001!\u0001!\u0001!\u0001!\u0001!\u0005!\u031e\b!\n!\f!\u0321\t!\u0001"+
		"!\u0003!\u0324\b!\u0001!\u0001!\u0005!\u0328\b!\n!\f!\u032b\t!\u0001!"+
		"\u0001!\u0005!\u032f\b!\n!\f!\u0332\t!\u0001!\u0001!\u0001!\u0005!\u0337"+
		"\b!\n!\f!\u033a\t!\u0001!\u0001!\u0005!\u033e\b!\n!\f!\u0341\t!\u0001"+
		"!\u0005!\u0344\b!\n!\f!\u0347\t!\u0001\"\u0001\"\u0001#\u0001#\u0001$"+
		"\u0001$\u0001%\u0001%\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0000\u0004\u0002 2B)\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"$&(*,.02468:<>@BDFHJLNP\u0000\u0000\u03b0\u0000U\u0001\u0000\u0000\u0000"+
		"\u0002i\u0001\u0000\u0000\u0000\u0004\u009d\u0001\u0000\u0000\u0000\u0006"+
		"\u009f\u0001\u0000\u0000\u0000\b\u00af\u0001\u0000\u0000\u0000\n\u00cd"+
		"\u0001\u0000\u0000\u0000\f\u00e8\u0001\u0000\u0000\u0000\u000e\u00fb\u0001"+
		"\u0000\u0000\u0000\u0010\u00fd\u0001\u0000\u0000\u0000\u0012\u0106\u0001"+
		"\u0000\u0000\u0000\u0014\u0116\u0001\u0000\u0000\u0000\u0016\u011f\u0001"+
		"\u0000\u0000\u0000\u0018\u0132\u0001\u0000\u0000\u0000\u001a\u0134\u0001"+
		"\u0000\u0000\u0000\u001c\u013d\u0001\u0000\u0000\u0000\u001e\u014d\u0001"+
		"\u0000\u0000\u0000 \u015d\u0001\u0000\u0000\u0000\"\u0182\u0001\u0000"+
		"\u0000\u0000$\u01b9\u0001\u0000\u0000\u0000&\u01db\u0001\u0000\u0000\u0000"+
		"(\u01dd\u0001\u0000\u0000\u0000*\u01f4\u0001\u0000\u0000\u0000,\u0204"+
		"\u0001\u0000\u0000\u0000.\u020d\u0001\u0000\u0000\u00000\u0252\u0001\u0000"+
		"\u0000\u00002\u025c\u0001\u0000\u0000\u00004\u0298\u0001\u0000\u0000\u0000"+
		"6\u029a\u0001\u0000\u0000\u00008\u029c\u0001\u0000\u0000\u0000:\u029e"+
		"\u0001\u0000\u0000\u0000<\u02ae\u0001\u0000\u0000\u0000>\u02b1\u0001\u0000"+
		"\u0000\u0000@\u02b5\u0001\u0000\u0000\u0000B\u0323\u0001\u0000\u0000\u0000"+
		"D\u0348\u0001\u0000\u0000\u0000F\u034a\u0001\u0000\u0000\u0000H\u034c"+
		"\u0001\u0000\u0000\u0000J\u034e\u0001\u0000\u0000\u0000L\u0350\u0001\u0000"+
		"\u0000\u0000N\u0352\u0001\u0000\u0000\u0000P\u0356\u0001\u0000\u0000\u0000"+
		"RT\u0005(\u0000\u0000SR\u0001\u0000\u0000\u0000TW\u0001\u0000\u0000\u0000"+
		"US\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000VX\u0001\u0000\u0000"+
		"\u0000WU\u0001\u0000\u0000\u0000X\\\u0003\u0002\u0001\u0000Y[\u0005(\u0000"+
		"\u0000ZY\u0001\u0000\u0000\u0000[^\u0001\u0000\u0000\u0000\\Z\u0001\u0000"+
		"\u0000\u0000\\]\u0001\u0000\u0000\u0000]_\u0001\u0000\u0000\u0000^\\\u0001"+
		"\u0000\u0000\u0000_`\u0005\u0000\u0000\u0001`\u0001\u0001\u0000\u0000"+
		"\u0000ab\u0006\u0001\uffff\uffff\u0000bj\u0003\u0004\u0002\u0000cj\u0003"+
		"\u0006\u0003\u0000dj\u0003\b\u0004\u0000ej\u0003\n\u0005\u0000fj\u0003"+
		"\u0014\n\u0000gj\u00030\u0018\u0000hj\u0003L&\u0000ia\u0001\u0000\u0000"+
		"\u0000ic\u0001\u0000\u0000\u0000id\u0001\u0000\u0000\u0000ie\u0001\u0000"+
		"\u0000\u0000if\u0001\u0000\u0000\u0000ig\u0001\u0000\u0000\u0000ih\u0001"+
		"\u0000\u0000\u0000j\u009a\u0001\u0000\u0000\u0000ko\n\u0004\u0000\u0000"+
		"ln\u0005(\u0000\u0000ml\u0001\u0000\u0000\u0000nq\u0001\u0000\u0000\u0000"+
		"om\u0001\u0000\u0000\u0000op\u0001\u0000\u0000\u0000pr\u0001\u0000\u0000"+
		"\u0000qo\u0001\u0000\u0000\u0000rv\u0005\u000b\u0000\u0000su\u0005(\u0000"+
		"\u0000ts\u0001\u0000\u0000\u0000ux\u0001\u0000\u0000\u0000vt\u0001\u0000"+
		"\u0000\u0000vw\u0001\u0000\u0000\u0000wy\u0001\u0000\u0000\u0000xv\u0001"+
		"\u0000\u0000\u0000y\u0099\u0003\u0002\u0001\u0005z~\n\u0003\u0000\u0000"+
		"{}\u0005(\u0000\u0000|{\u0001\u0000\u0000\u0000}\u0080\u0001\u0000\u0000"+
		"\u0000~|\u0001\u0000\u0000\u0000~\u007f\u0001\u0000\u0000\u0000\u007f"+
		"\u0081\u0001\u0000\u0000\u0000\u0080~\u0001\u0000\u0000\u0000\u0081\u0085"+
		"\u0005\u0002\u0000\u0000\u0082\u0084\u0005(\u0000\u0000\u0083\u0082\u0001"+
		"\u0000\u0000\u0000\u0084\u0087\u0001\u0000\u0000\u0000\u0085\u0083\u0001"+
		"\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086\u0088\u0001"+
		"\u0000\u0000\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0088\u0099\u0003"+
		"2\u0019\u0000\u0089\u008d\n\u0002\u0000\u0000\u008a\u008c\u0005(\u0000"+
		"\u0000\u008b\u008a\u0001\u0000\u0000\u0000\u008c\u008f\u0001\u0000\u0000"+
		"\u0000\u008d\u008b\u0001\u0000\u0000\u0000\u008d\u008e\u0001\u0000\u0000"+
		"\u0000\u008e\u0090\u0001\u0000\u0000\u0000\u008f\u008d\u0001\u0000\u0000"+
		"\u0000\u0090\u0094\u0005\u0003\u0000\u0000\u0091\u0093\u0005(\u0000\u0000"+
		"\u0092\u0091\u0001\u0000\u0000\u0000\u0093\u0096\u0001\u0000\u0000\u0000"+
		"\u0094\u0092\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000\u0000\u0000"+
		"\u0095\u0097\u0001\u0000\u0000\u0000\u0096\u0094\u0001\u0000\u0000\u0000"+
		"\u0097\u0099\u00032\u0019\u0000\u0098k\u0001\u0000\u0000\u0000\u0098z"+
		"\u0001\u0000\u0000\u0000\u0098\u0089\u0001\u0000\u0000\u0000\u0099\u009c"+
		"\u0001\u0000\u0000\u0000\u009a\u0098\u0001\u0000\u0000\u0000\u009a\u009b"+
		"\u0001\u0000\u0000\u0000\u009b\u0003\u0001\u0000\u0000\u0000\u009c\u009a"+
		"\u0001\u0000\u0000\u0000\u009d\u009e\u0003J%\u0000\u009e\u0005\u0001\u0000"+
		"\u0000\u0000\u009f\u00a3\u0005\u000e\u0000\u0000\u00a0\u00a2\u0005(\u0000"+
		"\u0000\u00a1\u00a0\u0001\u0000\u0000\u0000\u00a2\u00a5\u0001\u0000\u0000"+
		"\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a3\u00a4\u0001\u0000\u0000"+
		"\u0000\u00a4\u00a6\u0001\u0000\u0000\u0000\u00a5\u00a3\u0001\u0000\u0000"+
		"\u0000\u00a6\u00aa\u0003\u0002\u0001\u0000\u00a7\u00a9\u0005(\u0000\u0000"+
		"\u00a8\u00a7\u0001\u0000\u0000\u0000\u00a9\u00ac\u0001\u0000\u0000\u0000"+
		"\u00aa\u00a8\u0001\u0000\u0000\u0000\u00aa\u00ab\u0001\u0000\u0000\u0000"+
		"\u00ab\u00ad\u0001\u0000\u0000\u0000\u00ac\u00aa\u0001\u0000\u0000\u0000"+
		"\u00ad\u00ae\u0005\u000f\u0000\u0000\u00ae\u0007\u0001\u0000\u0000\u0000"+
		"\u00af\u00b3\u0003N\'\u0000\u00b0\u00b2\u0005(\u0000\u0000\u00b1\u00b0"+
		"\u0001\u0000\u0000\u0000\u00b2\u00b5\u0001\u0000\u0000\u0000\u00b3\u00b1"+
		"\u0001\u0000\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4\u00b6"+
		"\u0001\u0000\u0000\u0000\u00b5\u00b3\u0001\u0000\u0000\u0000\u00b6\u00ba"+
		"\u0005\u001e\u0000\u0000\u00b7\u00b9\u0005(\u0000\u0000\u00b8\u00b7\u0001"+
		"\u0000\u0000\u0000\u00b9\u00bc\u0001\u0000\u0000\u0000\u00ba\u00b8\u0001"+
		"\u0000\u0000\u0000\u00ba\u00bb\u0001\u0000\u0000\u0000\u00bb\u00bd\u0001"+
		"\u0000\u0000\u0000\u00bc\u00ba\u0001\u0000\u0000\u0000\u00bd\u00c1\u0003"+
		"\u0002\u0001\u0000\u00be\u00c0\u0005(\u0000\u0000\u00bf\u00be\u0001\u0000"+
		"\u0000\u0000\u00c0\u00c3\u0001\u0000\u0000\u0000\u00c1\u00bf\u0001\u0000"+
		"\u0000\u0000\u00c1\u00c2\u0001\u0000\u0000\u0000\u00c2\u00c4\u0001\u0000"+
		"\u0000\u0000\u00c3\u00c1\u0001\u0000\u0000\u0000\u00c4\u00c8\u0005\u001f"+
		"\u0000\u0000\u00c5\u00c7\u0005(\u0000\u0000\u00c6\u00c5\u0001\u0000\u0000"+
		"\u0000\u00c7\u00ca\u0001\u0000\u0000\u0000\u00c8\u00c6\u0001\u0000\u0000"+
		"\u0000\u00c8\u00c9\u0001\u0000\u0000\u0000\u00c9\u00cb\u0001\u0000\u0000"+
		"\u0000\u00ca\u00c8\u0001\u0000\u0000\u0000\u00cb\u00cc\u0003P(\u0000\u00cc"+
		"\t\u0001\u0000\u0000\u0000\u00cd\u00d1\u0003\f\u0006\u0000\u00ce\u00d0"+
		"\u0005(\u0000\u0000\u00cf\u00ce\u0001\u0000\u0000\u0000\u00d0\u00d3\u0001"+
		"\u0000\u0000\u0000\u00d1\u00cf\u0001\u0000\u0000\u0000\u00d1\u00d2\u0001"+
		"\u0000\u0000\u0000\u00d2\u00d5\u0001\u0000\u0000\u0000\u00d3\u00d1\u0001"+
		"\u0000\u0000\u0000\u00d4\u00d6\u0003\u0016\u000b\u0000\u00d5\u00d4\u0001"+
		"\u0000\u0000\u0000\u00d5\u00d6\u0001\u0000\u0000\u0000\u00d6\u00da\u0001"+
		"\u0000\u0000\u0000\u00d7\u00d9\u0005(\u0000\u0000\u00d8\u00d7\u0001\u0000"+
		"\u0000\u0000\u00d9\u00dc\u0001\u0000\u0000\u0000\u00da\u00d8\u0001\u0000"+
		"\u0000\u0000\u00da\u00db\u0001\u0000\u0000\u0000\u00db\u00de\u0001\u0000"+
		"\u0000\u0000\u00dc\u00da\u0001\u0000\u0000\u0000\u00dd\u00df\u0003\u001e"+
		"\u000f\u0000\u00de\u00dd\u0001\u0000\u0000\u0000\u00de\u00df\u0001\u0000"+
		"\u0000\u0000\u00df\u00e3\u0001\u0000\u0000\u0000\u00e0\u00e2\u0005(\u0000"+
		"\u0000\u00e1\u00e0\u0001\u0000\u0000\u0000\u00e2\u00e5\u0001\u0000\u0000"+
		"\u0000\u00e3\u00e1\u0001\u0000\u0000\u0000\u00e3\u00e4\u0001\u0000\u0000"+
		"\u0000\u00e4\u00e6\u0001\u0000\u0000\u0000\u00e5\u00e3\u0001\u0000\u0000"+
		"\u0000\u00e6\u00e7\u0003.\u0017\u0000\u00e7\u000b\u0001\u0000\u0000\u0000"+
		"\u00e8\u00ec\u0005\u0018\u0000\u0000\u00e9\u00eb\u0005(\u0000\u0000\u00ea"+
		"\u00e9\u0001\u0000\u0000\u0000\u00eb\u00ee\u0001\u0000\u0000\u0000\u00ec"+
		"\u00ea\u0001\u0000\u0000\u0000\u00ec\u00ed\u0001\u0000\u0000\u0000\u00ed"+
		"\u00ef\u0001\u0000\u0000\u0000\u00ee\u00ec\u0001\u0000\u0000\u0000\u00ef"+
		"\u00f0\u0003\u000e\u0007\u0000\u00f0\r\u0001\u0000\u0000\u0000\u00f1\u00f5"+
		"\u0003\u0012\t\u0000\u00f2\u00f4\u0005(\u0000\u0000\u00f3\u00f2\u0001"+
		"\u0000\u0000\u0000\u00f4\u00f7\u0001\u0000\u0000\u0000\u00f5\u00f3\u0001"+
		"\u0000\u0000\u0000\u00f5\u00f6\u0001\u0000\u0000\u0000\u00f6\u00f8\u0001"+
		"\u0000\u0000\u0000\u00f7\u00f5\u0001\u0000\u0000\u0000\u00f8\u00f9\u0003"+
		"\u0010\b\u0000\u00f9\u00fc\u0001\u0000\u0000\u0000\u00fa\u00fc\u0003\u0012"+
		"\t\u0000\u00fb\u00f1\u0001\u0000\u0000\u0000\u00fb\u00fa\u0001\u0000\u0000"+
		"\u0000\u00fc\u000f\u0001\u0000\u0000\u0000\u00fd\u0101\u0005\u000b\u0000"+
		"\u0000\u00fe\u0100\u0005(\u0000\u0000\u00ff\u00fe\u0001\u0000\u0000\u0000"+
		"\u0100\u0103\u0001\u0000\u0000\u0000\u0101\u00ff\u0001\u0000\u0000\u0000"+
		"\u0101\u0102\u0001\u0000\u0000\u0000\u0102\u0104\u0001\u0000\u0000\u0000"+
		"\u0103\u0101\u0001\u0000\u0000\u0000\u0104\u0105\u0003\u000e\u0007\u0000"+
		"\u0105\u0011\u0001\u0000\u0000\u0000\u0106\u010a\u0003L&\u0000\u0107\u0109"+
		"\u0005(\u0000\u0000\u0108\u0107\u0001\u0000\u0000\u0000\u0109\u010c\u0001"+
		"\u0000\u0000\u0000\u010a\u0108\u0001\u0000\u0000\u0000\u010a\u010b\u0001"+
		"\u0000\u0000\u0000\u010b\u010d\u0001\u0000\u0000\u0000\u010c\u010a\u0001"+
		"\u0000\u0000\u0000\u010d\u0111\u0005\u001c\u0000\u0000\u010e\u0110\u0005"+
		"(\u0000\u0000\u010f\u010e\u0001\u0000\u0000\u0000\u0110\u0113\u0001\u0000"+
		"\u0000\u0000\u0111\u010f\u0001\u0000\u0000\u0000\u0111\u0112\u0001\u0000"+
		"\u0000\u0000\u0112\u0114\u0001\u0000\u0000\u0000\u0113\u0111\u0001\u0000"+
		"\u0000\u0000\u0114\u0115\u0003\u0002\u0001\u0000\u0115\u0013\u0001\u0000"+
		"\u0000\u0000\u0116\u011a\u0003\u0016\u000b\u0000\u0117\u0119\u0005(\u0000"+
		"\u0000\u0118\u0117\u0001\u0000\u0000\u0000\u0119\u011c\u0001\u0000\u0000"+
		"\u0000\u011a\u0118\u0001\u0000\u0000\u0000\u011a\u011b\u0001\u0000\u0000"+
		"\u0000\u011b\u011d\u0001\u0000\u0000\u0000\u011c\u011a\u0001\u0000\u0000"+
		"\u0000\u011d\u011e\u0003\u0002\u0001\u0000\u011e\u0015\u0001\u0000\u0000"+
		"\u0000\u011f\u0123\u0005\u0019\u0000\u0000\u0120\u0122\u0005(\u0000\u0000"+
		"\u0121\u0120\u0001\u0000\u0000\u0000\u0122\u0125\u0001\u0000\u0000\u0000"+
		"\u0123\u0121\u0001\u0000\u0000\u0000\u0123\u0124\u0001\u0000\u0000\u0000"+
		"\u0124\u0126\u0001\u0000\u0000\u0000\u0125\u0123\u0001\u0000\u0000\u0000"+
		"\u0126\u0127\u0003\u0018\f\u0000\u0127\u0017\u0001\u0000\u0000\u0000\u0128"+
		"\u012c\u0003\u001c\u000e\u0000\u0129\u012b\u0005(\u0000\u0000\u012a\u0129"+
		"\u0001\u0000\u0000\u0000\u012b\u012e\u0001\u0000\u0000\u0000\u012c\u012a"+
		"\u0001\u0000\u0000\u0000\u012c\u012d\u0001\u0000\u0000\u0000\u012d\u012f"+
		"\u0001\u0000\u0000\u0000\u012e\u012c\u0001\u0000\u0000\u0000\u012f\u0130"+
		"\u0003\u001a\r\u0000\u0130\u0133\u0001\u0000\u0000\u0000\u0131\u0133\u0003"+
		"\u001c\u000e\u0000\u0132\u0128\u0001\u0000\u0000\u0000\u0132\u0131\u0001"+
		"\u0000\u0000\u0000\u0133\u0019\u0001\u0000\u0000\u0000\u0134\u0138\u0005"+
		"\u000b\u0000\u0000\u0135\u0137\u0005(\u0000\u0000\u0136\u0135\u0001\u0000"+
		"\u0000\u0000\u0137\u013a\u0001\u0000\u0000\u0000\u0138\u0136\u0001\u0000"+
		"\u0000\u0000\u0138\u0139\u0001\u0000\u0000\u0000\u0139\u013b\u0001\u0000"+
		"\u0000\u0000\u013a\u0138\u0001\u0000\u0000\u0000\u013b\u013c\u0003\u0018"+
		"\f\u0000\u013c\u001b\u0001\u0000\u0000\u0000\u013d\u0141\u0003L&\u0000"+
		"\u013e\u0140\u0005(\u0000\u0000\u013f\u013e\u0001\u0000\u0000\u0000\u0140"+
		"\u0143\u0001\u0000\u0000\u0000\u0141\u013f\u0001\u0000\u0000\u0000\u0141"+
		"\u0142\u0001\u0000\u0000\u0000\u0142\u0144\u0001\u0000\u0000\u0000\u0143"+
		"\u0141\u0001\u0000\u0000\u0000\u0144\u0148\u0005 \u0000\u0000\u0145\u0147"+
		"\u0005(\u0000\u0000\u0146\u0145\u0001\u0000\u0000\u0000\u0147\u014a\u0001"+
		"\u0000\u0000\u0000\u0148\u0146\u0001\u0000\u0000\u0000\u0148\u0149\u0001"+
		"\u0000\u0000\u0000\u0149\u014b\u0001\u0000\u0000\u0000\u014a\u0148\u0001"+
		"\u0000\u0000\u0000\u014b\u014c\u0003\u0002\u0001\u0000\u014c\u001d\u0001"+
		"\u0000\u0000\u0000\u014d\u0151\u0005\u001d\u0000\u0000\u014e\u0150\u0005"+
		"(\u0000\u0000\u014f\u014e\u0001\u0000\u0000\u0000\u0150\u0153\u0001\u0000"+
		"\u0000\u0000\u0151\u014f\u0001\u0000\u0000\u0000\u0151\u0152\u0001\u0000"+
		"\u0000\u0000\u0152\u0154\u0001\u0000\u0000\u0000\u0153\u0151\u0001\u0000"+
		"\u0000\u0000\u0154\u0155\u0003 \u0010\u0000\u0155\u001f\u0001\u0000\u0000"+
		"\u0000\u0156\u0157\u0006\u0010\uffff\uffff\u0000\u0157\u015e\u0003\"\u0011"+
		"\u0000\u0158\u015e\u0003$\u0012\u0000\u0159\u015e\u0003&\u0013\u0000\u015a"+
		"\u015e\u0003(\u0014\u0000\u015b\u015e\u0003*\u0015\u0000\u015c\u015e\u0003"+
		",\u0016\u0000\u015d\u0156\u0001\u0000\u0000\u0000\u015d\u0158\u0001\u0000"+
		"\u0000\u0000\u015d\u0159\u0001\u0000\u0000\u0000\u015d\u015a\u0001\u0000"+
		"\u0000\u0000\u015d\u015b\u0001\u0000\u0000\u0000\u015d\u015c\u0001\u0000"+
		"\u0000\u0000\u015e\u017f\u0001\u0000\u0000\u0000\u015f\u0163\n\u0003\u0000"+
		"\u0000\u0160\u0162\u0005(\u0000\u0000\u0161\u0160\u0001\u0000\u0000\u0000"+
		"\u0162\u0165\u0001\u0000\u0000\u0000\u0163\u0161\u0001\u0000\u0000\u0000"+
		"\u0163\u0164\u0001\u0000\u0000\u0000\u0164\u0166\u0001\u0000\u0000\u0000"+
		"\u0165\u0163\u0001\u0000\u0000\u0000\u0166\u016a\u0005\b\u0000\u0000\u0167"+
		"\u0169\u0005(\u0000\u0000\u0168\u0167\u0001\u0000\u0000\u0000\u0169\u016c"+
		"\u0001\u0000\u0000\u0000\u016a\u0168\u0001\u0000\u0000\u0000\u016a\u016b"+
		"\u0001\u0000\u0000\u0000\u016b\u016d\u0001\u0000\u0000\u0000\u016c\u016a"+
		"\u0001\u0000\u0000\u0000\u016d\u017e\u0003 \u0010\u0004\u016e\u0172\n"+
		"\u0002\u0000\u0000\u016f\u0171\u0005(\u0000\u0000\u0170\u016f\u0001\u0000"+
		"\u0000\u0000\u0171\u0174\u0001\u0000\u0000\u0000\u0172\u0170\u0001\u0000"+
		"\u0000\u0000\u0172\u0173\u0001\u0000\u0000\u0000\u0173\u0175\u0001\u0000"+
		"\u0000\u0000\u0174\u0172\u0001\u0000\u0000\u0000\u0175\u0179\u0005\t\u0000"+
		"\u0000\u0176\u0178\u0005(\u0000\u0000\u0177\u0176\u0001\u0000\u0000\u0000"+
		"\u0178\u017b\u0001\u0000\u0000\u0000\u0179\u0177\u0001\u0000\u0000\u0000"+
		"\u0179\u017a\u0001\u0000\u0000\u0000\u017a\u017c\u0001\u0000\u0000\u0000"+
		"\u017b\u0179\u0001\u0000\u0000\u0000\u017c\u017e\u0003 \u0010\u0003\u017d"+
		"\u015f\u0001\u0000\u0000\u0000\u017d\u016e\u0001\u0000\u0000\u0000\u017e"+
		"\u0181\u0001\u0000\u0000\u0000\u017f\u017d\u0001\u0000\u0000\u0000\u017f"+
		"\u0180\u0001\u0000\u0000\u0000\u0180!\u0001\u0000\u0000\u0000\u0181\u017f"+
		"\u0001\u0000\u0000\u0000\u0182\u0186\u0005\u001b\u0000\u0000\u0183\u0185"+
		"\u0005(\u0000\u0000\u0184\u0183\u0001\u0000\u0000\u0000\u0185\u0188\u0001"+
		"\u0000\u0000\u0000\u0186\u0184\u0001\u0000\u0000\u0000\u0186\u0187\u0001"+
		"\u0000\u0000\u0000\u0187\u0189\u0001\u0000\u0000\u0000\u0188\u0186\u0001"+
		"\u0000\u0000\u0000\u0189\u018d\u0005\u000e\u0000\u0000\u018a\u018c\u0005"+
		"(\u0000\u0000\u018b\u018a\u0001\u0000\u0000\u0000\u018c\u018f\u0001\u0000"+
		"\u0000\u0000\u018d\u018b\u0001\u0000\u0000\u0000\u018d\u018e\u0001\u0000"+
		"\u0000\u0000\u018e\u0190\u0001\u0000\u0000\u0000\u018f\u018d\u0001\u0000"+
		"\u0000\u0000\u0190\u0194\u0003\u0002\u0001\u0000\u0191\u0193\u0005(\u0000"+
		"\u0000\u0192\u0191\u0001\u0000\u0000\u0000\u0193\u0196\u0001\u0000\u0000"+
		"\u0000\u0194\u0192\u0001\u0000\u0000\u0000\u0194\u0195\u0001\u0000\u0000"+
		"\u0000\u0195\u0197\u0001\u0000\u0000\u0000\u0196\u0194\u0001\u0000\u0000"+
		"\u0000\u0197\u0198\u0005\u000f\u0000\u0000\u0198#\u0001\u0000\u0000\u0000"+
		"\u0199\u019d\u0003\u0002\u0001\u0000\u019a\u019c\u0005(\u0000\u0000\u019b"+
		"\u019a\u0001\u0000\u0000\u0000\u019c\u019f\u0001\u0000\u0000\u0000\u019d"+
		"\u019b\u0001\u0000\u0000\u0000\u019d\u019e\u0001\u0000\u0000\u0000\u019e"+
		"\u01a0\u0001\u0000\u0000\u0000\u019f\u019d\u0001\u0000\u0000\u0000\u01a0"+
		"\u01a4\u0005\u0004\u0000\u0000\u01a1\u01a3\u0005(\u0000\u0000\u01a2\u01a1"+
		"\u0001\u0000\u0000\u0000\u01a3\u01a6\u0001\u0000\u0000\u0000\u01a4\u01a2"+
		"\u0001\u0000\u0000\u0000\u01a4\u01a5\u0001\u0000\u0000\u0000\u01a5\u01a7"+
		"\u0001\u0000\u0000\u0000\u01a6\u01a4\u0001\u0000\u0000\u0000\u01a7\u01a8"+
		"\u0003\u0002\u0001\u0000\u01a8\u01ba\u0001\u0000\u0000\u0000\u01a9\u01ad"+
		"\u0003\u0002\u0001\u0000\u01aa\u01ac\u0005(\u0000\u0000\u01ab\u01aa\u0001"+
		"\u0000\u0000\u0000\u01ac\u01af\u0001\u0000\u0000\u0000\u01ad\u01ab\u0001"+
		"\u0000\u0000\u0000\u01ad\u01ae\u0001\u0000\u0000\u0000\u01ae\u01b0\u0001"+
		"\u0000\u0000\u0000\u01af\u01ad\u0001\u0000\u0000\u0000\u01b0\u01b4\u0005"+
		"\u0007\u0000\u0000\u01b1\u01b3\u0005(\u0000\u0000\u01b2\u01b1\u0001\u0000"+
		"\u0000\u0000\u01b3\u01b6\u0001\u0000\u0000\u0000\u01b4\u01b2\u0001\u0000"+
		"\u0000\u0000\u01b4\u01b5\u0001\u0000\u0000\u0000\u01b5\u01b7\u0001\u0000"+
		"\u0000\u0000\u01b6\u01b4\u0001\u0000\u0000\u0000\u01b7\u01b8\u0003\u0002"+
		"\u0001\u0000\u01b8\u01ba\u0001\u0000\u0000\u0000\u01b9\u0199\u0001\u0000"+
		"\u0000\u0000\u01b9\u01a9\u0001\u0000\u0000\u0000\u01ba%\u0001\u0000\u0000"+
		"\u0000\u01bb\u01bf\u0003\u0002\u0001\u0000\u01bc\u01be\u0005(\u0000\u0000"+
		"\u01bd\u01bc\u0001\u0000\u0000\u0000\u01be\u01c1\u0001\u0000\u0000\u0000"+
		"\u01bf\u01bd\u0001\u0000\u0000\u0000\u01bf\u01c0\u0001\u0000\u0000\u0000"+
		"\u01c0\u01c2\u0001\u0000\u0000\u0000\u01c1\u01bf\u0001\u0000\u0000\u0000"+
		"\u01c2\u01c6\u0005\u0005\u0000\u0000\u01c3\u01c5\u0005(\u0000\u0000\u01c4"+
		"\u01c3\u0001\u0000\u0000\u0000\u01c5\u01c8\u0001\u0000\u0000\u0000\u01c6"+
		"\u01c4\u0001\u0000\u0000\u0000\u01c6\u01c7\u0001\u0000\u0000\u0000\u01c7"+
		"\u01c9\u0001\u0000\u0000\u0000\u01c8\u01c6\u0001\u0000\u0000\u0000\u01c9"+
		"\u01ca\u0003\u0002\u0001\u0000\u01ca\u01dc\u0001\u0000\u0000\u0000\u01cb"+
		"\u01cf\u0003\u0002\u0001\u0000\u01cc\u01ce\u0005(\u0000\u0000\u01cd\u01cc"+
		"\u0001\u0000\u0000\u0000\u01ce\u01d1\u0001\u0000\u0000\u0000\u01cf\u01cd"+
		"\u0001\u0000\u0000\u0000\u01cf\u01d0\u0001\u0000\u0000\u0000\u01d0\u01d2"+
		"\u0001\u0000\u0000\u0000\u01d1\u01cf\u0001\u0000\u0000\u0000\u01d2\u01d6"+
		"\u0005\u0006\u0000\u0000\u01d3\u01d5\u0005(\u0000\u0000\u01d4\u01d3\u0001"+
		"\u0000\u0000\u0000\u01d5\u01d8\u0001\u0000\u0000\u0000\u01d6\u01d4\u0001"+
		"\u0000\u0000\u0000\u01d6\u01d7\u0001\u0000\u0000\u0000\u01d7\u01d9\u0001"+
		"\u0000\u0000\u0000\u01d8\u01d6\u0001\u0000\u0000\u0000\u01d9\u01da\u0003"+
		"\u0002\u0001\u0000\u01da\u01dc\u0001\u0000\u0000\u0000\u01db\u01bb\u0001"+
		"\u0000\u0000\u0000\u01db\u01cb\u0001\u0000\u0000\u0000\u01dc\'\u0001\u0000"+
		"\u0000\u0000\u01dd\u01e1\u0005\u001a\u0000\u0000\u01de\u01e0\u0005(\u0000"+
		"\u0000\u01df\u01de\u0001\u0000\u0000\u0000\u01e0\u01e3\u0001\u0000\u0000"+
		"\u0000\u01e1\u01df\u0001\u0000\u0000\u0000\u01e1\u01e2\u0001\u0000\u0000"+
		"\u0000\u01e2\u01e4\u0001\u0000\u0000\u0000\u01e3\u01e1\u0001\u0000\u0000"+
		"\u0000\u01e4\u01e8\u0003\u000e\u0007\u0000\u01e5\u01e7\u0005(\u0000\u0000"+
		"\u01e6\u01e5\u0001\u0000\u0000\u0000\u01e7\u01ea\u0001\u0000\u0000\u0000"+
		"\u01e8\u01e6\u0001\u0000\u0000\u0000\u01e8\u01e9\u0001\u0000\u0000\u0000"+
		"\u01e9\u01eb\u0001\u0000\u0000\u0000\u01ea\u01e8\u0001\u0000\u0000\u0000"+
		"\u01eb\u01ef\u0005\"\u0000\u0000\u01ec\u01ee\u0005(\u0000\u0000\u01ed"+
		"\u01ec\u0001\u0000\u0000\u0000\u01ee\u01f1\u0001\u0000\u0000\u0000\u01ef"+
		"\u01ed\u0001\u0000\u0000\u0000\u01ef\u01f0\u0001\u0000\u0000\u0000\u01f0"+
		"\u01f2\u0001\u0000\u0000\u0000\u01f1\u01ef\u0001\u0000\u0000\u0000\u01f2"+
		"\u01f3\u0003 \u0010\u0000\u01f3)\u0001\u0000\u0000\u0000\u01f4\u01f8\u0005"+
		"\u000e\u0000\u0000\u01f5\u01f7\u0005(\u0000\u0000\u01f6\u01f5\u0001\u0000"+
		"\u0000\u0000\u01f7\u01fa\u0001\u0000\u0000\u0000\u01f8\u01f6\u0001\u0000"+
		"\u0000\u0000\u01f8\u01f9\u0001\u0000\u0000\u0000\u01f9\u01fb\u0001\u0000"+
		"\u0000\u0000\u01fa\u01f8\u0001\u0000\u0000\u0000\u01fb\u01ff\u0003 \u0010"+
		"\u0000\u01fc\u01fe\u0005(\u0000\u0000\u01fd\u01fc\u0001\u0000\u0000\u0000"+
		"\u01fe\u0201\u0001\u0000\u0000\u0000\u01ff\u01fd\u0001\u0000\u0000\u0000"+
		"\u01ff\u0200\u0001\u0000\u0000\u0000\u0200\u0202\u0001\u0000\u0000\u0000"+
		"\u0201\u01ff\u0001\u0000\u0000\u0000\u0202\u0203\u0005\u000f\u0000\u0000"+
		"\u0203+\u0001\u0000\u0000\u0000\u0204\u0208\u0005\n\u0000\u0000\u0205"+
		"\u0207\u0005(\u0000\u0000\u0206\u0205\u0001\u0000\u0000\u0000\u0207\u020a"+
		"\u0001\u0000\u0000\u0000\u0208\u0206\u0001\u0000\u0000\u0000\u0208\u0209"+
		"\u0001\u0000\u0000\u0000\u0209\u020b\u0001\u0000\u0000\u0000\u020a\u0208"+
		"\u0001\u0000\u0000\u0000\u020b\u020c\u0003 \u0010\u0000\u020c-\u0001\u0000"+
		"\u0000\u0000\u020d\u0211\u0005!\u0000\u0000\u020e\u0210\u0005(\u0000\u0000"+
		"\u020f\u020e\u0001\u0000\u0000\u0000\u0210\u0213\u0001\u0000\u0000\u0000"+
		"\u0211\u020f\u0001\u0000\u0000\u0000\u0211\u0212\u0001\u0000\u0000\u0000"+
		"\u0212\u0214\u0001\u0000\u0000\u0000\u0213\u0211\u0001\u0000\u0000\u0000"+
		"\u0214\u0215\u0003\u0002\u0001\u0000\u0215/\u0001\u0000\u0000\u0000\u0216"+
		"\u021a\u0005\u0001\u0000\u0000\u0217\u0219\u0005(\u0000\u0000\u0218\u0217"+
		"\u0001\u0000\u0000\u0000\u0219\u021c\u0001\u0000\u0000\u0000\u021a\u0218"+
		"\u0001\u0000\u0000\u0000\u021a\u021b\u0001\u0000\u0000\u0000\u021b\u021d"+
		"\u0001\u0000\u0000\u0000\u021c\u021a\u0001\u0000\u0000\u0000\u021d\u0221"+
		"\u0003H$\u0000\u021e\u0220\u0005(\u0000\u0000\u021f\u021e\u0001\u0000"+
		"\u0000\u0000\u0220\u0223\u0001\u0000\u0000\u0000\u0221\u021f\u0001\u0000"+
		"\u0000\u0000\u0221\u0222\u0001\u0000\u0000\u0000\u0222\u0224\u0001\u0000"+
		"\u0000\u0000\u0223\u0221\u0001\u0000\u0000\u0000\u0224\u0228\u0005\u000f"+
		"\u0000\u0000\u0225\u0227\u0005(\u0000\u0000\u0226\u0225\u0001\u0000\u0000"+
		"\u0000\u0227\u022a\u0001\u0000\u0000\u0000\u0228\u0226\u0001\u0000\u0000"+
		"\u0000\u0228\u0229\u0001\u0000\u0000\u0000\u0229\u022b\u0001\u0000\u0000"+
		"\u0000\u022a\u0228\u0001\u0000\u0000\u0000\u022b\u022f\u0005\u0002\u0000"+
		"\u0000\u022c\u022e\u0005(\u0000\u0000\u022d\u022c\u0001\u0000\u0000\u0000"+
		"\u022e\u0231\u0001\u0000\u0000\u0000\u022f\u022d\u0001\u0000\u0000\u0000"+
		"\u022f\u0230\u0001\u0000\u0000\u0000\u0230\u0232\u0001\u0000\u0000\u0000"+
		"\u0231\u022f\u0001\u0000\u0000\u0000\u0232\u0233\u00032\u0019\u0000\u0233"+
		"\u0253\u0001\u0000\u0000\u0000\u0234\u0238\u0005\u0001\u0000\u0000\u0235"+
		"\u0237\u0005(\u0000\u0000\u0236\u0235\u0001\u0000\u0000\u0000\u0237\u023a"+
		"\u0001\u0000\u0000\u0000\u0238\u0236\u0001\u0000\u0000\u0000\u0238\u0239"+
		"\u0001\u0000\u0000\u0000\u0239\u023b\u0001\u0000\u0000\u0000\u023a\u0238"+
		"\u0001\u0000\u0000\u0000\u023b\u023f\u0003H$\u0000\u023c\u023e\u0005("+
		"\u0000\u0000\u023d\u023c\u0001\u0000\u0000\u0000\u023e\u0241\u0001\u0000"+
		"\u0000\u0000\u023f\u023d\u0001\u0000\u0000\u0000\u023f\u0240\u0001\u0000"+
		"\u0000\u0000\u0240\u0242\u0001\u0000\u0000\u0000\u0241\u023f\u0001\u0000"+
		"\u0000\u0000\u0242\u0246\u0005\u000f\u0000\u0000\u0243\u0245\u0005(\u0000"+
		"\u0000\u0244\u0243\u0001\u0000\u0000\u0000\u0245\u0248\u0001\u0000\u0000"+
		"\u0000\u0246\u0244\u0001\u0000\u0000\u0000\u0246\u0247\u0001\u0000\u0000"+
		"\u0000\u0247\u0249\u0001\u0000\u0000\u0000\u0248\u0246\u0001\u0000\u0000"+
		"\u0000\u0249\u024d\u0005\u0003\u0000\u0000\u024a\u024c\u0005(\u0000\u0000"+
		"\u024b\u024a\u0001\u0000\u0000\u0000\u024c\u024f\u0001\u0000\u0000\u0000"+
		"\u024d\u024b\u0001\u0000\u0000\u0000\u024d\u024e\u0001\u0000\u0000\u0000"+
		"\u024e\u0250\u0001\u0000\u0000\u0000\u024f\u024d\u0001\u0000\u0000\u0000"+
		"\u0250\u0251\u00032\u0019\u0000\u0251\u0253\u0001\u0000\u0000\u0000\u0252"+
		"\u0216\u0001\u0000\u0000\u0000\u0252\u0234\u0001\u0000\u0000\u0000\u0253"+
		"1\u0001\u0000\u0000\u0000\u0254\u0255\u0006\u0019\uffff\uffff\u0000\u0255"+
		"\u025d\u0003D\"\u0000\u0256\u025d\u00034\u001a\u0000\u0257\u025d\u0003"+
		"6\u001b\u0000\u0258\u025d\u00038\u001c\u0000\u0259\u025d\u0003>\u001f"+
		"\u0000\u025a\u025d\u0003<\u001e\u0000\u025b\u025d\u0003@ \u0000\u025c"+
		"\u0254\u0001\u0000\u0000\u0000\u025c\u0256\u0001\u0000\u0000\u0000\u025c"+
		"\u0257\u0001\u0000\u0000\u0000\u025c\u0258\u0001\u0000\u0000\u0000\u025c"+
		"\u0259\u0001\u0000\u0000\u0000\u025c\u025a\u0001\u0000\u0000\u0000\u025c"+
		"\u025b\u0001\u0000\u0000\u0000\u025d\u0295\u0001\u0000\u0000\u0000\u025e"+
		"\u0262\n\u0004\u0000\u0000\u025f\u0261\u0005(\u0000\u0000\u0260\u025f"+
		"\u0001\u0000\u0000\u0000\u0261\u0264\u0001\u0000\u0000\u0000\u0262\u0260"+
		"\u0001\u0000\u0000\u0000\u0262\u0263\u0001\u0000\u0000\u0000\u0263\u0265"+
		"\u0001\u0000\u0000\u0000\u0264\u0262\u0001\u0000\u0000\u0000\u0265\u0269"+
		"\u0005\u0002\u0000\u0000\u0266\u0268\u0005(\u0000\u0000\u0267\u0266\u0001"+
		"\u0000\u0000\u0000\u0268\u026b\u0001\u0000\u0000\u0000\u0269\u0267\u0001"+
		"\u0000\u0000\u0000\u0269\u026a\u0001\u0000\u0000\u0000\u026a\u026c\u0001"+
		"\u0000\u0000\u0000\u026b\u0269\u0001\u0000\u0000\u0000\u026c\u0294\u0003"+
		"2\u0019\u0005\u026d\u0271\n\u0003\u0000\u0000\u026e\u0270\u0005(\u0000"+
		"\u0000\u026f\u026e\u0001\u0000\u0000\u0000\u0270\u0273\u0001\u0000\u0000"+
		"\u0000\u0271\u026f\u0001\u0000\u0000\u0000\u0271\u0272\u0001\u0000\u0000"+
		"\u0000\u0272\u0274\u0001\u0000\u0000\u0000\u0273\u0271\u0001\u0000\u0000"+
		"\u0000\u0274\u0278\u0005\u0003\u0000\u0000\u0275\u0277\u0005(\u0000\u0000"+
		"\u0276\u0275\u0001\u0000\u0000\u0000\u0277\u027a\u0001\u0000\u0000\u0000"+
		"\u0278\u0276\u0001\u0000\u0000\u0000\u0278\u0279\u0001\u0000\u0000\u0000"+
		"\u0279\u027b\u0001\u0000\u0000\u0000\u027a\u0278\u0001\u0000\u0000\u0000"+
		"\u027b\u0294\u00032\u0019\u0004\u027c\u0280\n\u0001\u0000\u0000\u027d"+
		"\u027f\u0005(\u0000\u0000\u027e\u027d\u0001\u0000\u0000\u0000\u027f\u0282"+
		"\u0001\u0000\u0000\u0000\u0280\u027e\u0001\u0000\u0000\u0000\u0280\u0281"+
		"\u0001\u0000\u0000\u0000\u0281\u0283\u0001\u0000\u0000\u0000\u0282\u0280"+
		"\u0001\u0000\u0000\u0000\u0283\u0287\u0005\u000b\u0000\u0000\u0284\u0286"+
		"\u0005(\u0000\u0000\u0285\u0284\u0001\u0000\u0000\u0000\u0286\u0289\u0001"+
		"\u0000\u0000\u0000\u0287\u0285\u0001\u0000\u0000\u0000\u0287\u0288\u0001"+
		"\u0000\u0000\u0000\u0288\u028a\u0001\u0000\u0000\u0000\u0289\u0287\u0001"+
		"\u0000\u0000\u0000\u028a\u0294\u00032\u0019\u0002\u028b\u028f\n\u0002"+
		"\u0000\u0000\u028c\u028e\u0005(\u0000\u0000\u028d\u028c\u0001\u0000\u0000"+
		"\u0000\u028e\u0291\u0001\u0000\u0000\u0000\u028f\u028d\u0001\u0000\u0000"+
		"\u0000\u028f\u0290\u0001\u0000\u0000\u0000\u0290\u0292\u0001\u0000\u0000"+
		"\u0000\u0291\u028f\u0001\u0000\u0000\u0000\u0292\u0294\u0003:\u001d\u0000"+
		"\u0293\u025e\u0001\u0000\u0000\u0000\u0293\u026d\u0001\u0000\u0000\u0000"+
		"\u0293\u027c\u0001\u0000\u0000\u0000\u0293\u028b\u0001\u0000\u0000\u0000"+
		"\u0294\u0297\u0001\u0000\u0000\u0000\u0295\u0293\u0001\u0000\u0000\u0000"+
		"\u0295\u0296\u0001\u0000\u0000\u0000\u02963\u0001\u0000\u0000\u0000\u0297"+
		"\u0295\u0001\u0000\u0000\u0000\u0298\u0299\u0005\u0012\u0000\u0000\u0299"+
		"5\u0001\u0000\u0000\u0000\u029a\u029b\u0005\u0013\u0000\u0000\u029b7\u0001"+
		"\u0000\u0000\u0000\u029c\u029d\u0005\u0014\u0000\u0000\u029d9\u0001\u0000"+
		"\u0000\u0000\u029e\u02a2\u0005\f\u0000\u0000\u029f\u02a1\u0005(\u0000"+
		"\u0000\u02a0\u029f\u0001\u0000\u0000\u0000\u02a1\u02a4\u0001\u0000\u0000"+
		"\u0000\u02a2\u02a0\u0001\u0000\u0000\u0000\u02a2\u02a3\u0001\u0000\u0000"+
		"\u0000\u02a3\u02a5\u0001\u0000\u0000\u0000\u02a4\u02a2\u0001\u0000\u0000"+
		"\u0000\u02a5\u02a9\u0003B!\u0000\u02a6\u02a8\u0005(\u0000\u0000\u02a7"+
		"\u02a6\u0001\u0000\u0000\u0000\u02a8\u02ab\u0001\u0000\u0000\u0000\u02a9"+
		"\u02a7\u0001\u0000\u0000\u0000\u02a9\u02aa\u0001\u0000\u0000\u0000\u02aa"+
		"\u02ac\u0001\u0000\u0000\u0000\u02ab\u02a9\u0001\u0000\u0000\u0000\u02ac"+
		"\u02ad\u0005\r\u0000\u0000\u02ad;\u0001\u0000\u0000\u0000\u02ae\u02af"+
		"\u0005\u0010\u0000\u0000\u02af\u02b0\u0003F#\u0000\u02b0=\u0001\u0000"+
		"\u0000\u0000\u02b1\u02b2\u0005\u0011\u0000\u0000\u02b2\u02b3\u0005\u000e"+
		"\u0000\u0000\u02b3\u02b4\u0005\u000f\u0000\u0000\u02b4?\u0001\u0000\u0000"+
		"\u0000\u02b5\u02b9\u0005\u000e\u0000\u0000\u02b6\u02b8\u0005(\u0000\u0000"+
		"\u02b7\u02b6\u0001\u0000\u0000\u0000\u02b8\u02bb\u0001\u0000\u0000\u0000"+
		"\u02b9\u02b7\u0001\u0000\u0000\u0000\u02b9\u02ba\u0001\u0000\u0000\u0000"+
		"\u02ba\u02bc\u0001\u0000\u0000\u0000\u02bb\u02b9\u0001\u0000\u0000\u0000"+
		"\u02bc\u02c0\u00032\u0019\u0000\u02bd\u02bf\u0005(\u0000\u0000\u02be\u02bd"+
		"\u0001\u0000\u0000\u0000\u02bf\u02c2\u0001\u0000\u0000\u0000\u02c0\u02be"+
		"\u0001\u0000\u0000\u0000\u02c0\u02c1\u0001\u0000\u0000\u0000\u02c1\u02c3"+
		"\u0001\u0000\u0000\u0000\u02c2\u02c0\u0001\u0000\u0000\u0000\u02c3\u02c4"+
		"\u0005\u000f\u0000\u0000\u02c4A\u0001\u0000\u0000\u0000\u02c5\u02c6\u0006"+
		"!\uffff\uffff\u0000\u02c6\u0324\u00032\u0019\u0000\u02c7\u02cb\u00032"+
		"\u0019\u0000\u02c8\u02ca\u0005(\u0000\u0000\u02c9\u02c8\u0001\u0000\u0000"+
		"\u0000\u02ca\u02cd\u0001\u0000\u0000\u0000\u02cb\u02c9\u0001\u0000\u0000"+
		"\u0000\u02cb\u02cc\u0001\u0000\u0000\u0000\u02cc\u02ce\u0001\u0000\u0000"+
		"\u0000\u02cd\u02cb\u0001\u0000\u0000\u0000\u02ce\u02d2\u0005\u0004\u0000"+
		"\u0000\u02cf\u02d1\u0005(\u0000\u0000\u02d0\u02cf\u0001\u0000\u0000\u0000"+
		"\u02d1\u02d4\u0001\u0000\u0000\u0000\u02d2\u02d0\u0001\u0000\u0000\u0000"+
		"\u02d2\u02d3\u0001\u0000\u0000\u0000\u02d3\u02d5\u0001\u0000\u0000\u0000"+
		"\u02d4\u02d2\u0001\u0000\u0000\u0000\u02d5\u02d6\u00032\u0019\u0000\u02d6"+
		"\u0324\u0001\u0000\u0000\u0000\u02d7\u02db\u00032\u0019\u0000\u02d8\u02da"+
		"\u0005(\u0000\u0000\u02d9\u02d8\u0001\u0000\u0000\u0000\u02da\u02dd\u0001"+
		"\u0000\u0000\u0000\u02db\u02d9\u0001\u0000\u0000\u0000\u02db\u02dc\u0001"+
		"\u0000\u0000\u0000\u02dc\u02de\u0001\u0000\u0000\u0000\u02dd\u02db\u0001"+
		"\u0000\u0000\u0000\u02de\u02e2\u0005\u0007\u0000\u0000\u02df\u02e1\u0005"+
		"(\u0000\u0000\u02e0\u02df\u0001\u0000\u0000\u0000\u02e1\u02e4\u0001\u0000"+
		"\u0000\u0000\u02e2\u02e0\u0001\u0000\u0000\u0000\u02e2\u02e3\u0001\u0000"+
		"\u0000\u0000\u02e3\u02e5\u0001\u0000\u0000\u0000\u02e4\u02e2\u0001\u0000"+
		"\u0000\u0000\u02e5\u02e6\u00032\u0019\u0000\u02e6\u0324\u0001\u0000\u0000"+
		"\u0000\u02e7\u02eb\u00032\u0019\u0000\u02e8\u02ea\u0005(\u0000\u0000\u02e9"+
		"\u02e8\u0001\u0000\u0000\u0000\u02ea\u02ed\u0001\u0000\u0000\u0000\u02eb"+
		"\u02e9\u0001\u0000\u0000\u0000\u02eb\u02ec\u0001\u0000\u0000\u0000\u02ec"+
		"\u02ee\u0001\u0000\u0000\u0000\u02ed\u02eb\u0001\u0000\u0000\u0000\u02ee"+
		"\u02f2\u0005\u0005\u0000\u0000\u02ef\u02f1\u0005(\u0000\u0000\u02f0\u02ef"+
		"\u0001\u0000\u0000\u0000\u02f1\u02f4\u0001\u0000\u0000\u0000\u02f2\u02f0"+
		"\u0001\u0000\u0000\u0000\u02f2\u02f3\u0001\u0000\u0000\u0000\u02f3\u02f5"+
		"\u0001\u0000\u0000\u0000\u02f4\u02f2\u0001\u0000\u0000\u0000\u02f5\u02f6"+
		"\u00032\u0019\u0000\u02f6\u0324\u0001\u0000\u0000\u0000\u02f7\u02fb\u0003"+
		"2\u0019\u0000\u02f8\u02fa\u0005(\u0000\u0000\u02f9\u02f8\u0001\u0000\u0000"+
		"\u0000\u02fa\u02fd\u0001\u0000\u0000\u0000\u02fb\u02f9\u0001\u0000\u0000"+
		"\u0000\u02fb\u02fc\u0001\u0000\u0000\u0000\u02fc\u02fe\u0001\u0000\u0000"+
		"\u0000\u02fd\u02fb\u0001\u0000\u0000\u0000\u02fe\u0302\u0005\u0006\u0000"+
		"\u0000\u02ff\u0301\u0005(\u0000\u0000\u0300\u02ff\u0001\u0000\u0000\u0000"+
		"\u0301\u0304\u0001\u0000\u0000\u0000\u0302\u0300\u0001\u0000\u0000\u0000"+
		"\u0302\u0303\u0001\u0000\u0000\u0000\u0303\u0305\u0001\u0000\u0000\u0000"+
		"\u0304\u0302\u0001\u0000\u0000\u0000\u0305\u0306\u00032\u0019\u0000\u0306"+
		"\u0324\u0001\u0000\u0000\u0000\u0307\u030b\u00032\u0019\u0000\u0308\u030a"+
		"\u0005(\u0000\u0000\u0309\u0308\u0001\u0000\u0000\u0000\u030a\u030d\u0001"+
		"\u0000\u0000\u0000\u030b\u0309\u0001\u0000\u0000\u0000\u030b\u030c\u0001"+
		"\u0000\u0000\u0000\u030c\u030e\u0001\u0000\u0000\u0000\u030d\u030b\u0001"+
		"\u0000\u0000\u0000\u030e\u0312\u0005\u0004\u0000\u0000\u030f\u0311\u0005"+
		"(\u0000\u0000\u0310\u030f\u0001\u0000\u0000\u0000\u0311\u0314\u0001\u0000"+
		"\u0000\u0000\u0312\u0310\u0001\u0000\u0000\u0000\u0312\u0313\u0001\u0000"+
		"\u0000\u0000\u0313\u0315\u0001\u0000\u0000\u0000\u0314\u0312\u0001\u0000"+
		"\u0000\u0000\u0315\u0316\u0003J%\u0000\u0316\u0324\u0001\u0000\u0000\u0000"+
		"\u0317\u0318\u0005\u000e\u0000\u0000\u0318\u0319\u0003B!\u0000\u0319\u031a"+
		"\u0005\u000f\u0000\u0000\u031a\u0324\u0001\u0000\u0000\u0000\u031b\u031f"+
		"\u0005\n\u0000\u0000\u031c\u031e\u0005(\u0000\u0000\u031d\u031c\u0001"+
		"\u0000\u0000\u0000\u031e\u0321\u0001\u0000\u0000\u0000\u031f\u031d\u0001"+
		"\u0000\u0000\u0000\u031f\u0320\u0001\u0000\u0000\u0000\u0320\u0322\u0001"+
		"\u0000\u0000\u0000\u0321\u031f\u0001\u0000\u0000\u0000\u0322\u0324\u0003"+
		"B!\u0001\u0323\u02c5\u0001\u0000\u0000\u0000\u0323\u02c7\u0001\u0000\u0000"+
		"\u0000\u0323\u02d7\u0001\u0000\u0000\u0000\u0323\u02e7\u0001\u0000\u0000"+
		"\u0000\u0323\u02f7\u0001\u0000\u0000\u0000\u0323\u0307\u0001\u0000\u0000"+
		"\u0000\u0323\u0317\u0001\u0000\u0000\u0000\u0323\u031b\u0001\u0000\u0000"+
		"\u0000\u0324\u0345\u0001\u0000\u0000\u0000\u0325\u0329\n\u0003\u0000\u0000"+
		"\u0326\u0328\u0005(\u0000\u0000\u0327\u0326\u0001\u0000\u0000\u0000\u0328"+
		"\u032b\u0001\u0000\u0000\u0000\u0329\u0327\u0001\u0000\u0000\u0000\u0329"+
		"\u032a\u0001\u0000\u0000\u0000\u032a\u032c\u0001\u0000\u0000\u0000\u032b"+
		"\u0329\u0001\u0000\u0000\u0000\u032c\u0330\u0005\b\u0000\u0000\u032d\u032f"+
		"\u0005(\u0000\u0000\u032e\u032d\u0001\u0000\u0000\u0000\u032f\u0332\u0001"+
		"\u0000\u0000\u0000\u0330\u032e\u0001\u0000\u0000\u0000\u0330\u0331\u0001"+
		"\u0000\u0000\u0000\u0331\u0333\u0001\u0000\u0000\u0000\u0332\u0330\u0001"+
		"\u0000\u0000\u0000\u0333\u0344\u0003B!\u0004\u0334\u0338\n\u0002\u0000"+
		"\u0000\u0335\u0337\u0005(\u0000\u0000\u0336\u0335\u0001\u0000\u0000\u0000"+
		"\u0337\u033a\u0001\u0000\u0000\u0000\u0338\u0336\u0001\u0000\u0000\u0000"+
		"\u0338\u0339\u0001\u0000\u0000\u0000\u0339\u033b\u0001\u0000\u0000\u0000"+
		"\u033a\u0338\u0001\u0000\u0000\u0000\u033b\u033f\u0005\t\u0000\u0000\u033c"+
		"\u033e\u0005(\u0000\u0000\u033d\u033c\u0001\u0000\u0000\u0000\u033e\u0341"+
		"\u0001\u0000\u0000\u0000\u033f\u033d\u0001\u0000\u0000\u0000\u033f\u0340"+
		"\u0001\u0000\u0000\u0000\u0340\u0342\u0001\u0000\u0000\u0000\u0341\u033f"+
		"\u0001\u0000\u0000\u0000\u0342\u0344\u0003B!\u0003\u0343\u0325\u0001\u0000"+
		"\u0000\u0000\u0343\u0334\u0001\u0000\u0000\u0000\u0344\u0347\u0001\u0000"+
		"\u0000\u0000\u0345\u0343\u0001\u0000\u0000\u0000\u0345\u0346\u0001\u0000"+
		"\u0000\u0000\u0346C\u0001\u0000\u0000\u0000\u0347\u0345\u0001\u0000\u0000"+
		"\u0000\u0348\u0349\u0005&\u0000\u0000\u0349E\u0001\u0000\u0000\u0000\u034a"+
		"\u034b\u0005\u0016\u0000\u0000\u034bG\u0001\u0000\u0000\u0000\u034c\u034d"+
		"\u0005\u0015\u0000\u0000\u034dI\u0001\u0000\u0000\u0000\u034e\u034f\u0005"+
		"\u0016\u0000\u0000\u034fK\u0001\u0000\u0000\u0000\u0350\u0351\u0005\'"+
		"\u0000\u0000\u0351M\u0001\u0000\u0000\u0000\u0352\u0353\u0005$\u0000\u0000"+
		"\u0353\u0354\u0005&\u0000\u0000\u0354\u0355\u0005#\u0000\u0000\u0355O"+
		"\u0001\u0000\u0000\u0000\u0356\u0357\u0005%\u0000\u0000\u0357\u0358\u0005"+
		"&\u0000\u0000\u0358\u0359\u0005#\u0000\u0000\u0359Q\u0001\u0000\u0000"+
		"\u0000hU\\iov~\u0085\u008d\u0094\u0098\u009a\u00a3\u00aa\u00b3\u00ba\u00c1"+
		"\u00c8\u00d1\u00d5\u00da\u00de\u00e3\u00ec\u00f5\u00fb\u0101\u010a\u0111"+
		"\u011a\u0123\u012c\u0132\u0138\u0141\u0148\u0151\u015d\u0163\u016a\u0172"+
		"\u0179\u017d\u017f\u0186\u018d\u0194\u019d\u01a4\u01ad\u01b4\u01b9\u01bf"+
		"\u01c6\u01cf\u01d6\u01db\u01e1\u01e8\u01ef\u01f8\u01ff\u0208\u0211\u021a"+
		"\u0221\u0228\u022f\u0238\u023f\u0246\u024d\u0252\u025c\u0262\u0269\u0271"+
		"\u0278\u0280\u0287\u028f\u0293\u0295\u02a2\u02a9\u02b9\u02c0\u02cb\u02d2"+
		"\u02db\u02e2\u02eb\u02f2\u02fb\u0302\u030b\u0312\u031f\u0323\u0329\u0330"+
		"\u0338\u033f\u0343\u0345";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
