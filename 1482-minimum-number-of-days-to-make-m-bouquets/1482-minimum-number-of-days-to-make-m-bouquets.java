class Solution {
    public int minDays(int[] bd, int m, int k) {
        int n = bd.length;
        if(m*k > n) return -1;
        int left = 0, right = Integer.MIN_VALUE;

        for(int no : bd){
            right = Math.max(no, right);
        }

        int minDays = -1;

        while(left <= right){
            int mid = left + (right - left)/2;

            if(canMakeBouquests(bd, mid, k) >= m){
                minDays = mid;
                right = mid - 1;
            }
            else{
                left = mid+1;
            }
        }
        return minDays;
    }
    private int canMakeBouquests(int[] bd, int days, int k){
        int count = 0;
        int consecutive_count = 0;

        for(int i=0; i<bd.length; i++){
            if(bd[i] <= days){
                consecutive_count++;
            }
            else{
                consecutive_count = 0;
            }

            if(consecutive_count == k){
                count++;
                consecutive_count = 0;
            }

        }
        return count;
    }
}