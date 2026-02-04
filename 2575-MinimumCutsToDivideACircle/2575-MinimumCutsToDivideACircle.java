// Last updated: 2/4/2026, 9:26:11 PM
class Solution {
    public int numberOfCuts(int no) {
        if(no==1)
           return 0;
           if(no%2==0)
             return no/2;
             else 
                return no;
    }
}