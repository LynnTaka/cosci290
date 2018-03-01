//Lynn Takahashi
//CoSci 290

//Write a program that takes user input in the font format of "[number between 0-9] [item]"
//output: "You have two items.
//Those items are guns


import java.util.Scanner;

public class SubString{

public static void main(String[] args){

Scanner input = new Scanner(System.in);
  
  //asks for input
  System.out.println("Give me a number between 0 and 9 and an item"); 
  
  int amount = 0;
  String item ="";
  
  amount = input.nextInt();
  item = input.next();
  
  System.out.println("You will never have " + amount + " of " + item.substring(0, (item.length())));



}


}