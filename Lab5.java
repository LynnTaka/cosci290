//Lynn Takahashi
//CoSci 290

//Lab 5
//fix the logic and make this code check if each character is a letter

import java.util.Scanner;
public class Lab5{

  public static void main(String[] args){
    
    //instantiate the Scanner object
    Scanner input = new Scanner(System.in);
    
    int nameLength = 0;
    String answer = "";
    boolean flag = false;
    
    while(!flag){
      
      flag = true; 
        
      System.out.println("What is your name?");
    
      //get answer from console
      answer = input.next();
      
      //check if name is less than 2 characters
      if(answer.length() < 2){
      System.out.println("Please enter in a name that is at least "
                        + "two letters long and no numbers");
        flag = false;
      }
      else{ //long enough gets checked that it's all letters
        for(int index = 0; index < answer.length(); index++){
          
          //check if the character is a letter or number
          if(!Character.isLetter(answer.charAt(index))){ //if it's not a letter
            System.out.println("Please enter in a name that is at least "
                  + "two letters long and no numbers");
            flag = false;
            
          }
        }//end of for   
       }//end of else
       if(flag)break; //gets out of current loop
      }//end of while
  }
}
         