class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        calculateSubset(nums, 0, n, ans, new ArrayList<>());
        
        return ans;
    }
    public void calculateSubset(int[] nums, int idx, int n, List<List<Integer>> list, List<Integer> temp){
        list.add(new ArrayList<>(temp));
        for(int i=idx; i<n; i++){
            temp.add(nums[i]);
            calculateSubset(nums, i+1, n, list, temp);
            temp.remove(temp.size() - 1);
        }

    }
}