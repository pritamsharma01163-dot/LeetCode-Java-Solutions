
class Solution {
    public double myPow(double x, int n) {
        long power = n;
        power = Math.abs(power);

        double ans = 1.0;

        while (power > 0) {
            if ((power & 1) == 1) {
                ans *= x;
            }

            x *= x;
            power >>= 1;
        }

        if (n < 0) {
            ans = 1.0 / ans;
        }

        return ans;
    }
}
