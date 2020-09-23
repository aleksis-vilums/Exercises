import java.util.Scanner;

public class EchoWord {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

		System.out.print("Word: ");
        String word = scanner.nextLine();

        int length = word.length();

        int i = 1;

        while (i <= length){

            System.out.println(word);

            i += 1;
        }
    }
}