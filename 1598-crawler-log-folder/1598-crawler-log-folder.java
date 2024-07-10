class Solution {
    public int minOperations(String[] logs) {
        int count = 0;

        for(String str : logs){
            if(str.equals("../")){
                if(count > 0 ) count--;
            }
            else if(!str.equals("./")){
                count++;
            }
        }

        return count;
    }
}