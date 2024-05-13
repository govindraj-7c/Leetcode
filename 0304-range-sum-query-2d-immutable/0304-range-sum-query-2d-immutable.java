class NumMatrix {
    int[][] temp;
    public NumMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        temp = new int[m+1][n+1];

        for(int i=0; i<m; i++){
            int sum = 0;
            for(int j=0; j<n; j++){
                sum += matrix[i][j];
                temp[i+1][j+1] = sum;
            }
        }

    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int ans = 0;
        for(int i=row1; i<=row2; i++){
            ans += temp[i+1][col2+1] - temp[i+1][col1];
        }
        return ans;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */