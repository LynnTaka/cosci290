//Lynn Takahashi
//CoSci 290

//imports in scanner
import java.util.Scanner;

public class MidTermCompletion{
  //main method
  public static void main(String[] args){
  
  //scanner
  Scanner input = new Scanner(System.in);
    
    //variables
    int n;
    String str1;
    String str2;
    
    //ask prompt
    System.out.println("Please input a number.");

    //n is the number inputted
    n = input.nextInt();

    //first matrix
    str1 = printMatrix(n);

    //Print out first matrix
    System.out.println(str1);

    //space btw matrixes
    System.out.println("");

    //second matrix
    str2 = printMatrix(n); 

    //print out second matrix
    System.out.println(str2);

    //the sum
    System.out.println("When added together it makes the matrix.");




    //go through and finds the sum 
    for(int i=0; i < str1.length(); i++){

      //first value in the matrix
      int Value1 = Integer.parseInt(str1.charAt(i) + "");
      
      //first value in the second matrix
      int Value2 = Integer.parseInt(str2.charAt(i) + "");


      int sum = Value1 + Value2;


      System.out.print(sum + " ");

      }

    
  




  }//end of main

  
  public static String printMatrix(int n){
    
    String str1 = "";
    
    //makes the n amount of columns
    for(int c = 0; c < n; c++){
      
      //makes the n amount of rows
      for(int r = 0; r < n; r++){
        
       //returns 0-10
       r = 1 + (int)(Math.random() * ((10 - 1) + 1));
       System.out.print(r); 
      
      }
        
      //starts column on a new line
      str1 = str1 + "\n";
    //end of for loop     
    }
    
  //end of Matrix
    
    return str1;
  }
  
}//end of class