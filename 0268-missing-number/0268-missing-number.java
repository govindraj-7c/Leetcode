import java.util.*;
class Solution {
    public int missingNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int len = nums.length;
        int no = 0;
        for(int i=0; i<nums.length; i++){
            set.add(nums[i]);
        }
        for(int i=0; i<=len; i++){
            if(!set.contains(i)){
                no = i;
            }
        }
        return no;
    }
}