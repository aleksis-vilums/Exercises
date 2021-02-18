public class PrimeNumber {
    public static boolean prime(int n, int d){
        if (d == 1){
            return true;
        } else if (n % d == 0){
            return false;
        } else {
            return prime(n, d - 1);
        }
    }
}