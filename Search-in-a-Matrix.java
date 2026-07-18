/*
Problem: Search in a Matrix
Time Complexity: O(m*n)
Space Complexity: O(1)
*/

class Solution {
    public boolean searchMatrix(int[][] arr, int x) {
        
        for(int i=0;i<arr.length;i++){
            for(int j = 0;j<arr[0].length;j++){
                if(arr[i][j]==x) return true;
            }
        }
        return false;
        
    }
}
