//Lynn Takahashi
//CoSci

/*

Save the random numbers in a matrix by saving it to a String variable (maybe called str1 or str2) and 
using builtin functions like str1.charAt(i) and str1.length() to loop through each character. 
Parse the integer values by using Integer.parseInt(str1.charAt(i) + ""), for example. Save 
the resulting summation to another String, which will be formatted and printed as a matrix.

*/

//Midterm

//all the necessary stuff to get it running
import java.util.Scanner;
public class Midterm{
  public static void main(String[] arg){
  
    Scanner input = new Scanner(System.in);

    //ask prompt
    System.out.println("Please input a number, it'll be made into a matrix.");

    //n is the number inputted
    int n = input.nextInt();

    //first matrix
    String str1 = printMatrix(n);

    //Print out first matrix
    System.out.println(str1);

    //space btw matrixes
    System.out.println("");

    //second matrix
    String str2 = printMatrix(n); 

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

    
  

  //end of main method
  }

 //functions
  
  
  public static String printMatrix(int n){
    
    String str1 = "";
    
    //makes the n amount of columns
    for(int c = 0; c < n; c++){
      
      //makes the n amount of rows
      for(int r = 0; r < n; r++){
        
        //if-statement to randomly return 0-10 bc no other way :////////
        if (Math.random()<=.12){
          str1 = str1 + 1 + " ";  
        }
        else if (Math.random()<=.2){
         str1 = str1 + 2 + " ";    
        }
        else if (Math.random()<=.3){
          str1 = str1 + 3 + " ";  
        }
        else if (Math.random()<=.4){
          str1 = str1 + 4 + " ";  
        }
        else if (Math.random()<=.5){
          str1 = str1 + 5 + " ";  
        }
        else if (Math.random()<=.6){
          str1 = str1 + 6 + " ";   
        }
        else if (Math.random()<=.7){
          str1 = str1 + 7 + " ";  
        }
        else if (Math.random()<=.8){
          str1 = str1 + 8 + " ";  
        }
        else if (Math.random()<=.9){
          str1 = str1 + 9 + " ";  
        }
        else if (Math.random()<=.95){
          str1 = str1 + 10 + " ";  
        }
        else{
          str1 = str1 + 0 + " ";  
        }
        
      }
        
        
      //starts column on a new line
      str1 = str1 + "\n";
    //end of for loop     
    }
    
  //end of Matrix
    
    return str1;
  }
  
  //adding the matrix function
 
}