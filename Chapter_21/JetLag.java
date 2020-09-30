import java.util.Scanner;

public class JetLag {
	public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
		System.out.print("Enter Hours: ");
		double hours = scanner.nextFloat();
		System.out.print("Enter Zones: ");
        int zones = scanner.nextInt();
        System.out.print("Depart: ");
        int departTime = scanner.nextInt();
        System.out.print("Arrive: ");
        int arriveTime = scanner.nextInt();

        int depart = 0;

        if (departTime >= 12 && departTime <= 18){
            depart = 1;
        } else if (departTime >= 18 && departTime <= 22){
            depart = 3;
        } else if (departTime >= 22 && departTime <= 1){
            depart = 4;
        } else if (departTime >= 1 && departTime <= 8){
            depart = 5;
        }

        int arrive = 4;

        if (arriveTime >= 12 && arriveTime <= 18){
            arrive = 2;
        } else if (arriveTime >= 18 && arriveTime <= 22){
            arrive = 0;
        } else if (arriveTime >= 22 && arriveTime <= 1){
            arrive = 1;
        } else if (arriveTime >= 1 && arriveTime <= 8){
            arrive = 3;
        }

        double recovery = (hours/2.0 + (zones - 3.0) + depart + arrive)/10;

		System.out.println("Days of Recovery: " + recovery);
	}	
}