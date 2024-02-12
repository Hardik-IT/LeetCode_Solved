class Solution {
    // O (9(n^2))
    public void solveSudoku(char[][] board) {
        fillSudoku(board,0,0);
    }

    public boolean fillSudoku(char board[][],int row,int col){
        if(col==board[0].length){
            row++;
            col=0;
        }
        if(row==board.length) return true;

        if(board[row][col]=='.'){
            for(char num='1';num <='9';num++){
                if(isValid(board,row,col,num)){
                    board[row][col]=num;
                    if(fillSudoku(board,row,col+1)) return true;
                    board[row][col]='.';
                }
            }
            return false;
        }
        return fillSudoku(board,row,col+1);
    }
    public boolean isValid(char board[][],int row,int col,char num){
        //v row
        for(int c=0;c<9;c++)
            if(board[row][c]==num) return false;
        //v col
        for(int r=0;r<9;r++)
            if(board[r][col]==num) return false;

        // check grid
        int sR = (row/3)*3;
        int sC = (col/3)*3;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(board[sR+i][sC+j]==num){
                    return false;
                }
            }
        }
        return true;
    }

}