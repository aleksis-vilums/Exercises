import java.io.*;
import java.util.Scanner;

public class AvgStndrd {
    public static void main(String[] args) { 
        File file;
        Scanner scan;
        double num, total = 0, avg = 0, sd = 0, totalNum = 0, sumSQ = 0;

        try {
            file = new File("Doubles.csv");
            scan = new Scanner(file);

            while (scan.hasNextDouble()){
                num = scan.nextDouble();
                total += num;
                sumSQ += num * num;
                totalNum += 1;
            }

            avg = total/totalNum;
            sd = Math.sqrt((sumSQ/totalNum) - (avg * avg));

            System.out.println("Average: " + avg);
            System.out.println("Standard Deviation: " + sd);

        } catch (FileNotFoundException e){
            System.out.println("Error: The file does not exist");
        } finally {
            System.out.println("Done");

        }
    }
}