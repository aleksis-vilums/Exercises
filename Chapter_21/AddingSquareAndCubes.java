import java.util.Scanner;
public class AddingSquareAndCubes {
	public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
		System.out.print("Upper Limit: ");
		int n = scanner.nextInt();

		int square = 0;
		int i = 0;

		while (i <= n){
			square += i * i;
			i += 1;
		}

		int cube = 0;
		int x = 0;

		while (x <= n){
			cube += x * x * x;
			x += 1;
		}

		System.out.println("The sum of Squares is " + square);
		System.out.println("The sum of Cubes is " + cube);
	}	
}