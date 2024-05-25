class Solution {
    public boolean canConstruct(String r, String m) {
        int[] mCount = new int[26];

        for(int i=0; i<m.length(); i++){
            mCount[m.charAt(i)-'a']++;
        }

        for(int i=0; i<r.length(); i++){
            if(mCount[r.charAt(i)-'a'] > 0){
                mCount[r.charAt(i)-'a']--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}