class Solution {
    public int minOperations(String[] logs) {
        int count = 0;

        for(String str : logs){
            if(!str.equals("../") && !str.equals("./")){
                count++;
            }
            else if(str.equals("../") && count != 0){
                count--;
            }
        }

        return count;
    }
}