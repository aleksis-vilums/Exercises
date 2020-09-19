import java.util.Scanner;

public class CircleArea{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input the radius: ");

        int rad = scanner.nextInt();

        System.out.println("Radius = " + (Math.PI * rad * rad));
    }
}