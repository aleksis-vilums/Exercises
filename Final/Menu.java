import java.util.Scanner;
import java.io.*;

public class Menu {

    public static void main(String[] args) throws IOException{
        Scanner scan = new Scanner(System.in);

        System.out.println("Menu: \n1. Create New Game\n2. Validate a save file\n3. Reroll/Randomize an existing character\n4. Quit");
        int option = scan.nextInt();
        scan.nextLine();

        while (option != 4){
            if (option == 1){

                for (int i = 0; i < 4; i++){
                }
            }
        }

    }

}