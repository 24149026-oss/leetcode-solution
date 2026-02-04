// Last updated: 2/4/2026, 9:27:12 PM
class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        for(int i = 0; i < n-1; i++) {
            for(int j = 0; j < m-1; j++) {
                if(matrix[i][j] != matrix[i+1][j+1]) return false;
            }
        }
        return true;
    }
}