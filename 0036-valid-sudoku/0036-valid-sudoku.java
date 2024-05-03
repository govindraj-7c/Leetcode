class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set seen = new HashSet();
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                char no = board[i][j];

                if(no != '.'){
                    if(!seen.add(no + " in row " + i) || !seen.add(no + " in column " + j) || !seen.add(no + " in block " + i/3 + "-" + j/3)){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}