import java.util.Scanner;

public class AnnualApplianceCost {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter cost per kilowatt-hour in cents: ");
        double cost = scanner.nextFloat();
    
        System.out.print("Enter kilowatt-hours used per year: ");
        double time = scanner.nextFloat();
    
        System.out.println("Annual cost: " + time*cost);
    }
}