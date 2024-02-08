class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        char ans = '0';
        for(char c : s.toCharArray()){
            if(map.containsKey(c)){
                map.put(c, map.getOrDefault(c,0)+1);
            }
            else{
                map.put(c, 1);
            }
        }
        for(char e : t.toCharArray()){
            if((!map.containsKey(e)) || (map.get(e) == 0)){
                ans = e;
            }
            else{
                map.put(e, map.get(e)-1);
            }
        }
        return ans; 
    }
}