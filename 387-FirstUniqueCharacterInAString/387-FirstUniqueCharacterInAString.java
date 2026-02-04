// Last updated: 2/4/2026, 9:27:29 PM
class Solution {
    public int firstUniqChar(String s) {
       int[]freq=new int[26];
        for(char c:s.toCharArray()){
            freq[c-'a']++;
        }
        int index=0;
        for(char c:s.toCharArray()){
            if(freq[c-'a']==1)
            return index;
            index++;
        }
        return -1;
    }
}