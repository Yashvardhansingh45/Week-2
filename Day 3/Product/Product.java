// create a class Product

public class Product {
    
    // instance variables
    String productName;
    double Price;
    int quantity;

    // class variables
    static int discount ;

    // constructor
    public Product(String productName, double Price, int quantity) {
        this.productName = productName;
        this.Price = Price;
        this.quantity = quantity;
    }

    // static method to update discount
    public static void updateDiscount(int newDiscount) {
        discount = newDiscount;
    }

    // method to display product details
    void displayDetails(){
        if(this instanceof Product) {
            System.out.println("Product Name: " + productName);
            System.out.println("Price: " + Price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Discount: " + discount);
        }
        else {
            System.out.println("Invalid Product");
        }
    }
}
