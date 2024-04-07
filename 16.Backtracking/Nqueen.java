public class Nqueen {
    public static boolean isSafe(char board[][], int row, int col){
        //vertically up
       // }
         for(int i=row-1; i>=0; i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }
        //horizontally
        // for(int i=0; i<col; i++){
        //     if(board[row][i] == 'Q'){
        //         return false;
        //     }
        // }
        //diagonal left up
        for(int i=row, j= col; i>=0 && j>=0; i--,j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        //daigonal right up
        for(int i=row-1, j=col+1; i>=0 && j<board.length; i--, j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        // lower left diagonal
        // for(int i=row,j=col; i<board.length && j>=0; i++,j--){
        //     if(board[i][j] == 'Q'){
        //         return false;
        //     }
        // }
        return true;
    }

    static int count = 0;
    //for all possible solutions of N Queens problem :
    // public static void nQueens(char board[][] ,int row){
    //     //base
    //     if(row == board.length){
    //         printBoard(board);
    //         count ++;
    //         return;
    //     }
    //      //column loop
    //      for(int j=0; j<board.length; j++){
    //         if(isSafe(board, row, j)){
    //             board[row][j] = 'Q';
    //             nQueens(board, row+1);//function call
    //             board[row][j] = 'x';//backtracking step
    //         }
            
    //      }
    // }
    public static boolean nQueens(char board[][] ,int row){
        //base
        if(row == board.length){
            // printBoard(board);
            count ++;
            return true;
        }
         //column loop
         for(int j=0; j<board.length; j++){
            if(isSafe(board, row, j)){
                board[row][j] = 'Q';
                if(nQueens(board, row+1)){
                    return true;
                } 
                board[row][j] = 'x';//backtracking step
            }
            
         }
         return false;
    }

    public static void printBoard(char board[][]){
        System.out.println("----chess board----");
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                System.out.print(board[i][j]  + " ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int n = 4 ;
        char board[][] = new char[n][n];
        //initialize
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j] = 'x';
            }
        }
        if(nQueens(board, 0)){
            System.out.println("solution is possible");
            printBoard(board);
        } else {
            System.out.println("solution is not possible");
        }
        // nQueens(board, 0);
        // System.out.println("Total ways to solve N queens = " + count);
    }
}
