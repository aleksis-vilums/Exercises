import java.util.Set;

public class Vowels {
    public static void main(String[] args) {
        System.out.println(removeVowels("counterrevolutionaries"));
    }

    public static String removeVowels(String sentence){
        if (sentence.length() == 1){
            if (!isAVowel(sentence.substring(0, 1))){
                return "";
            } else {
                return sentence.substring(0, 1);
            }
        } else if (isAVowel(sentence.substring(0, 1))){
            return "" + removeVowels(sentence.substring(1));
        } else {
            return sentence.substring(0, 1) + removeVowels(sentence.substring(1));
        }
    }

    public static boolean isAVowel(String letter){
		if(letter.length() != 1){
            return false;
        } else {
            return letter.toLowerCase().matches("[aeiou]");
        }
	}
}