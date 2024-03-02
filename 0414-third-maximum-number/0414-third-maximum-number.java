class Solution {
    public int thirdMax(int[] nums) {
        int isThird = 1;
        Arrays.sort(nums);
        int i = nums.length - 1;
        int num = nums[nums.length-1];
        while(isThird < 3 && i>0){
            if(nums[i] != nums[i-1]){
                isThird++;
            }
            if(isThird == 3) return nums[i-1];
            i--;
        }
        return num;
    }
}