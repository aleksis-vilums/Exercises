import java.util.Scanner;

public class CorrectChange{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input the Cents: ");

        int cent = scanner.nextInt();

        System.out.println(cent/100 + " dollars and " + cent % 100 + " cents");
    }
}