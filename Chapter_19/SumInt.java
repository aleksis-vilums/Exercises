import java.util.Scanner;

public class SumInt {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter N: ");
		int n = scanner.nextInt();

        int i = 1;
        int sum = 0;

        while (i <= n){

            sum += i;

            i += 1;
        }

        System.out.println("Sum = " + sum);


	}	
}