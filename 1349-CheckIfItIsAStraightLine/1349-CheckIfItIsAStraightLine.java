// Last updated: 2/4/2026, 9:26:49 PM
class Solution {
    public boolean checkStraightLine(int[][] Co) {
      int x=Co[0][0];
      int y=Co[0][1];
      int x1=Co[1][0];
      int y1=Co[1][1];
      for(int i=2;i<Co.length;i++){
        int x2=Co[i][0];
        int y2=Co[i][1];
        if(((x-x1)*(y2-y1))!=((y-y1)*(x2-x1)))
        return false;
      }
      return true;
    }
}