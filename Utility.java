//Lynn Takahashi
//CoSci 290
//holds all custom methods that support my text adv

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Utility{
  
  /*
    This method reads a file and prints out each line
  */
  public void readFile(String filename){
    
    String currentLine; //hold current line being read in file
    
    
    try(BufferedReader br = new BufferedReader(new FileReader(filename))){
      
      while((currentLine = br.readLine()) != null){
        System.out.println(currentLine);
      }
      
    //if there is no file to be open the exception will be caught
    }catch(IOException e){
      e.printStackTrace();
    }
    
  }
  
  public void Splash(String story){
  
    if(story == "title"){
    System.out.println(  "      @@@        @@@@@@    @@@@@@   @@@@@@@ \n" 
  						           +"     @@@       @@@@@@@@  @@@@@@@   @@@@@@@  \n"
	  					           +"     @@!       @@!  @@@  !@@         @@!    \n"
  						           +"     !@!       !@!  @!@  !@!         !@!    \n"
	  					          +"      @!!       @!@!@!@!  !!@@!!      @!!    \n"
	  					          + "     !!!       !!!@!!!!   !!@!!!     !!!    \n"
  						          + "     !!:       !!:  !!!       !:!    !!:    	\n"			  
  						           +"     :!:      :!:  !:!      !:!     :!:    \n"
  						           +"     :: ::::  ::   :::  :::: ::      ::    \n"
  						           +"     : :: : :   :   : :  :: : :       :     \n"
											   
														   
						  +"@@@        @@@@@@   @@@  @@@   @@@@@@@@  @@@  @@@  \n"
						  +"@@@       @@@@@@@@  @@@  @@@  @@@@@@@@@  @@@  @@@  \n"
						  +"@@!       @@!  @@@  @@!  @@@  !@@        @@!  @@@  \n"
						  +"!@!       !@!  @!@  !@!  @!@  !@!        !@!  @!@  \n"
						  +"@!!       @!@!@!@!  @!@  !@!  !@! @!@!@  @!@!@!@!  \n"
						  +"!!!       !!!@!!!!  !@!  !!!  !!! !!@!!  !!!@!!!!  \n"
						  +"!!:       !!:  !!!  !!:  !!!  :!!   !!:  !!:  !!!  \n"
						  +" :!:      :!:  !:!  :!:  !:!  :!:   !::  :!:  !:!  \n"
						  +" :: ::::  ::   :::  ::::: ::   ::: ::::  ::   :::  \n"
						  +": :: : :   :   : :   : :  :    :: :: :    :   : :  ");    
  
    }
  if(story == "intro"){
    
    System.out.println("You wake up \n"
                    +"It's cold. \n"
                    +"There's someone next to you. \n"
                    +"Something."
                    +"A cat.");
    System.out.println("       ,     ,                   \n"                
	        					+"       |\\.\"./|                 \n"
			         			+"      /       \\                 \n"
        						+"     /  _   _  \\   ______       \n"
        						+"     \\==  Y  ==/\"'`      `.    \n"
        						+"     /`-._^_.-'\\     ,-  . \\   \n"
        						+"    /     `     \\   /     \\ \\ \n"
        						+"    \\  \\.___./  /_ _\\     / / \n"
          					+"     `, \\   / ,'  (,-----' /   \n"
        						+"       \"\"' '\"\"     '------' ");
    System.out.println("You shakily get up and take in your surroundings. \n"
                       +"Your in a dark room. \n"
                       +"You remember your name");
    }
  
  if(story == "theCat"){
    
    System.out.println("The cat brushes against your legs. \n"
                      +"You look down and they stare back up at you. \n"
                      +"You decide to name them--");    
  }  
    
  if(story == "gameOver"){
    
    System.out.println("..|'''.|      |     '||    ||' '||''''| \n" 
                      +".|'     '     |||     |||  |||   ||  . \n"
                      +"||    ....   |  ||    |'|..'||   ||''| \n"   
                      +"'|.    ||   .''''|.   | '|' ||   ||  \n"     
                      + "''|...'|  .|.  .||. .|. | .||. .||.....| \n"
                                          
                                          
                    +" ..|''||   '||'  '|' '||''''|  '||''|. \n"  
                    +".|'    ||   '|.  .'   ||  .     ||   || \n"
                    +"||      ||   ||  |    ||''|     ||''|' \n"  
                    +"'|.     ||    |||     ||        ||   |. \n" 
                    +" ''|...|'      |     .||.....| .||.  '|' \n");
  
  
   
    
  }  
    
  
    
    
  }//end of Splash
  
  
}//end of class