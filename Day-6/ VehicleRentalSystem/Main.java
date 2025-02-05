// 3 .Vehicle Rental System
// Description: Design a system to manage vehicle rentals:
// Define an abstract class Vehicle with fields like vehicleNumber, type, and rentalRate.
// Add an abstract method calculateRentalCost(int days).
// Create subclasses Car, Bike, and Truck with specific implementations of calculateRentalCost().
// Use an interface Insurable with methods calculateInsurance() and getInsuranceDetails().
// Apply encapsulation to restrict access to sensitive details like insurance policy numbers.
// Demonstrate polymorphism by iterating over a list of vehicles and calculating rental and insurance costs for each.
//MAin class-
class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("1234", "Car", 100);
        Vehicle bike = new Bike("5678", "Bike", 30);
        Vehicle truck = new Truck("91011", "Truck", 200);

        System.out.println("Car rental cost: " + car.calculateRentalCost(3));
        System.out.println("Bike rental cost: " + bike.calculateRentalCost(5));
        System.out.println("Truck rental cost: " + truck.calculateRentalCost(2));

        System.out.println(((Insurable) car).getInsuranceDetails());
        System.out.println(((Insurable) bike).getInsuranceDetails());
        System.out.println(((Insurable) truck).getInsuranceDetails());
    }
}
