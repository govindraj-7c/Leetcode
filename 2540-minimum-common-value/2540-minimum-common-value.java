class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int i=0;
        int j=0;
        int length1 = nums1.length;
        int length2 = nums2.length;
        if (nums1[length1-1] < nums2[0] || nums2[length2-1] < nums1[0])
            return -1;
        while(i>=0 && j>=0 && i<nums1.length && j<nums2.length){
            if(nums1[i] == nums2[j]) return nums1[i];
            else if(nums1[i] < nums2[j]){
                i++;
            }
            else if(nums2[j] < nums1[i]){
                j++;
            }
        }
        return -1;
    }
}