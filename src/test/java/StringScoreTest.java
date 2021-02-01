import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringScoreTest {


    @Test
    public void testMultipleStringScoreWithOddAndEvenVowelsInSingleStrings() {
        String sentence = "Ala ma kota";

        int result = StringScore.calculate(sentence);

        assertEquals(5, result);
    }

    @Test
    public void testMultipleStringScoreWithOddAndEvenVowelsResultIsOdd() {
        String sentence = "Yarek lubi koty";

        int result = StringScore.calculate(sentence);

        assertEquals(5, result);
    }

    @Test
    public void testMultipleStringScoreWithOddAndEvenVowelsResultIsEven() {
        String sentence = "Ala z kotem";

        int result = StringScore.calculate(sentence);

        assertEquals(4, result);
    }

    @Test
    public void testMultipleStringScoreWithoutAnyVowelsResultIsZero() {
        String sentence = "ddd z ddd";

        int result = StringScore.calculate(sentence);

        assertEquals(0, result);
    }

    @Test
    public void testSingleStringScoreWhitOddVowels() {
        String sentence = "Konrado";

        int result = StringScore.calculate(sentence);

        assertEquals(1, result);
    }

    @Test
    public void testSingleStringScoreWhitEvenVowels() {
        String sentence = "Konrad";

        int result = StringScore.calculate(sentence);

        assertEquals(2, result);
    }

    @Test
    public void testSingleStringScoreWithoutVowels() {
        String sentence = "Kkk";

        int result = StringScore.calculate(sentence);

        assertEquals(0, result);
    }

    @Test
    public void testStringScoreWithEmptyString() {
        String sentence = "";

        int result = StringScore.calculate(sentence);

        assertEquals(0, result);
    }

    @Test
    public void testStringScoreWithNull() {
        String sentence = "";

        int result = StringScore.calculate(sentence);

        assertEquals(0, result);
    }
}
