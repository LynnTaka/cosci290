//Lynn Takahashi
//CoSci 290

/*

Declare a 2D array of integers with 5 rows and 6 columns. 
Randomly assign each index an integer between 0 and 100. 
Create a custom function that takes in a 2D array of integers 
and finds the sum of each row. Each sum is saved into an array 
of integers that is returned by the function.

 
*/


public class Lab_20{
  
  public static void main(String[] args){
    
    //2D array called array
    int[][] array = new int [5][6];
    
    //randomly assigns integers to the index
    for(int i = 0; i < 5; i++){//rows
      for(int j = 0; j < 6; j++){//columns
        array[i][j] = 1 + (int)(Math.random() * 99) + 1;
        System.out.print(array[i][j] + " ");
      }    
      //new row
      System.out.print("\n");
    }
    
    sumOfRows(array);
    for(int k = 0; k < 5; k++){//rows
      for(int l = 0; l < 1; l++){//columns
        System.out.print(array[k][l]);
      }    
      //new row
      System.out.print("\n");
    }
    
  }//end of main
  
  //custom functions
  public static int[] sumOfRows(int[][] sum){
    
    int addThemUp = 0;
    int[] addition = new int[3];
    int index = 0;
    
     for(int i = 0; i < sum.length; i++){
      for(int j = 0; j < sum[i].length; j++){
        addThemUp += sum[i][j];
        //System.out.print(addThemUp);
      }
       
       addition[index] = addThemUp;
       index++;
       
       //new row
       System.out.print("\n");
    }
    
    return addition;
    
  }//end of sumOfRows


}//end of class


