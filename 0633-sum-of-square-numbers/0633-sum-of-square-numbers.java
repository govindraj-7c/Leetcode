class Solution {
    public boolean judgeSquareSum(int c) {
        if(c < 0) return false;

        long left = 0;
        long right = (int) Math.sqrt(c);

        while(left <= right){
            long ans = left*left + right*right;

            if(ans == c){
                return true;
            }

            else if(ans < c){
                left++;
            }

            else{
                right--;
            }
        }

        return false;
    }
}