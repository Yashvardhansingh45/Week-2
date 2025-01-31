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
class Truck extends Vehicle{
    //    Attributes
    private int loadCapacity;

    //  constructor
    Truck(int maxSpeed, String fuelType, int loadCapacity){
        super(maxSpeed,fuelType);
        this.loadCapacity=loadCapacity;
    }

    //  method to display info
    void displayInfo(){
        super.displayInfo();
        System.out.println("Load capacity of the vehicle is:"+loadCapacity);
    }
}