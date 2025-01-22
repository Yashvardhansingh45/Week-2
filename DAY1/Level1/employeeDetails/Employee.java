
public class Employee{
    // Attributes
    private String name;
    private int id;
    private double salary;
    // Constructor
    public Employee(String name, int id, double salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    // method to display the details
    public void displayDetails() {
        System.out.println("Name of the Employee: " + name);
        System.out.println("ID of the Employee: "+ id);
        System.out.println("Salary of the Employee: "+ salary);
    }
}