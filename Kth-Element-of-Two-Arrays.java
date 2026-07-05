/*
Problem: K-th element of two Arrays
Time Complexity: O(m + n)
Space Complexity: O(1)
*/

class Solution {
    public int kthElement(int arr[], int brr[], int n) {
        
        int i =0;
        int j = 0;
        int ans = 0;
        int k =0;
        while(i<arr.length && j<brr.length){
            if(arr[i]<=brr[j]){
                ans=arr[i];
                i++;
                k++;
            }else{
                ans=brr[j];
                j++;
                k++;
            }
            if(k==n) return ans;
        }
        
        while(i<arr.length){
            ans=arr[i];
            i++;
            k++;
            if(k==n) return ans;
            
        }
        
        while(j<brr.length){
            ans=brr[j];
            j++;
            k++;
            if(k==n) return ans;
        }
        return -1;
    }
}
