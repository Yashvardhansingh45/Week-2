// Problem 2: Bank and Account Holders (Association)
// Description: Model a relationship where a Bank has Customer objects associated with it.
// A Customer can have multiple bank accounts, and each account is linked to a Bank.
// Tasks:
// Define a Bank class and a Customer class.
// Use an association relationship to show that each customer has an account in a bank.
// Implement methods that enable communication, such as openAccount() in the Bank class and viewBalance() in the Customer class.
// Goal: Illustrate association by setting up a relationship between customers and the bank.
// Bank class
class Bank {
    //Attributes
    private String name;
    // comstructors
    public Bank(String name) {
        this.name = name;
    }
    // method to get name
    public String getName() {
        return name;
    }
//    method to open account
    public void openAccount(Customer customer, Account account) {
        customer.addAccount(account);
        System.out.println("Account opened for " + customer.getName() + " at " + name);
    }
}
