import java.util.Scanner;
import java.io.*;

// chapter 72 1-6
// chapter 73 1, 2

public class io {
    public static void main(String[] args) throws IOException{ 
        System.out.println("Input/Output Example");

        PrintWriter output = new PrintWriter("output.md");
        
        output.println("New Data");
        output.close();

        // File file;
        // Scanner scan;

        // try {
        //     file = new File("data.csv"); 
        //     scan = new Scanner(file);
            
        //     // while (scan.hasNextLine()){
        //     //     String letter = scan.nextLine();
        //     //     System.out.println("The next line: " + letter);
        //     // }
            
        //     // String letter = scan.nextLine();
            
        //     String[] letters = scan.nextLine().split(",");

        //     for (String letter : letters){
        //         System.out.println(letter);
        //     }

        //     int num = scan.nextInt();
        //     String word = scan.next();

        //     System.out.println(letters[0]);
        //     System.out.println(num);
        //     System.out.println(word);

        // } catch (FileNotFoundException e){
        //     System.out.println("Error: The file does not exist");
        // } finally {
        //     System.out.println("Done");
        // }

        //exception -> IoException

        //throws -> some other code handles it, not my problem
        //try/catch -> we manage it ourselves
    }
}