import java.util.Scanner;

public class FurtherSubFun{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter String: ");
		String string = scanner.nextLine();
		System.out.print("Enter beginning index: ");
		int start = scanner.nextInt();
		System.out.print("Enter ending index: ");
		int end = scanner.nextInt();

		String sub = string.substring(start, end);

		System.out.println("Original string: " + string);
		System.out.println("Substring: " + sub);
    }
}