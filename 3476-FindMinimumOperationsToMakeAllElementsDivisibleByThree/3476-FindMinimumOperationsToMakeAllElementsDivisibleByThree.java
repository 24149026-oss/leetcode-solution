// Last updated: 2/4/2026, 9:25:44 PM
class Solution {
    public int minimumOperations(int[] nums) {
       int operations=0;
       for(int num:nums){
        int r=num%3;
         if(r==1||r==2){
            operations++;
         }
       }
       return operations;
    }
}