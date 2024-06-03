class Solution {
    public int appendCharacters(String s, String t) {
        char[] ch1 = s.toCharArray();
        char[] ch2 = t.toCharArray();
        int p1 = 0, p2 = 0;

        while(p1 < s.length() && p2 < t.length()){
            if(ch2[p2] == ch1[p1]){
                p1++;
                p2++;
            }
            else{
                p1++;
            }
        }

        return t.length() - p2;
    }
}