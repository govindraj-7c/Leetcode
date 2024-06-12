class Solution {
    public String smallestSubsequence(String s) {
        int[] occ = new int[26];
        HashSet<Character> set = new HashSet<>();
        Stack<Character> stack = new Stack<>();

        for(char ch : s.toCharArray()){
            occ[ch-'a']++;
        }

        for(char ch : s.toCharArray()){
            occ[ch-'a']--;
            if(set.contains(ch)) continue;

            while(!stack.isEmpty() && stack.peek() > ch && occ[stack.peek()-'a'] != 0){
                set.remove(stack.pop());
            }
            stack.push(ch);
            set.add(ch);
        }
        StringBuilder sb = new StringBuilder();
        
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }

        return sb.reverse().toString();
    }
}