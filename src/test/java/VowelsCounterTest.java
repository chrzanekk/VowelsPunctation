import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VowelsCounterTest {


    @Test
    public void testVowelCountStringWhitAtLeastOneVowel() {
        String sentence = "Ala";

        int result = VowelsCounter.count(sentence);

        assertEquals(2,result);
    }

    @Test
    public void testVowelCountStringHaveNoVowel() {
        String sentence = "DDD";

        int result = VowelsCounter.count(sentence);

        assertEquals(0,result);
    }

    @Test
    public void testVowelCountWhitEmptyString() {
        String sentence = "";

        int result = VowelsCounter.count(sentence);

        assertEquals(0,result);
    }

//    do omówienia na lekcji
    @Test
    public void testVowelCountWhitNull() {
        String sentence = null;

        int result = VowelsCounter.count(sentence);

        assertEquals(0,result);
    }
}
