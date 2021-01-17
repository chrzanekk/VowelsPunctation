import java.util.List;

public class StringScore {
    private VowelCounter vowelCounter;
    private Vowels vowelList;

    public StringScore(VowelCounter vowelCounter) {
        this.vowelCounter = vowelCounter;
    }

    public int vowelScore(String userInput) {
        int score = 0;
        String[] split = userInput.split("\\s+");
        for (String string : split) {
            score += vowelCounter.punctation(vowelCounter.count(string));
        }
        return score;
    }
}
