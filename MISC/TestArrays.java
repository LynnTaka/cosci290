//Lynn Takahashi
//CoSci 290

public class TestArrays{

  //entry to the program
  public static void main(String[] args){

    //declare an array - the integer in the second pair of bracketed declares a size
    String[] names = new String[5];
    
    //assign values to this array
    names[0] = "Steven";
    names[1] = "Chris";
    names[2] = "Gerson";
    names[3] = "Hai";
    names[4] = "Adam";
    
    //update
    names[4] = "Lynn";
    
    for(int i = 0; i < names.length; i++){
    System.out.println("Element " + i + ": "+ names[i]);
    }

  }//end of main
  
}//end of class