import java.util.Scanner;

public class Todo{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
		int option = 0;
		
		System.out.print("Add a New Task = 1\nUpdate Task = 2\nClear all Tasks = 3\nQuit = 4");
		int option = scanner.nextInt();

        while (option != 4){
            if (option == 1){
                System.out.println("Description? ");
                String description = scanner.nextLine();
                System.out.println("Due Date? ");
                String due = scanner.nextLine();
                System.out.println("Priorty? ");
                int priorty = scanner.nextInt();
                

                
            }
        }
        TodoClass app = new TodoClass("Homework", "Jan 1 2021", 1, false);

        System.out.println(app);

        app.addlist("Christmas", "Dec 25 2020", 2, false);

        System.out.println(app);

    }
}