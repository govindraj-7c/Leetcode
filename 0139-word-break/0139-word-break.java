class Solution {
    Boolean[] t;
    public boolean wordBreak(String s, List<String> wordDict) {
        HashSet<String> set = new HashSet<>();
        for(int i=0; i<wordDict.size(); i++){
            set.add(wordDict.get(i));
        }
        t = new Boolean[s.length()];

        return solve(s, set, 0);

    }
    boolean solve(String s, HashSet<String> set, int idx){
        if(idx == s.length()){
            return true;
        }
        if(t[idx] != null){
            return t[idx];
        }
        for(int i=idx; i<s.length(); i++){
            String tempString = s.substring(idx, i+1);
            if(set.contains(tempString) && solve(s, set, i+1)){
                return t[idx] = true;
            }
        }

        return t[idx] = false;
    }
}