//Lynn Takahashi
//CoSci 290

/*
 Repeat additions Listing 5.4, SubtractionQuizLoop.java, 
 generates five random subtraction questions. Revise the program 
 to generate ten random addition questions for two integers between 
 1 and 15. Display the correct count and test time. 
*/

import java.util.Scanner;

public class Lab6{

public static void main(String[] args){
  
  final int NUMBEROFQUESTIONS = 10; //10 problems
  int correctCount = 0; //Count correct answers
  int count = 0; //count questions
  long startTime = System.currentTimeMillis(); 
  String output = "";
  
   Scanner input = new Scanner(System.in);
  
  
  while(count < NUMBEROFQUESTIONS){
    //generates 2 random numbers
    int num1 = (1 + (int)(Math.random() * (15))); //equation
    int num2 = (1 + (int)(Math.random() * (15))); //equation
  
  
  System.out.println("What is " + num1 + " + " + num2 + "?");
  int answer = input.nextInt(); //STUDENTS ANSWER GOES HERE
  
  //Grading the answer
  if(num1 + num2 == answer){
    System.out.println("You are correct!");
    correctCount++; //increase the number of correct answers
  }
  else{
    System.out.println("Your answer is incorrect \n"
                      +num1 + " + " + num2 + " should be " + (num1 + num2));
  }
count++; //increase question count

}//end of while
  
long endTime = System.currentTimeMillis(); //dear god i want to die
long testTime = endTime - startTime; //how long you took
  
  System.out.println("Correct count is " + correctCount + "\n"
                    +"Test time is " + testTime/1000 + " seconds \n"
                    +output);
  
}
}