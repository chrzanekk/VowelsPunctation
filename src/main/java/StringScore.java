import java.util.List;

public class StringScore {
    private VowelCounter vowelCounter;


    public StringScore(VowelCounter vowelCounter) {
        this.vowelCounter = vowelCounter;
    }

    public int stringScore(String userInput) {
        int score = 0;
        String[] split = userInput.split("\\s+");
        for (String string : split) {
            score += vowelScore(vowelCounter.count(string));
        }
        return score;
    }

    private int vowelScore(int vowelCount) {
        if (vowelCount%2==0 && vowelCount!=0) {
            return 2;
        } else if (vowelCount%2!=0 && vowelCount!=0) {
            return 1;
        }
        return 0;
    }
}
