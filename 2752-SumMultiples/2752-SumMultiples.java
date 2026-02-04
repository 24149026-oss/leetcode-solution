// Last updated: 2/4/2026, 9:25:57 PM
class Solution {
    public int sumOfMultiples(int n) {
        int s=0;
        for(int i=3;i<=n;i++){
            if(i%3==0 || i%5==0 || i%7==0)
              s+=i;
        }
        return s;
    }
}