/*
  Lynn Takahashi
  
  Lab 21: Complete implementation for each function 
    to complete this Tic Tac Toe game!
  
*/

import java.util.*;

public class Connect4_2{
  
  //declare 2d array to hold X's and O's to represent board
  static int w = 6;
  static int h = 6;
  static int bottom = w - 1;
  static char[][] board = new char[w][h];//creates board
  static char xo = 'x'; //holds which player is currently playing
  static boolean gameOver = false; //ends the loop if there is a winner
    
  //start of program
  public static void main(String[] args){
    
    //declare variables
    Scanner input = new Scanner(System.in);
    int row = 0;
    int col = 0;

    
    System.out.println("Let's play Connect 4!");
       
    //while there isn't a winner
    while(!gameOver){
      printBoard();
      System.out.println("It is " + xo + "'s turn. Please enter 0, 1, 2, 3, 4, 5 the column");
      move(col);
      if(checkWinner()){
        gameOver = true;
        break;
      }
    }
    
  }//end of main method
  
  /*
    This method prints the Tic Tac Toe board
    with updated moves by players.
  */
  public static void printBoard(){
    
         
		//rows
        for (int i = 0; i < 6; i++) {

            System.out.print("| ");
			
			//columns
            for (int j = 0; j < 6; j++) {

                System.out.print(board[i][j] + " | ");

            }

            System.out.println();

            System.out.println("--------------------------");

        }//end of for

    
 
  }//end of printBoard
  
  public static void changeXO(){
    
	if(xo == 'x'){
		xo = 'o';
	}
    else{
		xo = 'x';
    }
  }//end of changeXO
  
  /*
    If there isn't already an x or o in that row and col
    place the character in the array.
    Then change xo.
    Else prompt the user to try again because there's already an x or o here.
  */
  public static void move(int col){
    
    Scanner input = new Scanner(System.in);
    
    //counter
    int count=1;
    
    col = input.nextInt();
    
    
    while(!gameOver){
      if(col>5 || col<0){
        System.out.println("Please input a valid number");
        break;
      }//end of if
      
      else if(board[bottom][col] == '.'){//if blank 
          board[bottom][col] = xo; //place an x or o
          changeXO();
          break;//break loop
        }
        else if(board[bottom][col] == 'x' || board[bottom][col]== 'o'){
          count += 1;
          if(board[bottom - count][col] == '.'){//if it's blank
            board[bottom - count][col] = xo; //place x or o
            changeXO();
           //break loop
          }
        }
        if(count == 6){
          System.out.println("This is not valid, please try again");
          break;
        }
        else{
          board[bottom][col] = xo;
          changeXO();
          break;
        }
      }//end og while


  }//end of move

  /*
  public static void X(){
    int count = 1;
    
    System.out.println("It's X's turn.");
    
    int col = input.nextInt();
    
    while(!gameover){
      if(col>6){
        System.out.println("Invalid input");
        break;
      }
      if(board[bottom][col] == ' '){
        board[bottom][col] = 'x';
        break;
      }
      else if(board[bottom][col]) =='x' || board[bottom][col] == 'o'){
        if((board[bottom-count][col]) == ' '){
          board[bottom-count][col] == 'x';
          break
        }//end of if 
      }//end of else if
      counter+=1;
      if(counter == 6){
        
      }
    }
    */
  
  
  
  
  /*
    Returns true if there there is a winner or a draw to end the game
  */
  public static boolean checkWinner(){
    
    int n =0;
	//go through all possibilities
	if(board [5][n]==board[5][n+1] && board[5][n+1] == board[5][n+2] && board[5][n+2] == board[5][n+3] && (board [5][n]=='x' || board [5][n]=='o')){
      changeXO();
      printBoard();
      System.out.println(xo + " is the winner!!!!");          
      return true;
    }
    else if(board [4][n]==board[4][n+1] && board[4][n+1] == board[4][n+2] && board[4][n+2] == board[4][n+3] && (board [4][n]=='x' || board [4][n]=='o')){
      changeXO();
      printBoard();
      System.out.println(xo + " is the winner!!!!");          
      return true;
    }
    
    else if(board [3][n]==board[3][n+1] && board[3][n+1] == board[3][n+2] && board[3][n+2] == board[3][n+3] && (board [3][n]=='x' || board [3][n]=='o')){
      changeXO();
      printBoard();
      System.out.println(xo + " is the winner!!!!");          
      return true;
    }
    
    else if(board [2][n]==board[2][n+1] && board[2][n+1] == board[2][n+2] && board[2][n+2] == board[2][n+3] && (board [2][n]=='x' || board [2][n]=='o')){
      changeXO();
      printBoard();
      System.out.println(xo + " is the winner!!!!");          
      return true;
    }
    else if(board [1][n]==board[1][n+1] && board[1][n+1] == board[1][n+2] && board[1][n+2] == board[1][n+3] && (board [1][n]=='x' || board [1][n]=='o')){
      changeXO();
      printBoard();
      System.out.println(xo + " is the winner!!!!");          
      return true;
    }
    else if(board [n][n]==board[n][n+1] && board[n][n+1] == board[n][n+2] && board[n][n+2] == board[n][n+3] && (board [n][n]=='x' || board [n][n]=='o')){
      changeXO();
      printBoard();
      System.out.println(xo + " is the winner!!!!");          
      return true;
    }
    //end of horizontal
    
    else if(board [n][5]==board[n+1][5] && board[n+1][5] == board[n+2][5] && board[n+2][5] == board[n+3][5] && (board [n][5]=='x' || board [n][5]=='o')){
      changeXO();
      printBoard();
      System.out.println(xo + " is the winner!!!!");          
      return true;
    }
    
    else if(board [n][4]==board[n+1][4] && board[n+1][4] == board[n+2][4] && board[n+2][4] == board[n+3][4] && (board [n][4]=='x' || board [n][4]=='o')){
      changeXO();
      printBoard();
      System.out.println(xo + " is the winner!!!!");          
      return true;
    }
    
    else if(board [n][3]==board[n+1][3] && board[n+1][3] == board[n+2][3] && board[n+2][3] == board[n+3][3] && (board [n][3]=='x' || board [n][3]=='o')){
      changeXO();
      printBoard();
      System.out.println(xo + " is the winner!!!!");          
      return true;
    }
    else if(board [n][2]==board[n+1][2] && board[n+1][2] == board[n+2][2] && board[n+2][2] == board[n+3][2] && (board [n][2]=='x' || board [n][2]=='o')){
      changeXO();
      printBoard();
      System.out.println(xo + " is the winner!!!!");          
      return true;
    }
    else if(board [n][1]==board[n+1][1] && board[n+1][1] == board[n+2][1] && board[n+2][1] == board[n+3][1] && (board [n][1]=='x' || board [n][1]=='o')){
      changeXO();
      printBoard();
      System.out.println(xo + " is the winner!!!!");          
      return true;
    } 
    else if(board [n][n]==board[n+1][n] && board[n+1][n] == board[n+2][n] && board[n+2][n] == board[n+3][n] && (board [n][n]=='x' || board [n][n]=='o')){
      changeXO();
      printBoard();
      System.out.println(xo + " is the winner!!!!");          
      return true;
    }
    //end of vertical
    
    else if(board [5][5]==board[4][4] && board[4][4] == board[3][3] && board[3][3] == board[2][2] && (board [5][5]=='x' || board [5][5]=='o')){
      changeXO();
      printBoard();
      System.out.println(xo + " is the winner!!!!");          
      return true;
    }
    else if(board [5][4]==board[4][3] && board[4][3] == board[3][2] && board[3][2] == board[2][1] && (board [5][4]=='x' || board [5][4]=='o')){
      changeXO();
      printBoard();
      System.out.println(xo + " is the winner!!!!");          
      return true;
    }
    else if(board [5][3]==board[4][2] && board[4][2] == board[3][1] && board[3][1] == board[2][0] && (board [5][3]=='x' || board [5][3]=='o')){
      changeXO();
      printBoard();
      System.out.println(xo + " is the winner!!!!");          
      return true;
    }
    //end part 1 of diagonal checks
    else if(board [5][2]==board[4][3] && board[4][3] == board[3][4] && board[3][4] == board[2][5] && (board [5][2]=='x' || board [5][2]=='o')){
      changeXO();
      printBoard();
      System.out.println(xo + " is the winner!!!!");          
      return true;
    }
    else if(board [5][1]==board[4][2] && board[4][2] == board[3][3] && board[3][3] == board[2][4] && (board [5][1]=='x' || board [5][1]=='o')){
      changeXO();
      printBoard();
      System.out.println(xo + " is the winner!!!!");          
      return true;
    }
    else if(board [5][0]==board[4][1] && board[4][1] == board[3][2] && board[3][2] == board[2][3] && (board [5][0]=='x' || board [5][0]=='o')){
      changeXO();
      printBoard();
      System.out.println(xo + " is the winner!!!!");          
      return true;
    }
    //end of diagonal
    
    else
      return false;

    
  }//end of checkWinner
  
  
}//end class