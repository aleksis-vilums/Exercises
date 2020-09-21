import java.util.Scanner;

public class Delicatessen {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the item: ");
		String item = scanner.nextLine();
		System.out.print("Enter the price: ");
        double price = scanner.nextDouble();
        System.out.print("Overnight delivery? ");
        int delivery = scanner.nextInt();

        double deliveryPrice = 0;

        if (price < 10 && delivery == 0){
            deliveryPrice = 2;
        } else if (price < 10 && delivery == 1){
            deliveryPrice = 5;
        } else if (price >= 10 && delivery == 1){
            deliveryPrice = 3;
        }

		System.out.println("Invoice: \n" + item + ": "+ price + "\nDelivery: " + deliveryPrice + "\nTotal: " + (price + deliveryPrice));

	}	
}