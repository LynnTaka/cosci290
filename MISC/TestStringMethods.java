//Lynn Takahashi
//CoSci

/*

Play with built-in functions for the String class

*/

public class TestStringMethods{
  public static void main(String[] args){
    
    //hardcode a random String
    String str = "i23abc!145";
    
    //one way to go through each character in a String 
    char character = str.charAt(0);
    char character2 = str.charAt(1);
    //etc
    
    //print out the characters
    System.out.println("List of characters parsed 1 - " + character
                      +" 2 - " + character2);
    //
    
    for(int i = 0; i < str.length(); i++){
      //how you go through the loop
      System.out.println(str.charAt(i));
    }
    
    if(Character.isDigit(str.charAt(0))){
      System.out.println("This is a digit!");
    }
    else{
      System.out.println("This is not a digit.");
    }
    //
    //
  }
}