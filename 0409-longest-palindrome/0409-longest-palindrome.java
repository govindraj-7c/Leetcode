class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        boolean flag = false;
        int ans = 0;

        for(char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }

        for(HashMap.Entry<Character, Integer> ch : map.entrySet()){
            if(ch.getValue() % 2 == 0){
                ans += ch.getValue();
            }
            else if(ch.getValue() % 2 != 0 && !flag){
                ans += ch.getValue();
                flag = true;
            }
            else if(flag){
                ans += ch.getValue() - 1;
            }
        }

        return ans;

    }
}