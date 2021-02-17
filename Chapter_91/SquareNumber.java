public class SquareNumber {
    public static void main(String[] args) {
        System.out.println(squareNumber(4));
    }

    public static int squareNumber(int n){
        if(n == 1){
            return 1;
        } else {
            return squareNumber(n - 1) + (2*n) - 1;
        }
    }
}