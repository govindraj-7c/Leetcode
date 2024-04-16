class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] map = new int[1001];
        int[] res = new int[1001];

        int count = 0;
        for(int no : nums2)
            map[no]++;

        for(int no : nums1){
            if(map[no] > 0){
                res[count++] = no;
                map[no]--;
            }
        }

        return Arrays.copyOfRange(res, 0, count);
    }
}