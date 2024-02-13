// Generated from XPath.g by ANTLR 4.13.1
package parser_util;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class XPathLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DocOpen=1, ImmediateDescendent=2, Descendent=3, Equal=4, Equals=5, Is=6,
		Eq=7, And=8, Or=9, Not=10, Comma=11, OpenBracket=12, CloseBracket=13,
		OpenParen=14, CloseParen=15, At=16, Text=17, Children=18, Current=19,
		Parent=20, StringConstant=21, PathTag=22, WS=23;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"DocOpen", "ImmediateDescendent", "Descendent", "Equal", "Equals", "Is",
			"Eq", "And", "Or", "Not", "Comma", "OpenBracket", "CloseBracket", "OpenParen",
			"CloseParen", "At", "Text", "Children", "Current", "Parent", "StringConstant",
			"PathTag", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'doc('", "'/'", "'//'", "'='", "'=='", "'is'", "'eq'", "'and'",
			"'or'", "'not'", "','", "'['", "']'", "'('", "')'", "'@'", "'text'",
			"'*'", "'.'", "'..'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DocOpen", "ImmediateDescendent", "Descendent", "Equal", "Equals",
			"Is", "Eq", "And", "Or", "Not", "Comma", "OpenBracket", "CloseBracket",
			"OpenParen", "CloseParen", "At", "Text", "Children", "Current", "Parent",
			"StringConstant", "PathTag", "WS"
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


	public XPathLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "XPath.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0017\u0082\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0005\u0014j\b\u0014\n\u0014"+
		"\f\u0014m\t\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014r\b\u0014"+
		"\n\u0014\f\u0014u\t\u0014\u0001\u0014\u0003\u0014x\b\u0014\u0001\u0015"+
		"\u0004\u0015{\b\u0015\u000b\u0015\f\u0015|\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0000\u0000\u0017\u0001\u0001\u0003\u0002\u0005\u0003"+
		"\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015"+
		"\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012"+
		"%\u0013\'\u0014)\u0015+\u0016-\u0017\u0001\u0000\u0003\u0002\u0000\"\""+
		"\'\'\u000b\u0000\t\n\r\r  \"\"\'*,,./==@@[[]]\u0003\u0000\t\n\r\r  \u0085"+
		"\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000"+
		"\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000"+
		"\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000"+
		"\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001"+
		"\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000"+
		"\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000"+
		"\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0001/"+
		"\u0001\u0000\u0000\u0000\u00034\u0001\u0000\u0000\u0000\u00056\u0001\u0000"+
		"\u0000\u0000\u00079\u0001\u0000\u0000\u0000\t;\u0001\u0000\u0000\u0000"+
		"\u000b>\u0001\u0000\u0000\u0000\rA\u0001\u0000\u0000\u0000\u000fD\u0001"+
		"\u0000\u0000\u0000\u0011H\u0001\u0000\u0000\u0000\u0013K\u0001\u0000\u0000"+
		"\u0000\u0015O\u0001\u0000\u0000\u0000\u0017Q\u0001\u0000\u0000\u0000\u0019"+
		"S\u0001\u0000\u0000\u0000\u001bU\u0001\u0000\u0000\u0000\u001dW\u0001"+
		"\u0000\u0000\u0000\u001fY\u0001\u0000\u0000\u0000![\u0001\u0000\u0000"+
		"\u0000#`\u0001\u0000\u0000\u0000%b\u0001\u0000\u0000\u0000\'d\u0001\u0000"+
		"\u0000\u0000)w\u0001\u0000\u0000\u0000+z\u0001\u0000\u0000\u0000-~\u0001"+
		"\u0000\u0000\u0000/0\u0005d\u0000\u000001\u0005o\u0000\u000012\u0005c"+
		"\u0000\u000023\u0005(\u0000\u00003\u0002\u0001\u0000\u0000\u000045\u0005"+
		"/\u0000\u00005\u0004\u0001\u0000\u0000\u000067\u0005/\u0000\u000078\u0005"+
		"/\u0000\u00008\u0006\u0001\u0000\u0000\u00009:\u0005=\u0000\u0000:\b\u0001"+
		"\u0000\u0000\u0000;<\u0005=\u0000\u0000<=\u0005=\u0000\u0000=\n\u0001"+
		"\u0000\u0000\u0000>?\u0005i\u0000\u0000?@\u0005s\u0000\u0000@\f\u0001"+
		"\u0000\u0000\u0000AB\u0005e\u0000\u0000BC\u0005q\u0000\u0000C\u000e\u0001"+
		"\u0000\u0000\u0000DE\u0005a\u0000\u0000EF\u0005n\u0000\u0000FG\u0005d"+
		"\u0000\u0000G\u0010\u0001\u0000\u0000\u0000HI\u0005o\u0000\u0000IJ\u0005"+
		"r\u0000\u0000J\u0012\u0001\u0000\u0000\u0000KL\u0005n\u0000\u0000LM\u0005"+
		"o\u0000\u0000MN\u0005t\u0000\u0000N\u0014\u0001\u0000\u0000\u0000OP\u0005"+
		",\u0000\u0000P\u0016\u0001\u0000\u0000\u0000QR\u0005[\u0000\u0000R\u0018"+
		"\u0001\u0000\u0000\u0000ST\u0005]\u0000\u0000T\u001a\u0001\u0000\u0000"+
		"\u0000UV\u0005(\u0000\u0000V\u001c\u0001\u0000\u0000\u0000WX\u0005)\u0000"+
		"\u0000X\u001e\u0001\u0000\u0000\u0000YZ\u0005@\u0000\u0000Z \u0001\u0000"+
		"\u0000\u0000[\\\u0005t\u0000\u0000\\]\u0005e\u0000\u0000]^\u0005x\u0000"+
		"\u0000^_\u0005t\u0000\u0000_\"\u0001\u0000\u0000\u0000`a\u0005*\u0000"+
		"\u0000a$\u0001\u0000\u0000\u0000bc\u0005.\u0000\u0000c&\u0001\u0000\u0000"+
		"\u0000de\u0005.\u0000\u0000ef\u0005.\u0000\u0000f(\u0001\u0000\u0000\u0000"+
		"gk\u0005\"\u0000\u0000hj\b\u0000\u0000\u0000ih\u0001\u0000\u0000\u0000"+
		"jm\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000"+
		"\u0000ln\u0001\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000nx\u0005\"\u0000"+
		"\u0000os\u0005\'\u0000\u0000pr\b\u0000\u0000\u0000qp\u0001\u0000\u0000"+
		"\u0000ru\u0001\u0000\u0000\u0000sq\u0001\u0000\u0000\u0000st\u0001\u0000"+
		"\u0000\u0000tv\u0001\u0000\u0000\u0000us\u0001\u0000\u0000\u0000vx\u0005"+
		"\'\u0000\u0000wg\u0001\u0000\u0000\u0000wo\u0001\u0000\u0000\u0000x*\u0001"+
		"\u0000\u0000\u0000y{\b\u0001\u0000\u0000zy\u0001\u0000\u0000\u0000{|\u0001"+
		"\u0000\u0000\u0000|z\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000"+
		"},\u0001\u0000\u0000\u0000~\u007f\u0007\u0002\u0000\u0000\u007f\u0080"+
		"\u0001\u0000\u0000\u0000\u0080\u0081\u0006\u0016\u0000\u0000\u0081.\u0001"+
		"\u0000\u0000\u0000\u0005\u0000ksw|\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
