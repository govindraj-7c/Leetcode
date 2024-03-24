class Solution {
    public int findDuplicate(int[] nums) {
        boolean[] visited = new boolean[nums.length];
        for(int no : nums){
            if(visited[no]){
                return no;
            }
            visited[no] = true;
        }
        return 0;
    }
}