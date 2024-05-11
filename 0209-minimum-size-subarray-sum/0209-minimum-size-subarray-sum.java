class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int left = 0, right = 0;
        int ans = Integer.MAX_VALUE;
        int sum = 0;

        while(left<=right && right<n){
            sum += nums[right];

            if(sum < target){
                right++;
            }
            else {
                while(sum >= target){
                    int length = (right-left)+1;
                    ans = Math.min(ans, length);
                    sum -= nums[left];
                    left++;
                }
                right++;
            }
        }
        if(ans == Integer.MAX_VALUE) return 0;
            
        return ans;
    }
}