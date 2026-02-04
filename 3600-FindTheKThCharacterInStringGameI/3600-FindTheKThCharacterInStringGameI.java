// Last updated: 2/4/2026, 9:25:39 PM
class Solution {
    public char kthCharacter(int k) {
        return (char) ('a' + Integer.bitCount(k-1));
    }
}