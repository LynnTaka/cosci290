/*

Lynn Takahashi
CoSci 290

*/

import java.util.Scanner;

public class GameDriver {
  
  public static void main(String[] args){
  
   System.out.println("._.___________                                 ._. \n"
                      +"| |\\_   _____/ ______ ____ _____  ______   ____| | \n"
                      +"| | |    __)_ /  ___// ___\\\\__  \\ \\____ \\_/ __ \\ | \n"
                      +" \\| |        \\\\___ \\\\  \\___ / __ \\|  |_> >  ___/\\| \n"
                      +"  _/_______  /____  >\\___  >____  /   __/ \\___  >_ \n"
                      +" \\/        \\/     \\/     \\/     \\/|__|        \\/\\/");
  
  String name = "";
  String answer = "";
  int age = 0;
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
                      +"Why don't we play a game.  A game of chance. \n"
                      +"Roll the dice.");
 
  
    System.out.println("A " + rollTheDie +"...");
  
  if(rollTheDie <=3){
    System.out.println("I'm afraid my friend you've already lost the game.");
  }
  else{
    System.out.println("You my friend are already off to a great start.");
  }
  
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
}