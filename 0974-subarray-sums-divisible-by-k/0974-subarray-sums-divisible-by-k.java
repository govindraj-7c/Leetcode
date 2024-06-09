class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int prefixSum = 0;
        map.put(0,1);
        int ans = 0;

        for(int i=0; i<nums.length; i++){
            prefixSum += nums[i];
            int rem = prefixSum % k;
            if(rem < 0){
                rem += k;
            }
            if(map.containsKey(rem)){
                ans += map.get(rem);
                map.put(rem, map.get(rem) + 1);
            }
            else{
                map.put(rem, 1);
            }
        }

        return ans;
    }
}