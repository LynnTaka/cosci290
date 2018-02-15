/* 
Lynn Takahashi
Co Sci 290

Demo topics on:
  -increments/decrement operators
  -augmented assignment operators
  -casting with ints, doubles, and chars
  -basic if-else
*/


public class DemoBoolean{

  public static void main(String[] args){
    
    int num = 1;    
    num = num + 1; //increment num by 1
    num++; //post increment, line 16 and 17 are equivalent
    ++num; //pre incremnet
    
    num = 1;
    int count = ++num; //pre increment count 2 num 2
    System.out.println("count " + count + " num " + num);
    num = 1;
    count = num++; //post increment, count 1 num 2
    System.out.println("count " + count + " num " + num);
    
    count = num--; //post-decrement
    count = --num; //pre-decrement
    
    //examples of augmented assignment operators
    num += 2; //equivalent to num = num + 2
    num *= 2; //num = num * 2
    num /= 2; //num = num / 2
    num -= 2; //num = num - 2
    
    num = 2;
    double num2 = 3.0;
    System.out.println("Double wins: " + num * 3.0);
    System.out.println("Casting a double to an int: " + (int) num2); //lose the decimal
    System.out.println("Casting an int to a double: " + (double) num); //turns 2 into 2.0
    System.out.println("Casting a char to an int: " + (int) 'c'); //c turns into 99 bc of ASCII
    
    if(num != 0) {
      System.out.println("Correct");
      }
        
    int numberofZombies = 3;
    int actualNumberOfZombies = 100;
    
    //basic if-else
    if(numberofZombies == actualNumberOfZombies){ 
      System.out.println("You might survive this apocalypse");
    }
    else{
      System.out.println("You might not survive this apocalypse");
    }
    
    //Generating a random number
    //Math.pow (3, 2); 3^2
    System.out.println(Math.random()); //random number btw 0 and 1
    
    //Min + Math.random() * (Max-Min)
    
    System.out.println(1 + (int)(Math.random() * 10));
    System.out.println(5 + (int)(Math.random() * 5));
    
    int chanceOfSurviving = 1 + (int)(Math.random() * (10-1));
    
    System.out.println(chanceOfSurviving);
    
    if(chanceOfSurviving <= 3){
      System.out.println("You made it out alive!");
    }  
    else{
      System.out.println("You died loser.");      
    }
    
  }

}