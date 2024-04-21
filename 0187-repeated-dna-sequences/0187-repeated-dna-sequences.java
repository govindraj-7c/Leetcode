class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        HashMap<String, Integer> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        if(s.length() < 10){
            return list;
        }

        for(int i=0; i<10; i++){
            sb.append(s.charAt(i));
        }
        map.put(sb.toString(), 1);

        for(int i=10; i<s.length(); i++){
            sb.deleteCharAt(0);
            sb.append(s.charAt(i));
            map.put(sb.toString(), map.getOrDefault(sb.toString(), 0)+1);
        }

        for(String key : map.keySet()){
            if(map.get(key) > 1){
                list.add(key);
            }
        }
        return list;
    }
}