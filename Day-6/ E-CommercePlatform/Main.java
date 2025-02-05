// 2. E-Commerce Platform
// Description: Develop a simplified e-commerce platform:
// Create an abstract class Product with fields like productId, name, and price, and an abstract method calculateDiscount().
// Extend it into concrete classes: Electronics, Clothing, and Groceries.
// Implement an interface Taxable with methods calculateTax() and getTaxDetails() for applicable product categories.
// Use encapsulation to protect product details, allowing updates only through setter methods.
// Showcase polymorphism by creating a method that calculates and prints the final price (price + tax - discount) for a list of Product.
class Main {
    public static void main(String[] args) {
        Product product1 = new Electronics(101, "Laptop", 1000);
        Product product2 = new Clothing(102, "Shirt", 50);

        double finalPrice1 = product1.getPrice() + ((Taxable) product1).calculateTax() - product1.calculateDiscount();
        double finalPrice2 = product2.getPrice() + ((Taxable) product2).calculateTax() - product2.calculateDiscount();

        System.out.println("Final price of " + product1.getName() + ": $" + finalPrice1);
        System.out.println("Final price of " + product2.getName() + ": $" + finalPrice2);
    }
}
