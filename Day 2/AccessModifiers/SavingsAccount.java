class BankAccount {
    public int accountNumber;    // Public
    protected String accountHolder; // Protected
    private double balance;      // Private

    // Constructor
    BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Public methods to access and modify balance
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

class SavingsAccount extends BankAccount {
    SavingsAccount(int accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    // Display Savings Account Details
    void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
    }
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1001, "John Doe", 5000.00);
        System.out.println("Balance: " + account.getBalance());
        account.setBalance(6000.00);
        System.out.println("Updated Balance: " + account.getBalance());

        SavingsAccount savings = new SavingsAccount(1002, "Alice", 7000.00);
        savings.displayDetails();
    }
}
