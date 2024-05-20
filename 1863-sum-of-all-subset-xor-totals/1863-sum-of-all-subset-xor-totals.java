class Solution {
    int total = 0;
    public int subsetXORSum(int[] nums) {
        calculateXOR(nums, 0, 0);

        return total;
    }

    public void calculateXOR(int[] nums, int idx, int xor){
        if(idx == nums.length){
            total += xor;
            return;
        }

        calculateXOR(nums, idx+1, xor^nums[idx]);
        calculateXOR(nums, idx+1, xor);
    }
}