import java.util.Scanner;

public class WordDots {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

		System.out.print("Enter first word: ");
        String word = scanner.nextLine();
        System.out.print("Enter second word: ");
        String word2 = scanner.nextLine();

        int sum = word.length() + word2.length();
        int dots = 30 - sum;

        int i = 1;

        System.out.print(word);
        while (i <= dots){

            System.out.print(".");

            i += 1;
        }
        System.out.print(word2);
    }
}