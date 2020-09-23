import java.util.Scanner;

public class SumRangeInt {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter low: ");
        int low = scanner.nextInt();
        System.out.print("Enter high: ");
        int high = scanner.nextInt();

        int sum = 0;

        while (low <= high){

            sum += low;

            low += 1;
        }

        System.out.println("Sum = " + sum);


	}	
}