class Solution {
    public String convertToTitle(int columnNumber) {
        if(columnNumber < 27){
            char res = (char) (columnNumber + 64);
            String ans = Character.toString(res);
            return ans;
        }
        else{
            StringBuilder ans = new StringBuilder("");
            while(columnNumber > 0){
                int x = columnNumber%26;
                if(x == 0){
                    ans.append('Z');
                    columnNumber--;
                }
                else{
                    ans.append((char)('A' + x-1));
                }
                columnNumber = columnNumber/26;
            }
            return ans.reverse().toString();
        }
    }
}