public class VowelScore {

    public static int calculate(int vowelCount) {
        if (vowelCount % 2 == 0 && vowelCount != 0) {
            return 2;
        } else if (vowelCount % 2 != 0) {
            return 1;
        }
        return 0;
    }
}
