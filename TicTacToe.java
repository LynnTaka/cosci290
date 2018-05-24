/*
  Lynn Takahashi
  
  Lab 21: Complete implementation for each function 
    to complete this Tic Tac Toe game!
  
*/

import java.util.*;

public class TicTacToe{
  
  //declare 2d array to hold X's and O's to represent board
  static char[][] board = {
                            {' ', ' ', ' '},
                            {' ', ' ', ' '},
                            {' ', ' ', ' '}
                          };
  static char xo = 'x'; //holds which player is currently playing
  static boolean gameOver = false; //ends the loop if there is a winner
    
  //start of program
  public static void main(String[] args){
    
    //declare variables
    Scanner input = new Scanner(System.in);
    int row = 0;
    int col = 0;
    
    System.out.println("Let's play Tic Tac Toe!");
       
    //while there isn't a winner
    while(!gameOver){
      printBoard();
      System.out.println("It is " + xo + "'s turn. Please enter 0, 1, 2 for row");
      row = input.nextInt();
      while(row>2 || row<0){
        System.out.println("Please input a valid number");
        row = input.nextInt();
      }
      System.out.println("Please enter 0, 1, 2 for col");
      col = input.nextInt();
      while(col>2 || col<0){
        System.out.println("Please input a valid number");
        col = input.nextInt();
      }
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
    
	    System.out.println("-------------");

         
		//rows
        for (int i = 0; i < 3; i++) {

            System.out.print("| ");
			
			//columns
            for (int j = 0; j < 3; j++) {

                System.out.print(board[i][j] + " | ");

            }

            System.out.println();

            System.out.println("-------------");

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
    
	//go through all possibilities
	if(board [0][0]==board[1][0] && board[1][0] == board[2][0] && (board [0][0]=='x' || board [0][0]=='o')){
      changeXO();
      printBoard();
      System.out.println(xo + " is the winner!!!!");          
      return true;
  }
    else if(board [0][1]==board[1][1] && board[1][1] == board[2][1] && (board [0][1]=='x' || board [0][1]=='o')){
      changeXO();
      printBoard();
      System.out.println(xo + " is the winner!!!!");          
      return true;
    }
    else if(board [0][2]==board[1][2] && board[1][2] == board[2][2] && (board [0][2]=='x' || board [0][2]=='o')){
      changeXO();
      printBoard();
      System.out.println(xo + " is the winner!!!!");          
      return true;
    }
    else if(board [0][0]==board[0][1] && board[0][1] == board[0][2] && (board [0][0]=='x' || board [0][0]=='o')){
      changeXO();
      printBoard();
      System.out.println(xo + " is the winner!!!!");          
      return true;
    }
    else if(board [1][0]==board[1][1] && board[1][1] == board[1][2] && (board [1][0]=='x' || board [1][0]=='o')){
      changeXO();
      printBoard();
      System.out.println(xo + " is the winner!!!!");          
      return true;
    }
    else if(board [2][0]==board[2][1] && board[2][1] == board[2][2] && (board [2][0]=='x' || board [2][0]=='o')){
      changeXO();
      printBoard();
      System.out.println(xo + " is the winner!!!!");          
      return true;
    }
    else if(board [0][0]==board[1][1] && board[1][1] == board[2][2] && (board [0][0]=='x' || board [0][0]=='o')){
      changeXO();
      printBoard();
      System.out.println(xo + " is the winner!!!!");          
      return true;
    }
    else{
      if(board [2][0]==board[1][1] && board[1][1] == board[0][2] && (board [2][0]=='x' || board [2][0]=='o')){
      changeXO();
      printBoard();
      System.out.println(xo + " is the winner!!!!");          
      return true;
      }
    }
    
    int counter = 0;
    for(int i=0; i<3; i++){
      for(int j = 0; j<3; j++){ 
        if(board[i][j] != ' '){
         counter ++;
          if(counter>8){
          printBoard();
          System.out.println("There are no winners this game is a draw!");
          return true;         
      }
          
      
        }
         
      }
        
    }
    
    
      return false;

    
  }//end of checkWinner
  
  
}//end class

