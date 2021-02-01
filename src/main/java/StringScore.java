public class StringScore {
    public static int calculate(String userInput) {
        int score = 0;
        for (String string : userInput.split("\\s+")) {
            score += VowelScore.calculate(VowelsCounter.count(string));
        }
        return score;
    }
}
