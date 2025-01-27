
class Circle {
    // Attribute
    double radius;

    // Default Constructor
    Circle() {
        this(1.0); // Calls the parameterized constructor
    }

    // Parameterized Constructor
    Circle(double radius) {
        this.radius = radius;
    }

    // Calculate Area
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Display Circle Details
    void displayCircleDetails() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + calculateArea());
    }
    public static void main(String[] args) {
        // Default Constructor
        Circle circle1 = new Circle();
        System.out.println("Circle 1:");
        circle1.displayCircleDetails();

        // Parameterized Constructor
        Circle circle2 = new Circle(5.0);
        System.out.println("\nCircle 2:");
        circle2.displayCircleDetails();
    }
    }