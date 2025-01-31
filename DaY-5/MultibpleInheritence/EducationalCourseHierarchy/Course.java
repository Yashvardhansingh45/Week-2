// Sample Problem 2: Educational Course Hierarchy
// Description: Model a course system where Course is the base class, OnlineCourse is a subclass, and PaidOnlineCourse extends OnlineCourse.
// Tasks:
// Define a superclass Course with attributes like courseName and duration.
// Define OnlineCourse to add attributes such as platform and isRecorded.
// Define PaidOnlineCourse to add fee and discount.
// Goal: Demonstrate how each level of inheritance builds on the previous, adding complexity to the system.
// Base class
class Course {
    String courseName;
    int duration; // in hours

    Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    void displayCourseInfo() {
        System.out.println("Course: " + courseName + ", Duration: " + duration + " hours");
    }
}

