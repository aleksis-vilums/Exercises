import java.util.Scanner;

public class Wind {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter Wind Speed: ");
		double v = scanner.nextDouble();
		System.out.print("Enter Temperature: ");
		double temp = scanner.nextDouble();

        double wind = 0;
        if (v > 3 && temp < 50){
            wind = 35.74 + 0.6215*temp - 35.75*Math.pow(v, 0.16) + 0.4275*temp*Math.pow(v, 0.16);
        } else if (v < 3){
            wind = v;
        } else if (temp > 50){
            wind = temp;
        }

		System.out.println("Wind Chill: " + wind);

	}	
}