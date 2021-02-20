public class CountChar {
    public static void main(String[] args) {
        System.out.println(countChar( "XaaaYaaaZaaaYaaaaY", 'Y'));
    }

    public static int countChar(String sentence, char letter){
        if (sentence.isEmpty()){
            return 0;
        } else if (sentence.charAt(0) == letter){
            return 1 + countChar(sentence.substring(1), letter);
        } else {
            return countChar(sentence.substring(1), letter);
        }
    }
}