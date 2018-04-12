//Lynn Takahashi
//CoSci 290

/*
	Directions:
	1. This application has bugs. Edit my code so that the program compiles and runs.
	2. Comment every line of code.
	3. Add code or modify the code so that the following output is achieved:
	Sample output with odd number:
	This program will check if a number is even or odd...
	Please enter in a whole number...
	3
	The number 3 is odd...
	Sample output with even number:
	This program will check if a number is even or odd...
	Please enter in a whole number...
	2
	The number 2 is even...
	
	Note:
	Preserve the indentation of the code. 
	Clean java code has:
	 proper indentation
	 variable declaration at the beginning of the program
	 class name starts with a capital
	 comments that explains the logic
*/

//import scanner
import java.util.Scanner;

public class Lab12{
	
	//main method
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		//later used as inputted number
		int num = 0;
		
		//outprints the purpose of the program.  
		System.out.println("This program will check if a number" 
										 + " is even or odd...");
		
		//User prompt
		System.out.println("Please enter in a whole number...");
		
		//The user's input, saved now as num
		num = input.nextInt();
		
		//method that checks if the number is even or odd.
		checkNums(num);
	
	//end of main method
	}

//method
public static void checkNums(int num){
		
		//checks whether or not the number is even or odd.  
		if(num%2==0){
			//prints out if even
			System.out.println("The number " + num + " is even.");
		}
		else{
			//prints out if odd
			System.out.println("This number " + num + " is odd.");
		}
	
		//end of checkNums
		}

	//end of class
}