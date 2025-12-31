//package com.mcnz.vector;

public class TicTacTest {

  public static void main(String[] args) 
  {
    char[] board = { '1', '2', '3', 
                     '4', '5', '6', 
                     '7', '8', '9' };

    var numberOfSquaresPlayed = 0;
    var whoseTurnItIs = 'x';

    while (numberOfSquaresPlayed < 9) 
    {
      printTheBoard(board);
      System.out.printf("Choose a square player %s:", whoseTurnItIs);
      var scanner = new java.util.Scanner(System.in);
      var input = scanner.nextInt();
      board[input - 1] = whoseTurnItIs;

      if (  (board[0] + board[1] + board[2] == (whoseTurnItIs * 3)) // first row 
         || (board[3] + board[4] + board[5] == (whoseTurnItIs * 3)) // second row
         || (board[6] + board[7] + board[8] == (whoseTurnItIs * 3)) // third row
         || (board[0] + board[3] + board[6] == (whoseTurnItIs * 3)) // first column
         || (board[1] + board[4] + board[7] == (whoseTurnItIs * 3)) // second column
         || (board[2] + board[5] + board[8] == (whoseTurnItIs * 3)) // third column
         || (board[0] + board[4] + board[8] == (whoseTurnItIs * 3)) // first diagonal
         || (board[2] + board[4] + board[6] == (whoseTurnItIs * 3)) // second diagonal
      ) 
      {
         printTheBoard(board);
         System.out.println("You won!!! Congratulations!");
         break;
      } else {
         numberOfSquaresPlayed++;
         whoseTurnItIs = (whoseTurnItIs == 'x') ? 'o' : 'x';
      }
    }
  }

  private static void printTheBoard(char[] board) 
  {
    System.out.printf("%n %s | %s | %s %n", board[0], board[1], board[2]);
    System.out.println(" - + - + - ");
    System.out.printf(" %s | %s | %s %n", board[3], board[4], board[5]);
    System.out.println(" - + - + - "); 
    System.out.printf(" %s | %s | %s %n%n", board[6], board[7], board[8]);
  }
} /* End of the Java Tic Tac Toe Game */