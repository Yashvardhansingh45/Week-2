// Sample Problem 2: Educational Course Hierarchy
// Description: Model a course system where Course is the base class, OnlineCourse is a subclass, and PaidOnlineCourse extends OnlineCourse.
// Tasks:
// Define a superclass Course with attributes like courseName and duration.
// Define OnlineCourse to add attributes such as platform and isRecorded.
// Define PaidOnlineCourse to add fee and discount.
// Goal: Demonstrate how each level of inheritance builds on the previous, adding complexity to the system.
// Subclass of OnlineCourse
class PaidOnlineCourse extends OnlineCourse {
    double fee;
    double discount; // percentage

    PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    void displayPaidCourseInfo() {
        displayOnlineCourseInfo();
        double discountedFee = fee - (fee * discount / 100);
        System.out.println("Fee: $" + fee + ", Discount: " + discount + "%, Final Fee: $" + discountedFee);
    }
}

