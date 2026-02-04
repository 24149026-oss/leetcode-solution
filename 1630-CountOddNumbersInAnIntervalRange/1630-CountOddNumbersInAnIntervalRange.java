// Last updated: 2/4/2026, 9:26:42 PM
class Solution {
    public int countOdds(int low, int high) {
        int nums=high-low+1;
		if(low%2!=0 && high%2!=0)  
            return nums/2 + 1;
        else
		return nums/2;
    }
}