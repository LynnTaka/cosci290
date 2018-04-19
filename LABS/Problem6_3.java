//Lynn Takahashi
//CoSci 290

/*

6.3 (Palindrome integer) Write the methods with the following headers 
// Return the reversal of an integer, i.e., reverse(456) returns 654

public static int reverse(int number) 
// Return true if number is a palindrome

public static boolean isPalindrome(int number)

Use the reverse method to implement isPalindrome. A number is a palindrome 
if its reversal is the same as itself. Write a test program that prompts the user 
to enter an integer and reports whether the integer is a palindrome.

*/

import java.util.Scanner;

public class Problem6_3{

public static void main(String[] args){
  
  //import a scanner
  Scanner input = new Scanner(System.in);
  
  //number to be inputted eventually
  int number = 0; 
  
  //command prompt
  System.out.println("Enter an integer."); 
  
  //input number here
  number = input.nextInt();  
  
  if(!isPalindrome(number)){
    System.out.println(number + " isn't a palindrome, but this is it reversed " + (reverse(number)) + ".");//prob a shorter way to do this but im a noob find out later
  }
  else{
    System.out.println(number + " is a palindrome.");
  }
   
  //end of main method
  }
  
  
//NOTE TO SELF PUT THE FUNCTIONS OUTSIDE THE MAIN METHOD FFUUUUUFfuwifniowenfweifjpofjewf
// Return true if number is a palindrome 
 public static boolean isPalindrome(int number){
    if(number == reverse(number)){ 
      //if is the same reversed returns true.  
      return true;
    //end of if
    }
   
       else{
         return false;
       //end of else
       }
  //end of boolean 
  }
  
   //Return the reversal of an integer, i.e., reverse(456) returns 654    
 public static int reverse(int number){//reversed number
   
   String rLil = ""; //stands for lilreverse represent !!!!!!!
   
   String pp = number + ""; //stands for poopoo or how im feeling rn at this moment. professor this made me want to jump off a cliff
  
   for(int i = pp.length()-1; i >=0; i--){
     
     rLil += pp.charAt(i);
   
   //end of for loop
   }
   
     return Integer.valueOf(rLil);//the reverse of pp
 
 //end of reverse
 }
//end of classa 
}