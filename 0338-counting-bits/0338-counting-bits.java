class Solution {
    public int[] countBits(int n) {
        int[] arr = new int[n+1];
        int ans = 0;
        arr[0] = 0;
        for(int i=1; i<=n; i++){
            int no = i;
            while(no!=0){
                ans += no&1;
                no >>>= 1;
            }
            arr[i] = ans;
            ans = 0;
        }
        return arr;
    }
}