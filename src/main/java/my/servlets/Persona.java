package my.servlets;

public class Persona {

    private String firstName;
    private String lastName;
    private double salary;

//    консруктор
    public Persona(String firstName, String lastName, Double salary) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setSalary(salary);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
