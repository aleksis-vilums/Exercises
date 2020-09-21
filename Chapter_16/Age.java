import java.util.Scanner;

public class Age {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter years: ");
		int year = scanner.nextInt();
		System.out.print("Enter months: ");
		int month = scanner.nextInt();
		System.out.print("Enter days: ");
        int day = scanner.nextInt();
        
        int days = 0;

        for(int i = 0; i < month; i++){
            if(i != 1){
                days += (i % 2  == 0 ? 1 : 0) + 30;
            } else {
                days += 28;
            }
        }

        int sec = day + days + (year*365);
        int seconds = sec*86400;

        System.out.println("Seconds: " + seconds);
        System.out.println("Percentage: " + (seconds/2500000000.f)*100);

	}	
}