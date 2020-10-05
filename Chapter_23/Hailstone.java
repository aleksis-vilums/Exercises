import java.util.Scanner;

public class Hailstone {
	public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Initial: ");
        int initial = scanner.nextInt();
        
        while (initial != 1){
            if (initial%2 == 0){
                initial /= 2;
            } else {
                initial = 3*initial + 1;
            }
            System.out.println(initial);
            
        }
	}	
}