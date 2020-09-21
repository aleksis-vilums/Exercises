import java.util.Scanner;

public class Microwave {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		System.out.print("How many items to heat: ");
		int items = scanner.nextInt();
		System.out.print("Time for one item: ");
        int time = scanner.nextInt();

        int heating = 0;

        if (items == 1){
            heating = time;
        } else if (items == 2){
            heating = time + (time/2);
        } else if (items == 3){
            heating = time*2;
        } else {
            System.out.println("Heating not recommended");
        }

        int minutes = heating/100;
        int sec = heating % 100;

		System.out.println("Recomended heating time: " + minutes + " minutes " + sec + " seconds");

	}	
}