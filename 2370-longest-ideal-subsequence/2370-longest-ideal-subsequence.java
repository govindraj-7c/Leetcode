class Solution {
    public int longestIdealString(String s, int k) {
        int n = s.length();
        int[] t = new int[26];
        int result = 0;

        for(int i=0; i<n; i++){
            int idx = s.charAt(i) - 'a';
            int left = Math.max(0, idx-k);
            int right = Math.min(25, idx+k);
            int longest = 0;
            for(int j=left; j<=right; j++){
                longest = Math.max(t[j], longest);
            }
            t[idx] = Math.max(t[idx], longest+1);
            result = Math.max(t[idx], result);
        }
        return result;
    }
}