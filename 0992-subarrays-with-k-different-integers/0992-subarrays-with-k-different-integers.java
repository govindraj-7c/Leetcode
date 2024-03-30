class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return slidingWindow(nums, k) - slidingWindow(nums, k-1);
    }
    public int slidingWindow(int[] nums, int k){
        HashMap<Integer, Integer> map = new HashMap<>();
        int left = 0, right = 0;
        int n = nums.length;
        int count = 0;

        while(right < n){
            map.put(nums[right], map.getOrDefault(nums[right],0)+1);

            while(map.size() > k){
                map.put(nums[left], map.getOrDefault(nums[left], 0)-1);
                if(map.get(nums[left]) == 0){
                    map.remove(nums[left]);
                }
                left++;
            }

            count += (right-left+1);
            right++;
        }
        return count;
    }
}