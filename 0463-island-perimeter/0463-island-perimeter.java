class Solution {
    public int islandPerimeter(int[][] grid) {
        int counter = 0;
        int m = grid.length;
        int n = grid[0].length;

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j] == 1){
                    counter = findIsland(grid, i, j, counter, m, n);
                }
            }
        }
        return counter;
    }
    public int findIsland(int[][] grid, int i, int j, int counter, int m, int n){
        int[] rowT = {0,0,-1,1};
        int[] colT = {1,-1,0,0};

        for(int k=0; k<4; k++){
            int rowG = i+rowT[k];
            int colG = j+colT[k];

            if(rowG<m && rowG>=0 && colG<n && colG>=0 && grid[rowG][colG] == 0){
                counter++;
            }

            else if(rowG<0 || rowG>=m || colG<0 || colG>=n){
                counter++;
            }
        }
        return counter;
    }
}