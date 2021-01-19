import java.util.List;
import java.util.Locale;

public class VowelCounter {
    public List<Character> vowels;

    public VowelCounter(List<Character> vowels) {
        this.vowels = vowels;
    }

    public int count(String word) {
        int vowelCount = 0;
        for (int i = 0; i < word.length(); i++) {
            for (Character vowel : vowels) {
                if (vowel.equals(word.toLowerCase().charAt(i))) {
                    vowelCount++;
                }
            }
        }
        return vowelCount;
    }
}
