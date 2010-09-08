package koopa.grammars.cobol.test;

import junit.framework.TestCase;
import koopa.parsers.Parser;
import koopa.tokenizers.test.TestTokenizer;

import org.junit.Test;

public class FileDescriptionEntryTest extends TestCase {

  private static koopa.grammars.cobol.CobolGrammar grammar = new koopa.grammars.cobol.CobolGrammar();

    @Test
    public void testBlockContains_1() {
      Parser parser = grammar.blockContains();
      assertNotNull(parser);
      TestTokenizer tokenizer = new TestTokenizer("BLOCK", "CONTAINS", "1", "TO", 
        "7", "CHARACTERS");
      assertTrue(parser.accepts(tokenizer));
      assertEquals(6, tokenizer.getNumberOfProcessedTokens());
    }

    @Test
    public void testBlockContains_2() {
      Parser parser = grammar.blockContains();
      assertNotNull(parser);
      TestTokenizer tokenizer = new TestTokenizer("BLOCK", "CONTAINS", "1", "TO", 
        "7", "RECORDS");
      assertTrue(parser.accepts(tokenizer));
      assertEquals(6, tokenizer.getNumberOfProcessedTokens());
    }

    @Test
    public void testBlockContains_3() {
      Parser parser = grammar.blockContains();
      assertNotNull(parser);
      TestTokenizer tokenizer = new TestTokenizer("BLOCK", "CONTAINS", "1", "TO", 
        "7");
      assertTrue(parser.accepts(tokenizer));
      assertEquals(5, tokenizer.getNumberOfProcessedTokens());
    }

    @Test
    public void testBlockContains_4() {
      Parser parser = grammar.blockContains();
      assertNotNull(parser);
      TestTokenizer tokenizer = new TestTokenizer("BLOCK", "CONTAINS", "1", "CHARACTERS");
      assertTrue(parser.accepts(tokenizer));
      assertEquals(4, tokenizer.getNumberOfProcessedTokens());
    }

    @Test
    public void testBlockContains_5() {
      Parser parser = grammar.blockContains();
      assertNotNull(parser);
      TestTokenizer tokenizer = new TestTokenizer("BLOCK", "CONTAINS", "1", "RECORDS");
      assertTrue(parser.accepts(tokenizer));
      assertEquals(4, tokenizer.getNumberOfProcessedTokens());
    }

    @Test
    public void testBlockContains_6() {
      Parser parser = grammar.blockContains();
      assertNotNull(parser);
      TestTokenizer tokenizer = new TestTokenizer("BLOCK", "CONTAINS", "1");
      assertTrue(parser.accepts(tokenizer));
      assertEquals(3, tokenizer.getNumberOfProcessedTokens());
    }

    @Test
    public void testBlockContains_7() {
      Parser parser = grammar.blockContains();
      assertNotNull(parser);
      TestTokenizer tokenizer = new TestTokenizer("BLOCK", "1", "TO", "7", "CHARACTERS");
      assertTrue(parser.accepts(tokenizer));
      assertEquals(5, tokenizer.getNumberOfProcessedTokens());
    }

    @Test
    public void testBlockContains_8() {
      Parser parser = grammar.blockContains();
      assertNotNull(parser);
      TestTokenizer tokenizer = new TestTokenizer("BLOCK", "1", "TO", "7", "RECORDS");
      assertTrue(parser.accepts(tokenizer));
      assertEquals(5, tokenizer.getNumberOfProcessedTokens());
    }

    @Test
    public void testBlockContains_9() {
      Parser parser = grammar.blockContains();
      assertNotNull(parser);
      TestTokenizer tokenizer = new TestTokenizer("BLOCK", "1", "TO", "7");
      assertTrue(parser.accepts(tokenizer));
      assertEquals(4, tokenizer.getNumberOfProcessedTokens());
    }

    @Test
    public void testBlockContains_10() {
      Parser parser = grammar.blockContains();
      assertNotNull(parser);
      TestTokenizer tokenizer = new TestTokenizer("BLOCK", "1", "CHARACTERS");
      assertTrue(parser.accepts(tokenizer));
      assertEquals(3, tokenizer.getNumberOfProcessedTokens());
    }

    @Test
    public void testBlockContains_11() {
      Parser parser = grammar.blockContains();
      assertNotNull(parser);
      TestTokenizer tokenizer = new TestTokenizer("BLOCK", "1", "RECORDS");
      assertTrue(parser.accepts(tokenizer));
      assertEquals(3, tokenizer.getNumberOfProcessedTokens());
    }

    @Test
    public void testBlockContains_12() {
      Parser parser = grammar.blockContains();
      assertNotNull(parser);
      TestTokenizer tokenizer = new TestTokenizer("BLOCK", "1");
      assertTrue(parser.accepts(tokenizer));
      assertEquals(2, tokenizer.getNumberOfProcessedTokens());
    }

    @Test
    public void testCodeSet_13() {
      Parser parser = grammar.codeSet();
      assertNotNull(parser);
      TestTokenizer tokenizer = new TestTokenizer("CODE-SET", "IS", "MY-ALPHABET-NAME");
      assertTrue(parser.accepts(tokenizer));
      assertEquals(3, tokenizer.getNumberOfProcessedTokens());
    }

    @Test
    public void testCodeSet_14() {
      Parser parser = grammar.codeSet();
      assertNotNull(parser);
      TestTokenizer tokenizer = new TestTokenizer("CODE-SET", "MY-ALPHABET-NAME");
      assertTrue(parser.accepts(tokenizer));
      assertEquals(2, tokenizer.getNumberOfProcessedTokens());
    }

    @Test
    public void testDataRecords_15() {
      Parser parser = grammar.dataRecords();
      assertNotNull(parser);
      TestTokenizer tokenizer = new TestTokenizer("DATA", "RECORD", "IS", "MY-DATA-NAME");
      assertTrue(parser.accepts(tokenizer));
      assertEquals(4, tokenizer.getNumberOfProcessedTokens());
    }

    @Test
    public void testDataRecords_16() {
      Parser parser = grammar.dataRecords();
      assertNotNull(parser);
      TestTokenizer tokenizer = new TestTokenizer("DATA", "RECORD", "IS", "MY-DATA-NAME", 
        "MY-OTHER-DATA-NAME");
      assertTrue(parser.accepts(tokenizer));
      assertEquals(5, tokenizer.getNumberOfProcessedTokens());
    }

    @Test
    public void testDataRecords_17() {
      Parser parser = grammar.dataRecords();
      assertNotNull(parser);
      TestTokenizer tokenizer = new TestTokenizer("DATA", "RECORD", "ARE", "MY-DATA-NAME");
      assertTrue(parser.accepts(tokenizer));
      assertEquals(4, tokenizer.getNumberOfProcessedTokens());
    }

    @Test
    public void testDataRecords_18() {
      Parser parser = grammar.dataRecords();
      assertNotNull(parser);
      TestTokenizer tokenizer = new TestTokenizer("DATA", "RECORD", "ARE", "MY-DATA-NAME", 
        "MY-OTHER-DATA-NAME");
      assertTrue(parser.accepts(tokenizer));
      assertEquals(5, tokenizer.getNumberOfProcessedTokens());
    }

    @Test
    public void testDataRecords_19() {
      Parser parser = grammar.dataRecords();
      assertNotNull(parser);
      TestTokenizer tokenizer = new TestTokenizer("DATA", "RECORD", "MY-DATA-NAME");
      assertTrue(parser.accepts(tokenizer));
      assertEquals(3, tokenizer.getNumberOfProcessedTokens());
    }

    @Test
    public void testDataRecords_20() {
      Parser parser = grammar.dataRecords();
      assertNotNull(parser);
      TestTokenizer tokenizer = new TestTokenizer("DATA", "RECORD", "MY-DATA-NAME", 
        "MY-OTHER-DATA-NAME");
      assertTrue(parser.accepts(tokenizer));
      assertEquals(4, tokenizer.getNumberOfProcessedTokens());
    }

    @Test
    public void testDataRecords_21() {
      Parser parser = grammar.dataRecords();
      assertNotNull(parser);
      TestTokenizer tokenizer = new TestTokenizer("DATA", "RECORDS", "IS", "MY-DATA-NAME");
      assertTrue(parser.accepts(tokenizer));
      assertEquals(4, tokenizer.getNumberOfProcessedTokens());
    }

    @Test
    public void testDataRecords_22() {
      Parser parser = grammar.dataRecords();
      assertNotNull(parser);
      TestTokenizer tokenizer = new TestTokenizer("DATA", "RECORDS", "IS", "MY-DATA-NAME", 
        "MY-OTHER-DATA-NAME");
      assertTrue(parser.accepts(tokenizer));
      assertEquals(5, tokenizer.getNumberOfProcessedTokens());
    }

    @Test
    public void testDataRecords_23() {
      Parser parser = grammar.dataRecords();
      assertNotNull(parser);
      TestTokenizer tokenizer = new TestTokenizer("DATA", "RECORDS", "ARE", "MY-DATA-NAME");
      assertTrue(parser.accepts(tokenizer));
      assertEquals(4, tokenizer.getNumberOfProcessedTokens());
    }

    @Test
    public void testDataRecords_24() {
      Parser parser = grammar.dataRecords();
      assertNotNull(parser);
      TestTokenizer tokenizer = new TestTokenizer("DATA", "RECORDS", "ARE", "MY-DATA-NAME", 
        "MY-OTHER-DATA-NAME");
      assertTrue(parser.accepts(tokenizer));
      assertEquals(5, tokenizer.getNumberOfProcessedTokens());
    }

    @Test
    public void testDataRecords_25() {
      Parser parser = grammar.dataRecords();
      assertNotNull(parser);
      TestTokenizer tokenizer = new TestTokenizer("DATA", "RECORDS", "MY-DATA-NAME");
      assertTrue(parser.accepts(tokenizer));
      assertEquals(3, tokenizer.getNumberOfProcessedTokens());
    }

    @Test
    public void testDataRecords_26() {
      Parser parser = grammar.dataRecords();
      assertNotNull(parser);
      TestTokenizer tokenizer = new TestTokenizer("DATA", "RECORDS", "MY-DATA-NAME", 
        "MY-OTHER-DATA-NAME");
      assertTrue(parser.accepts(tokenizer));
      assertEquals(4, tokenizer.getNumberOfProcessedTokens());
    }

    @Test
    public void testDataRecords_27() {
      Parser parser = grammar.dataRecords();
      assertNotNull(parser);
      TestTokenizer tokenizer = new TestTokenizer("RECORD", "IS", "MY-DATA-NAME");
      assertTrue(parser.accepts(tokenizer));
      assertEquals(3, tokenizer.getNumberOfProcessedTokens());
    }

    @Test
    public void testDataRecords_28() {
      Parser parser = grammar.dataRecords();
      assertNotNull(parser);
      TestTokenizer tokenizer = new TestTokenizer("RECORD", "IS", "MY-DATA-NAME", 
        "MY-OTHER-DATA-NAME");
      assertTrue(parser.accepts(tokenizer));
      assertEquals(4, tokenizer.getNumberOfProcessedTokens());
    }

    @Test
    public void testDataRecords_29() {
      Parser parser = grammar.dataRecords();
      assertNotNull(parser);
      TestTokenizer tokenizer = new TestTokenizer("RECORD", "ARE", "MY-DATA-NAME");
      assertTrue(parser.accepts(tokenizer));
      assertEquals(3, tokenizer.getNumberOfProcessedTokens());
    }

    @Test
    public void testDataRecords_30() {
      Parser parser = grammar.dataRecords();
      assertNotNull(parser);
      TestTokenizer tokenizer = new TestTokenizer("RECORD", "ARE", "MY-DATA-NAME", 
        "MY-OTHER-DATA-NAME");
      assertTrue(parser.accepts(tokenizer));
      assertEquals(4, tokenizer.getNumberOfProcessedTokens());
    }

    @Test
    public void testDataRecords_31() {
      Parser parser = grammar.dataRecords();
      assertNotNull(parser);
      TestTokenizer tokenizer = new TestTokenizer("RECORD", "MY-DATA-NAME");
      assertTrue(parser.accepts(tokenizer));
      assertEquals(2, tokenizer.getNumberOfProcessedTokens());
    }

    @Test
    public void testDataRecords_32() {
      Parser parser = grammar.dataRecords();
      assertNotNull(parser);
      TestTokenizer tokenizer = new TestTokenizer("RECORD", "MY-DATA-NAME", "MY-OTHER-DATA-NAME");
      assertTrue(parser.accepts(tokenizer));
      assertEquals(3, tokenizer.getNumberOfProcessedTokens());
    }

    @Test
    public void testDataRecords_33() {
      Parser parser = grammar.dataRecords();
      assertNotNull(parser);
      TestTokenizer tokenizer = new TestTokenizer("RECORDS", "IS", "MY-DATA-NAME");
      assertTrue(parser.accepts(tokenizer));
      assertEquals(3, tokenizer.getNumberOfProcessedTokens());
    }

    @Test
    public void testDataRecords_34() {
      Parser parser = grammar.dataRecords();
      assertNotNull(parser);
      TestTokenizer tokenizer = new TestTokenizer("RECORDS", "IS", "MY-DATA-NAME", 
        "MY-OTHER-DATA-NAME");
      assertTrue(parser.accepts(tokenizer));
      assertEquals(4, tokenizer.getNumberOfProcessedTokens());
    }

    @Test
    public void testDataRecords_35() {
      Parser parser = grammar.dataRecords();
      assertNotNull(parser);
      TestTokenizer tokenizer = new TestTokenizer("RECORDS", "ARE", "MY-DATA-NAME");
      assertTrue(parser.accepts(tokenizer));
      assertEquals(3, tokenizer.getNumberOfProcessedTokens());
    }

    @Test
    public void testDataRecords_36() {
      Parser parser = grammar.dataRecords();
      assertNotNull(parser);
      TestTokenizer tokenizer = new TestTokenizer("RECORDS", "ARE", "MY-DATA-NAME", 
        "MY-OTHER-DATA-NAME");
      assertTrue(parser.accepts(tokenizer));
      assertEquals(4, tokenizer.getNumberOfProcessedTokens());
    }

    @Test
    public void testDataRecords_37() {
      Parser parser = grammar.dataRecords();
      assertNotNull(parser);
      TestTokenizer tokenizer = new TestTokenizer("RECORDS", "MY-DATA-NAME");
      assertTrue(parser.accepts(tokenizer));
      assertEquals(2, tokenizer.getNumberOfProcessedTokens());
    }

    @Test
    public void testDataRecords_38() {
      Parser parser = grammar.dataRecords();
      assertNotNull(parser);
      TestTokenizer tokenizer = new TestTokenizer("RECORDS", "MY-DATA-NAME", "MY-OTHER-DATA-NAME");
      assertTrue(parser.accepts(tokenizer));
      assertEquals(3, tokenizer.getNumberOfProcessedTokens());
    }

    @Test
    public void testLabelRecords_39() {
      Parser parser = grammar.labelRecords();
      assertNotNull(parser);
      TestTokenizer tokenizer = new TestTokenizer("LABEL", "RECORD", "IS", "OMITTED");
      assertTrue(parser.accepts(tokenizer));
      assertEquals(4, tokenizer.getNumberOfProcessedTokens());
    }

    @Test
    public void testLabelRecords_40() {
      Parser parser = grammar.labelRecords();
      assertNotNull(parser);
      TestTokenizer tokenizer = new TestTokenizer("LABEL", "RECORD", "IS", "STANDARD");
      assertTrue(parser.accepts(tokenizer));
      assertEquals(4, tokenizer.getNumberOfProcessedTokens());
    }

    @Test
    public void testLabelRecords_41() {
      Parser parser = grammar.labelRecords();
      assertNotNull(parser);
      TestTokenizer tokenizer = new TestTokenizer("LABEL", "RECORD", "IS", "MY-DATA-NAME");
      assertTrue(parser.accepts(tokenizer));
      assertEquals(4, tokenizer.getNumberOfProcessedTokens());
    }

    @Test
    public void testLabelRecords_42() {
      Parser parser = grammar.labelRecords();
      assertNotNull(parser);
      TestTokenizer tokenizer = new TestTokenizer("LABEL", "RECORD", "IS", "MY-DATA-NAME", 
        "MY-OTHER-DATA-NAME");
      assertTrue(parser.accepts(tokenizer));
      assertEquals(5, tokenizer.getNumberOfProcessedTokens());
    }

    @Test
    public void testLabelRecords_43() {
      Parser parser = grammar.labelRecords();
      assertNotNull(parser);
      TestTokenizer tokenizer = new TestTokenizer("LABEL", "RECORD", "ARE", "OMITTED");
      assertTrue(parser.accepts(tokenizer));
      assertEquals(4, tokenizer.getNumberOfProcessedTokens());
    }

    @Test
    public void testLabelRecords_44() {
      Parser parser = grammar.labelRecords();
      assertNotNull(parser);
      TestTokenizer tokenizer = new TestTokenizer("LABEL", "RECORD", "ARE", "STANDARD");
      assertTrue(parser.accepts(tokenizer));
      assertEquals(4, tokenizer.getNumberOfProcessedTokens());
    }

    @Test
    public void testLabelRecords_45() {
      Parser parser = grammar.labelRecords();
      assertNotNull(parser);
      TestTokenizer tokenizer = new TestTokenizer("LABEL", "RECORD", "ARE", "MY-DATA-NAME");
      assertTrue(parser.accepts(tokenizer));
      assertEquals(4, tokenizer.getNumberOfProcessedTokens());
    }

    @Test
    public void testLabelRecords_46() {
      Parser parser = grammar.labelRecords();
      assertNotNull(parser);
      TestTokenizer tokenizer = new TestTokenizer("LABEL", "RECORD", "ARE", "MY-DATA-NAME", 
        "MY-OTHER-DATA-NAME");
      assertTrue(parser.accepts(tokenizer));
      assertEquals(5, tokenizer.getNumberOfProcessedTokens());
    }

    @Test
    public void testLabelRecords_47() {
      Parser parser = grammar.labelRecords();
      assertNotNull(parser);
      TestTokenizer tokenizer = new TestTokenizer("LABEL", "RECORD", "OMITTED");
      assertTrue(parser.accepts(tokenizer));
      assertEquals(3, tokenizer.getNumberOfProcessedTokens());
    }

    @Test
    public void testLabelRecords_48() {
      Parser parser = grammar.labelRecords();
      assertNotNull(parser);
      TestTokenizer tokenizer = new TestTokenizer("LABEL", "RECORD", "STANDARD");
      assertTrue(parser.accepts(tokenizer));
      assertEquals(3, tokenizer.getNumberOfProcessedTokens());
    }

    @Test
    public void testLabelRecords_49() {
      Parser parser = grammar.labelRecords();
      assertNotNull(parser);
      TestTokenizer tokenizer = new TestTokenizer("LABEL", "RECORD", "MY-DATA-NAME");
      assertTrue(parser.accepts(tokenizer));
      assertEquals(3, tokenizer.getNumberOfProcessedTokens());
    }

    @Test
    public void testLabelRecords_50() {
      Parser parser = grammar.labelRecords();
      assertNotNull(parser);
      TestTokenizer tokenizer = new TestTokenizer("LABEL", "RECORD", "MY-DATA-NAME", 
        "MY-OTHER-DATA-NAME");
      assertTrue(parser.accepts(tokenizer));
      assertEquals(4, tokenizer.getNumberOfProcessedTokens());
    }

    @Test
    public void testLabelRecords_51() {
      Parser parser = grammar.labelRecords();
      assertNotNull(parser);
      TestTokenizer tokenizer = new TestTokenizer("LABEL", "RECORDS", "IS", "OMITTED");
      assertTrue(parser.accepts(tokenizer));
      assertEquals(4, tokenizer.getNumberOfProcessedTokens());
    }

    @Test
    public void testLabelRecords_52() {
      Parser parser = grammar.labelRecords();
      assertNotNull(parser);
      TestTokenizer tokenizer = new TestTokenizer("LABEL", "RECORDS", "IS", "STANDARD");
      assertTrue(parser.accepts(tokenizer));
      assertEquals(4, tokenizer.getNumberOfProcessedTokens());
    }

    @Test
    public void testLabelRecords_53() {
      Parser parser = grammar.labelRecords();
      assertNotNull(parser);
      TestTokenizer tokenizer = new TestTokenizer("LABEL", "RECORDS", "IS", "MY-DATA-NAME");
      assertTrue(parser.accepts(tokenizer));
      assertEquals(4, tokenizer.getNumberOfProcessedTokens());
    }

    @Test
    public void testLabelRecords_54() {
      Parser parser = grammar.labelRecords();
      assertNotNull(parser);
      TestTokenizer tokenizer = new TestTokenizer("LABEL", "RECORDS", "IS", "MY-DATA-NAME", 
        "MY-OTHER-DATA-NAME");
      assertTrue(parser.accepts(tokenizer));
      assertEquals(5, tokenizer.getNumberOfProcessedTokens());
    }

    @Test
    public void testLabelRecords_55() {
      Parser parser = grammar.labelRecords();
      assertNotNull(parser);
      TestTokenizer tokenizer = new TestTokenizer("LABEL", "RECORDS", "ARE", "OMITTED");
      assertTrue(parser.accepts(tokenizer));
      assertEquals(4, tokenizer.getNumberOfProcessedTokens());
    }

    @Test
    public void testLabelRecords_56() {
      Parser parser = grammar.labelRecords();
      assertNotNull(parser);
      TestTokenizer tokenizer = new TestTokenizer("LABEL", "RECORDS", "ARE", "STANDARD");
      assertTrue(parser.accepts(tokenizer));
      assertEquals(4, tokenizer.getNumberOfProcessedTokens());
    }

    @Test
    public void testLabelRecords_57() {
      Parser parser = grammar.labelRecords();
      assertNotNull(parser);
      TestTokenizer tokenizer = new TestTokenizer("LABEL", "RECORDS", "ARE", "MY-DATA-NAME");
      assertTrue(parser.accepts(tokenizer));
      assertEquals(4, tokenizer.getNumberOfProcessedTokens());
    }

    @Test
    public void testLabelRecords_58() {
      Parser parser = grammar.labelRecords();
      assertNotNull(parser);
      TestTokenizer tokenizer = new TestTokenizer("LABEL", "RECORDS", "ARE", "MY-DATA-NAME", 
        "MY-OTHER-DATA-NAME");
      assertTrue(parser.accepts(tokenizer));
      assertEquals(5, tokenizer.getNumberOfProcessedTokens());
    }

    @Test
    public void testLabelRecords_59() {
      Parser parser = grammar.labelRecords();
      assertNotNull(parser);
      TestTokenizer tokenizer = new TestTokenizer("LABEL", "RECORDS", "OMITTED");
      assertTrue(parser.accepts(tokenizer));
      assertEquals(3, tokenizer.getNumberOfProcessedTokens());
    }

    @Test
    public void testLabelRecords_60() {
      Parser parser = grammar.labelRecords();
      assertNotNull(parser);
      TestTokenizer tokenizer = new TestTokenizer("LABEL", "RECORDS", "STANDARD");
      assertTrue(parser.accepts(tokenizer));
      assertEquals(3, tokenizer.getNumberOfProcessedTokens());
    }

    @Test
    public void testLabelRecords_61() {
      Parser parser = grammar.labelRecords();
      assertNotNull(parser);
      TestTokenizer tokenizer = new TestTokenizer("LABEL", "RECORDS", "MY-DATA-NAME");
      assertTrue(parser.accepts(tokenizer));
      assertEquals(3, tokenizer.getNumberOfProcessedTokens());
    }

    @Test
    public void testLabelRecords_62() {
      Parser parser = grammar.labelRecords();
      assertNotNull(parser);
      TestTokenizer tokenizer = new TestTokenizer("LABEL", "RECORDS", "MY-DATA-NAME", 
        "MY-OTHER-DATA-NAME");
      assertTrue(parser.accepts(tokenizer));
      assertEquals(4, tokenizer.getNumberOfProcessedTokens());
    }

    @Test
    public void testLinage_63() {
      Parser parser = grammar.linage();
      assertNotNull(parser);
      TestTokenizer tokenizer = new TestTokenizer("LINAGE", "IS", "10", "LINES");
      assertTrue(parser.accepts(tokenizer));
      assertEquals(4, tokenizer.getNumberOfProcessedTokens());
    }

    @Test
    public void testLinage_64() {
      Parser parser = grammar.linage();
      assertNotNull(parser);
      TestTokenizer tokenizer = new TestTokenizer("LINAGE", "IS", "MY-LINE-COUNT", 
        "LINES");
      assertTrue(parser.accepts(tokenizer));
      assertEquals(4, tokenizer.getNumberOfProcessedTokens());
    }

    @Test
    public void testLinage_65() {
      Parser parser = grammar.linage();
      assertNotNull(parser);
      TestTokenizer tokenizer = new TestTokenizer("LINAGE", "IS", "10");
      assertTrue(parser.accepts(tokenizer));
      assertEquals(3, tokenizer.getNumberOfProcessedTokens());
    }

    @Test
    public void testLinage_66() {
      Parser parser = grammar.linage();
      assertNotNull(parser);
      TestTokenizer tokenizer = new TestTokenizer("LINAGE", "IS", "MY-LINE-COUNT");
      assertTrue(parser.accepts(tokenizer));
      assertEquals(3, tokenizer.getNumberOfProcessedTokens());
    }

    @Test
    public void testLinage_67() {
      Parser parser = grammar.linage();
      assertNotNull(parser);
      TestTokenizer tokenizer = new TestTokenizer("LINAGE", "10", "LINES");
      assertTrue(parser.accepts(tokenizer));
      assertEquals(3, tokenizer.getNumberOfProcessedTokens());
    }

    @Test
    public void testLinage_68() {
      Parser parser = grammar.linage();
      assertNotNull(parser);
      TestTokenizer tokenizer = new TestTokenizer("LINAGE", "MY-LINE-COUNT", "LINES");
      assertTrue(parser.accepts(tokenizer));
      assertEquals(3, tokenizer.getNumberOfProcessedTokens());
    }

    @Test
    public void testLinage_69() {
      Parser parser = grammar.linage();
      assertNotNull(parser);
      TestTokenizer tokenizer = new TestTokenizer("LINAGE", "10");
      assertTrue(parser.accepts(tokenizer));
      assertEquals(2, tokenizer.getNumberOfProcessedTokens());
    }

    @Test
    public void testLinage_70() {
      Parser parser = grammar.linage();
      assertNotNull(parser);
      TestTokenizer tokenizer = new TestTokenizer("LINAGE", "MY-LINE-COUNT");
      assertTrue(parser.accepts(tokenizer));
      assertEquals(2, tokenizer.getNumberOfProcessedTokens());
    }

    @Test
    public void testLinage_71() {
      Parser parser = grammar.linage();
      assertNotNull(parser);
      TestTokenizer tokenizer = new TestTokenizer("LINAGE", "IS", "10", "LINES", 
        "WITH", "FOOTING", "AT", "20");
      assertTrue(parser.accepts(tokenizer));
      assertEquals(8, tokenizer.getNumberOfProcessedTokens());
    }

    @Test
    public void testLinage_72() {
      Parser parser = grammar.linage();
      assertNotNull(parser);
      TestTokenizer tokenizer = new TestTokenizer("LINAGE", "IS", "10", "LINES", 
        "WITH", "FOOTING", "AT", "MY-FOOTING");
      assertTrue(parser.accepts(tokenizer));
      assertEquals(8, tokenizer.getNumberOfProcessedTokens());
    }

    @Test
    public void testLinage_73() {
      Parser parser = grammar.linage();
      assertNotNull(parser);
      TestTokenizer tokenizer = new TestTokenizer("LINAGE", "IS", "10", "LINES", 
        "WITH", "FOOTING", "20");
      assertTrue(parser.accepts(tokenizer));
      assertEquals(7, tokenizer.getNumberOfProcessedTokens());
    }

    @Test
    public void testLinage_74() {
      Parser parser = grammar.linage();
      assertNotNull(parser);
      TestTokenizer tokenizer = new TestTokenizer("LINAGE", "IS", "10", "LINES", 
        "WITH", "FOOTING", "MY-FOOTING");
      assertTrue(parser.accepts(tokenizer));
      assertEquals(7, tokenizer.getNumberOfProcessedTokens());
    }

    @Test
    public void testLinage_75() {
      Parser parser = grammar.linage();
      assertNotNull(parser);
      TestTokenizer tokenizer = new TestTokenizer("LINAGE", "IS", "10", "LINES", 
        "FOOTING", "AT", "20");
      assertTrue(parser.accepts(tokenizer));
      assertEquals(7, tokenizer.getNumberOfProcessedTokens());
    }

    @Test
    public void testLinage_76() {
      Parser parser = grammar.linage();
      assertNotNull(parser);
      TestTokenizer tokenizer = new TestTokenizer("LINAGE", "IS", "10", "LINES", 
        "FOOTING", "AT", "MY-FOOTING");
      assertTrue(parser.accepts(tokenizer));
      assertEquals(7, tokenizer.getNumberOfProcessedTokens());
    }

    @Test
    public void testLinage_77() {
      Parser parser = grammar.linage();
      assertNotNull(parser);
      TestTokenizer tokenizer = new TestTokenizer("LINAGE", "IS", "10", "LINES", 
        "FOOTING", "20");
      assertTrue(parser.accepts(tokenizer));
      assertEquals(6, tokenizer.getNumberOfProcessedTokens());
    }

    @Test
    public void testLinage_78() {
      Parser parser = grammar.linage();
      assertNotNull(parser);
      TestTokenizer tokenizer = new TestTokenizer("LINAGE", "IS", "10", "LINES", 
        "FOOTING", "MY-FOOTING");
      assertTrue(parser.accepts(tokenizer));
      assertEquals(6, tokenizer.getNumberOfProcessedTokens());
    }

    @Test
    public void testLinage_79() {
      Parser parser = grammar.linage();
      assertNotNull(parser);
      TestTokenizer tokenizer = new TestTokenizer("LINAGE", "IS", "10", "LINES", 
        "LINES", "AT", "TOP", "2");
      assertTrue(parser.accepts(tokenizer));
      assertEquals(8, tokenizer.getNumberOfProcessedTokens());
    }

    @Test
    public void testLinage_80() {
      Parser parser = grammar.linage();
      assertNotNull(parser);
      TestTokenizer tokenizer = new TestTokenizer("LINAGE", "IS", "10", "LINES", 
        "LINES", "AT", "TOP", "MY-TOP");
      assertTrue(parser.accepts(tokenizer));
      assertEquals(8, tokenizer.getNumberOfProcessedTokens());
    }

    @Test
    public void testLinage_81() {
      Parser parser = grammar.linage();
      assertNotNull(parser);
      TestTokenizer tokenizer = new TestTokenizer("LINAGE", "IS", "10", "LINES", 
        "AT", "TOP", "2");
      assertTrue(parser.accepts(tokenizer));
      assertEquals(7, tokenizer.getNumberOfProcessedTokens());
    }

    @Test
    public void testLinage_82() {
      Parser parser = grammar.linage();
      assertNotNull(parser);
      TestTokenizer tokenizer = new TestTokenizer("LINAGE", "IS", "10", "LINES", 
        "AT", "TOP", "MY-TOP");
      assertTrue(parser.accepts(tokenizer));
      assertEquals(7, tokenizer.getNumberOfProcessedTokens());
    }

    @Test
    public void testLinage_83() {
      Parser parser = grammar.linage();
      assertNotNull(parser);
      TestTokenizer tokenizer = new TestTokenizer("LINAGE", "IS", "10", "LINES", 
        "LINES", "TOP", "2");
      assertTrue(parser.accepts(tokenizer));
      assertEquals(7, tokenizer.getNumberOfProcessedTokens());
    }

    @Test
    public void testLinage_84() {
      Parser parser = grammar.linage();
      assertNotNull(parser);
      TestTokenizer tokenizer = new TestTokenizer("LINAGE", "IS", "10", "LINES", 
        "LINES", "TOP", "MY-TOP");
      assertTrue(parser.accepts(tokenizer));
      assertEquals(7, tokenizer.getNumberOfProcessedTokens());
    }

    @Test
    public void testLinage_85() {
      Parser parser = grammar.linage();
      assertNotNull(parser);
      TestTokenizer tokenizer = new TestTokenizer("LINAGE", "IS", "10", "LINES", 
        "TOP", "2");
      assertTrue(parser.accepts(tokenizer));
      assertEquals(6, tokenizer.getNumberOfProcessedTokens());
    }

    @Test
    public void testLinage_86() {
      Parser parser = grammar.linage();
      assertNotNull(parser);
      TestTokenizer tokenizer = new TestTokenizer("LINAGE", "IS", "10", "LINES", 
        "TOP", "MY-TOP");
      assertTrue(parser.accepts(tokenizer));
      assertEquals(6, tokenizer.getNumberOfProcessedTokens());
    }

    @Test
    public void testLinage_87() {
      Parser parser = grammar.linage();
      assertNotNull(parser);
      TestTokenizer tokenizer = new TestTokenizer("LINAGE", "IS", "10", "LINES", 
        "LINES", "AT", "BOTTOM", "2");
      assertTrue(parser.accepts(tokenizer));
      assertEquals(8, tokenizer.getNumberOfProcessedTokens());
    }

    @Test
    public void testLinage_88() {
      Parser parser = grammar.linage();
      assertNotNull(parser);
      TestTokenizer tokenizer = new TestTokenizer("LINAGE", "IS", "10", "LINES", 
        "LINES", "AT", "BOTTOM", "MY-TOP");
      assertTrue(parser.accepts(tokenizer));
      assertEquals(8, tokenizer.getNumberOfProcessedTokens());
    }

    @Test
    public void testLinage_89() {
      Parser parser = grammar.linage();
      assertNotNull(parser);
      TestTokenizer tokenizer = new TestTokenizer("LINAGE", "IS", "10", "LINES", 
        "AT", "BOTTOM", "2");
      assertTrue(parser.accepts(tokenizer));
      assertEquals(7, tokenizer.getNumberOfProcessedTokens());
    }

    @Test
    public void testLinage_90() {
      Parser parser = grammar.linage();
      assertNotNull(parser);
      TestTokenizer tokenizer = new TestTokenizer("LINAGE", "IS", "10", "LINES", 
        "AT", "BOTTOM", "MY-TOP");
      assertTrue(parser.accepts(tokenizer));
      assertEquals(7, tokenizer.getNumberOfProcessedTokens());
    }

    @Test
    public void testLinage_91() {
      Parser parser = grammar.linage();
      assertNotNull(parser);
      TestTokenizer tokenizer = new TestTokenizer("LINAGE", "IS", "10", "LINES", 
        "LINES", "BOTTOM", "2");
      assertTrue(parser.accepts(tokenizer));
      assertEquals(7, tokenizer.getNumberOfProcessedTokens());
    }

    @Test
    public void testLinage_92() {
      Parser parser = grammar.linage();
      assertNotNull(parser);
      TestTokenizer tokenizer = new TestTokenizer("LINAGE", "IS", "10", "LINES", 
        "LINES", "BOTTOM", "MY-TOP");
      assertTrue(parser.accepts(tokenizer));
      assertEquals(7, tokenizer.getNumberOfProcessedTokens());
    }

    @Test
    public void testLinage_93() {
      Parser parser = grammar.linage();
      assertNotNull(parser);
      TestTokenizer tokenizer = new TestTokenizer("LINAGE", "IS", "10", "LINES", 
        "BOTTOM", "2");
      assertTrue(parser.accepts(tokenizer));
      assertEquals(6, tokenizer.getNumberOfProcessedTokens());
    }

    @Test
    public void testLinage_94() {
      Parser parser = grammar.linage();
      assertNotNull(parser);
      TestTokenizer tokenizer = new TestTokenizer("LINAGE", "IS", "10", "LINES", 
        "BOTTOM", "MY-TOP");
      assertTrue(parser.accepts(tokenizer));
      assertEquals(6, tokenizer.getNumberOfProcessedTokens());
    }

    @Test
    public void testFdFileDescriptionEntry_95() {
      Parser parser = grammar.fdFileDescriptionEntry();
      assertNotNull(parser);
      TestTokenizer tokenizer = new TestTokenizer("FD", "MY-FILE-NAME", ".");
      assertTrue(parser.accepts(tokenizer));
      assertEquals(3, tokenizer.getNumberOfProcessedTokens());
    }

    @Test
    public void testSdFileDescriptionEntry_96() {
      Parser parser = grammar.sdFileDescriptionEntry();
      assertNotNull(parser);
      TestTokenizer tokenizer = new TestTokenizer("SD", "MY-FILE-NAME", ".");
      assertTrue(parser.accepts(tokenizer));
      assertEquals(3, tokenizer.getNumberOfProcessedTokens());
    }
}