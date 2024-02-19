class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        HashSet<List<Integer>> temp = new HashSet<>();
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){
            int j = i+1;
            int k = nums.length - 1;
            while(j<k){
                int add = nums[i] + nums[j] + nums[k];
                if(add == 0){
                    temp.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                }
                else if(add < 0){
                    j++;
                }
                else{
                    k--;
                }
            }
        }
        ans.addAll(temp);
        return ans;
    }
}