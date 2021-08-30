// Generated from br/ufscar/dc/compiladores/alguma/lexico/AlgumaLexer.g4 by ANTLR 4.7.2
package br.ufscar.dc.compiladores.alguma.lexico;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AlgumaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PALAVRA_CHAVE=1, NUM_INT=2, NUM_REAL=3, IDENT=4, ATRIB=5, OP_REL=6, OP_ARIT=7, 
		DELIM=8, ABRECHA=9, FECHACHA=10, ABREPAR=11, FECHAPAR=12, VIRG=13, PONT=14, 
		CADEIA=15, CADEIA_NFECHADA=16, COMENTARIO=17, COMENT_ERRADO=18, WS=19, 
		PULAL=20, ERRO=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PALAVRA_CHAVE", "NUM_INT", "NUM_REAL", "IDENT", "ATRIB", "OP_REL", "OP_ARIT", 
			"DELIM", "ABRECHA", "FECHACHA", "ABREPAR", "FECHAPAR", "VIRG", "PONT", 
			"CADEIA", "CADEIA_NFECHADA", "ESC_SEQ", "COMENTARIO", "COMENT_ERRADO", 
			"WS", "PULAL", "ERRO"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "'<-'", null, null, "':'", "'['", "']'", 
			"'('", "')'", "','", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PALAVRA_CHAVE", "NUM_INT", "NUM_REAL", "IDENT", "ATRIB", "OP_REL", 
			"OP_ARIT", "DELIM", "ABRECHA", "FECHACHA", "ABREPAR", "FECHAPAR", "VIRG", 
			"PONT", "CADEIA", "CADEIA_NFECHADA", "COMENTARIO", "COMENT_ERRADO", "WS", 
			"PULAL", "ERRO"
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


	public AlgumaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "AlgumaLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\27\u0193\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5"+
		"\2\u0128\n\2\3\3\6\3\u012b\n\3\r\3\16\3\u012c\3\4\6\4\u0130\n\4\r\4\16"+
		"\4\u0131\3\4\3\4\6\4\u0136\n\4\r\4\16\4\u0137\3\5\3\5\7\5\u013c\n\5\f"+
		"\5\16\5\u013f\13\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7"+
		"\u014d\n\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16"+
		"\3\17\3\17\3\20\3\20\3\20\7\20\u0162\n\20\f\20\16\20\u0165\13\20\3\20"+
		"\3\20\3\21\3\21\3\21\7\21\u016c\n\21\f\21\16\21\u016f\13\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\23\3\23\7\23\u0178\n\23\f\23\16\23\u017b\13\23\3\23"+
		"\3\23\3\23\3\23\3\24\3\24\7\24\u0183\n\24\f\24\16\24\u0186\13\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\u0179\2\30\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37"+
		"\21!\22#\2%\23\'\24)\25+\26-\27\3\2\13\4\2((``\4\2C\\c|\6\2\62;C\\aac"+
		"|\6\2\'\',-//\61\61\5\2\f\f$$^^\4\2$$^^\3\2\f\f\3\2\177\177\5\2\13\13"+
		"\17\17\"\"\2\u01c6\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\3\u0127"+
		"\3\2\2\2\5\u012a\3\2\2\2\7\u012f\3\2\2\2\t\u0139\3\2\2\2\13\u0140\3\2"+
		"\2\2\r\u014c\3\2\2\2\17\u014e\3\2\2\2\21\u0150\3\2\2\2\23\u0152\3\2\2"+
		"\2\25\u0154\3\2\2\2\27\u0156\3\2\2\2\31\u0158\3\2\2\2\33\u015a\3\2\2\2"+
		"\35\u015c\3\2\2\2\37\u015e\3\2\2\2!\u0168\3\2\2\2#\u0172\3\2\2\2%\u0175"+
		"\3\2\2\2\'\u0180\3\2\2\2)\u0189\3\2\2\2+\u018d\3\2\2\2-\u0191\3\2\2\2"+
		"/\60\7c\2\2\60\61\7n\2\2\61\62\7i\2\2\62\63\7q\2\2\63\64\7t\2\2\64\65"+
		"\7k\2\2\65\66\7v\2\2\66\67\7o\2\2\67\u0128\7q\2\289\7f\2\29:\7g\2\2:;"+
		"\7e\2\2;<\7n\2\2<=\7c\2\2=>\7t\2\2>\u0128\7g\2\2?@\7n\2\2@A\7k\2\2AB\7"+
		"v\2\2BC\7g\2\2CD\7t\2\2DE\7c\2\2E\u0128\7n\2\2FG\7k\2\2GH\7p\2\2HI\7v"+
		"\2\2IJ\7g\2\2JK\7k\2\2KL\7t\2\2L\u0128\7q\2\2MN\7n\2\2NO\7g\2\2OP\7k\2"+
		"\2P\u0128\7c\2\2QR\7g\2\2RS\7u\2\2ST\7e\2\2TU\7t\2\2UV\7g\2\2VW\7x\2\2"+
		"W\u0128\7c\2\2XY\7t\2\2YZ\7g\2\2Z[\7c\2\2[\u0128\7n\2\2\\]\7n\2\2]^\7"+
		"q\2\2^_\7i\2\2_`\7k\2\2`a\7e\2\2a\u0128\7q\2\2bc\7u\2\2c\u0128\7g\2\2"+
		"de\7g\2\2ef\7p\2\2fg\7v\2\2gh\7c\2\2h\u0128\7q\2\2ij\7u\2\2jk\7g\2\2k"+
		"l\7p\2\2lm\7c\2\2m\u0128\7q\2\2no\7h\2\2op\7k\2\2pq\7o\2\2qr\7a\2\2rs"+
		"\7u\2\2s\u0128\7g\2\2t\u0128\7g\2\2uv\7q\2\2v\u0128\7w\2\2wx\7\60\2\2"+
		"x\u0128\7\60\2\2yz\7e\2\2z{\7c\2\2{|\7u\2\2|\u0128\7q\2\2}~\7u\2\2~\177"+
		"\7g\2\2\177\u0080\7l\2\2\u0080\u0128\7c\2\2\u0081\u0082\7h\2\2\u0082\u0083"+
		"\7k\2\2\u0083\u0084\7o\2\2\u0084\u0085\7a\2\2\u0085\u0086\7e\2\2\u0086"+
		"\u0087\7c\2\2\u0087\u0088\7u\2\2\u0088\u0128\7q\2\2\u0089\u008a\7r\2\2"+
		"\u008a\u008b\7c\2\2\u008b\u008c\7t\2\2\u008c\u0128\7c\2\2\u008d\u008e"+
		"\7c\2\2\u008e\u008f\7v\2\2\u008f\u0128\7g\2\2\u0090\u0091\7h\2\2\u0091"+
		"\u0092\7c\2\2\u0092\u0093\7e\2\2\u0093\u0128\7c\2\2\u0094\u0095\7h\2\2"+
		"\u0095\u0096\7k\2\2\u0096\u0097\7o\2\2\u0097\u0098\7a\2\2\u0098\u0099"+
		"\7r\2\2\u0099\u009a\7c\2\2\u009a\u009b\7t\2\2\u009b\u0128\7c\2\2\u009c"+
		"\u009d\7g\2\2\u009d\u009e\7p\2\2\u009e\u009f\7s\2\2\u009f\u00a0\7w\2\2"+
		"\u00a0\u00a1\7c\2\2\u00a1\u00a2\7p\2\2\u00a2\u00a3\7v\2\2\u00a3\u0128"+
		"\7q\2\2\u00a4\u00a5\7h\2\2\u00a5\u00a6\7k\2\2\u00a6\u00a7\7o\2\2\u00a7"+
		"\u00a8\7a\2\2\u00a8\u00a9\7g\2\2\u00a9\u00aa\7p\2\2\u00aa\u00ab\7s\2\2"+
		"\u00ab\u00ac\7w\2\2\u00ac\u00ad\7c\2\2\u00ad\u00ae\7p\2\2\u00ae\u00af"+
		"\7v\2\2\u00af\u0128\7q\2\2\u00b0\u0128\t\2\2\2\u00b1\u00b2\7t\2\2\u00b2"+
		"\u00b3\7g\2\2\u00b3\u00b4\7i\2\2\u00b4\u00b5\7k\2\2\u00b5\u00b6\7u\2\2"+
		"\u00b6\u00b7\7v\2\2\u00b7\u00b8\7t\2\2\u00b8\u0128\7q\2\2\u00b9\u00ba"+
		"\7h\2\2\u00ba\u00bb\7k\2\2\u00bb\u00bc\7o\2\2\u00bc\u00bd\7a\2\2\u00bd"+
		"\u00be\7t\2\2\u00be\u00bf\7g\2\2\u00bf\u00c0\7i\2\2\u00c0\u00c1\7k\2\2"+
		"\u00c1\u00c2\7u\2\2\u00c2\u00c3\7v\2\2\u00c3\u00c4\7t\2\2\u00c4\u0128"+
		"\7q\2\2\u00c5\u00c6\7v\2\2\u00c6\u00c7\7k\2\2\u00c7\u00c8\7r\2\2\u00c8"+
		"\u0128\7q\2\2\u00c9\u00ca\7r\2\2\u00ca\u00cb\7t\2\2\u00cb\u00cc\7q\2\2"+
		"\u00cc\u00cd\7e\2\2\u00cd\u00ce\7g\2\2\u00ce\u00cf\7f\2\2\u00cf\u00d0"+
		"\7k\2\2\u00d0\u00d1\7o\2\2\u00d1\u00d2\7g\2\2\u00d2\u00d3\7p\2\2\u00d3"+
		"\u00d4\7v\2\2\u00d4\u0128\7q\2\2\u00d5\u00d6\7h\2\2\u00d6\u00d7\7k\2\2"+
		"\u00d7\u00d8\7o\2\2\u00d8\u00d9\7a\2\2\u00d9\u00da\7r\2\2\u00da\u00db"+
		"\7t\2\2\u00db\u00dc\7q\2\2\u00dc\u00dd\7e\2\2\u00dd\u00de\7g\2\2\u00de"+
		"\u00df\7f\2\2\u00df\u00e0\7k\2\2\u00e0\u00e1\7o\2\2\u00e1\u00e2\7g\2\2"+
		"\u00e2\u00e3\7p\2\2\u00e3\u00e4\7v\2\2\u00e4\u0128\7q\2\2\u00e5\u00e6"+
		"\7x\2\2\u00e6\u00e7\7c\2\2\u00e7\u0128\7t\2\2\u00e8\u00e9\7h\2\2\u00e9"+
		"\u00ea\7w\2\2\u00ea\u00eb\7p\2\2\u00eb\u00ec\7e\2\2\u00ec\u00ed\7c\2\2"+
		"\u00ed\u0128\7q\2\2\u00ee\u00ef\7h\2\2\u00ef\u00f0\7k\2\2\u00f0\u00f1"+
		"\7o\2\2\u00f1\u00f2\7a\2\2\u00f2\u00f3\7h\2\2\u00f3\u00f4\7w\2\2\u00f4"+
		"\u00f5\7p\2\2\u00f5\u00f6\7e\2\2\u00f6\u00f7\7c\2\2\u00f7\u0128\7q\2\2"+
		"\u00f8\u00f9\7t\2\2\u00f9\u00fa\7g\2\2\u00fa\u00fb\7v\2\2\u00fb\u00fc"+
		"\7q\2\2\u00fc\u00fd\7t\2\2\u00fd\u00fe\7p\2\2\u00fe\u0128\7g\2\2\u00ff"+
		"\u0100\7e\2\2\u0100\u0101\7q\2\2\u0101\u0102\7p\2\2\u0102\u0103\7u\2\2"+
		"\u0103\u0104\7v\2\2\u0104\u0105\7c\2\2\u0105\u0106\7p\2\2\u0106\u0107"+
		"\7v\2\2\u0107\u0128\7g\2\2\u0108\u0109\7h\2\2\u0109\u010a\7c\2\2\u010a"+
		"\u010b\7n\2\2\u010b\u010c\7u\2\2\u010c\u0128\7q\2\2\u010d\u010e\7p\2\2"+
		"\u010e\u010f\7c\2\2\u010f\u0128\7q\2\2\u0110\u0111\7x\2\2\u0111\u0112"+
		"\7g\2\2\u0112\u0113\7t\2\2\u0113\u0114\7f\2\2\u0114\u0115\7c\2\2\u0115"+
		"\u0116\7f\2\2\u0116\u0117\7g\2\2\u0117\u0118\7k\2\2\u0118\u0119\7t\2\2"+
		"\u0119\u0128\7q\2\2\u011a\u011b\7h\2\2\u011b\u011c\7k\2\2\u011c\u011d"+
		"\7o\2\2\u011d\u011e\7a\2\2\u011e\u011f\7c\2\2\u011f\u0120\7n\2\2\u0120"+
		"\u0121\7i\2\2\u0121\u0122\7q\2\2\u0122\u0123\7t\2\2\u0123\u0124\7k\2\2"+
		"\u0124\u0125\7v\2\2\u0125\u0126\7o\2\2\u0126\u0128\7q\2\2\u0127/\3\2\2"+
		"\2\u01278\3\2\2\2\u0127?\3\2\2\2\u0127F\3\2\2\2\u0127M\3\2\2\2\u0127Q"+
		"\3\2\2\2\u0127X\3\2\2\2\u0127\\\3\2\2\2\u0127b\3\2\2\2\u0127d\3\2\2\2"+
		"\u0127i\3\2\2\2\u0127n\3\2\2\2\u0127t\3\2\2\2\u0127u\3\2\2\2\u0127w\3"+
		"\2\2\2\u0127y\3\2\2\2\u0127}\3\2\2\2\u0127\u0081\3\2\2\2\u0127\u0089\3"+
		"\2\2\2\u0127\u008d\3\2\2\2\u0127\u0090\3\2\2\2\u0127\u0094\3\2\2\2\u0127"+
		"\u009c\3\2\2\2\u0127\u00a4\3\2\2\2\u0127\u00b0\3\2\2\2\u0127\u00b1\3\2"+
		"\2\2\u0127\u00b9\3\2\2\2\u0127\u00c5\3\2\2\2\u0127\u00c9\3\2\2\2\u0127"+
		"\u00d5\3\2\2\2\u0127\u00e5\3\2\2\2\u0127\u00e8\3\2\2\2\u0127\u00ee\3\2"+
		"\2\2\u0127\u00f8\3\2\2\2\u0127\u00ff\3\2\2\2\u0127\u0108\3\2\2\2\u0127"+
		"\u010d\3\2\2\2\u0127\u0110\3\2\2\2\u0127\u011a\3\2\2\2\u0128\4\3\2\2\2"+
		"\u0129\u012b\4\62;\2\u012a\u0129\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012a"+
		"\3\2\2\2\u012c\u012d\3\2\2\2\u012d\6\3\2\2\2\u012e\u0130\4\62;\2\u012f"+
		"\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u012f\3\2\2\2\u0131\u0132\3\2"+
		"\2\2\u0132\u0133\3\2\2\2\u0133\u0135\7\60\2\2\u0134\u0136\4\62;\2\u0135"+
		"\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0135\3\2\2\2\u0137\u0138\3\2"+
		"\2\2\u0138\b\3\2\2\2\u0139\u013d\t\3\2\2\u013a\u013c\t\4\2\2\u013b\u013a"+
		"\3\2\2\2\u013c\u013f\3\2\2\2\u013d\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e"+
		"\n\3\2\2\2\u013f\u013d\3\2\2\2\u0140\u0141\7>\2\2\u0141\u0142\7/\2\2\u0142"+
		"\f\3\2\2\2\u0143\u014d\7@\2\2\u0144\u0145\7@\2\2\u0145\u014d\7?\2\2\u0146"+
		"\u014d\7>\2\2\u0147\u0148\7>\2\2\u0148\u014d\7?\2\2\u0149\u014a\7>\2\2"+
		"\u014a\u014d\7@\2\2\u014b\u014d\7?\2\2\u014c\u0143\3\2\2\2\u014c\u0144"+
		"\3\2\2\2\u014c\u0146\3\2\2\2\u014c\u0147\3\2\2\2\u014c\u0149\3\2\2\2\u014c"+
		"\u014b\3\2\2\2\u014d\16\3\2\2\2\u014e\u014f\t\5\2\2\u014f\20\3\2\2\2\u0150"+
		"\u0151\7<\2\2\u0151\22\3\2\2\2\u0152\u0153\7]\2\2\u0153\24\3\2\2\2\u0154"+
		"\u0155\7_\2\2\u0155\26\3\2\2\2\u0156\u0157\7*\2\2\u0157\30\3\2\2\2\u0158"+
		"\u0159\7+\2\2\u0159\32\3\2\2\2\u015a\u015b\7.\2\2\u015b\34\3\2\2\2\u015c"+
		"\u015d\7\60\2\2\u015d\36\3\2\2\2\u015e\u0163\7$\2\2\u015f\u0162\5#\22"+
		"\2\u0160\u0162\n\6\2\2\u0161\u015f\3\2\2\2\u0161\u0160\3\2\2\2\u0162\u0165"+
		"\3\2\2\2\u0163\u0161\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0166\3\2\2\2\u0165"+
		"\u0163\3\2\2\2\u0166\u0167\7$\2\2\u0167 \3\2\2\2\u0168\u016d\7$\2\2\u0169"+
		"\u016c\5#\22\2\u016a\u016c\n\7\2\2\u016b\u0169\3\2\2\2\u016b\u016a\3\2"+
		"\2\2\u016c\u016f\3\2\2\2\u016d\u016b\3\2\2\2\u016d\u016e\3\2\2\2\u016e"+
		"\u0170\3\2\2\2\u016f\u016d\3\2\2\2\u0170\u0171\7\f\2\2\u0171\"\3\2\2\2"+
		"\u0172\u0173\7^\2\2\u0173\u0174\7$\2\2\u0174$\3\2\2\2\u0175\u0179\7}\2"+
		"\2\u0176\u0178\n\b\2\2\u0177\u0176\3\2\2\2\u0178\u017b\3\2\2\2\u0179\u017a"+
		"\3\2\2\2\u0179\u0177\3\2\2\2\u017a\u017c\3\2\2\2\u017b\u0179\3\2\2\2\u017c"+
		"\u017d\7\177\2\2\u017d\u017e\3\2\2\2\u017e\u017f\b\23\2\2\u017f&\3\2\2"+
		"\2\u0180\u0184\7}\2\2\u0181\u0183\n\t\2\2\u0182\u0181\3\2\2\2\u0183\u0186"+
		"\3\2\2\2\u0184\u0182\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0187\3\2\2\2\u0186"+
		"\u0184\3\2\2\2\u0187\u0188\7\f\2\2\u0188(\3\2\2\2\u0189\u018a\t\n\2\2"+
		"\u018a\u018b\3\2\2\2\u018b\u018c\b\25\2\2\u018c*\3\2\2\2\u018d\u018e\7"+
		"\f\2\2\u018e\u018f\3\2\2\2\u018f\u0190\b\26\2\2\u0190,\3\2\2\2\u0191\u0192"+
		"\13\2\2\2\u0192.\3\2\2\2\17\2\u0127\u012c\u0131\u0137\u013d\u014c\u0161"+
		"\u0163\u016b\u016d\u0179\u0184\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}