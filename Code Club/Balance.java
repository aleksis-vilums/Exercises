import java.util.Scanner;

public class Balance {
	
	public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
		double bal = 0.f;
		
		System.out.print("Transaction: ");
		double money = scanner.nextDouble();
        bal += money;
	
		while (money != 0){
            
			if (bal <= 250 && bal - money > 250){
				System.out.printf("WARNING: Your balance of $%.2f is less than $250\n", bal);
			} else if (bal <= 0){
				System.out.printf("ALERT: Your account has a negative balance of $%.2f\n", bal);
			}

            System.out.print("Transaction: ");
		    money = scanner.nextDouble();
			bal += money;
			
        }
		
		System.out.printf("Your final balance is $%.2f\n", bal);
	}

}
