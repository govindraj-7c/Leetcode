class Solution {
    public int specialArray(int[] nums) {
        int x = 0;
        for(int i=0; i<nums.length*2; i++){
            int count = 0;
            for(int j=0; j<nums.length; j++){
                if(nums[j] >= x){
                    count++;
                }
            }
            if(x == count){
                return x;
            }
            x++;
        }
        return -1;
    }
}