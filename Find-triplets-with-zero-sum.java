/*
Problem: Find triplets with zero sum
Time Complexity: O(n*n)
Space Complexity: O(log n) due to recursion stack
*/

class Solution {
    public boolean findTriplets(int[] arr) {
        //sort the array
        Arrays.sort(arr);
        //triplet calculation
        for(int l =0;l<arr.length-2;l++){
            int target = -arr[l];
            int i=l+1;
            int j=arr.length-1;
            while(i<j){
                int sum = arr[i]+arr[j];
                if(sum<target) i++;
                else if(sum>target) j--;
                else{
                    return true;
                }
            }
        }
        return false;
        
    }
}
