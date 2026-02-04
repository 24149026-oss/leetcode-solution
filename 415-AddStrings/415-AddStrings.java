// Last updated: 2/4/2026, 9:27:25 PM
 import java.math.BigInteger;
 class Solution {
    public String addStrings(String num1, String num2) {
        BigInteger a=new BigInteger(num1);
        BigInteger b=new BigInteger(num2);
        return a.add(b).toString();
    }
}