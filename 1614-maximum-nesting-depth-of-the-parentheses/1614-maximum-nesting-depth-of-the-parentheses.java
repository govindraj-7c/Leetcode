class Solution {
    public int maxDepth(String s) {
        Stack<Character> stack = new Stack<>();
        int max = 0, count = 0;
        for(char ch : s.toCharArray()){
            if(ch == '('){
                stack.push(ch);
                count++;
            }
            else if(ch == ')'){
                stack.pop();
                count--;
            }
            max = Math.max(max,count);
        }
        return max;
    }
}