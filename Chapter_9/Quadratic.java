public class Quadratic{
    public static void main( String[] args){

        double x, value;

        x = 0;
        value = 3*Math.pow(x, 2) - 8*x + 4;
        System.out.println("At X = " + x + " the value is " + value);

        x = 2;
        value = 3*Math.pow(x, 2) - 8*x + 4;
        System.out.println("At X = " + x + " the value is " + value);

        x = 4;
        value = 3*Math.pow(x, 2) - 8*x + 4;
        System.out.println("At X = " + x + " the value is " + value);
    }
}