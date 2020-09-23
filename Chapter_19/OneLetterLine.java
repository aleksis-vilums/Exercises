import java.util.Scanner;

public class OneLetterLine {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

		System.out.print("Enter word: ");
        String word = scanner.nextLine();

        int i = 0;

        while (i < word.length()) {

            System.out.println(word.charAt(i));

            i += 1;
        }
    }
}