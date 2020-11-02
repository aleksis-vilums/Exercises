import java.util.Scanner;

public class CylinderTester{

    public static void main( String args[]) {
    Scanner scanner = new Scanner(System.in);

    double r, h;

    System.out.print("Enter radius: " ); 
    r = scanner.nextDouble();

    System.out.print("Enter height: " ); 
    h = scanner.nextDouble();
 
    Cylinder c = new Cylinder( r, h );

    System.out.println("Volume: " + c.volume() + " Surface: " + c.surface());
    }
}