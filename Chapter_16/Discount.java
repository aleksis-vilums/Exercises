import java.util.Scanner;

public class Discount {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter amount of purchases: ");
        int cents = scanner.nextInt();

        if (cents >= 10){
            cents -= cents * 0.1;
        }

		System.out.println("Discount: " + cents);
    }
}