class Solution {
    public int nthUglyNumber(int n) {
        int[] arr = new int[n+1];
        int i2 = 1;
        int i3 = 1;
        int i5 = 1;

        arr[1] = 1;

        for(int i=2; i<=n; i++){
            int i2UglyNo = arr[i2] * 2;
            int i3UglyNo = arr[i3] * 3;
            int i5UglyNo = arr[i5] * 5;

            int min = Math.min(i2UglyNo, Math.min(i3UglyNo, i5UglyNo));

            arr[i] = min;

            if(min == i2UglyNo) i2++;
            if(min == i3UglyNo) i3++;
            if(min == i5UglyNo) i5++;
        }

        return arr[n];
    }
}