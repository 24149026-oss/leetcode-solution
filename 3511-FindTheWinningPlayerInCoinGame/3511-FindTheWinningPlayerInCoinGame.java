// Last updated: 2/4/2026, 9:25:42 PM
class Solution {
    public String winningPlayer(int x, int y) {
        int t = Math.min(x, y / 4);
        if (t == 0) 
        return "Bob";
        return (t % 2 == 1) ? "Alice" : "Bob";

    }
}