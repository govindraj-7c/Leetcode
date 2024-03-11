class Solution {
    public String customSortString(String order, String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            map.put(curr, map.getOrDefault(curr, 0) + 1);
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < order.length(); i++) {
            char curr = order.charAt(i);
            if(map.containsKey(curr)) {
                int val = map.get(curr);
                for(int j = 0; j < val; j++) {
                    sb.append(curr);
                }
                map.remove(curr);
            }
        }
        for(Map.Entry<Character, Integer> entry : map.entrySet()) {
            char curr = entry.getKey();
            int val = entry.getValue();
            for(int i = 0; i < val; i++) {
                sb.append(curr);
            }
        }
        return sb.toString();
    }
}