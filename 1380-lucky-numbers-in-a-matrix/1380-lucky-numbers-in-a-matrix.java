class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;

        for(int i=0; i<m; i++){
            boolean flag = true;
            int val = Integer.MAX_VALUE;
            int idx = 0;
            for(int j=0; j<n; j++){
                if(matrix[i][j] < val){
                    val = matrix[i][j];
                    idx = j;
                }
            }
            for(int j=0; j<m; j++){
                if(val < matrix[j][idx]){
                    flag = false;
                    break;
                }
            }
            if(flag){
                list.add(val);
            }
        }

        return list;
    }
}