class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<num.length(); i++){
            while(!stack.isEmpty() && k>0 && stack.peek() > num.charAt(i)){
                stack.pop();
                k--;
            }
            stack.push(num.charAt(i));
        }

        while (k > 0 && !stack.isEmpty()) {
            stack.pop();
            k--;
        }

        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        sb.reverse();
        while(sb.length() > 0 && sb.charAt(0) == '0') sb.deleteCharAt(0);

        return sb.length() > 0 ? sb.toString() : "0";
    }
}