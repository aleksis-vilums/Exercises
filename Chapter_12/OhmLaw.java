import java.util.Scanner;

public class OhmLaw{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("V = ");
        int V = scanner.nextInt();
        System.out.println("R = ");
        int R = scanner.nextInt();
        System.out.println("I = " + (V + 0.0)/R);
    }
}