class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Arrays.sort(nums);
        int last = nums[nums.length - 1];
        int[] occ = new int[last+1];
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[0] - b[0]);

        for(int i=0; i<nums.length; i++){
            occ[nums[i]]++;
        }

        for(int i=0; i<occ.length; i++){
            pq.add(new int[]{occ[i], i});

            if(pq.size() > k){
                pq.remove();
            }
        }

        int[] ans = new int[pq.size()];
        int j=0;
        while(!pq.isEmpty()){
            int[] temp = pq.remove();
            ans[j++] = temp[1];
        }

        return ans;
    }
}