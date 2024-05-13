class Solution {
    public int matrixScore(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        for(int row=0; row<m; row++){
            if(grid[row][0] == 0){
                flipRow(grid, row);
            }
        }

        for(int col=1; col<n; col++){
            int countOne = 0;
            int countZero = 0;
            for(int row=0; row<m; row++){
                if(grid[row][col] == 1){
                    countOne++;
                }
                else{
                    countZero++;
                }
            }
            if(countOne < countZero){
                flipCol(grid, col);
            }
        }

        int totalSum = 0;
        for(int[] rows : grid){
            totalSum += calculateTotal(rows);
        }

        return totalSum;
    }
    private void flipRow(int[][] grid, int row){
        for(int col=0; col<grid[0].length; col++){
            grid[row][col] = 1 - grid[row][col];
        }
    }
    private void flipCol(int[][] grid, int col){
        for(int row=0; row<grid.length; row++){
            grid[row][col] = 1 - grid[row][col];
        }
    }
    private int calculateTotal(int[] rows){
        int ans = 0;
        for(int no : rows){
            ans = ans*2 + no;
        }
        return ans;
    }
}