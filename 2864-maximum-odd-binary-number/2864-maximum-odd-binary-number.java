class Solution {
    public String maximumOddBinaryNumber(String s) {
        int count = 0;
        char[] arr = new char[s.length()];
        Arrays.fill(arr,'0');
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '1'){
                count++;
            }
        }
        if(count > 0){
            arr[s.length()-1] = '1';
            count--;
        }
        for(int i=0; i<arr.length-1; i++){
            if(count > 0){
                arr[i] = '1';
                count--;
            }
            else{
                break;
            }
        }
        String ans = new String(arr);
        return ans;
    }
}