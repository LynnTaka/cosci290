//Lynn Takahashi
//CoSci

/*

(Display matrix of 0s and 1s) Write a method that displays an n-by-n matrix

Each element is 0 or 1, which is generated randomly. Write a test program 
that prompts the user to enter n and displays an n-by-n matrix.

*/


import java.util.Scanner;
public class Lab_11{
public static void main(String[] args){
  
  //import in the scanner
  Scanner input = new Scanner(System.in);

  System.out.println("Please input a number, and I will make it into a matrix of 0 and 1.");
  
  int n = input.nextInt();
  
  printMatrix(n);
  //end of main method
  }
  
  //function
  public static void printMatrix(int n){
    
    //makes the n amount of columns
    for(int c = 0; c < n; c++){
      
      //makes the r amount of rows
      for(int r = 0; r< n; r++){
        
        //if-statement to randomly return 1 or 0
        if (Math.random()>=.5){
          System.out.print("1");
        }
        else{
          System.out.print("0");
        }
      //end of for loop  
      }
      
      //starts column on a new line
      System.out.println("");
      
    }
    
  //end of Matrix
  }
  
}