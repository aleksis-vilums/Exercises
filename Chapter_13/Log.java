import java.util.Scanner;

public class Log {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a double: ");
		double value = scanner.nextFloat();

		double answer = Math.log(value)/Math.log(2);

		System.out.println("Base 2 log of " + value + " is " + answer);
	}	
}