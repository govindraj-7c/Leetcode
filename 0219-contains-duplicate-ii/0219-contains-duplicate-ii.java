class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int j = 0;
        for(Integer no : nums){
            if(map.containsKey(no)){
                if(j!=map.get(no) && Math.abs(map.get(no) - j) <= k){
                    return true;
                }
                else{
                    map.put(no,j);
                }
            }
            else{
                map.put(no, j);
            }
            j++;
        }
        return false;
    }
}