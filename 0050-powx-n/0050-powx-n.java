class Solution {
    public double myPow(double x, int n) {
        if(n > 0){
            return power(x,n);
        }
        else if(n < 0){
            int m = Math.abs(n);
            double ans = power(x, m);
            return 1/ans;
        }
        else{
            return 1;
        }
    }

    public double power(double x, int n){
        if(n == 0){
            return 1;
        }

        double halfPower = power(x, n/2);
        double fullPower = halfPower * halfPower;

        if(n %2 != 0){
            fullPower = fullPower * x;
        }

        return fullPower;
    }
}