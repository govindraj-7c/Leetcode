class NumArray {
    int[] arr;
    public NumArray(int[] nums) {
        arr = Arrays.copyOf(nums, nums.length);
    }
    
    public int sumRange(int left, int right) {
        int ans = 0;
        for(int i=left; i<=right; i++){
            ans += arr[i];
        }
        return ans;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */