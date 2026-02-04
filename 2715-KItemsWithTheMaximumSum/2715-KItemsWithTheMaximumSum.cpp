// Last updated: 2/4/2026, 9:26:01 PM
class Solution {
public:
    int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        int total=numOnes+numZeros+numNegOnes;
        if(k<=numOnes){
           return k;
        }
        if(k<=(numOnes+numZeros)){
          return numOnes;
        }
        else{
         int rem=k-(numOnes+numZeros);
          return numOnes- rem;
        }
    }
};