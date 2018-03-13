//Lynn Takahashi
//CoSci 290
/*
*6.2 (Sum the digits in an integer) Write a method that computes the sum of the digits in an integer. 
Use the following method header: public static int sumDigits(long n)
*/


import java.util.Scanner;//imports the scanner

public class Problem62{
  
public static void main(String[] args){

  Scanner input= new Scanner(System.in);
  
  System.out.println("Enter an integer you want to find the sum of the digits:"); //Question to ask
  
  long much = input.nextLong();
  
  System.out.println("The sum of the integers digits is " + sumDigits(much));  //spits out th sum of the integer

  }//end of main method
  
  public static int sumDigits(long n){//making the method
   
    int number = (int)Math.abs(n);
    int sum = 0; //sum of all the integers that are inputted
    
    while(number != 0){
      sum+= number%10;
      number = number/10;
        
    }//end of while
    return sum;//returns sum of number
  
  }//end of method
}//end of class