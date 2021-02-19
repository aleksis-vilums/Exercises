public class GCD {
    public static void main(String[] args) {
        System.out.println(greatCommonDivisor(6, 9));
        System.out.println(greatCommonDivisor(25, 55));
    }

    public static int greatCommonDivisor(int n, int d){
        if (n == 0){
            return d;
        } else {
            return greatCommonDivisor(d%n, n);
        }
    }
}