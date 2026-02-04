// Last updated: 2/4/2026, 9:26:30 PM
class Solution {
    public boolean isThree(int n) {
        int y=2;
        for(int i=2;i<n-1;i++){
            if(n%i==0){
                y++;
            }
        }
        if(y==3) return true;
        else return false;
    }
}