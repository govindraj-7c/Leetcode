class Solution {
    public boolean canConstruct(String r, String m) {
        HashMap<Character, Integer> map = new HashMap<>();

        for(char ch : m.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }

        for(char ch : r.toCharArray()){
            if(map.containsKey(ch) && map.get(ch) > 0){
                map.put(ch, map.get(ch)-1);
            }
            else{
                return false;
            }
        }

        return true;
    }
}