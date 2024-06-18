class Solution {
    public boolean canJump(int[] nums) {
        int len = nums.length-1;
        if(len == 0) return true;
        int idx = 0;
        int ele = nums[idx];

        while(ele > 0){
            if(ele >= len){
                return true;
            }
            idx++;
            ele--;
            len--;
            if(ele < nums[idx]){
                ele = nums[idx];
            }
        }
        return false;
    }
}