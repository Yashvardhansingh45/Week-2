// Sample Problem 2: School System with Different Roles
// Description: Create a hierarchy for a school system where Person is the superclass, and Teacher, Student, and Staff are subclasses.
// Tasks:
// Define a superclass Person with common attributes like name and age.
// Define subclasses Teacher, Student, and Staff with specific attributes (e.g., subject for Teacher and grade for Student).
// Each subclass should have a method like displayRole() that describes the role.
// Goal: Demonstrate hierarchical inheritance by modeling different roles in a school, each with shared and unique characteristics.
// Subclass Teacher
class Teacher extends Person {
    String subject;

    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    void displayRole() {
        System.out.println("Role: Teacher, Subject: " + subject);
    }
}
