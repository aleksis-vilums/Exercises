import java.util.Scanner;

public class MPG {
	public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Initial: ");
        int initial = scanner.nextInt();
        
        while (initial >= 0){
            System.out.print("Final: ");
            int f = scanner.nextInt();
            System.out.print("Gallons: ");
            int gallons = scanner.nextInt();

            floats mpg = (f - initial)/gallons;

            System.out.println("MPG: " + mpg);

            System.out.print("Initial: ");
            initial = scanner.nextInt();
            
        }
	}	
}