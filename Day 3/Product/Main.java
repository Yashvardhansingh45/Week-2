// Main class
public class Main {
    public static void main(String[] args) {
        // create product objects
        Product product1 = new Product("Laptop", 45000, 10);
        Product product2 = new Product("Mobile", 15000, 20);
        
        // update discount
        Product.updateDiscount(1000);
        
        // display product details
        product1.displayDetails();
        product2.displayDetails();
    }
}
