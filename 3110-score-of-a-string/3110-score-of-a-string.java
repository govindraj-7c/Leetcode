class Solution {
    public int scoreOfString(String s) {
        int n = s.length();
        char ch[] = s.toCharArray();
        int sum = 0;
        int i=0;

        while(i < n-1){
            int j = i+1;
            sum += Math.abs(ch[i] - ch[j]);
            i++;
        }

        return sum;
    }
}