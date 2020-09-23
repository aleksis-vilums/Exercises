import java.util.Scanner;

public class HArmonicSum {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter N: ");
		int n = scanner.nextInt();
	
        double sum = 0;
        int i = 1;	
		while(i <= n){
            sum += 1.0f/i;
            i += 1;
		}

		System.out.println("The sum is " + sum);

	}	
}