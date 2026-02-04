// Last updated: 2/4/2026, 9:27:34 PM
class Solution {
    public boolean isPowerOfFour(int n) {
        if (n <= 0) return false;
        if ((n & (n - 1)) != 0) return false;
        return (n & 0x55555555) != 0; }
}