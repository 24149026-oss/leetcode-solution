// Last updated: 2/4/2026, 9:26:41 PM
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int ans = 0, cnt[] = new int[101];
        for (int a: nums) {
            ans += cnt[a]++;
        }
        return ans;
    }
}