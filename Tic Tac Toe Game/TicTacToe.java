import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {

        //Initialising the board
        char[][] board = new char[3][3];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                board[i][j]=' ';
            }
        }

      char player='X';
      boolean gameOver=false;
      Scanner in = new Scanner(System.in);

      //Main Logic
      while(!gameOver){
          printBoard(board);
          System.out.println("Player "+player+" enter: ");
          int i = in.nextInt();
          int j = in.nextInt();

          if(board[i][j]==' '){
              board[i][j]= player;
              gameOver= haveWon(board,player);
              if(gameOver){
                  System.out.println("Player "+player+" has WON!");
                  printBoard(board);
              }else{
                  if(player=='X'){
                      player='O';
                  }else{
                      player='X';
                  }
              }
          } else{
              System.out.println("Invalid Move, Change Location");
          }
      }

    }

    //checking winning conditions.
    public static boolean haveWon(char[][] board, char player) {
        for(int i=0;i<board.length;i++){ //row check
            if(board[i][0]==player && board[i][1]==player && board[i][2]==player){
                return true;
            }
        }

        for(int j=0;j<board[0].length;j++){ //colums check
            if(board[0][j]==player && board[1][j]==player && board[2][j]==player){
                return true;
            }
        }

        //diagonal checks
         if(board[0][0]==player && board[1][1]==player && board[2][2]==player){
             return true;
         }
         if(board[0][2]==player && board[1][1]==player && board[2][0]==player){
             return true;
         }
         return false;
    }

    //printing the board
    public static void printBoard(char[][] board) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                System.out.print("|"+board[i][j]+"|");
            }
            System.out.println();
        }
    }


}
 
