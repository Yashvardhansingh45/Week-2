// Program to Simulate an ATM
// Problem Statement: Create a BankAccount class with attributes accountHolder, accountNumber, and balance.
// Add methods for: Depositing money.
// Withdrawing money (only if sufficient balance exists).
// Displaying the current balance.
// Explanation: The BankAccount class stores bank account details as attributes.
// The methods allow interaction with these attributes to modify and view the account's state.
public class ATM{
    // attributes
    private String accountHolder;
    private int accountNumber;
    private double balance;
     //constructor
    ATM(String accountHolder, int accountNumber, double initialbalance){
        this.accountHolder=accountHolder;
        this.accountNumber=accountNumber;
        this.balance=initialbalance;
    }
    // method to deposite money
    void depositeMoney(double amount){
        if (amount > 0){
            balance += amount;
            System.out.println( amount +"Deposited, New Balance is: "+ balance);
        }
        else {
            System.out.println("Amount entered should be above 0.");
        }
    }
    // method to wirhdraw money
    void withdrawingMoney(double amount){
        if(amount > balance){
            System.out.println("Amount should be eqaul to balance or less than balance.");
        }
        else {
            balance -= amount;
            System.out.println( amount +" Withdrawed, New Balance is: "+ balance);
        }
    }
    // method to display Details
    void displayDetails(){
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Current Balance: " + balance);
    }
}