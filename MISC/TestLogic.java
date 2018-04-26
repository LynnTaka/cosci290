//Lynn Takahashi
//CoSci 290

/*
Topics:
  -multi-way if-else
  -logical operators
  -symbolic logic
*/

import java.util.Scanner;

public class TestLogic{

public static void main(String[] args){
  
  //Setting up scanner for user input
  Scanner input = new Scanner(System.in);    
  
  int grade = input.nextInt();
  
    if(grade >= 90){
      System.out.print("A");  
    }
  
  //two-way if-else
    if(grade < 90){
      System.out.println(" grade is not an A");
    }
    else{
      System.out.println(" grade is an A");
    }
  
  //multi if-elseif-else
    if(grade >= 90){
      System.out.println("A");
    } 
    else if(grade >= 80){
      System.out.println("B");
    }
    else if(grade >= 70){
      System.out.println("C");
    }
    else{
      System.out.println("F");
    }
  
  /* 
  
  Logical Operators
  ! - NOT
  != - NOT EQUAL TO
  == - IS EQUAL TO
  && - AND
  || - OR
  
  */
  
  //using if-else, write code that cracks whether 
  //a student's grade is good, average, or bad
  if(grade >= 80){
    System.out.println("This is a good grade!");  
    
    //nested-if
    if(grade >= 90){
      System.out.println("Wow, you got an A!");
      
    }
    
  }
  else if(grade <80 && grade >= 70){
    System.out.println("This is an average grade.");
  }
  else{
    System.out.println("This is a bad grade.");
  }
  
  
}


}

