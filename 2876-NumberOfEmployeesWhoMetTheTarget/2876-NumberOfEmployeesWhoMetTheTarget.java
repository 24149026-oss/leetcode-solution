// Last updated: 2/4/2026, 9:25:51 PM
class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int c=0;
        for(int h:hours){
            if(h>=target){
                c++;
            }
        }
        return c;
    }
}