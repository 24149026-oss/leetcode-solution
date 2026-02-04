// Last updated: 2/4/2026, 9:26:06 PM
class Solution {
    public int alternateDigitSum(int n) {
        String xx = String.valueOf(n);
        int s = 0;
        int i = 0;
        for(char ch : xx.toCharArray()){
            int d = ch - '0';
            if(i% 2 == 0){
                s += d;
                i++;
            }
            else{
                s += -1 * d;
                i++;
            }
        }
        return s;
    }
}