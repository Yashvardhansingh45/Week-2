class CarRental {
    // Attributes
    String customerName;
    String carModel;
    int rentalDays;
    double totalCost;

    // Default Constructor
    CarRental() {
        customerName = "Guest";
        carModel = "Standard";
        rentalDays = 1;
        totalCost = calculateCost();
    }

    // Parameterized Constructor
    CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.totalCost = calculateCost();
    }

    // Method to Calculate Cost
    private double calculateCost() {
        double dailyRate = switch (carModel.toLowerCase()) {
            case "suv" -> 50.0;
            case "sedan" -> 40.0;
            case "hatchback" -> 30.0;
            default -> 20.0;
        };
        return dailyRate * rentalDays;
    }

    // Display Rental Details
    void displayRentalDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: $" + totalCost);
    }
    public static void main(String[] args) {
        // Default Constructor
        CarRental rental1 = new CarRental();
        System.out.println("Rental 1:");
        rental1.displayRentalDetails();

        // Parameterized Constructor
        CarRental rental2 = new CarRental("Bob", "SUV", 3);
        System.out.println("\nRental 2:");
        rental2.displayRentalDetails();
    }
}