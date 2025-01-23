// Program to Check Palindrome String
// Problem Statement: 	Create a PalindromeChecker class with an attribute text.
// Add methods to:
// Check if the text is a palindrome.
// Display the result.
// Explanation: The PalindromeChecker class holds the text attribute.
// The methods operate on this attribute to verify its palindrome status and display the result.
public class Palindrome{
    // Attributes
    private String text;    // constructor
    Palindrome(String text){
        this.text=text;
    }
    // method to check palindrome String
    public boolean palindroneChecker(){
        int Length = text.length();
        char []arr= new char[Length];
        for(int i=0; i < Length; i++){
            arr[i]=text.charAt(i);
        }
        int index =0;
        for(int i= Length-1; i >= 0; i--){
            if(text.charAt(index)!=arr[i]){
                return false
            } index++;
        } return true;
    }
    // method to display result
    void display(){
        if(check(text)){
            System.out.println("Result: The text is a palindrome.");
        } else {
            System.out.println("Result: The text is not a palindrome.");
        }
    }
}