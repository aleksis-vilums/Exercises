public class EmployeeTester{
    public static void main(String[] args) {
        Employee john = new Employee("John", "Adams", 15, 45, "Coding");

        System.out.println(john);

        john.print();

        System.out.println(john.equals(john));
    }
}