public class Person{
    private String firstName, lastName;
    private Person x;

    Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setName(String fName, String lName){
        firstName = fName;
        lastName = lName;
    }

    public void printLastFirst(){
        System.out.println(lastName + ", " + firstName);
    }

    public void print(){
        System.out.println(firstName + " " + lastName);
    }

    public String toString(){
        return lastName + ", " + firstName;
    }

    public boolean equals(Object o){
        if (o.toString().equals(toString())){
            return true;
        }

        return false;
    }

    public void copy(Object x){
        x = new Person(getFirstName(), getLastName());
    }

    public Person getCopy(){
        return x;
    }

}