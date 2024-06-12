class Solution {
    public void sortColors(int[] nums) {
        int[] occ = new int[3];
        int n = nums.length;
        for(int no : nums){
            occ[no]++;
        }
        int j = 0;
        for(int i=0; i<occ.length; i++){
            while(occ[i] > 0){
                nums[j] = i;
                j++;
                occ[i]--;
            }
        }
    }
}