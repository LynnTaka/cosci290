/*

Lynn Takahashi
CoSci 290

*/

import java.util.Scanner;

public class GameDriver {
  
  public static void main(String[] args){
		
		Scanner input = new Scanner(System.in); //initiate scanner for user input
    Utility tool = new Utility(); //initiate utility for use
    String name = "";
		int rollTheDie = (1 + (int)(Math.random() * (6-1)));
		String cat = "";
    
    tool.Splash("title");//enters the splash screen
    tool.Splash("intro");//introduction
    
    name = input.next();//the player inputs their name
    
    System.out.println("Yes, that's right your name is " + name + ".");
    
    tool.Splash("theCat");
    
    cat = input.next();//inputs their companions name
    
		tool.readFile("Text.txt");
  
 		 if(rollTheDie <=3){
  		  System.out.println("I'm afraid my friend you've already lost the game.");
		 }
   	else if(rollTheDie == 1){
     	 System.out.println("The half of a snake eye, I like you already.");
   		 }	 	 
 		else{
   		 System.out.println("You my friend are already off to a great start.");
  		}
  
  	tool.Splash("gameOver");//Game over screen
		
}
}