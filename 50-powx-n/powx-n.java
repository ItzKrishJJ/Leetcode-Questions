class Solution {
    public double myPow(double x, int n) {
        double ans = 1.0;
        long nn = n;
        boolean isNegative = nn < 0;

        if (isNegative) {
            nn = -nn;
        }

        while (nn > 0) {
            if (nn % 2 == 1) {
                ans *= x;
                nn--;
            } else {
                x *= x;
                nn /= 2;
            }
        }

        if (isNegative) {
            ans = 1.0 / ans;
        }

        return ans;
    }
}
