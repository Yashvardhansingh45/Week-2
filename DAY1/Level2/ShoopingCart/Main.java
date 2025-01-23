class Main{
    public static void main(String[] args) {
        CartItem cart = new CartItem();
        // Add an item to the cart
        cart.addItem("Laptop", 1200.50, 1);
        // Display total cost
        cart.displayTotalCost();
        // Remove the item from the cart
        cart.removeItem();
        // Try to display total cost after removal
        cart.displayTotalCost();
    }
}