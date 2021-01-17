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

    public int punctation(int vowelCount) {
        if (vowelCount%2==0 && vowelCount!=0) {
            return 2;
        } else if (vowelCount%2!=0 && vowelCount!=0) {
            return 1;
        }
        return 0;
    }

}
