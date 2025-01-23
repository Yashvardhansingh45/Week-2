// Program to Simulate Student Report
// Problem Statement: Create a Student class with attributes name, rollNumber, and marks.
// Add two methods:To calculate the grade based on the marks.
// To display the student's details and grade.
// Explanation: The Student class organizes all relevant details about a student as attributes.
// Methods are used to calculate the grade and provide a way to display all information.
public class Student{
    // Attributes
    private String name;
    private int rollNumber;
    private double marks;
    private char grades;
    //constructor
    Student(String name, int rollnumber, double marks){
        this.name=name;
        this.rollNumber=rollnumber;
        this.marks=marks;
    }
    // method to calculate the grade based on marks
    char calculateGrade(){
        if(marks >= 90 && marks <= 100 ){
            this.grades='A';
        }
        else if (marks >= 70) {
            this.grades='B';
        }
        else if (marks >= 50) {
            this.grades='C';
        }
        else if (marks >= 33) {
            this.grades='D';
        }
        else {
            this.grades='F';
        }
        return grades;
    }
    void displayDetails(){
        System.out.println("Name of the student is: "+ name );
        System.out.println("Roll Number of the Student is:"+ rollNumber);
        System.out.println("Marks obtained by the Student is: "+ marks);
        System.out.println("Grade obtained by the Student is:" + grades);
    }
}