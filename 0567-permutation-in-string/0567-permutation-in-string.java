class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];
        int len1 = s1.length();
        int len2 = s2.length();
        int left = 0, right = 0;

        if(len1 > len2) return false;
        while(right < len1){
            arr1[s1.charAt(right) - 'a']++;
            arr2[s2.charAt(right) - 'a']++;
            right++;
        }
        right--;

        while(right < len2){
            if(Arrays.equals(arr1,arr2)) return true;
            right++;
            if(right != len2){
                arr2[s2.charAt(right) - 'a']++;
            }
            arr2[s2.charAt(left) - 'a']--;
            left++;
        }

        return false;
    }
}