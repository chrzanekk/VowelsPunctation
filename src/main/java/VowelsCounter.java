import java.util.*;

public class VowelsCounter {
    private enum Vowel {
        A('a'),
        E('e'),
        I('i'),
        O('o'),
        U('u');
        private Character vowel;

        Vowel(Character vowel) {
            this.vowel = vowel;
        }

        public Character getVowel() {
            return vowel;
        }

        public static List<Character> listOfVowels() {
            List<Character> list = new LinkedList<>();
            for (Vowel vowel : Vowel.values()) {
                list.add(vowel.getVowel());
            }
            return list;
        }
    }


    public static int count(String word) {
        String clearWord = word.toLowerCase();
        int vowelCount = 0;
        List<Character> vowels = Vowel.listOfVowels();
        for (int i = 0; i < word.length(); i++) {
//            zmiana struktury danych (metoda contains).
//            for (Character vowel : Vowel.listOfVowels()) {
//                if (vowel.equals(word.toLowerCase().charAt(i))) {
//                    vowelCount++;
//                    break;
//                }
//            }
            if (vowels.contains(clearWord.charAt(i))) {
                vowelCount++;
            }
        }
        return vowelCount;
    }
}

