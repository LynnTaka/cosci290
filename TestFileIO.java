/*
Lynn Takahashi
CoSci 290
*/

//io=input output
//Exceptions prevent it from crashing
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TestFileIO{

  public static void main(String[] args){
    
    String currentLine; //hold current line being read in file
    String filename = "Text.txt"; //hold the relative (partial) path of a file
    
    try(BufferedReader br = new BufferedReader(new FileReader(filename))){
      
      while((currentLine = br.readLine()) != null){
        System.out.println(currentLine);
      }
      
    //if there is no file to be open the exception will be caught
    }catch(IOException e){
      e.printStackTrace();
    }
    
  } //end of main
  
}//end class