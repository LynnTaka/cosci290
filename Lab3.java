//Lynn Takahashi
//CoSci 290

public class Lab3 {

public static void main(String[] args){

int minimum = 2;
int maximum = 12;
int diceRoll = minimum + (int)(Math.random() * maximum); //random generator equation

  System.out.println("A game then! \n"
                    +"Here my friend roll the dice.");
  
  System.out.println("A " + diceRoll + "...");
    
if(diceRoll >= 6){
  System.out.println("You my friend are off to a great start");
}
 else if(diceRoll == 2){
   System.out.println("Snake eyes. \n"
                     +"How quaint. \n"
                     +"I suppose you only deserve such a reward for such a roll. \n"
                     +"Take this coin. \n"
                     +"Lady Luck smiles upon you my friend.");
   }
  else{
    System.out.println("Oh my dear... \n"
                      +"I'm afraid Lady Luck does not smile upon you today. \n"
                      +"All I can give you is well wishes.");
   }

  }
}