public class PayrollTester {
    public static void main(String[] args){
        Employee johnEmployee = new Employee("John", "Cashier", 12.0, 0, 0);

        System.out.println(johnEmployee);

        johnEmployee.hours(8);
        johnEmployee.hours(1);
        johnEmployee.hours(9);

        System.out.println(johnEmployee);
    }

}