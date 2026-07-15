/* 
Problem: Sum of Matrix
Time Complexity: O(n*n)
Space Complexity: O(1)
*/

class Solution {
    public int sumOfMatrix(int[][] arr) {
        
        int sum =0;
        for(int i =0;i<arr.length;i++){
            for(int j =0;j<arr[0].length;j++){
                sum+=arr[i][j];
            }
        }
        return sum;
    }
}
