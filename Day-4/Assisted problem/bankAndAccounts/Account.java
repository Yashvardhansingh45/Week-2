// Account class
class Account {
    //Attributes
    private static int idCounter = 1;
    private int id;
    private double balance;
// constructors
    public Account(double initialBalance) {
        this.id = idCounter++;
        this.balance = initialBalance;
    }
//    method to get id
    public int getId() {
        return id;
    }
//    method to get balance
    public double getBalance() {
        return balance;
    }
//    method to deposit
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount + " to Account ID " + id);
        }
    }
// method to withdraw
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " from Account ID " + id);
        } else {
            System.out.println("Insufficient balance or invalid amount for Account ID " + id);
        }
    }
}