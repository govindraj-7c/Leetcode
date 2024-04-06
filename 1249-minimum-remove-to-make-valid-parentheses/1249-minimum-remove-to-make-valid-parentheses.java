class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> stack = new Stack<>();
        boolean[] visited = new boolean[s.length()];

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '('){
                stack.push(i);
            }
            else if(s.charAt(i) == ')'){
                if(!stack.isEmpty()){
                    stack.pop();
                }
                else{
                    visited[i] = true;
                }
            }
        }

        while(!stack.isEmpty()){
            visited[stack.pop()] = true; 
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            if(!visited[i]){
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}