//  Create a class 
class Library{

  //  Create a static variable libraryName
  static String libraryName;

  // Attributes of the class
  String title;
  String author;
  final int ISBN;
  
  // Constructor of the class
   
   Library(int ISBN,String title,String author){
     this.title=title;
	   this.author=author;
	   this.ISBN=ISBN;
	 }

  // Method to print the library name
   static void displayLibraryName(String name){
      libraryName=name;
    System.out.println("Name "+ libraryName);
    }

   // Method to display the details of the book
    void display(){
      if(this instanceof Library){
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("ISBN: "+ISBN);
      }else{
        System.out.println("Invalid object");
      }
    }
  }
   