class Solution {
    public int[][] construct2DArray(int[] o, int m, int n) {
        int[][] ans = new int[m][n];
        int idx = 0;

        if((m*n) != o.length){
            return new int[0][0];
        }

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                ans[i][j] = o[idx++];
            }
        }

        return ans;
    }
}