// Sample Problem 1: Bank Account Types
// Description: Model a banking system with different account types using hierarchical inheritance.
// BankAccount is the superclass, with SavingsAccount, CheckingAccount, and FixedDepositAccount as subclasses.
// Tasks:
// Define a base class BankAccount with attributes like accountNumber and balance.
// Define subclasses SavingsAccount, CheckingAccount, and FixedDepositAccount, each with unique attributes like interestRate for SavingsAccount and withdrawalLimit for CheckingAccount.
// Implement a method displayAccountType() in each subclass to specify the account type.
// Goal: Explore hierarchical inheritance, demonstrating how each subclass can have unique attributes while inheriting from a shared superclass.
// Subclass CheckingAccount
class CheckingAccount extends BankAccount {
    double withdrawalLimit;

    CheckingAccount(int accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    void displayAccountType() {
        System.out.println("This is a Checking Account with a withdrawal limit of: $" + withdrawalLimit);
    }
}
