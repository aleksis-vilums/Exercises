import java.util.Scanner;

public class SumOddInt {
	public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("N: ");
		int n = scanner.nextInt();

		int sum = 0;
		for(int i = 1; i <= n; i += 2){
			sum += i;
		}

        System.out.println("Sum: " + sum);
        System.out.println("N^2: " + (n*n));
	}	
}