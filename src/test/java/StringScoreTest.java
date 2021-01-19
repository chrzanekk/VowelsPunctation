import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringScoreTest {
    private static StringScore stringScore;

    @Before
    public void setUp() throws Exception {
        stringScore = new StringScore(new VowelCounter(Vowels.listOfVowels()));
    }

    @Test
    public void testMultipleStringScoreWithOddAndEvenVowelsInSingleStrings() {
        String sentence = "Ala ma kota";

        int result = stringScore.stringScore(sentence);

        assertEquals(5, result);
    }

    @Test
    public void testMultipleStringScoreWithOddAndEvenVowelsResultIsOdd() {
        String sentence = "Yarek lubi koty";

        int result = stringScore.stringScore(sentence);

        assertEquals(5, result);
    }

    @Test
    public void testMultipleStringScoreWithOddAndEvenVowelsResultIsEven() {
        String sentence = "Ala z kotem";

        int result = stringScore.stringScore(sentence);

        assertEquals(4, result);
    }

    @Test
    public void testMultipleStringScoreWithoutAnyVowelsResultIsZero() {
        String sentence = "ddd z ddd";

        int result = stringScore.stringScore(sentence);

        assertEquals(0, result);
    }
    @Test
    public void testSingleStringScoreWhitOddVowels() {
        String sentence = "Konrado";

        int result = stringScore.stringScore(sentence);

        assertEquals(1,result);
    }

    @Test
    public void testSingleStringScoreWhitEvenVowels() {
        String sentence = "Konrad";

        int result = stringScore.stringScore(sentence);

        assertEquals(2,result);
    }

    @Test
    public void testSingleStringScoreWithoutVowels() {
        String sentence = "Kkk";

        int result = stringScore.stringScore(sentence);

        assertEquals(0,result);
    }
}
