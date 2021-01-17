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
    public void testStringScoreWithOddAndEvenVowels() {
        String sentence = "Ala ma kota";

        int result = stringScore.vowelScore(sentence);

        assertEquals(5,result);
    }

    @Test
    public void testStringScoreWithOddAndEvenVowelsScoreIsOdd() {
        String sentence = "Yarek lubi koty";

        int result = stringScore.vowelScore(sentence);

        assertEquals(5,result);
    }

    @Test
    public void testStringScoreWithOddAndEvenVowelsScoreIsEven() {
        String sentence = "Ala z kotem";

        int result = stringScore.vowelScore(sentence);

        assertEquals(4,result);
    }

    @Test
    public void testStringScoreWithoutAnyVowels() {
        String sentence = "ddd z ddd";

        int result = stringScore.vowelScore(sentence);

        assertEquals(0,result);
    }
}
