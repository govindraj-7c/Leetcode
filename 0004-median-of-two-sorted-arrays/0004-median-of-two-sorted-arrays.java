class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<nums1.length; i++){
            list.add(nums1[i]);
        }
        for(int i=0; i<nums2.length; i++){
            list.add(nums2[i]);
        }
        int[] arr = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            arr[i] = list.get(i);
        }
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length-1;
        int mid = left + (right-left)/2;
        double ans = 0;
        if(arr.length%2 == 0){
            ans = (double) (arr[mid]+arr[mid+1])/2;
        }
        else if(arr.length%2 != 0){
            ans = (double) (arr[mid]);
        }
        return ans;
    }
}