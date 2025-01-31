// Vehicle and Transport System
// Description: Design a vehicle hierarchy where Vehicle is the superclass, and Car, Truck, and Motorcycle
// are subclasses with unique attributes.
// Tasks:
// Define a superclass Vehicle with maxSpeed and fuelType attributes and a method displayInfo().
// Define subclasses Car, Truck, and Motorcycle, each with additional attributes, such as seatCapacity for Car.
// Demonstrate polymorphism by storing objects of different subclasses in an array of Vehicle type and calling displayInfo() on each.
// Goal: Understand how inheritance helps in organizing shared and unique features across subclasses
// and use polymorphism for dynamic method calls.
//main class
class Main {
    public static void main(String []args){
//        creatring objects
        Vehicle car = new Car(200,"petrol",5);
        Vehicle truck = new Truck (100,"Deisel",10000);
        Vehicle motorcycle = new Motorcycle (150,"Petrol",true);

        Vehicle [] vehicles= {car,truck,motorcycle};

        for (Vehicle vehicle : vehicles) {
            vehicle.displayInfo();
            System.out.println();
        }
    }
}