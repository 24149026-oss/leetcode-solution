// Last updated: 2/4/2026, 9:26:17 PM
class Solution {
    public int averageValue(int[] z) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < z.length; i++) {
            if (z[i] % 2 == 0 && z[i] % 3 == 0) {
                x++;
                y += z[i];
            }
        }
        if (x != 0) {
            return y / x;
        }
        return 0;
    }
}