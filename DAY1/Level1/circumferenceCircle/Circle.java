//Program to Compute Area of a Circle
//Problem Statement: Write a program to create a Circle class with an attribute radius.
// Add methods to calculate and display the area and circumference of the circle.
class Circle{
    //Attributes
    double radius;
    double pi =3.14;
    // Constructor
    Circle(double radius){
        this.radius=radius;
    }
    // method to calculate and display the area of the circle
    void calculateArea(){
        System.out.println("Area of Circle is: "+ (radius*radius*pi));
    }
    // method to calculate and display the circumference of the circle
    void calculacteCircumference(){
        System.out.println("Circumference of Circle is: "+(2*pi*radius));
    }
}