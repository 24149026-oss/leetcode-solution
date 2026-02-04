// Last updated: 2/4/2026, 9:26:18 PM
class Solution {
    public int commonFactors(int a, int b) {
        int y=0;
        for(int i=1;i<=a;i++){
            if(a%i==0 && b%i==0)
               y++;
        }
        return y;
    }
}