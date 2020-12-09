import java.io.*;
import java.util.Scanner;

public class SumInt {
    public static void main(String[] args) { 
        File file;
        Scanner scan;
        int num, total = 0;

        try {
            file = new File("Integers.csv");
            scan = new Scanner(file);

            while (scan.hasNextInt()){
                num = scan.nextInt();
                total += num;
            }

            System.out.println("Total: " + total);
        } catch (FileNotFoundException e){
            System.out.println("Error: The file does not exist");
        } finally {
            System.out.println("Done");
        }
    }
}