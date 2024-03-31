class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        int minIdx = -1, maxIdx = -1, left = -1, right = 0;
        long count = 0;

        while(right < nums.length){
            if(nums[right] < minK || nums[right] > maxK){
                minIdx = right;
                maxIdx = right;
                left = right;
            }
            minIdx = nums[right] == minK ? right : minIdx;
            maxIdx = nums[right] == maxK ? right : maxIdx;
            count += Math.min(minIdx, maxIdx) - left;
            right++;
        }

        return count;
    }
}