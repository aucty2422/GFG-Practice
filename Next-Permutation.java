/*
Problem: Next Permutation
Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    void nextPermutation(int[] arr) {
        
        //1.Find the breaking point
        int idx = -1;
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                idx = i;
                break;
            }
        }
        
        //if no breaking point exists, reverse the array
        if(idx==-1){
            int i=0;
            int j = arr.length-1;
            while(i<j){
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
            return;
        }
        
        //2.Swap with the first greater element than arr[idx] from the last
        for(int i=arr.length-1;i>idx;i--){
            if(arr[i]>arr[idx]){
                int temp = arr[i];
                arr[i] = arr[idx];
                arr[idx] = temp;
                break;
            }
        }
        
        //3. Reverse the part after index idx to get the next lexicographical greater permutation
        int i = idx+1;
        int j = arr.length-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return;
        
    }
}
