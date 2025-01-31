// Sample Problem 2: Educational Course Hierarchy
// Description: Model a course system where Course is the base class, OnlineCourse is a subclass, and PaidOnlineCourse extends OnlineCourse.
// Tasks:
// Define a superclass Course with attributes like courseName and duration.
// Define OnlineCourse to add attributes such as platform and isRecorded.
// Define PaidOnlineCourse to add fee and discount.
// Goal: Demonstrate how each level of inheritance builds on the previous, adding complexity to the system.
// Main class
public class Main {
    public static void main(String[] args) {
        Course course = new Course("Java Basics", 40);
        course.displayCourseInfo();

        OnlineCourse onlineCourse = new OnlineCourse("Advanced Java", 60, "Udemy", true);
        onlineCourse.displayOnlineCourseInfo();

        PaidOnlineCourse paidOnlineCourse = new PaidOnlineCourse("Spring Framework", 80, "Coursera", true, 200, 15);
        paidOnlineCourse.displayPaidCourseInfo();
    }
}