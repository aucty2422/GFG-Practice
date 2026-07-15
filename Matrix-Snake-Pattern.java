/* 
Problem: Matrix Snake Pattern
Time Complexity: O(n*n)
Space Complexity: O(n*n)
*/

class Solution {
    static ArrayList<Integer> snakePattern(int arr[][]) {
        
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0;i<arr.length;i++){
            if((i&1)==1){
                for(int j=arr[0].length-1;j>=0;j--){
                    ans.add(arr[i][j]);
                }
            }
            else{
                for(int j=0;j<arr[0].length;j++){
                    ans.add(arr[i][j]);
                }
            }
        }
        return ans;
        
        
    }
}
