class Solution {
    int M = 1000000007;
    int[][][] t = new int[100001][2][3];
    public int checkRecord(int n) {
        for (int i = 0; i < 100001; i++) {
            for (int j = 0; j < 2; j++) {
                Arrays.fill(t[i][j], -1);
            }
        }
        return solve(n, 0, 0);
    }
    private int solve(int n, int countA, int countL){
        if(countA > 1 || countL > 2) return 0;

        if(n == 0){
            return 1;
        }

        if(t[n][countA][countL] != -1) {
            return t[n][countA][countL];
        }

        int a = solve(n-1, countA+1, 0)%M;
        int l = solve(n-1, countA, countL+1)%M;
        int p = solve(n-1, countA, 0)%M;

        return t[n][countA][countL] = ((a + l) % M + p) % M;
    }
}