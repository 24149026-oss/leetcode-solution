// Last updated: 2/4/2026, 9:26:36 PM
class Solution {
    public int arraySign(int[] nums) {
        int sign=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                sign*=-1;
            }
            else if(nums[i]==0) return 0;
        }
        return sign;
    }
}