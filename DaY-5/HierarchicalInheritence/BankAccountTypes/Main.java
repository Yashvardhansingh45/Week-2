// Sample Problem 1: Bank Account Types
// Description: Model a banking system with different account types using hierarchical inheritance.
// BankAccount is the superclass, with SavingsAccount, CheckingAccount, and FixedDepositAccount as subclasses.
// Tasks:
// Define a base class BankAccount with attributes like accountNumber and balance.
// Define subclasses SavingsAccount, CheckingAccount, and FixedDepositAccount, each with unique attributes like interestRate for SavingsAccount and withdrawalLimit for CheckingAccount.
// Implement a method displayAccountType() in each subclass to specify the account type.
// Goal: Explore hierarchical inheritance, demonstrating how each subclass can have unique attributes while inheriting from a shared superclass.
// Main class
public class Main {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount(101, 5000, 4.5);
        CheckingAccount checking = new CheckingAccount(102, 3000, 1000);
        FixedDepositAccount fd = new FixedDepositAccount(103, 20000, 5);

        savings.displayAccountType();
        savings.displayBalance();

        checking.displayAccountType();
        checking.displayBalance();

        fd.displayAccountType();
        fd.displayBalance();
    }
}
