/*
Problem: Majority Element
Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    int majorityElement(int arr[]) {

        int ans = arr[0];
        int count = 0;
        for(int i=0;i<arr.length;i++){
            
            if(arr[i]==ans) count++;
            else{
                count--;
                if(count==0){
                    ans = arr[i];
                    count = 1;
                }
            }
        }
        
        int cnt = 0;
        if(count>0){
            for(int i =0;i<arr.length;i++){
                if(arr[i]==ans) cnt++;
            }
        }
        
        if(cnt>arr.length/2) return ans;
        return -1;
 
        
    }
}
