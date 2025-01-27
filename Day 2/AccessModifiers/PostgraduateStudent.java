class Student {
    public int rollNumber;       // Public
    protected String name;       // Protected
    private double CGPA;         // Private

    // Constructor
    Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    // Public methods to access and modify CGPA
    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }
}

class PostgraduateStudent extends Student {
    PostgraduateStudent(int rollNumber, String name, double CGPA) {
        super(rollNumber, name, CGPA);
    }

    // Display Postgraduate Student Details
    void displayDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
    }
    public static void main(String[] args) {
        Student student = new Student(101, "John", 3.8);
        System.out.println("CGPA before update: " + student.getCGPA());
        student.setCGPA(4.0);
        System.out.println("CGPA after update: " + student.getCGPA());

        PostgraduateStudent pgStudent = new PostgraduateStudent(102, "Alice", 3.9);
        pgStudent.displayDetails();
    }
}
