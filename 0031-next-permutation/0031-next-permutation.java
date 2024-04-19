class Solution {
    public void nextPermutation(int[] nums) {
        int pivotIdx = -1;

        for(int i=nums.length-1; i>0; i--){
            if(nums[i] > nums[i-1]){
                pivotIdx = i-1;
                break;
            }
        }

        int swap_idx = -1;

        if(pivotIdx == -1){
            reverse(nums,0);
        }

        else{
            for(int i=nums.length-1; i>=pivotIdx+1; i--){
            if(nums[i] > nums[pivotIdx]){
                swap_idx = i;
                break;
            }
        }

        swap(nums, pivotIdx, swap_idx);
        reverse(nums, pivotIdx+1);
        }
    }

    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public void reverse(int[] nums, int start){
        int i = start;
        int j = nums.length - 1;

        while(i<j){
            swap(nums, i, j);
            i++;
            j--;
        }
    }
}