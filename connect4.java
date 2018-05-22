/*
  Lynn Takahashi
  
  Lab 21: Complete implementation for each function 
    to complete this Tic Tac Toe game!
  
*/

import java.util.*;

public class connect4{
  
  //declare 2d array to hold X's and O's to represent board
  static char[][] board = {
                            {' ', ' ', ' ', ' ', ' ', ' '},
                            {' ', ' ', ' ', ' ', ' ', ' '},
                            {' ', ' ', ' ', ' ', ' ', ' '},
                            {' ', ' ', ' ', ' ', ' ', ' '},
                            {' ', ' ', ' ', ' ', ' ', ' '},
                            {' ', ' ', ' ', ' ', ' ', ' '}
                          };
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
      System.out.println("It is " + xo + "'s turn. Please enter 0, 1, 2, 3, 4, 5 for row");
      row = input.nextInt();
      System.out.println("Please enter 0, 1, 2, 3, 4, 5 for col");
      col = input.nextInt();
      move(row, col);
      if(checkWinner()){
        gameOver = true;
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

            System.out.println("-------------------------");

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
  public static void move(int row, int col){
    
    if(board[row][col] == 'x'||board[row][col] == 'o'){
      System.out.println("There is already a marker here, try again.");
    }
      else{
        board[row][col] = xo;
        changeXO();
      }
    
 

  }//end of move
  
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