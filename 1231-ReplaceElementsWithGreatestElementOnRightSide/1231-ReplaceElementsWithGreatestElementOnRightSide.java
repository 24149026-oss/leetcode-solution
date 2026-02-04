// Last updated: 2/4/2026, 9:26:54 PM
class Solution {
    public int[] replaceElements(int[] arr) {
        int m=arr[arr.length-1];
        arr[arr.length-1]=-1;
        for(int i=arr.length-2;i>=0;i--){
            int t=arr[i];
            arr[i]=m;
            if(m<t){
                m=t;
            }
        }
        return arr;
    }
}