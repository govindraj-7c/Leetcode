class Solution {
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        for(int i=n-1; i>=0; i--){
            for(int j=0; j<i; j++){
                if(nums[i] == Math.abs(nums[j]) && nums[j] < 0){
                    return nums[i];
                }
            }
        }
        return -1;
    }
}