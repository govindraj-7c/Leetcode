class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int no : nums){
            if(set.contains(no)){
                return true;
            }
            set.add(no);
        }
        return false;
    }
}