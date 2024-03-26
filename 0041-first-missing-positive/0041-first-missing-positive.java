class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int counter = 1;
        for(int no : nums){
            set.add(no);
        }
        int i = 0;
        while(set.size() > i){
            if(set.contains(counter)){
                counter++;
            }
            else{
                break;
            }
            i++;
        }
        return counter;
    }
}