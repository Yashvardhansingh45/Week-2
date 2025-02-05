// 4. Banking System
// Description: Create a banking system with different account types:
// Define an abstract class BankAccount with fields like accountNumber, holderName, and balance.
// Add methods like deposit(double amount) and withdraw(double amount) (concrete) and calculateInterest() (abstract).
// Implement subclasses SavingsAccount and CurrentAccount with unique interest calculations.
// Create an interface Loanable with methods applyForLoan() and calculateLoanEligibility().
// Use encapsulation to secure account details and restrict unauthorized access.
// Demonstrate polymorphism by processing different account types and calculating interest dynamically.
//super class
abstract class BankAccount {
//    Attributes
    private String accountNumber;
    private String holderName;
    private double balance;
//Constructors
    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }
// method to get info
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }
//method to calculate Intrest
    public abstract double calculateInterest();
}
// interface
interface Loanable {
    void applyForLoan();
    double calculateLoanEligibility();
}