//Lynn Takahashi
//CoSci 290
/*

7.9 (Find the smallest element)
Write a method that finds the smallest element in an array of double values using the following header:
public static double min(double[] array)
Write a test program that prompts the user to enter ten numbers, invokes this
method to return the minimum value, and displays the minimum value.

*/

  
import java.util.Scanner;

public class Lab_18{
  
  //entry point of method
  public static void main(String[] args){
    
    //array that's the length of 10
    double[] numbers = new double[10];
    
    Scanner input = new Scanner(System.in);
    
    //prompts user
    System.out.println("Enter ten numbers and this program will find the minimum value.");

    //user input    
    for(int i = 0; i < numbers.length; i++){
       numbers[i] = input.nextDouble();
    }
    
    //output the minimum number
    System.out.println("The minimum number is: " + min(numbers));
    
    
  }//end of main
  
    public static double min(double[] array){
      
      //minimum value
      double min = array[0];
      
      for(int i = 0; i < array.length; i++){
        if(min > array[i]) min = array[i];  
      }
      
      //spits out the minimum value
      return min;
      
    }
      
}//end of class