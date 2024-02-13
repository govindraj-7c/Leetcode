class Solution {
    public String toHex(int num) {
        if(num==0){
            return "0";
        }
        long val = num;
        if(num<0){
            val = (long) (Math.pow(2,32)+num);
        }
        StringBuilder sb = new StringBuilder();
        while(val != 0){
            int rem = (int) (val - (((int) (val / 16)) * 16));
            val /= 16;
            if(rem >= 10){
                sb.append((char)(rem+87));
            }
            else{
                sb.append(rem);
            }
        }
        return sb.reverse().toString();
    }
}