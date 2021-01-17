import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VowelCounterTest {
    private static VowelCounter vowelCounter;
    @Before
    public void setUp() throws Exception {
        vowelCounter = new VowelCounter(Vowels.listOfVowels());
    }

    @Test
    public void testStringWhitAtLeastOneVowel() {
        String word = "Ala";

        int result = vowelCounter.count(word);

        assertEquals(2,result);
    }

    @Test
    public void testStringWhitNoVowel() {
        String word = "DDD";

        int result = vowelCounter.count(word);

        assertEquals(0,result);
    }

    @Test
    public void testStringPunctationWhitOddVowel() {
        String word = "Konrado";

        int result = vowelCounter.punctation(vowelCounter.count(word));

        assertEquals(1,result);
    }

    @Test
    public void testStringPunctationWhitEvenVowel() {
        String word = "Konrad";

        int result = vowelCounter.punctation(vowelCounter.count(word));

        assertEquals(2,result);
    }
}
