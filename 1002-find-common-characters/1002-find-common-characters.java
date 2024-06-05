class Solution {
    public List<String> commonChars(String[] words) {
        int n = words.length;
        HashMap<Character, Integer> map1 = new HashMap<>();
        List<String> ans = new ArrayList<>();

        for(char ch : words[0].toCharArray()){
            map1.put(ch, map1.getOrDefault(ch, 0)+1);
        }

        for(int i=1; i<n; i++){
            HashMap<Character, Integer> map2 = new HashMap<>();
            for(char ch : words[i].toCharArray()){
                if(map1.containsKey(ch) && map1.get(ch) > 0){
                    map2.put(ch, map2.getOrDefault(ch, 0) + 1);
                    map1.put(ch, map1.get(ch) - 1);
                }
            }
            map1.clear();
            map1.putAll(map2);
        }

        for(char ch : map1.keySet()){
            while(map1.get(ch) > 0){
                ans.add(String.valueOf(ch));
                map1.put(ch, map1.get(ch) - 1);
            }
        }

        return ans;

    }
}