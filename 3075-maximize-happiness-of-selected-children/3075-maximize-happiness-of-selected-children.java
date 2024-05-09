class Solution {
    public long maximumHappinessSum(int[] h, int k) {
        Arrays.sort(h);
        int pointer = 0;
        long ans = 0;

        for(int i=h.length-1; i>=h.length-k; i--){
            int num = h[i] - pointer;
            if(num > 0){
                ans += num;
            }
            pointer++;
        }

        return ans;
    }
}