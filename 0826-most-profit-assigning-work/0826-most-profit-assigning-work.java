class Solution {
    public int maxProfitAssignment(int[] d, int[] p, int[] w) {
        int n = p.length;
        int[][] arr = new int[n][2];
        int totalProfit = 0;
        Arrays.sort(w);

        for(int i=0; i<d.length; i++){
            arr[i][0] = d[i];
            arr[i][1] = p[i];
        }

        Arrays.sort(arr, (a,b) -> a[0] - b[0]);

        for(int i=0; i<w.length; i++){
            int j=0;
            int maxP = Integer.MIN_VALUE;
            while(j<n && arr[j][0] <= w[i]){
                maxP = Math.max(maxP, arr[j][1]);
                j++;
            }
            if(maxP != Integer.MIN_VALUE){
                totalProfit += maxP;
            }
        }

        return totalProfit;
    }
}