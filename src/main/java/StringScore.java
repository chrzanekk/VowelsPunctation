public class StringScore {
    private VowelCounter vowelCounter;
    private VowelScore vowelScore;


    public StringScore(VowelCounter vowelCounter, VowelScore vowelScore) {
        this.vowelCounter = vowelCounter;
        this.vowelScore = vowelScore;
    }

    public int calculate(String userInput) {
        int score = 0;
        String[] split = userInput.split("\\s+");
        for (String string : split) {
            score += vowelScore.calculate(vowelCounter.count(string));
        }
        return score;
    }


}
