class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        Queue<int[]> q = new LinkedList<>();

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(matrix[i][j] == 0){
                    q.add(new int[]{i,j});
                }
            }
        }

        while(!q.isEmpty()){
            int[] arr = q.remove();
            int x = arr[0];
            int y = arr[1];
            for(int i=0; i<m; i++){
                for(int j=0; j<n; j++){
                    if(i == x || j == y){
                        matrix[i][j] = 0;
                    }
                }
            }
        }
    }
}