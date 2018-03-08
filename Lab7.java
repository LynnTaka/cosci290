//Lynn Takahashi
//CoSci
/*
(Count positive and negative numbers and compute the average of numbers) 
Write a program that reads an unspecified number of integers, determines 
how many positive and negative values have been read, and computes the total 
and average of the input values (not counting zeros). Your program ends with 
the input 0. Display the average as a floating-point number. Here is a sample run:


Enter an integer, the input ends if it is 0: 1 2 -1 3 0 
The number of positives is 3 
The number of negatives is 1 
The total is 5.0 The average is 1.25
Enter an integer, the input ends if it is 0: 0 
No numbers are entered except 0
*/

import java.util.Scanner;

public class Lab7{
  public static void main(String[] args){
  
  Scanner input=new Scanner(System.in);
  
    int iWantToDie = 0;
    int numberOfPostives = 0;
    int numberOfNegatives = 0;
    int index = 0;
    int total = 0;
    int numOfNum= 0;
    double average = 0;
    
    
    System.out.println("Enter an integer, the input ends if it is 0:"); //ASK PROMPT
    
   iWantToDie = input.nextInt(); //User input the number
    
    if(iWantToDie == 0){ //cannot enter 0 first
      System.out.println("No number but 0 is entered");
    }
    
    while(iWantToDie != 0){
      
      if(iWantToDie > 0){
        numberOfPostives++; //counts the positives
      }
      else{
        numberOfNegatives++; //counts the negatives
      }//end of else
      total+=iWantToDie;//calculates the total so far
      numOfNum++;//the number of the numbers so far
      iWantToDie = input.nextInt();//lets the user input another integer
      
      
    }//end of the while loop
    
    average = total/numOfNum; //calculates the average
    
    System.out.println("The number of positives: " + numberOfPostives + "\n" //spits out everything below this 
                      +"The number of negatives: " + numberOfNegatives + "\n"
                      +"The total is " + total + "\n"
                      +"The average is " + average);
    
    
    /*
    System.out.println(numberInputed);
    
    while(numberInputed.charAt(index) != '0'){

      if(numberInputed.charAt(index) == '-'){
        numberOfNegatives++;
      }
      else{
        numberInputed.charAt(index) == //not after a -
          //numberofPositives++
      }
      
      index++;
      
    }
    
    
        
    
    */
    
        
    
    /*
    If i>0 i<0
    */
  
  }
}