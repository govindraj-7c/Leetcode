class Solution {
    public int minOperations(int[] nums, int k) {
        int exor = 0;
        int count = 0;

        for(int i=0; i<nums.length; i++){
            exor = exor^nums[i];
        }

        int res = exor^k;

        while(res != 0){
            count += res & 1;
            res = res>>1; 
        }

        return count;
    }
}