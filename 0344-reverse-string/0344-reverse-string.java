class Solution {
    public void reverseString(char[] s) {
        int n = s.length;
        for(int i=0; i<n; i++){
            for(int j=0; j<n-1-i; j++){
                char temp = s[j];
                s[j] = s[j+1];
                s[j+1] = temp;
            }
        }
    }
}