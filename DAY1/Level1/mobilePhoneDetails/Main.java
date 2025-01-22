class Main{
    public static void main(String []args){
        // create object for Mobile class
        Mobile Phone1= new Mobile("Realme","X7", 30000.0);
        Mobile Phone2= new Mobile("Iphone","16 Pro", 130000);
        //call the method to display the Details of phone
        Phone1.displayDetails();
        Phone2.displayDetails();
    }
}