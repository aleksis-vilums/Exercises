import java.util.Scanner ;

public class ConeTester
{
  public static void main( String[] args ) {
    Scanner scanner = new Scanner(System.in);

    double radius, height;

    System.out.print("Enter radius: " ); 
    radius = scanner.nextDouble();

    System.out.print("Enter height: " ); 
    height = scanner.nextDouble();
 
    Cone cone = new Cone( radius, height );

    System.out.println("Area: "  + cone.area() + " Volume: " + cone.volume() );
    System.out.println("Slant Height: " + cone.slantHeight() + " Angle: " + cone.angle());
  }
}