/*
  Lynn Takahashi
  Co Sci 290
*/

import java.util.Scanner;

public class InputAssignment{

  public static void main(String[] args){
    
  String name = "";
  String choice = "";
  int suckers = 0;
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("Hi, so what's your name?");
    
    name = input.next();
    
    System.out.println("Great well " + name + " do you like clowns?");
    
    choice = input.next();
    
    System.out.println(choice + " you say, well on a scale of one to ten how much do you like them?");
      
    suckers = input.nextInt();
      
    System.out.println("Great, because this place is full of them. \n"
                      +"Good luck!");
    
  } 
}