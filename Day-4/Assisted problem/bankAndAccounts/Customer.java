//Problem 2: Bank and Account Holders (Association)
//Description: Model a relationship where a Bank has Customer objects associated with it. A Customer can have multiple bank accounts, and each account is linked to a Bank.
//Tasks:
//Define a Bank class and a Customer class.
//Use an association relationship to show that each customer has an account in a bank.
//Implement methods that enable communication, such as openAccount() in the Bank class and viewBalance() in the Customer class.
//Goal: Illustrate association by setting up a relationship between customers and the bank.
// Customer class
import java.util.ArrayList;
import java.util.List;

class Customer {
//    Attributes
    private String name;
    private List<Account> accounts;
// constructrs
    public Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }
//  method to get Name
    public String getName() {
        return name;
    }
//  Method to add Account
    public void addAccount(Account account) {
        accounts.add(account);
    }
//  Mehtod to view Balance
    public void viewBalance() {
        System.out.println("Balances for " + name + ":");
        for (Account account : accounts) {
            System.out.println("Account ID: " + account.getId() + ", Balance: " + account.getBalance());
        }
    }
}
