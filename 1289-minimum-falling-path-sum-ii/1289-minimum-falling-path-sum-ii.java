class Solution {
    public int minFallingPathSum(int[][] grid) {
        if(grid.length == 1){
            return grid[0][0];
        }

        int[][] dp = new int[grid.length][grid.length];
        for(int[] i : dp){
            Arrays.fill(i,-1);
        }

        int ans = Integer.MAX_VALUE;
        for(int i=0; i<grid.length; i++){
            ans = Math.min(ans, minimumSum(grid, 0, i, dp));
        }
        return ans;
    }

    public int minimumSum(int[][] grid, int row, int col, int[][] dp){
        if(col<0 || col>grid.length-1){
            return 0;
        }
        if(row == grid.length-1) return grid[row][col];

        if(dp[row][col] != -1) return dp[row][col];

        int ans = Integer.MAX_VALUE;
        for(int i=0; i<grid.length; i++){
            if(i == col) continue;
            ans = Math.min(ans, grid[row][col] + minimumSum(grid, row+1, i, dp));
        }
        return dp[row][col] = ans;
    }
}