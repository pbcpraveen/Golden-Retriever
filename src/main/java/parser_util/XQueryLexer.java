// Generated from XQuery.g by ANTLR 4.13.1
package parser_util;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class XQueryLexer extends Lexer {
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
			"CloseParen", "At", "Text", "Children", "Current", "Parent", "FileName",
			"StringConstant", "Dollar", "For", "Let", "Some", "Empty", "In", "Where",
			"OpenBrace", "CloseBrace", "Assign", "Return", "Satisfies", "CloseAngular",
			"OpenAngular", "OpenAngularwithforwardslash", "Join", "PathTag", "Variable",
			"Separators"
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


	public XQueryLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "XQuery.g"; }

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
		"\u0004\u0000)\u00f9\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007"+
		"&\u0002\'\u0007\'\u0002(\u0007(\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0014\u0001\u0014\u0004\u0014\u008e\b\u0014\u000b\u0014\f\u0014"+
		"\u008f\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0005\u0015\u009b\b\u0015\n"+
		"\u0015\f\u0015\u009e\t\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0005"+
		"\u0015\u00a3\b\u0015\n\u0015\f\u0015\u00a6\t\u0015\u0001\u0015\u0003\u0015"+
		"\u00a9\b\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001\"\u0001\"\u0001#\u0001#\u0001$\u0001$\u0001$\u0001%\u0001%\u0001"+
		"%\u0001%\u0001%\u0001&\u0004&\u00ee\b&\u000b&\f&\u00ef\u0001\'\u0001\'"+
		"\u0004\'\u00f4\b\'\u000b\'\f\'\u00f5\u0001(\u0001(\u0000\u0000)\u0001"+
		"\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007"+
		"\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d"+
		"\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/"+
		"\u00181\u00193\u001a5\u001b7\u001c9\u001d;\u001e=\u001f? A!C\"E#G$I%K"+
		"&M\'O(Q)\u0001\u0000\u0005\u0006\u0000  --09AZ__az\u0002\u0000\"\"\'\'"+
		"\u0003\u000009AZaz\u0002\u000009az\u0003\u0000\t\n\r\r  \u00fe\u0000\u0001"+
		"\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005"+
		"\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001"+
		"\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000"+
		"\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000"+
		"\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000"+
		"\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000"+
		"\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000"+
		"\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000"+
		"\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000"+
		"\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001"+
		"\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000"+
		"\u0000\u00001\u0001\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u0000"+
		"5\u0001\u0000\u0000\u0000\u00007\u0001\u0000\u0000\u0000\u00009\u0001"+
		"\u0000\u0000\u0000\u0000;\u0001\u0000\u0000\u0000\u0000=\u0001\u0000\u0000"+
		"\u0000\u0000?\u0001\u0000\u0000\u0000\u0000A\u0001\u0000\u0000\u0000\u0000"+
		"C\u0001\u0000\u0000\u0000\u0000E\u0001\u0000\u0000\u0000\u0000G\u0001"+
		"\u0000\u0000\u0000\u0000I\u0001\u0000\u0000\u0000\u0000K\u0001\u0000\u0000"+
		"\u0000\u0000M\u0001\u0000\u0000\u0000\u0000O\u0001\u0000\u0000\u0000\u0000"+
		"Q\u0001\u0000\u0000\u0000\u0001S\u0001\u0000\u0000\u0000\u0003X\u0001"+
		"\u0000\u0000\u0000\u0005Z\u0001\u0000\u0000\u0000\u0007]\u0001\u0000\u0000"+
		"\u0000\t_\u0001\u0000\u0000\u0000\u000bb\u0001\u0000\u0000\u0000\re\u0001"+
		"\u0000\u0000\u0000\u000fh\u0001\u0000\u0000\u0000\u0011l\u0001\u0000\u0000"+
		"\u0000\u0013o\u0001\u0000\u0000\u0000\u0015s\u0001\u0000\u0000\u0000\u0017"+
		"u\u0001\u0000\u0000\u0000\u0019w\u0001\u0000\u0000\u0000\u001by\u0001"+
		"\u0000\u0000\u0000\u001d{\u0001\u0000\u0000\u0000\u001f}\u0001\u0000\u0000"+
		"\u0000!\u007f\u0001\u0000\u0000\u0000#\u0084\u0001\u0000\u0000\u0000%"+
		"\u0086\u0001\u0000\u0000\u0000\'\u0088\u0001\u0000\u0000\u0000)\u008b"+
		"\u0001\u0000\u0000\u0000+\u00a8\u0001\u0000\u0000\u0000-\u00aa\u0001\u0000"+
		"\u0000\u0000/\u00ac\u0001\u0000\u0000\u00001\u00b0\u0001\u0000\u0000\u0000"+
		"3\u00b4\u0001\u0000\u0000\u00005\u00b9\u0001\u0000\u0000\u00007\u00bf"+
		"\u0001\u0000\u0000\u00009\u00c2\u0001\u0000\u0000\u0000;\u00c8\u0001\u0000"+
		"\u0000\u0000=\u00ca\u0001\u0000\u0000\u0000?\u00cc\u0001\u0000\u0000\u0000"+
		"A\u00cf\u0001\u0000\u0000\u0000C\u00d6\u0001\u0000\u0000\u0000E\u00e0"+
		"\u0001\u0000\u0000\u0000G\u00e2\u0001\u0000\u0000\u0000I\u00e4\u0001\u0000"+
		"\u0000\u0000K\u00e7\u0001\u0000\u0000\u0000M\u00ed\u0001\u0000\u0000\u0000"+
		"O\u00f1\u0001\u0000\u0000\u0000Q\u00f7\u0001\u0000\u0000\u0000ST\u0005"+
		"d\u0000\u0000TU\u0005o\u0000\u0000UV\u0005c\u0000\u0000VW\u0005(\u0000"+
		"\u0000W\u0002\u0001\u0000\u0000\u0000XY\u0005/\u0000\u0000Y\u0004\u0001"+
		"\u0000\u0000\u0000Z[\u0005/\u0000\u0000[\\\u0005/\u0000\u0000\\\u0006"+
		"\u0001\u0000\u0000\u0000]^\u0005=\u0000\u0000^\b\u0001\u0000\u0000\u0000"+
		"_`\u0005=\u0000\u0000`a\u0005=\u0000\u0000a\n\u0001\u0000\u0000\u0000"+
		"bc\u0005i\u0000\u0000cd\u0005s\u0000\u0000d\f\u0001\u0000\u0000\u0000"+
		"ef\u0005e\u0000\u0000fg\u0005q\u0000\u0000g\u000e\u0001\u0000\u0000\u0000"+
		"hi\u0005a\u0000\u0000ij\u0005n\u0000\u0000jk\u0005d\u0000\u0000k\u0010"+
		"\u0001\u0000\u0000\u0000lm\u0005o\u0000\u0000mn\u0005r\u0000\u0000n\u0012"+
		"\u0001\u0000\u0000\u0000op\u0005n\u0000\u0000pq\u0005o\u0000\u0000qr\u0005"+
		"t\u0000\u0000r\u0014\u0001\u0000\u0000\u0000st\u0005,\u0000\u0000t\u0016"+
		"\u0001\u0000\u0000\u0000uv\u0005[\u0000\u0000v\u0018\u0001\u0000\u0000"+
		"\u0000wx\u0005]\u0000\u0000x\u001a\u0001\u0000\u0000\u0000yz\u0005(\u0000"+
		"\u0000z\u001c\u0001\u0000\u0000\u0000{|\u0005)\u0000\u0000|\u001e\u0001"+
		"\u0000\u0000\u0000}~\u0005@\u0000\u0000~ \u0001\u0000\u0000\u0000\u007f"+
		"\u0080\u0005t\u0000\u0000\u0080\u0081\u0005e\u0000\u0000\u0081\u0082\u0005"+
		"x\u0000\u0000\u0082\u0083\u0005t\u0000\u0000\u0083\"\u0001\u0000\u0000"+
		"\u0000\u0084\u0085\u0005*\u0000\u0000\u0085$\u0001\u0000\u0000\u0000\u0086"+
		"\u0087\u0005.\u0000\u0000\u0087&\u0001\u0000\u0000\u0000\u0088\u0089\u0005"+
		".\u0000\u0000\u0089\u008a\u0005.\u0000\u0000\u008a(\u0001\u0000\u0000"+
		"\u0000\u008b\u008d\u0005\"\u0000\u0000\u008c\u008e\u0007\u0000\u0000\u0000"+
		"\u008d\u008c\u0001\u0000\u0000\u0000\u008e\u008f\u0001\u0000\u0000\u0000"+
		"\u008f\u008d\u0001\u0000\u0000\u0000\u008f\u0090\u0001\u0000\u0000\u0000"+
		"\u0090\u0091\u0001\u0000\u0000\u0000\u0091\u0092\u0005.\u0000\u0000\u0092"+
		"\u0093\u0005x\u0000\u0000\u0093\u0094\u0005m\u0000\u0000\u0094\u0095\u0005"+
		"l\u0000\u0000\u0095\u0096\u0001\u0000\u0000\u0000\u0096\u0097\u0005\""+
		"\u0000\u0000\u0097*\u0001\u0000\u0000\u0000\u0098\u009c\u0005\"\u0000"+
		"\u0000\u0099\u009b\b\u0001\u0000\u0000\u009a\u0099\u0001\u0000\u0000\u0000"+
		"\u009b\u009e\u0001\u0000\u0000\u0000\u009c\u009a\u0001\u0000\u0000\u0000"+
		"\u009c\u009d\u0001\u0000\u0000\u0000\u009d\u009f\u0001\u0000\u0000\u0000"+
		"\u009e\u009c\u0001\u0000\u0000\u0000\u009f\u00a9\u0005\"\u0000\u0000\u00a0"+
		"\u00a4\u0005\'\u0000\u0000\u00a1\u00a3\b\u0001\u0000\u0000\u00a2\u00a1"+
		"\u0001\u0000\u0000\u0000\u00a3\u00a6\u0001\u0000\u0000\u0000\u00a4\u00a2"+
		"\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5\u00a7"+
		"\u0001\u0000\u0000\u0000\u00a6\u00a4\u0001\u0000\u0000\u0000\u00a7\u00a9"+
		"\u0005\'\u0000\u0000\u00a8\u0098\u0001\u0000\u0000\u0000\u00a8\u00a0\u0001"+
		"\u0000\u0000\u0000\u00a9,\u0001\u0000\u0000\u0000\u00aa\u00ab\u0005$\u0000"+
		"\u0000\u00ab.\u0001\u0000\u0000\u0000\u00ac\u00ad\u0005f\u0000\u0000\u00ad"+
		"\u00ae\u0005o\u0000\u0000\u00ae\u00af\u0005r\u0000\u0000\u00af0\u0001"+
		"\u0000\u0000\u0000\u00b0\u00b1\u0005l\u0000\u0000\u00b1\u00b2\u0005e\u0000"+
		"\u0000\u00b2\u00b3\u0005t\u0000\u0000\u00b32\u0001\u0000\u0000\u0000\u00b4"+
		"\u00b5\u0005s\u0000\u0000\u00b5\u00b6\u0005o\u0000\u0000\u00b6\u00b7\u0005"+
		"m\u0000\u0000\u00b7\u00b8\u0005e\u0000\u0000\u00b84\u0001\u0000\u0000"+
		"\u0000\u00b9\u00ba\u0005e\u0000\u0000\u00ba\u00bb\u0005m\u0000\u0000\u00bb"+
		"\u00bc\u0005p\u0000\u0000\u00bc\u00bd\u0005t\u0000\u0000\u00bd\u00be\u0005"+
		"y\u0000\u0000\u00be6\u0001\u0000\u0000\u0000\u00bf\u00c0\u0005i\u0000"+
		"\u0000\u00c0\u00c1\u0005n\u0000\u0000\u00c18\u0001\u0000\u0000\u0000\u00c2"+
		"\u00c3\u0005w\u0000\u0000\u00c3\u00c4\u0005h\u0000\u0000\u00c4\u00c5\u0005"+
		"e\u0000\u0000\u00c5\u00c6\u0005r\u0000\u0000\u00c6\u00c7\u0005e\u0000"+
		"\u0000\u00c7:\u0001\u0000\u0000\u0000\u00c8\u00c9\u0005{\u0000\u0000\u00c9"+
		"<\u0001\u0000\u0000\u0000\u00ca\u00cb\u0005}\u0000\u0000\u00cb>\u0001"+
		"\u0000\u0000\u0000\u00cc\u00cd\u0005:\u0000\u0000\u00cd\u00ce\u0005=\u0000"+
		"\u0000\u00ce@\u0001\u0000\u0000\u0000\u00cf\u00d0\u0005r\u0000\u0000\u00d0"+
		"\u00d1\u0005e\u0000\u0000\u00d1\u00d2\u0005t\u0000\u0000\u00d2\u00d3\u0005"+
		"u\u0000\u0000\u00d3\u00d4\u0005r\u0000\u0000\u00d4\u00d5\u0005n\u0000"+
		"\u0000\u00d5B\u0001\u0000\u0000\u0000\u00d6\u00d7\u0005s\u0000\u0000\u00d7"+
		"\u00d8\u0005a\u0000\u0000\u00d8\u00d9\u0005t\u0000\u0000\u00d9\u00da\u0005"+
		"i\u0000\u0000\u00da\u00db\u0005s\u0000\u0000\u00db\u00dc\u0005f\u0000"+
		"\u0000\u00dc\u00dd\u0005i\u0000\u0000\u00dd\u00de\u0005e\u0000\u0000\u00de"+
		"\u00df\u0005s\u0000\u0000\u00dfD\u0001\u0000\u0000\u0000\u00e0\u00e1\u0005"+
		">\u0000\u0000\u00e1F\u0001\u0000\u0000\u0000\u00e2\u00e3\u0005<\u0000"+
		"\u0000\u00e3H\u0001\u0000\u0000\u0000\u00e4\u00e5\u0005<\u0000\u0000\u00e5"+
		"\u00e6\u0005/\u0000\u0000\u00e6J\u0001\u0000\u0000\u0000\u00e7\u00e8\u0005"+
		"j\u0000\u0000\u00e8\u00e9\u0005o\u0000\u0000\u00e9\u00ea\u0005i\u0000"+
		"\u0000\u00ea\u00eb\u0005n\u0000\u0000\u00ebL\u0001\u0000\u0000\u0000\u00ec"+
		"\u00ee\u0007\u0002\u0000\u0000\u00ed\u00ec\u0001\u0000\u0000\u0000\u00ee"+
		"\u00ef\u0001\u0000\u0000\u0000\u00ef\u00ed\u0001\u0000\u0000\u0000\u00ef"+
		"\u00f0\u0001\u0000\u0000\u0000\u00f0N\u0001\u0000\u0000\u0000\u00f1\u00f3"+
		"\u0005$\u0000\u0000\u00f2\u00f4\u0007\u0003\u0000\u0000\u00f3\u00f2\u0001"+
		"\u0000\u0000\u0000\u00f4\u00f5\u0001\u0000\u0000\u0000\u00f5\u00f3\u0001"+
		"\u0000\u0000\u0000\u00f5\u00f6\u0001\u0000\u0000\u0000\u00f6P\u0001\u0000"+
		"\u0000\u0000\u00f7\u00f8\u0007\u0004\u0000\u0000\u00f8R\u0001\u0000\u0000"+
		"\u0000\u0007\u0000\u008f\u009c\u00a4\u00a8\u00ef\u00f5\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
