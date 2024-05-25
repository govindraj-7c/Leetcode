class Solution {
    List<String> ans = new ArrayList<>();
    public List<String> wordBreak(String s, List<String> wordDict) {
        HashMap<String, Integer> map = new HashMap<>();
        for(int i=0; i<wordDict.size(); i++){
            map.put(wordDict.get(i), 1);
        }
        sentenceform(s, map, 0, "");
        return ans;
    }
    private void sentenceform(String s, HashMap<String, Integer> map, int idx, String str){
        if(idx == s.length()){
            ans.add(str);
            return;
        }
        for(int i=idx; i<s.length(); i++){
            String tempstr = s.substring(idx, i+1);
            if(map.containsKey(tempstr)){
                String originalString = str;
                if(!str.isEmpty()){
                    str += " ";
                }
                str += tempstr;
                sentenceform(s, map, i+1, str);
                str = originalString;
            }
        }

    }
}