class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        int n = profits.length;
        int[][] cp = new int[n][2];
        for(int i=0; i<n; i++){
            cp[i][0] = profits[i];
            cp[i][1] = capital[i];
        }
        Arrays.sort(cp, (a,b) -> b[0] - a[0]);
        int j = 0;
        while(k>0 && j!=n){
            for(int i=0; i<n; i++){
                if(w >= cp[i][1] && cp[i][1] != -1){
                    w += cp[i][0];
                    cp[i][0] = -1;
                    cp[i][1] = -1;
                    j++;
                    break;
                }
            }
            k--;
        }

        return w;
    }
}