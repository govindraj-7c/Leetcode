class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        int n = s.length();
        if(n<=10 || n>10000) return new ArrayList<>();
        HashSet<String> seen = new HashSet<>();
        HashSet<String> ans = new HashSet<>();

        for(int i=0; i+9<n; i++){
            String temp = s.substring(i,i+10);
            if(!seen.add(temp)){
                ans.add(temp);
            }
        }

        return new ArrayList<>(ans);
    }
}