//Lynn Takahashi
//CoSci

import java.util.Scanner;

public class GameDriver2{
  
  public static void main(String[] args){
    
    Scanner input = new Scanner(System.in); //initiate scanner for user input
    Utility tool = new Utility(); //initiate utility for use
    String name = "";
    
    tool.Splash("title");//enters the splash screen
    tool.Splash("intro");//introduction
    
    name = input.next();//the player inputs their name
    
    System.out.println("Yes, that's right your name is " + name + ".");
    
    tool.Splash("theCat")
    
    cat = input.next();//inputs their companions name
    
    
    
    
    
    
   System.out.println(("      @@@        @@@@@@    @@@@@@   @@@@@@@ \n" 
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
  
     
  String name = "";
  String cat = "";
  String answer = "";
  int age = 0;
  String no = "";
  int rollTheDie = (1 + (int)(Math.random() * (6-1)));
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("Welcome, what's your name?");
    
    name = input.next();
    
    System.out.println("Tell me, " + name + " do you like windowless rooms?");
    
    answer = input.next();
    
    System.out.println(answer + " you say. \n"
                      +"Hmmm... \n"
                      +"... \n"
                      +"I confess it's been a while since someone new has ended up here. \n"
                      +"I'm afraid my eyesight isn't what it used to be. \n"
                      +"Would you please tell me how old you are?");
      
    age = input.nextInt();
      
    System.out.println("Only " + age + "? \n"
                      +"What a shame. \n"
                      +"You had so much more to live for, but now you're stuck here. \n"
                      +"With me. \n"
                      +"As your only company. \n"
                      +"Oh, and this cat too.  \n"
                      +"What would you like to name them?"); //cat name prompt here
   
    cat = input.next();
    
    System.out.println(cat +", huh? \n"
                      +"Adorable. " + name + " and " + cat + "! \n"
                      +"What a pair you two make. \n"
                      +"Would you like to play a very special game?");//answer doesnt matter
    
    no = input.next();
    
    System.out.println("Well, it's not like you had a choice in the matter. \n"
                      +"We're going to play a game of chance. \n"
                      +"Here's a die. \n");
 
  
    System.out.println("A " + rollTheDie +"...");
  
    
  }//end of main
  
}// end of class