class Solution {
    public int calculate(String s) {
        // Constraints-
        if(s==null || s.length()==0) return 0;
        // Initializing-
        Stack<Integer> st = new Stack<>();
        int curr = 0;
        char op = '+';
        char[] c = s.toCharArray();
        // Traverse on a char c[]-
        for(int i = 0; i<c.length; i++){
            if(Character.isDigit(c[i])){
                curr = curr * 10 + c[i]-'0';
            }
            if(!Character.isDigit(c[i]) && c[i] != ' ' || i == c.length-1){
                if(op=='+') st.push(curr);
                else if(op=='-') st.push(-curr);
                else if(op=='*') st.push(st.pop()*curr);
                else if(op=='/') st.push(st.pop()/curr);
                // Initializing to the default value again.
                op = c[i];
                curr = 0;
            }
        }
        // Summing up all the values
        int sum = 0;
        while(!st.isEmpty())
            sum += st.pop();
        return sum;
    }
}