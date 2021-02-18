import java.util.Scanner;

public class TriangleTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a integer:");
        int n = scanner.nextInt();
        if (n > 0){
            System.out.println(tri(n));
        } else {
            System.out.println("Oops, looks like the integer is not a postive\nPlease enter a postive integer");
        }
    }
    
    public static int tri(int n){
        if(n == 1){
            //base case
            return 1;
        } else {
            //recursion
            return n + tri(n - 1);
        }

    }
}