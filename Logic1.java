//Lynn Takahashi
//CoSci 290
/*

Use control structures to do string manipulation 
and user validation

Built-in String functions
str.length()
str.toUpperCase()
str.toLowerCase()
str.equalsIgnoreCase
str.charAt(int index)- get a specific character at an index
str.substring(int startIndex, int endIndex)-gives a subset string
based on the given range

*/

public class Logic1{

public static void main(String[] args){

  String str = "Java Rules!";//length is 11
  int num = 10;
  
  for(int index = 0; index < str.length(); index++){
    //first iteration index = 0 = "J" - index updates to 1
    //second iteration index = 1 = "a" - index updates to 2
    if(index % 2 == 0){//only even indicies printed
      System.out.println(str.charAt(index)); //prints Java Rules! vertically
    }//end of if
  
   
    /*if(num % 2 == 0){//if 10 divided by zero equals 0
      //% - mod a two step operator
      System.out.println("This number is even!");
    }
    */
    /*
    else{
      System.out.println("This number is odd!");
    }
  */
  
  //the reason why you want to use a for-loop bc it knows how many iterations it will run
  }//end of for
  
  System.out.println(str.substring(0, 4)); //output java
  
  } //end of start
} //end of code