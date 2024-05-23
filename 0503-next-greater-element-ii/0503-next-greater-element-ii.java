class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] tempArr = new int[n*2];
        int[] ans = new int[n];

        for(int i=0; i<n; i++){
            tempArr[i] = nums[i];
        }
        int j = 0;
        for(int i=n; i<n*2; i++){
            tempArr[i] = nums[j++];
        }

        for(int i=0; i<n; i++){
            for(int k=i+1; k<n*2; k++){
                if(tempArr[k] > nums[i]){
                    ans[i] = tempArr[k];
                    break;
                }
                ans[i] = -1;
            }
        }
        return ans;
    }
}