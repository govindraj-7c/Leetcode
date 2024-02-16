import java.util.regex.Matcher;
import java.util.regex.Pattern;
class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        int res = 0;
        for(int i=0; i<operations.length; i++){
            if(isValidInput(operations[i])){
                int no = Integer.parseInt(operations[i]);
                stack.push(no);
            }
            else if(operations[i].equals("+")){
                int var = stack.pop();
                int sum = var + stack.peek();
                stack.push(var);
                stack.push(sum);
            }
            else if(operations[i].equals("D")){
                int peek = stack.peek();
                int var = peek * 2;
                stack.push(var);
            }
            else if(operations[i].equals("C")){
                stack.pop();
            }
        }
        while(!stack.empty()){
            res = res + stack.pop();
        }
        return res;
    }
    private boolean isValidInput(String input) {
        String regex = "^-?([1-2]?[0-9]{1,4}|30000)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }
}