import java.util.Scanner;

public class Movie {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		System.out.print("Age? ");
		int age = scanner.nextInt();
		System.out.print("Time? ");
		int time = scanner.nextInt();
        
        int price = 0;

        if (time < 1700){
            if (age > 13){
                price = 5;
            } else {
                price = 2;
            }
        } else {
            if (age > 13){
                price = 8;
            } else {
                price = 4;
            }
        }

        System.out.println("Price: " + price + " dollars");

	}	
}