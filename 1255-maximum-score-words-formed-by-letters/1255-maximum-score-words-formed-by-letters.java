class Solution {
    int maxScore = 0;
    public int maxScoreWords(String[] words, char[] letters, int[] score) {
        int[] occ = new int[26];
        for(char ch : letters){
            occ[ch-'a']++;
        }

        calculation(words, score, occ, 0, 0);
        return maxScore;
    }

    private void calculation(String[] words, int[] score, int[] occ, int i, int currScore){

        maxScore = Math.max(maxScore, currScore);

        if(i == words.length) return;
        int j = 0;
        int sum = 0;
        int[] tempOcc = Arrays.copyOf(occ, occ.length);
        while(j < words[i].length()){
            char ch = words[i].charAt(j);
            if(tempOcc[ch-'a'] == 0){
                break;
            }
            sum += score[ch-'a'];
            tempOcc[ch-'a']--;
            j++;
        }

        if(j == words[i].length()){
            calculation(words, score, tempOcc, i+1, currScore+sum);
        }

        calculation(words, score, occ, i+1, currScore);
    }
}