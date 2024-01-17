class Solution {
    public void reverseString(char[] s) {
        String ans = "";
        for(int i=0; i<s.length; i++){
            ans = ans + s[i];
        }
        StringBuilder sb = new StringBuilder(ans);
        ans = sb.reverse().toString();
        for(int i=0; i<ans.length(); i++){
            s[i] = ans.charAt(i);
        }
    }
}