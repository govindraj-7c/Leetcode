class Solution {
    public long continuousSubarrays(int[] nums) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        long count = 0;
        int left = 0, right = 0;
        int n = nums.length;

        while(left < n){
            map.put(nums[left], map.getOrDefault(nums[left], 0)+1);
            left++;
            while(Math.abs(map.firstEntry().getKey()-map.lastEntry().getKey())>2){
                map.put(nums[right], map.getOrDefault(nums[right],0)-1);
                if(map.get(nums[right]) == 0){
                    map.remove(nums[right]);
                }
                right++;
            }
            count += left-right;
        }

        return count;
    }
}