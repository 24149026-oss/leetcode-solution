// Last updated: 2/4/2026, 9:26:51 PM
class Solution {
    public int minCostToMoveChips(int[] position) {
        int x=0,y=0;
        for(int i=0;i<position.length;i++){
            if(position[i]%2==0){
                x++;
            }else{
            y++;
            }
        }
        if(x>y){
            return y;
        }
        return x;
    }
}