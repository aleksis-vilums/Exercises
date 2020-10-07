import java.util.Scanner;

public class RangeAdder {
	public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Low end of range: ");
        int low = scanner.nextInt();
        System.out.print("High end of range: ");
        int high = scanner.nextInt();
        System.out.print("Enter Data: ");
        int data = scanner.nextInt();

        int sum1 = 0;
        int sum2 = 0;
        
        while (data != 0){
            if (data >= low && data <= high){
                sum1 += data;
            } else {
                sum2 += data;
            }

            System.out.print("Enter Data: ");
            data = scanner.nextInt();
        }

        System.out.println("Sum of in range values: " + sum1);
        System.out.println("Sum of out of range values: " + sum2);
	}	
}