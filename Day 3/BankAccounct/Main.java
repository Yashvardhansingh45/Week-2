public class Main {
    public static void main(String[] args) {
        BankAccount obj1 = new BankAccount( "John Doe", 34555);
        BankAccount obj2 = new BankAccount( "Jane Doe", 61112);

        obj1.getAccountDetails();
        obj2.getAccountDetails();

        BankAccount.getTotalAccounts();
    }
}