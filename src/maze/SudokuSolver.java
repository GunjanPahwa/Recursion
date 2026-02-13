package maze;

public class SudokuSolver {
    public static void main(String[] args) {

    }
    static boolean solve(int[][] board){
        int n=board.length;
        int row=-1;
        int col=-1;
        boolean emptyLeft=true;
        //this is how we are replacing r,c from arguments
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]==0){//empty place
                    row=i;
                    col=j;
                    emptyLeft=false;
                    break; //this means we got one possible answer
                }
            }
            //if you found some empty element in row then break
            if(emptyLeft==false){
                break;
            }

        }
        if(emptyLeft==true){//if i did not find empty places then sudoku is solved
            return true;

        }
        //backtrack
        for(int number=1;number<=9;number++){
            if(isSafe(board,row,col,number)){
                board[row][col]=number;
                if(solve(board)){
                    display(board);
                    return true;
                }else{
                    //backtrack
                    board[row][col]=0;
                }
            }
        }
        return false;
    }
    private static void display(int[][] board){
        for(int[] row:board){
            for(int num:row){
                System.out.print(num+"");
                System.out.println();
            }
        }
    }
    static boolean isSafe(int[][] board, int row, int col, int num){
        //check the row
        for(int i=0;i<board.length;i++){
            //check if the number is already in row or not
            if(board[row][col]==num){
                return false;
            }
        }
        for(int[] nums:board){
            //check if the number is already in row or not
            if(nums[col]==num){ //same col for every row
                return false;
            }
        }
        int sqrt=(int)(Math.sqrt(board.length));
        int rowStart=row-row%sqrt;
        int colStart=col-col%sqrt;
        for(int r=rowStart;r<rowStart+sqrt;r++){
            for(int c=colStart;c<colStart+sqrt;c++){
                if(board[r][c]==num){
                    return false;
                }

            }
        }
        return true;
    }

}
