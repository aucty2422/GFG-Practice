/*
Problem: Longest Subarray with Sum K
Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
    public int longestSubarray(int[] arr, int target) {
        

        HashMap<Integer,Integer> map = new HashMap<>();
        int sum=0;
        int length =0;
        
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum==target) length = i+1;
            
            int val = sum-target;
            if(map.containsKey(val)){
                int len = i - map.get(val);
                length = Math.max(len,length);
            }
            
            map.putIfAbsent(sum,i);
        }
        
        return length;
    }
}
