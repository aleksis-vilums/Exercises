import java.util.Scanner;

public class DeviationN {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter N: ");
		int n = scanner.nextInt();
        
        int i = 0;
        double avrg = 0;
        double avrgSquare = 0;

		while(i < n){
            System.out.print("Enter Number: ");
            float num = scanner.nextFloat();

            avrg += num;
            avrgSquare += num * num;

            i += 1;
        }
        
        avrg = avrg/n;
        avrgSquare = avrgSquare/n;

        double SD = Math.sqrt( avrgSquare - (avrg * avrg));

        System.out.println("The average is " + avrg);
        System.out.println("The standard deviation is " + SD);

	}	
}