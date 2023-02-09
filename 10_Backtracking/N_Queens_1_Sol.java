public class N_Queens_1_Sol
{
  public static void main (String args[])
  {
    int n = 1 ;
    char board[][] = new char[n][n];
    // initialize
    for (int i = 0; i < board.length; i++) 
    {
        for (int j = 0; j < board.length; j++) 
        {
            board[i][j] = 'X' ;
        }
    }
    if(nQueens(board, 0))
    {
       System.out.println("Solution is possible ");
       printBoard(board);
    }
    else
    {
       System.out.println("Solution is not possible");
    }
  }
public static boolean isSafe(char board[][], int row, int col) {
        // vetical up
        for (int i = row-1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // diag left up
        for (int i = row - 1 , j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // diag right up
        for (int i = row - 1 , j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;

    }

    public static boolean nQueens(char board[][], int row) {
        // base
        if (row == board.length) {
            // printBoard(board);
            count++;
            return true;
        }
        // column loop
        for (int j = 0; j < board.length; j++) {
                if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                if(nQueens(board, row+1)){       //fxn call
                    return true ;
                } 
                board[row][j] = 'X'; //backtracking step
            }
        }
        return false;
    }

    public static void printBoard(char board[][]) {
        System.out.println("----------------- Chess Board ---------------------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    static int count = 0 ;
}  
