public class Employee extends Person{
    private double payRate;
    private double hoursWorked;
    private String department;
    private Employee x;

    public final int HOURS = 40;
    public final double OVERTIME = 1.5;

    public Employee(){
        super("", "");
        payRate = 0;
        hoursWorked = 0;
        department = "";
    }

    public Employee(String firstName, String lastName, double payRate, double hoursWorked, String department){
        super(firstName, lastName);
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
        this.department = department;
    }

    public double calculatePay(){
        double wage = 0;
        if(hoursWorked > HOURS){
            double overtimeHours = hoursWorked - HOURS;
            double wage2 = overtimeHours * (payRate * OVERTIME);
            double wage1 = 40*payRate;
            wage = wage1 + wage2;
        } else {
            wage = hoursWorked*payRate;
        }

        return wage;
    }

    public String toString(){
        return "The wages for " + super.toString() + " from the " + department + " deparment are: $" + calculatePay();
    }

    public void print(){
        System.out.println("The employee " + super.toString() + " from the " + department + " deparment worked " + hoursWorked + " hours with a pay rate of " + payRate + ". The wages for this employee are $" + calculatePay());
    }

    public void setAll(String fName, String lName, double rate, double hours, String dep){
        super.setName(fName, lName);
        payRate = rate;
        hoursWorked = hours;
        department = dep;
    }

    public double getPayRate() {
        return payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public String getDepartment() {
        return department;
    }

    public boolean equals(Object o) {
        return super.equals(o);
    }

    public void copy(Employee x) {
        super.copy(x);
    }

    public Employee getCopy() {
        return x = new Employee(getFirstName(), getLastName(), getPayRate(), getHoursWorked(), getDepartment());
    }

}