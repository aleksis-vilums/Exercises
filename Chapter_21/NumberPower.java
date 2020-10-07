import java.util.Scanner;
public class NumberPower {
	public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
       
        System.out.print("Enter X: ");
		double x = scanner.nextDouble();
		System.out.print("Enter N: ");
		int n = scanner.nextInt();

		double power = 1;
		int i = 0;

        if (n < 0){
            System.out.println("N must be positive");
        } else {
            while (i < n){
                power *= x;
                i += 1;
            }
        }
		System.out.println("Answer is " + power);
	}	
}