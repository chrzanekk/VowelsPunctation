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
        String sentence = "DDD";

        int result = vowelCounter.count(sentence);

        assertEquals(0,result);
    }


}
