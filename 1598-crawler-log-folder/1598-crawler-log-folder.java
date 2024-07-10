class Solution {
    public int minOperations(String[] logs) {
        Stack<String> stack = new Stack<>();
        int count = 0;

        for(String str : logs){
            if(str.equals("../") && !stack.isEmpty()){
                stack.pop();
            }
            else if(str.equals("./")){
                continue;
            }
            else if(!str.equals("./") && !str.equals("../")){
                stack.push(str);
            }
        }

        while(!stack.isEmpty()){
            count++;
            stack.pop();
        }
        return count;
    }
}