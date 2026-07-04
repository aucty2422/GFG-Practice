/*
Problem: Check Equal Arrays
Time Complexity: O(n log n)
Space Complexity: O(log n) due to sorting 
*/

class Solution {
    public static boolean checkEqual(int[] a, int[] b) {
        
        
        if(a.length!=b.length) return false;
        Arrays.sort(a);
        Arrays.sort(b);
        int i =0;
        int j =0;
        while(i<a.length && j<b.length){
            if(a[i]!=b[j]) return false;
            i++;
            j++;
        }
        return true;
        
    }
}
