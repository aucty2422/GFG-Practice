/*
Problem: Transpose of a Matrix
Time Complexity: O(n*n)
Space Complexity: O(n*n)
*/


class Solution {
    public ArrayList<ArrayList<Integer>> transpose(int[][] arr) {
        
       ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
       for(int i=0;i<arr.length;i++){
           ArrayList<Integer>list = new ArrayList<>();
           for(int j =0;j<arr[0].length;j++){
               if(i<j){
                   int temp = arr[i][j];
                   arr[i][j]=arr[j][i];
                   arr[j][i]=temp;
                   
               }
               list.add(arr[i][j]);
           }
           ans.add(list);
       }
       return ans;
       
        
    }
}
