class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        HashSet<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
        
        for(int i=0; i<nums.length-3; i++){
            for(int j=i+1; j<nums.length-2; j++){
                int k = j+1;
                int l = nums.length-1;

                while(k<l){
                    long sum = (long) nums[i] + nums[j] + nums[k] + nums[l];

                    if(sum == target) {
                        set.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));
                        k++;
                        // l--;
                    }

                    else if(sum < target){
                        k++;
                    }
                    else{
                        l--;
                    }
                }
            }
        }
        List<List<Integer>> ans = new ArrayList<>();
        ans.addAll(set);

        return ans;
    }
}