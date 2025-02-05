// 4. Banking System
// Description: Create a banking system with different account types:
// Define an abstract class BankAccount with fields like accountNumber, holderName, and balance.
// Add methods like deposit(double amount) and withdraw(double amount) (concrete) and calculateInterest() (abstract).
// Implement subclasses SavingsAccount and CurrentAccount with unique interest calculations.
// Create an interface Loanable with methods applyForLoan() and calculateLoanEligibility().
// Use encapsulation to secure account details and restrict unauthorized access.
// Demonstrate polymorphism by processing different account types and calculating interest dynamically.
// Main class
class Main {
    public static void main(String[] args) {
        BankAccount savings = new SavingsAccount("SA123", "Alice", 5000);
        BankAccount current = new CurrentAccount("CA456", "Bob", 10000);

        System.out.println("Savings interest: " + savings.calculateInterest());
        System.out.println("Current interest: " + current.calculateInterest());
    }
}
