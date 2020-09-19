import java.util.Scanner;

public class OhmLaw{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("V = ");
        int V = scanner.nextInt();
        System.out.print("R = ");
        int R = scanner.nextInt();
        System.out.println("I = " + (V + 0.0)/R);
    }
}