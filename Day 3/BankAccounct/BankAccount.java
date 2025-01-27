// Create a class BankAccount 
class BankAccount{

    // create a class variable BankName
    static String BankName = "SBI";

    // create a class variable count
    static int count = 0;

    // create instance variables
    String accountHolderName;
    final int accountNumber;

    // create a constructor
    BankAccount(String accountHolderName, int accountNumber){
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        count++;
    }

    static void getTotalAccounts(){
        System.out.println("Total accounts in " + count);
    }

    void getAccountDetails(){
        if(this instanceof BankAccount){
            System.out.println("Bank Name: " + BankName);
            System.out.println("Account Holder Name: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
        }else {
            System.out.println("Invalid object");
        }
    }
       
}