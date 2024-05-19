class Solution {
    public long maximumValueSum(int[] nums, int k, int[][] edges) {
        long sum = 0;
        int count = 0;
        long nuksan = Integer.MAX_VALUE;

        for(int no : nums){
            if((no ^ k) > no){
                count++;
                sum +=  (no ^ k);
            }
            else{
                sum += no;
            }

            nuksan = Math.min(nuksan, Math.abs(no - (no^k)));
        }

        if(count%2 != 0){
           return sum-nuksan;
        }

        return sum;
    }
}