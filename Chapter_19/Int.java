import java.util.Scanner;

public class Int {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter Start: ");
		int start = scanner.nextInt();
		System.out.print("Enter End: ");
        int end = scanner.nextInt();

        int i = 0;
        int difference = end - start;

        while (i <= difference){

            System.out.println(start + i);

            i += 1;
        }

	}	
}