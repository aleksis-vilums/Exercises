public class PentagonalNumber {
    public static void main(String[] args) {
        System.out.println(pent(3));
        System.out.println(pent(4));
        System.out.println(pent(2));
        System.out.println(pent(1));


    }

    public static int pent(int n){
        if (n == 1){
            return 1;
        } else {
            return pent(n - 1) + (3*(n-1)) + 1;
        }
    }

    //4 , 7, 10, 
}