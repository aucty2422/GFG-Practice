/*
Problem: Merge Without Extra Space
Time Complexity: O(m logm + n logn)
Space Complexity: O(1)
*/


class Solution {
    public void mergeArrays(int arr[], int brr[]) {
        
        int i = arr.length-1;
        int j = 0;
        while(i>=0 && j<brr.length){
            if(arr[i]>brr[j]){
                int temp = arr[i];
                arr[i]=brr[j];
                brr[j]=temp;
                i--;
                j++;
            }else break;
        }
        Arrays.sort(arr);
        Arrays.sort(brr);
        
        
    }
}
