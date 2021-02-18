public class TriangleNumber {
    public static void main(String[] args) {
        System.out.println(triNumber(1));
        System.out.println(triNumber(2));
        System.out.println(triNumber(3));
        System.out.println(triNumber(4));
    }
//  1, 3, 6, 10, 15
    public static int triNumber(int n){
        if (n == 0){
            return 0;
        } else if (n == 1){
            return 1;
        } else if (n%2 == 1){
            return 3*triNumber(n/2) + triNumber((n/2) + 1);
        } else {
            return 3*triNumber(n/2) + triNumber((n/2) - 1);
        }

    }
}