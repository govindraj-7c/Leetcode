class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int n = nums.length;
        int[] sorted = new int[n];
        
        for(int i=0; i<n; i++){
            sorted[i] = nums[i];
        }

        Arrays.sort(sorted);
        int start = -1, end = 0;

        for(int i=0; i<n; i++){
            if(nums[i] != sorted[i]){
                start = i;
                break;
            }
        }

        if(start == -1) return 0;

        for(int i=n-1; i>=0; i--){
            if(nums[i] != sorted[i]){
                end = i;
                break;
            }
        }

        return end-start+1;
    }
}