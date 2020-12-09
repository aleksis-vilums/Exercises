import java.io.*;
import java.util.Scanner;

public class NumFilter {
    public static void main(String[] args) { 
        File file;
        Scanner scan;
        Scanner scanner = new Scanner(System.in);

        System.out.println("File from? ");
        String og = scanner.nextLine();
        
        System.out.println("Negative file? ");
        String neg = scanner.nextLine();

        System.out.println("Postive file? ");
        String pos = scanner.nextLine();

        try {
            file = new File(og);
            scan = new Scanner(file);
            PrintWriter positiveOutput = new PrintWriter(neg);
            PrintWriter negativeOutput = new PrintWriter(pos);

            while (scan.hasNextLine()){
                int num = scan.nextInt();
                if (num >= 0){
                    positiveOutput.println(num);
                } else {
                    negativeOutput.println(num);
                }
            }

            positiveOutput.close();
            negativeOutput.close();
            scanner.close();

        } catch (FileNotFoundException e){
            System.out.println("Error: The file does not exist");
        } finally {
            System.out.println("Done");

        }
    }
}