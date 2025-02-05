
// Main class for testing
class Main{
    public static void main(String[] args) {
        Vehicle car = new Car("C001", "Alice", 5);
        Vehicle bike = new Bike("B001", "Bob", 2);

        car.getVehicleDetails();
        System.out.println("Car Fare: $" + car.calculateFare(10));

        bike.getVehicleDetails();
        System.out.println("Bike Fare: $" + bike.calculateFare(10));
    }
}
