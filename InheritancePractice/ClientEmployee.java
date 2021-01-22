import java.util.Scanner;

public class ClientEmployee {

    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);

        String last, first, dept;
        double pay_rate;
        int hours;

        Employee prof = new Employee("John", "Doe", 25.50, 50, "COSC"); 
        Employee newEmp = new Employee();

        System.out.println("Enter Employee last name: ");
        last = scanner.nextLine();
        System.out.println("Enter Employee first name: ");
        first = scanner.nextLine();
        System.out.println("Enter Department: ");
        dept = scanner.nextLine();
        System.out.println("Enter employee pay rate: ");
        pay_rate = scanner.nextInt();
        System.out.println("Enter employee hours worked: ");
        hours = scanner.nextInt();

        newEmp.setAll(first, last, pay_rate, hours, dept);

        System.out.println(prof);
        System.out.println(newEmp);

        prof.print();
        newEmp.print();

        if(!newEmp.equals(prof)){
            System.out.println("Couldn't find an employee with same record.");
        }




    }

}

 