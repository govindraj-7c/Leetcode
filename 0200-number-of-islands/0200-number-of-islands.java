class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int counter = 0;

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j] == '1'){
                    islandTraverse(grid,m,n,i,j);
                    counter++;
                }
            }
        }

        return counter;
    }
    public void islandTraverse(char[][] grid, int m, int n, int i, int j){
        int[] rowT = {0,0,-1,1};
        int[] colT = {1,-1,0,0};

        grid[i][j] = '$';

        for(int k=0; k<4; k++){
            int rowG = i+rowT[k];
            int colG = j+colT[k];

            if(rowG<m && rowG>=0 && colG<n && colG>=0 && grid[rowG][colG] == '1'){
                islandTraverse(grid, m, n, rowG, colG);
            }
        }
    }
}