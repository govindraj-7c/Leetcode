class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int n = Integer.MIN_VALUE;
        for(int i=0; i<arr1.length; i++){
            n = Math.max(n, arr1[i]);
        }
        int[] occ = new int[n+1];
        
        for(int i=0; i<arr1.length; i++){
            occ[arr1[i]]++;
        }

        int[] ans = new int[arr1.length];
        int j = 0;
        for(int i=0; i<arr2.length; i++){
            while(occ[arr2[i]] > 0){
                ans[j] = arr2[i];
                occ[arr2[i]]--;
                j++;
            }
        }
        for(int i=0; i<occ.length; i++){
            while(occ[i] > 0){
                ans[j] = i;
                j++;
                occ[i]--;
            }
        }

        return ans;
    }
}