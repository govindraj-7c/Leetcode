class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[0]-b[0]);

        for(int no : nums1){
            pq.add(new int[]{no+nums2[0], 0});
        }

        while(k>0 && !pq.isEmpty()){
            int[] pair = pq.remove();
            int sum = pair[0];
            int idx = pair[1];

            List<Integer> list = new ArrayList<>();
            list.add(sum - nums2[idx]);
            list.add(nums2[idx]);
            ans.add(list);

            if(idx + 1 < nums2.length){
                pq.add(new int[]{sum - nums2[idx] + nums2[idx+1], idx+1});
            }

            k--;
        }

        return ans;
    }
}