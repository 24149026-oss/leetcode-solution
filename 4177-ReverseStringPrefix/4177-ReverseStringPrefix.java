// Last updated: 2/4/2026, 9:25:37 PM
class Solution {
    public String reversePrefix(String s, int k) {
        String r="";
        for(int i=k-1;i>=0;i--){
            r=r+s.charAt(i);
        }
        for(int i=k;i<s.length();i++){
            r=r+s.charAt(i);
        }
        return r;
    }
}