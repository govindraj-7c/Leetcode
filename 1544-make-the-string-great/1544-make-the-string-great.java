class Solution {
    public String makeGood(String s) {
        Stack<String> stack = new Stack<>();
        String[] str = new String[s.length()];
        String ans = "";
        for(int i=0; i<s.length(); i++){
            str[i] = String.valueOf(s.charAt(i));
        }
        for(String ch : str){
            if(stack.isEmpty()){
                stack.push(ch);
            }
            else if(ch.equalsIgnoreCase(stack.peek())){
                if(ch.equals(stack.peek())){
                    stack.push(ch);
                }
                else{
                    stack.pop();
                }
            }
            else{
                stack.push(ch);
            }
        }
        while(!stack.isEmpty()){
            String temp = stack.pop();
            ans += temp;
        }
        StringBuilder sb = new StringBuilder(ans);
        return sb.reverse().toString();
    }
}