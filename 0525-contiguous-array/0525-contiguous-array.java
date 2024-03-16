class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int prefixSum = 0;
        map.put(prefixSum,-1);
        int len = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0){
                prefixSum += -1;
            }
            else{
                prefixSum += 1;
            }
            if(map.containsKey(prefixSum)){
                len = Math.max(len, (i-map.get(prefixSum)));
            }
            else{
                map.put(prefixSum,i);
            }
        }
        return len;
    }
}