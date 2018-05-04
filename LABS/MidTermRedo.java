//Lynn Takahashi
//CoSci 290

/*
Remember the prompt of your midterm? Try solving 
(the random part and the matrix addition part) by using arrays instead. 
Did you find this to be easier than string concatenation and manipulation? 

I can figure out how to make them add together, but I can't figure out 
how to randomly generate a matrix of any size and have them added together
*/

import java.util.Scanner;

public class MidTermRedo{

  //entry point of method
  public static void main(String[] args){
  
    Scanner input = new Scanner(System.in);
    
    //variables
    int col = 0;
    int rows = 0;
    int num1 = 0;
    int num2 = 0;
    
    //number of rows
    System.out.println("Enter the number of rows.");
    col = input.nextInt();
    
    System.out.println("Enter the number of columns.");
    rows = input.nextInt();
    
    int first[][] = new int[rows][col];
    int second[][] = new int[rows][col];
    int sum[][] = new int[rows][col];
    
    System.out.print("Enter the numbers for the first matrix.");
    
    for(num1=0; num1<col; num1++){
      for(num2=0; num2<rows; num2++){
        first[num1][num2] = input.nextInt(); 
      }
    }
      
    System.out.print("Enter the numbers for the second matrix.");
    
    for(num1=0; num1<col; num1++){
      for(num2=0; num2<rows; num2++){
        second[num1][num2] = input.nextInt();
      }
    }
          
    //sum of matrix
    for(num1=0; num1<col; num1++){
      for(num2=0; num2<rows; num2++){
        sum[num1][num2] = first[num1][num2] + second[num1][num2];
      }
    }
    
    System.out.println("The sum is: ");

    for(num1=0; num1<col; num1++){
      for(num2=0; num2<rows; num2++){
        System.out.print(sum[num1][num2] + "  ");
        
        System.out.println();
      }
    }
    
    
    
  }//end of main
  
/*  my code to try to generate a random matrix it did not work
    class Random{
    
    //variables
    int[][] matrix = new int [5][5];
    Arrays.fill(matrix,(int)Math.random()*10);
    
    //print matrix
    for(int i=0; i<matrix.length; i++){
      for(int j=0; j<matrix[i]; j++){
        matrix[i][j] = (int)Math.random()*10);
      }
      
    }
    
    System.out.println();
    
    
  }
*/
}//end of class