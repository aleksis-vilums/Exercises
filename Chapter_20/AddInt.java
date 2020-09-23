import java.util.Scanner;

public class AddInt {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		System.out.print("How many: ");
		int length = scanner.nextInt();
	
        int sum = 0;
        int i = 0;	
		while(i < length){
			System.out.print("Enter number: ");
            sum += scanner.nextInt();
            i += 1;
		}

		System.out.println("The sum is " + sum);

	}	
}