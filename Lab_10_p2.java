//Lynn Takahashi
//CoSci290
/*
Part 2 
5.10 (Find numbers divisible by 5 and 6) Write a program that displays all the 
numbers from 100 to 1,000, ten per line, that are divisible by 5 and 6. 
Numbers are separated by exactly one space.
*/

//import scanner
import java.util.Scanner;

public class Lab_10_p2{
public static void main(String[] args){
  
  //counting the numbers printed
  int count = 0;
  
  //starts at 100, ends at 1000, and is incremented
  for(int i = 100; i <= 1000; i++){ 
    
    //prints out all numbers divisible by 5, 6, and 30
    if(i % 6 == 0 || i % 5 ==0 || (i % 6== 0 && i % 5 == 0)){
      
      //when the count is less than 10 will be printed on the same line
      //ends at 9 bc count started at 0
      if(count < 9){
        System.out.print(i + " ");
        count ++;
      }
        else{
          System.out.println(i);
          count = 0;
        //end of else
        }
    //end of if
    }
        
    
   //end of for   
   }
  
  
  //end of main method
  } 
//end of class  
}