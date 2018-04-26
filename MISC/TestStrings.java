//Lynn Takahashi
//CoSci 290
//Demo on String class

import java.util.Scanner;

public class TestStrings{

  //main method
  public static void main(String[] args){
    
    //Initiate the Scanner object
    Scanner input = new Scanner(System.in);
    
    //Impose rules on user input
    /*
    name.length() - gives a int of how many characters the String is long  
    */        
        
   
    int nameLength = 0;
    String answer = input.next();
    boolean flag = false;
    
    /* 
    
    Using Pseudocode write your logic
    
    while the usert gives a name that is less thn two characters{
    
    check if input is < two characters{
      and keep prompting
    }
    else{
    
    }
    }
    
    */
    
     //example of a while loop - repeats the same code unlimited times
    while(nameLength < 2 && flag = false){
      
      System.out.println("What is your name?");
    
    
     //get answer from the console
    answer = input.next();  
     
    //check if name is at least 2 characters
    if(answer.length() < 2 && flag = false){
      System.out.println("Please enter a name that is at least"
                        +" two letters long and no numbers.");
      flag = false;
            
      }
      else{//name contains at least 2 characters check to see if name contains letters
        //for example go through each letter in the name Logan
        //name.charAt(0) to look at the character in indes 0
        //use for loop bc we know how many letters it has
        for(int index = 0; index < answer.length(); index++){
          
          System.out.println(answer.charAt(index));
          
          //check if the character is a letter or number
          if(!Character.isLetter(answer.charAt(index))){ //not a letter
            flag = true;
            break; //gets out of the current loop
        }
      
      
      nameLength = answer.length();      
    } //end of while loop
    
      }
    /*
    When you want code to run at least once    
      do{
      
      body of code
      
      }
    
    while(some condition);
    
    */
    
    
    
    
    
    System.out.println("Are you rich? Yes or No?");  
    
    String pizza = input.next();
    /*
    Example below checks for specific responses:
    
    answer = answer.toUpperCase(); - makes all lowercase
    answer = answer.toLowerCase(); - makes all uppercase
    answer.equals("some other string") - checks if two strings are the same
    answer.equalsIgnoreCase("") - checks if two Strings are equal regardless of case
    */
    
    //Whats inside the equal only takes a String
    //equalsIgnoreCase ignores capital letters
    if(pizza.equalsIgnoreCase("no")){ //"no" != No
      System.out.println("That sucks!");      
    }
    else{
      System.out.println("Share the love my dude.");
    }
      
      
      
  }
}