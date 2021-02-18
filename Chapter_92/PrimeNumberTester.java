public class PrimeNumberTester {

    public static void main(String[] args) {
        System.out.println(PrimeNumber.prime(7, 6)); // true
        System.out.println(PrimeNumber.prime(34, 33)); // false
        System.out.println(PrimeNumber.prime(23, 22)); // true
        System.out.println(PrimeNumber.prime(20, 19)); // false
    }
}