import java.util.Scanner;

public class Wedge {
    
	public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
       
        System.out.print("Enter Stars: ");
		int stars = scanner.nextInt();

        int i = stars;
        int x = 0;
        
        while (i > 0){
            while (x < i){
                System.out.print("*");
                x += 1;
            }
            System.out.println();
            i -= 1;
            x = 0;
        }
	}	
}