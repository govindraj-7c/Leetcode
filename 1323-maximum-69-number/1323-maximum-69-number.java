class Solution {
    public int maximum69Number (int num) {
        String temp = String.valueOf(num);
        char[] no = temp.toCharArray();

        for(int i=0; i<temp.length(); i++){
            if(no[i] == '6'){
                no[i] = '9';
                break;
            }
        }
        int ans = 0;
        for(int i=0; i<no.length; i++){
            int n = no[i] - '0';
            ans = ans*10 + n;
        }
        return ans;
    }
}