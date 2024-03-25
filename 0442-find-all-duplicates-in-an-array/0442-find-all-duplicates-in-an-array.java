class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int[] arr = new int[nums.length+1];
        for(int i=0; i<nums.length; i++){
            int val = nums[i];
            if(arr[val] == 1){
                list.add(nums[i]);
            }
            arr[val]++;
        }
        return list;
    }
}