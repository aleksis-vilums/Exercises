public class PowNumber {
    public static void main(String[] args) {
        System.out.println(pow(5));
    }

    public static int pow(int n){
        if (n == 0){
            return 1;
        } else {
            return 2*pow(n - 1);
        }
    }
}