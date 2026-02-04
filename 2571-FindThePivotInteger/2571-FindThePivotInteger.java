// Last updated: 2/4/2026, 9:26:12 PM
class Solution {
    public int pivotInteger(int n) {
        int S = n * (n + 1) / 2;
        int x = (int) Math.sqrt(S);
        return x * x == S ? x : -1;
    }
}