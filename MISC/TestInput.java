/*
  Lynn Takahashi
  Co Sci 290
  
  Testing datatype sand input from users
  
*/

import java.util.Scanner; //is a Java object that allows you to take user input
public class TestInput{
  
  //main method-starting pt of application
  public static void main(String[] args){
 
    //1. identifiers can only start with a letter, _, and $
    //2. identifiers with multiple words are camelCased
  //e.g. - numOfStudents, name, interestRate,
  
    //datatypes:
      //int - integer - whole number => 3, 3452, biggest number 2147483647, -3.3
      //double - decimal number => 3.33, 0.2, -3.3
      //char - single character inside single quotations => '3', '!'
      //boolean - true or false => true, false
    //object/refernce datatypes
      //String - characters surrounded with double quotation marks => "cat"
      //There are other objects in Jaba that comes with Java that are custom
        //=> Objesct/class that comes with Java: Scanner, System, Math etc. Objects
        //=> Customer classes: Zombie, SpaceInvader, Person, etc. 
  
    final double PI_VALUE = 3.1415; //constants are all capital, multiple words seperated by underscores
    int numberOfStudents = 29;
    double avgGPA = 3.78;
    String name = "";
    boolean gameOver = false; //or true
    int age= 0;
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("Hi, give me your name: ");
    
    name = input.next(); //.next() is for the String types
    
    System.out.println("Hi " + name);
    
    System.out.println("How old are you?");
          
    age = input.nextInt(); //.nextInt() is for int types  
    
    System.out.println("You are " + age + " years old!");
    
   /*
    Arithmetic Operators
    + addition
    - subtraction
    * multiplication
    / division
    = assignment operator, equals
    % modules eg 10%2 ==> 10/2 and then finding the reminder which is 0
    
    Programming math operations follow the same order of operations as in Math
      (), Exponents, Multiplication/Division, Addition/Subtraction
      left to right
   */
    
    int month = age * 12;
    int days = age * 365;
    int hours = days * 24; 
    
    System.out.println("You are " + month + " months old OR " + days + " days old OR " 
                       + hours + " hours old!");
    
  }

}