//Problem 2: Bank and Account Holders (Association)
//Description: Model a relationship where a Bank has Customer objects associated with it. A Customer can have multiple bank accounts, and each account is linked to a Bank.
//Tasks:
//Define a Bank class and a Customer class.
//Use an association relationship to show that each customer has an account in a bank.
//Implement methods that enable communication, such as openAccount() in the Bank class and viewBalance() in the Customer class.
//Goal: Illustrate association by setting up a relationship between customers and the bank.
//Main class
public class Main{
    public static void main(String[] args) {
        // create object for class bank
        Bank bank = new Bank("XYZ Bank");
        // create object for class customer
        Customer customer1 = new Customer("Alice");
        Customer customer2 = new Customer("Bob");
        // create object for class Account
        Account account1 = new Account(500.0);
        Account account2 = new Account(1000.0);
        Account account3 = new Account(300.0);
        // call the method to open account
        bank.openAccount(customer1, account1);
        bank.openAccount(customer1, account2);
        bank.openAccount(customer2, account3);
        // call the method
        account1.deposit(200);
        account2.withdraw(50);
        account3.deposit(100);
//        call the method
        customer1.viewBalance();
        customer2.viewBalance();
    }
}