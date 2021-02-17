import java.util.Scanner;

public class WhileLoops {

    public static void main(String[] args){

        // countable 
        int count = 0;
        while(count < 10){
            System.out.println(count);

            count =+ 1;
        }

        // for loop

        // uncountable
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        while(!password.equals("password")){
            System.out.print("Enter password: ");
            password = scanner.nextLine();
        }

        int x = 1;
        while(x > 0){
            x = 0;
            System.out.println("In loop");
            x = 1;
        }

        //infinite loop

        while(true){
            // forever

            //ctrl c in console to terminate
        }

        int z = 0;
        while (z < 100){
            System.out.println("Oops, z does not change")
        }

        int foo = 0;
        while(foo < 10){
            int bar = 1;
            foo++;
        }

    }
}