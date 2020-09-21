import java.util.Scanner;

public class Fantasy {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		System.out.print("Name: ");
		String name = scanner.nextLine();
		System.out.print("Enter strength (1-10): ");
        int strength = scanner.nextInt();
        System.out.print("Enter health (1-10): ");
        int health = scanner.nextInt();
        System.out.print("Enter luck (1-10): ");
        int luck = scanner.nextInt();

        if ((strength + health + luck) > 15){
            System.out.println("You have given your character too many points!" + "\nDefault values have been assigned:" + name + ", Strength: 5, Health: 5, Luck: 5");
        } else {
            System.out.println(name + ", Strength: " + strength + ", Health: " + health + ", Luck: " + luck);
        }

	}	
}