import java.util.Scanner;

public class WeekTemp {

	public static void main (String[] args) {
        String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursady", "Friday", "Saturday"};
        
        int temps[] = new int[7];
        
        int ans = 0;

        Scanner scanner = new Scanner(System.in);
        
		for (int i = 0; i < 7; i++){
            System.out.print(daysOfWeek[i] + " temp: ");
			temps[i] = Integer.parseInt(scanner.nextLine());
			ans += temps[i];
		}		

		for (int i = 0; i < 7; i++){
			System.out.print(daysOfWeek[i] + ": " + temps[i] + "F ");
        }
        
        ans /= 7;

		System.out.println("\b\nWeekly Average: " + ans + "F");

	}

}