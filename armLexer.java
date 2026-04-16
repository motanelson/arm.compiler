// Generated from arm.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class armLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, REGISTER=9, 
		LABEL=10, INT=11, WS=12, COMMENT=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "REGISTER", 
			"LABEL", "INT", "WS", "COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'MOV'", "','", "'ADD'", "'SUB'", "'MUL'", "'CMP'", "'B'", "'#'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "REGISTER", "LABEL", 
			"INT", "WS", "COMMENT"
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


	public armLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "arm.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\17Y\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4"+
		"\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3"+
		"\n\6\n:\n\n\r\n\16\n;\3\13\3\13\7\13@\n\13\f\13\16\13C\13\13\3\f\6\fF"+
		"\n\f\r\f\16\fG\3\r\6\rK\n\r\r\r\16\rL\3\r\3\r\3\16\3\16\7\16S\n\16\f\16"+
		"\16\16V\13\16\3\16\3\16\2\2\17\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\3\2\7\3\2\62;\5\2C\\aac|\6\2\62;C\\aac|\5\2\13"+
		"\f\17\17\"\"\4\2\f\f\17\17\2]\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\3\35\3\2\2\2\5"+
		"!\3\2\2\2\7#\3\2\2\2\t\'\3\2\2\2\13+\3\2\2\2\r/\3\2\2\2\17\63\3\2\2\2"+
		"\21\65\3\2\2\2\23\67\3\2\2\2\25=\3\2\2\2\27E\3\2\2\2\31J\3\2\2\2\33P\3"+
		"\2\2\2\35\36\7O\2\2\36\37\7Q\2\2\37 \7X\2\2 \4\3\2\2\2!\"\7.\2\2\"\6\3"+
		"\2\2\2#$\7C\2\2$%\7F\2\2%&\7F\2\2&\b\3\2\2\2\'(\7U\2\2()\7W\2\2)*\7D\2"+
		"\2*\n\3\2\2\2+,\7O\2\2,-\7W\2\2-.\7N\2\2.\f\3\2\2\2/\60\7E\2\2\60\61\7"+
		"O\2\2\61\62\7R\2\2\62\16\3\2\2\2\63\64\7D\2\2\64\20\3\2\2\2\65\66\7%\2"+
		"\2\66\22\3\2\2\2\679\7T\2\28:\t\2\2\298\3\2\2\2:;\3\2\2\2;9\3\2\2\2;<"+
		"\3\2\2\2<\24\3\2\2\2=A\t\3\2\2>@\t\4\2\2?>\3\2\2\2@C\3\2\2\2A?\3\2\2\2"+
		"AB\3\2\2\2B\26\3\2\2\2CA\3\2\2\2DF\t\2\2\2ED\3\2\2\2FG\3\2\2\2GE\3\2\2"+
		"\2GH\3\2\2\2H\30\3\2\2\2IK\t\5\2\2JI\3\2\2\2KL\3\2\2\2LJ\3\2\2\2LM\3\2"+
		"\2\2MN\3\2\2\2NO\b\r\2\2O\32\3\2\2\2PT\7B\2\2QS\n\6\2\2RQ\3\2\2\2SV\3"+
		"\2\2\2TR\3\2\2\2TU\3\2\2\2UW\3\2\2\2VT\3\2\2\2WX\b\16\2\2X\34\3\2\2\2"+
		"\b\2;AGLT\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}