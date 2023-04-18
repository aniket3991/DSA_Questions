package medium;

public class SudokuValidation {
    public boolean isValidSudoku(char[][] board) {
        boolean[][] checkRow = new boolean[9][9];
        boolean[][] checkColumn = new boolean[9][9];
        boolean[][] checkSquare = new boolean[9][9];



        for(int i = 0; i < 9; i++){

            for(int row = 0; row < 9; row++){
                if(board[i][row] >= '0' && board[i][row] <= '9'){
                    if(checkRow[i][board[i][row] - '0' - 1])
                        return false;
                else
                        checkRow[i][board[i][row] - '0' - 1] = true;
                }
            }
            for(int column = 0; column < 9; column++){
                if(board[column][i] >= '0' && board[column][i] <= '9'){
                    if(checkColumn[board[column][i] - '0' - 1][i])
                        return false;
                    else
                        checkColumn[board[column][i] - '0' - 1][i] = true;
                }
            }
            for(int c = (i / 3) * 3; c < ((i / 3) * 3) + 3 ; c++){
                for(int r = (i % 3) * 3; r < ((i % 3) * 3) + 3; r++){
                    if(board[c][r] >= '0' && board[c][r] <= '9'){
                        if(checkSquare[i][board[c][r] - '0' - 1])
                            return false;
                        else
                            checkSquare[i][board[c][r] - '0' - 1] = true;
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        char[][] board = {{'5', '3', '.', '.', '7', '.', '.', '.', '.'}
                , {'6', '.', '.', '1', '9', '5', '.', '.', '.'}
                , {'.', '9', '8', '.', '.', '.', '.', '6', '.'}
                , {'8', '.', '.', '.', '6', '.', '.', '.', '3'}
                , {'4', '.', '.', '8', '.', '3', '.', '.', '1'}
                , {'7', '.', '.', '.', '2', '.', '.', '.', '6'}
                , {'.', '6', '.', '.', '.', '.', '2', '8', '.'}
                , {'.', '.', '.', '4', '1', '9', '.', '.', '5'}
                , {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};

        SudokuValidation sudokuValidation = new SudokuValidation();
        System.out.println(sudokuValidation.isValidSudoku(board));
    }
}
