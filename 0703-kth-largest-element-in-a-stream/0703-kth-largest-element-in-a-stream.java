class KthLargest {
    PriorityQueue<Integer> pq;
    int large = 0;

    public KthLargest(int k, int[] nums) {
        pq = new PriorityQueue<>(Collections.reverseOrder());
        large = k;

        for(int i=0; i<nums.length; i++){
            pq.add(nums[i]);
        }
    }
    
    public int add(int val) {
        pq.add(val);
        int ans = 0;
        for(int i=0; i<large; i++){
            ans = pq.remove();
            pq.add(ans);
        }

        return ans;
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */