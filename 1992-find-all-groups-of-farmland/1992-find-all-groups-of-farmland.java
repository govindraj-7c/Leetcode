class Solution {
    public int[][] findFarmland(int[][] land) {
        int m = land.length;
        int n = land[0].length;
        ArrayList<int[]> pos = new ArrayList<>();

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(land[i][j] == 1){
                    int[] maxPos = {i,j};
                    landTraversal(land, m, n, i, j, maxPos);

                    pos.add(new int[]{i, j, maxPos[0], maxPos[1]});
                }
            }
        }

        int[][] ans = new int[pos.size()][4];

        for(int i=0; i<pos.size(); i++){
            ans[i] = pos.get(i);
        }

        return ans;
    }

    public void landTraversal(int[][] land, int m, int n, int i, int j, int[] maxPos){
        land[i][j] = 0;
        int[] rowT = {0,0,-1,1};
        int[] colT = {1,-1,0,0};

        for(int k=0; k<4; k++){
            int rowG = i+rowT[k];
            int colG = j+colT[k];

            if(rowG<m && rowG>=0 && colG<n && colG>=0 && land[rowG][colG] == 1){
                maxPos[0] = Math.max(maxPos[0], rowG);
                maxPos[1] = Math.max(maxPos[1], colG);

                landTraversal(land, m, n, rowG, colG, maxPos);
            }

        }
    }
}