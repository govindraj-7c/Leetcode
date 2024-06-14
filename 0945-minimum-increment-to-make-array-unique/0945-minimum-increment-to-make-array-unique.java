class Solution {
    public int minIncrementForUnique(int[] nums) {
        int n = nums.length;
        if(n==1) return 0;
        // int max = Integer.MIN_VALUE;
        int ans = 0;
        // for(int no : nums){
        //     max = Math.max(max, no);
        // }
        boolean[] arr = new boolean[1000001];

        for(int i=0; i<n; i++){
            int ele = nums[i];
            while(arr[ele]){
                ans++;
                ele++;
            }
            arr[ele] = true;
        }

        return ans;
    }
}