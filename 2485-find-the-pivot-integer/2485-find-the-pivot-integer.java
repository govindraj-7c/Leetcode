class Solution {
    public int pivotInteger(int n) {
        int leftBound = 1, rightBound = n;
        int fullSum = (n*(n+1))/2;
        while(leftBound <= rightBound){
            int mid = leftBound + (rightBound-leftBound)/2;
            int firstHalfSum = (mid*(mid+1))/2;
            int secondHalfSum = fullSum - firstHalfSum + mid;
            if(firstHalfSum == secondHalfSum) return mid;
            if(firstHalfSum < secondHalfSum){
                leftBound = mid+1;
            }
            else{
                rightBound = mid-1;
            }
        }
        return -1;
    }
}