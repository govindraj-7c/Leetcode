class NumArray {
    int[] temp;
    public NumArray(int[] nums) {
        temp = new int[nums.length + 1];

        int sum = 0;
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
            temp[i+1] = sum;
        }

    }
    
    public int sumRange(int left, int right) {
        return temp[right + 1] - temp[left];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */