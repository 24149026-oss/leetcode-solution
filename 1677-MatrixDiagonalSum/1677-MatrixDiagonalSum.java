// Last updated: 2/4/2026, 9:26:38 PM
class Solution {
    public int diagonalSum(int[][] m) {
        int s=0;
        int i=0,j=0;
        int n=m.length;
        for(int k=1;k<=n;k++){
            s+=m[i][j];
            i++;
            j++;
        }
        i=0;
        j=n-1;
        for(int k=1;k<=n;k++){
            if(i!=j)
              s+=m[i][j];
              i++;
              j--;
        } 
        return s;
    }
}