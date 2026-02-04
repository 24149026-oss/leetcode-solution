// Last updated: 2/4/2026, 9:27:15 PM
class Solution {
    public boolean hasAlternatingBits(int n) {
        while(n!=0){
            int a=(n&1);
            n>>=1;
            int b=(n&1);
            if(a==b)
                return false;
        }
        return true;
    }
}
