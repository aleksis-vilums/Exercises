import java.util.Scanner;

public class Brick {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number of seconds: ");
		double time = scanner.nextFloat();

		double distance = (0.5 * 32.174 * time * time);

		System.out.println("Distance: " + distance);
	}	
}