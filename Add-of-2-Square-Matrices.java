/*
Problem: Add of 2 Square Matrices
Time Complexity: O(n*n)
Space Complexity: O(1)
*/

class Solution {
    public void addMat(int[][] arr, int[][] brr) {
        
        for(int i=0;i<arr.length;i++){
            for(int j =0;j<arr[0].length;j++){
                arr[i][j]=arr[i][j]+brr[i][j];
            }
        }
        
    }
}
