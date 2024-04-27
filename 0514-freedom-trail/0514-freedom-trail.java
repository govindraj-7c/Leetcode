class Solution {
    int[][] t = new int[101][101];
    public int findRotateSteps(String ring, String key) {
        for(int[] i : t){
            Arrays.fill(i, -1);
        }
        return solve(0,0, ring, key);
    }
    public int solve(int ringIdx, int keyIdx, String ring, String key){
        if(keyIdx >= key.length()){
            return 0;
        }
        int result = Integer.MAX_VALUE;

        if(t[ringIdx][keyIdx] != -1){
            return t[ringIdx][keyIdx];
        }

        for(int i=0; i<ring.length(); i++){
            if(ring.charAt(i) == key.charAt(keyIdx)){
                int totalSteps = countSteps(ringIdx, i, ring.length()) + 1 +
                    solve(i, keyIdx+1, ring, key);

                result = Math.min(result, totalSteps); 
            }
        }
        return t[ringIdx][keyIdx] = result;
    }
    public int countSteps(int ringIdx, int i, int length){
        int dist = Math.abs(i-ringIdx);
        int reverseDist = Math.abs(length-dist);

        return Math.min(dist, reverseDist);
    }
}