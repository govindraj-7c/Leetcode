class Solution {
    int[] row = {0,1,0,-1};
    int[] col = {-1,0,1,0};
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(word.charAt(0) == board[i][j]){
                    boolean ans =  solution(board, word, m, n, i,j, 0);
                    if(ans) return true;
                }
            }
        }
        return false;
    }
    public boolean solution(char[][] board, String word, int m, int n, int i, int j, int cur){

        if(cur == word.length()) return true;

        if(i<0 || j<0 || i>= m || j>=n || board[i][j] != word.charAt(cur)) {
            return false;
        }

        board[i][j] = '$';

        for(int k=0; k<4; k++){
            boolean ans = solution(board, word, m, n, i+row[k], j+col[k], cur+1);
            if(ans == true){
                return true;
            }
        }

        board[i][j] = word.charAt(cur);
        return false;
    }
}