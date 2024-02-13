class Solution {
    public String firstPalindrome(String[] words) {
        String ans = "";
        for(int i=0; i<words.length; i++){
            if(palindrome(words[i])){
                ans = words[i];
                break;
            }
        }
        return ans;
    }
    public boolean palindrome(String word){
        StringBuilder sb = new StringBuilder(word);
        String ans = sb.reverse().toString();
        if(word.equals(ans)){
            return true;
        }
        else{
            return false;
        }
    }
}