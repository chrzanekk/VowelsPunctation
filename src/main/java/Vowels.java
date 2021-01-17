import java.util.ArrayList;
import java.util.List;

public enum Vowels {
    A('a'),
    E('e'),
    I('i'),
    O('o'),
    U('u');
    private Character vowel;

    Vowels(Character vowel) {
        this.vowel = vowel;
    }

    public Character getVowel() {
        return vowel;
    }

    public static List<Character> listOfVowels(){
        List<Character> list = new ArrayList<>();
        for(Vowels vowels : Vowels.values()) {
            list.add(vowels.getVowel());
        }
        return list;
    }
}
