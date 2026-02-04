// Last updated: 2/4/2026, 9:27:19 PM
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int[] res=new int[n];
        for(int i=0;i<n;i++){
            res[i]=-1;
            for(int j=1;j<n;j++){
                if(nums[i]<nums[(i+j)%n]){
                    res[i]=nums[(i+j)%n];
                    break;
                }
            }
        }
        return res;
    }
}        