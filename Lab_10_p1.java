//Lynn Takahashi
//CoSci290
/*
Part 1
6.8 
Convert from Celsius to Fahrenheit
Convert from Fahrenheit to Celsius
Part 2 
5.10 (Find numbers divisible by 5 and 6) Write a program that displays all the 
numbers from 100 to 1,000, ten per line, that are divisible by 5 and 6. 
Numbers are separated by exactly one space.
*/

//import scanner
import java.util.Scanner;

public class Lab_10_p1{
  
public static void main(String[] args){
  
  Scanner input = new Scanner(System.in);
  
    //asks user to input temp to convert to fahr
    System.out.println("Please input a temperature in Celsius to convert into Fahrenheit");
  
    double celsius = input.nextDouble();
    
    //prints out the inputted double and calls upon the celsiusToFahrenheit function
    System.out.println(celsius + " celsius is " + celsiusToFahrenheit(celsius) + " fahrenheit.");
    
    //asks user to input temp to convert into celsius
    System.out.println("Please input a temperature in Fareheit to convert into Celsius.");
  
    double fahrenheit = input.nextDouble();
  
    //prints out inputted double and calls upon the fahrenheitToCelsius function
    System.out.println(fahrenheit + " fahrenheit is " + fahrenheitToCelsius(fahrenheit) + " in celsius.");

  //end of main method
  } 
  
    //convert cels to fahr
    public static double celsiusToFahrenheit(double celsius){
      
      //expression to make into fahr
      double toFahrenheit = (9.0/5) * celsius + 32; 
      return toFahrenheit;

    //end of celsiusToFahrenheit  
    }
  
    
    //convert fahr to cels
    public static double fahrenheitToCelsius(double fahrenheit){
      
      //expression to make into cels
      double toCelsius = (5.0/9) * (fahrenheit - 32); 
      return toCelsius;

    //end of fahrenheitToCelsius  
    }
  
  
} //end of class