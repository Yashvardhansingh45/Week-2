// Vehicle and Transport System
// Description: Design a vehicle hierarchy where Vehicle is the superclass, and Car, Truck, and Motorcycle
// are subclasses with unique attributes.
// Tasks:
// Define a superclass Vehicle with maxSpeed and fuelType attributes and a method displayInfo().
// Define subclasses Car, Truck, and Motorcycle, each with additional attributes, such as seatCapacity for Car.
// Demonstrate polymorphism by storing objects of different subclasses in an array of Vehicle type and calling displayInfo() on each.
// Goal: Understand how inheritance helps in organizing shared and unique features across subclasses
// and use polymorphism for dynamic method calls.

//subclass car
class Car extends Vehicle{
//    Attributes
    private int seatCapacity;

//  constructor
    Car(int maxSpeed, String fuelType, int seatCapacity){
        super(maxSpeed,fuelType);
        this.seatCapacity=seatCapacity;
    }

//  method to display info
    void displayInfo(){
        super.displayInfo();
        System.out.println("Seat capacity of the vehicle is:"+seatCapacity);
    }
}