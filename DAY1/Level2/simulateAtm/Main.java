class Main{
    public static void main(String []args){
        //create object for class student
        ATM johnsAccount = new ATM("John Doe",123456789,  1000.00);
        ATM janesAccount = new ATM("Jane Smith",987654321 , 1500.00);

        // Using the objects
        johnsAccount.depositeMoney(500);            // John deposits $500
        johnsAccount.withdrawingMoney(200);           // John withdraws $200
        johnsAccount.displayDetails();
        janesAccount.withdrawingMoney(2000);          // Attempt to withdraw more than the balance
        janesAccount.depositeMoney(300);             // Jane deposits $300
        janesAccount.displayDetails();     // Display Jane's account details
    }
}