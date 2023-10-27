public class SudokuSolver {
    public static void main(String[] args) {
        int[][] board = new int[][]{
                {3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0}
        };

        if (solve(board)) {
            display(board);
        } else {
            System.out.print("Cannot solve");
        }
    }

    static boolean solve(int[][] board){
        int n= board.length;
        int r=-1;
        int c=-1;

        boolean emptyleft = true;

        // Find the first empty cell
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]==0){
                    r=i;
                    c=j;
                    emptyleft=false;
                    break;
                }
            }

            if(!emptyleft){
                break;
            }

        }

        // If no empty cells are left, the puzzle is solved.
        if(emptyleft){
                return true;}

        // Try placing numbers 1-9 and backtrack if a solution is not found
        for(int num=1;num<10;num++){
            if(issafe(board,r,c,num)){
                board[r][c]=num;
                if(solve(board)){
                    return true ; //found a solution
                } else{
                    board[r][c]=0; //Backtrack
                }
            }
        }
        return false;
    }


    static void display(int[][] board){
        for(int[] r : board){
            for(int num :r){
                System.out.print(num + " ");

            }
            System.out.println();
        }
    }



     static boolean issafe(int[][] board, int r,int c, int num){
        //check the row
         for(int i=0;i<board.length;i++){
             if(board[r][i]==num){
                 return false;
             }
         }
         //check the column
         for(int i=0;i<board[0].length;i++){
             if(board[i][c]==num){
                 return false;
             }
         }

         //check the mini-box
         int sqrt = (int)(Math.sqrt(board.length));
         int start = r-r%sqrt;
         int end=c-c%sqrt;
         for(int i=start;i<start+sqrt;i++){
             for (int j = end; j <end+sqrt ; j++) {
             //check if number is in box or not
             if(board[i][j]==num) {
                 return false;
                }
             }
         }
         // The number is safe to place in the cell
         return true;
     }
}
