class Course {
    // Instance Variables
    String courseName;
    int duration; // in weeks
    double fee;

    // Class Variable
    static String instituteName = "Global Learning";

    // Constructor
    Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance Method to display course details
    void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
        System.out.println("Fee: $" + fee);
        System.out.println("Institute: " + instituteName);
    }

    // Class Method to update institute name
    static void updateInstituteName(String newName) {
        instituteName = newName;
    }
    public static void main(String[] args) {
        Course course1 = new Course("Java Programming", 12, 300.00);
        Course course2 = new Course("Web Development", 10, 250.00);

        course1.displayCourseDetails();
        course2.displayCourseDetails();

        Course.updateInstituteName("Tech Academy");
        System.out.println("\nAfter Updating Institute Name:");
        course1.displayCourseDetails();
        course2.displayCourseDetails();
    }
}
