package advanceDsa;

import java.util.ArrayList;
import java.util.List;

public class Nqueen {
    public static boolean isSafe(int row,int col,char board[][]){
        //for row
        for(int j=0; j<board.length; j++) {
            if(board[row][j] == 'Q') {
                return false;
            }
        }

        //vertical
        for(int i=0; i<board.length; i++) {
            if(board[i][col] == 'Q') {
                return false;
            }
        }

        //upper left
        int r = row;
        for(int c=col; c>=0 && r>=0; c--, r--) {
            if(board[r][c] == 'Q') {
                return false;
            }
        }

        //upper right
        r = row;
        for(int c=col; c<board.length && r>=0; r--, c++) {
            if (board[r][c] == 'Q') {
                return false;

            }
        }



        r = row;
        for(int c=col; c>=0 && r<board.length; r++, c--) {
            if(board[r][c] == 'Q') {
                return false;
            }
        }

        //lower right
        for(int c=col; c<board.length && r<board.length; c++, r++) {
            if(board[r][c] == 'Q') {
                return false;
            }
        }

        return true;
    }





    public static void saveBoard(char[][]board ,List<List<String>> allBoards){
        List<String>newBoard=new ArrayList<>();
        for (int row=0;row< board.length;row++){
            for (int col=0;col< board[0].length;col++){
                if (board[row][col]=='Q'){
                    newBoard.add("Q");
                }
                else {
                    newBoard.add(".");
                }
            }
        }
        allBoards.add(newBoard);
    }
    public static void helper(char board[][], List<List<String>> allBoards, int col){
        if(col==board.length){
            saveBoard(board,allBoards);
            return;
        }
        for (int row=0;row<board.length;row++){
            if(isSafe(row,col,board)){
                board[row][col]='Q';
                helper(board,allBoards,col+1);
                board[row][col]='.';
            }
        }
    }


    public static void main(String[] args) {
        List<List<String>> allBoards =new ArrayList<>();
        int n=4;
        char[][]board=new char[n][n];
       helper(board,allBoards,0);
        System.out.print(allBoards);

    }

}
