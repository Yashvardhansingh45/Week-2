// Sample Problem 2: Educational Course Hierarchy
// Description: Model a course system where Course is the base class, OnlineCourse is a subclass, and PaidOnlineCourse extends OnlineCourse.
// Tasks:
// Define a superclass Course with attributes like courseName and duration.
// Define OnlineCourse to add attributes such as platform and isRecorded.
// Define PaidOnlineCourse to add fee and discount.
// Goal: Demonstrate how each level of inheritance builds on the previous, adding complexity to the system.
// Subclass of Course
class OnlineCourse extends Course {
    String platform;
    boolean isRecorded;

    OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    void displayOnlineCourseInfo() {
        displayCourseInfo();
        System.out.println("Platform: " + platform + ", Recorded: " + (isRecorded ? "Yes" : "No"));
    }
}
