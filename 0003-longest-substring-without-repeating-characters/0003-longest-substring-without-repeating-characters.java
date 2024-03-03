class Solution {
    public int lengthOfLongestSubstring(String s) {
        String ans = "";
        int maxCount = 0;
        for(int i=0; i<s.length(); i++){
            for(int j=0; j<ans.length(); j++){
                if(s.charAt(i) != ans.charAt(j)) continue;
                else{
                    String temp = ans.substring(j+1);
                    ans = "";
                    ans += temp;
                    break;
                }
            }
            ans += s.charAt(i);
            maxCount = Math.max(ans.length(), maxCount);
        }
        return maxCount;
    }
}