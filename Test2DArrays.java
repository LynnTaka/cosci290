//Lynn Takahashi
//CoSci 290

public class Test2DArrays{
  
  //main method
  public static void main(String[] args){
  
    //declare 2d array
    String[][] words = new String[3][2];
    
    /*
    
    {
      {null, null}
      {null, null}
      {null, null}
    }
    
    */
  
    //assign first element in 2d array
    words[0][0] = "cat";
    
    //get element
    System.out.println(words[0][0]);
    System.out.println(words[0][1]);
    
    //iterate through array and assign values using loops
    for(int i = 0; i < words.length; i++){//row
      for(int j = 0; j < words[i].length; j++){//column
        words[i][j] = i * j + "cats";
        System.out.println(words[i][j]);
      }     
    }
    
    System.out.println(print2DArray(words));
    
  }//end of main

  //this method concatenates all elements in 2d arrays
  public static String print2DArray(String[][] array){
    
    String concat = "";
    
    for(int i = 0; i < array.length; i++){
      for(int j = 0; j < array[i].length; j++){
        concat = concat + array[i][j] + " ";
      }
    }
    
    return concat;
    
  }//end og print2DArray

}//end of class