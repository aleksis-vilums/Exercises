public class LogNumber {
    public static void main(String[] args) {
        System.out.println(logNumber(32));
    }

    public static int logNumber(int n){
        if(n == 1){
            return 0;
        } else {
            return 1 + logNumber(n/2);
        }
    }
}