import java.util.Scanner;

public class LeastPositiveResidue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = 0, a2 = 1; // temp
        
        while(a != a2){
            System.out.print("Enter modulus M: ");
            int m = scan.nextInt();
            System.out.print("Enter argument A: ");
            a = scan.nextInt();
            System.out.println(leastPositiveResidue(a, m));
            
            if(a2 == a){
                break;
            }

            System.out.print("Enter modulus M: ");
            m = scan.nextInt();
            System.out.print("Enter argument A: ");
            a2 = scan.nextInt();
            System.out.println(leastPositiveResidue(a2, m));
            
        }

    }

    public static int leastPositiveResidue(int a, int m){
        //a - m 
        if(a <= m-1 && a >= 0){
            return a;
        } else if (a >= m){
            return leastPositiveResidue(a - m, m);
        } else {
            return leastPositiveResidue(a + m, m);
        }
    }
}