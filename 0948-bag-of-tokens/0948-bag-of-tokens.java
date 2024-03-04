class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int left = 0, right = tokens.length-1;
        int s = 0;
        int maxS = 0;
        while(left <= right){
            if(power >= tokens[left]){
                power -= tokens[left];
                s++;
                left++;
                maxS = Math.max(s,maxS);
            }
            else if(s>0){
                power += tokens[right];
                right--;
                s--;
            }
            else{
                break;
            }
        }
        return maxS;
    }
}