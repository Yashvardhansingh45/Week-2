// 3 .Vehicle Rental System
// Description: Design a system to manage vehicle rentals:
// Define an abstract class Vehicle with fields like vehicleNumber, type, and rentalRate.
// Add an abstract method calculateRentalCost(int days).
// Create subclasses Car, Bike, and Truck with specific implementations of calculateRentalCost().
// Use an interface Insurable with methods calculateInsurance() and getInsuranceDetails().
// Apply encapsulation to restrict access to sensitive details like insurance policy numbers.
// Demonstrate polymorphism by iterating over a list of vehicles and calculating rental and insurance costs for each.
//subclass
class Truck extends Vehicle implements Insurable {
    public Truck(String vehicleNumber, String type, double rentalRate) {
        super(vehicleNumber, type, rentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return days * getRentalRate() * 1.5; // Trucks have higher rental cost
    }

    @Override
    public double calculateInsurance() {
        return 500;
    }

    @Override
    public String getInsuranceDetails() {
        return "Truck insurance: $500";
    }
}
