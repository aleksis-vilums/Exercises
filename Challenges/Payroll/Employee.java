public class Employee{

    //variables declare
    private String name, position;
    private double wage, hours, totalHours;
    private int id;

    //Constructor
    Employee(String name, String position, double wage, double hours, double totalHours){
        this.name = name;
        this.position = position;
        this.wage = wage;
        this.hours = hours;
        this.totalHours = totalHours;
        id += 1;
    }

    //Setters
    public String setName(String name){
        this.name = name;
    }

    public String setPosition(String position){
        this.position = position;
    }

    public float setWage(float wage){
        this.wage = wage;
    }

    //Getters
    public String getName(){
        return this.name;
    }

    public String getPosition(){
        return this.position;
    }

    public double getWage(){
        return this.wage;
    }

    //Hours
    public void hours(float hours){
        this.hours += hours;
    }

    //Total hours

    //String
    public String toString(){
        String employee = new String ("Name: " + name + "\nPostion: " + position + "\nWage: " + wage + "\nHours: " + hours + "\n ");

        return employee;
    }
}