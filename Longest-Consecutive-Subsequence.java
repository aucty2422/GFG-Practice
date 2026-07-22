/*
Problem: Longest Consecutive Subsequence
Time Complexity: O(n)
Space Complexity: O(n)
*/
class Solution {
    public int longestConsecutive(int[] arr) {
        
        //Optimal-Approach
        
        //hashset to put all array elements in it
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        
        //consequetive subsequence count 
        int longest = 1;
        for(int i=0;i<arr.length;i++){
            if(!set.contains(arr[i]-1)){
                int ele = arr[i];
                int cnt=1;
                while(set.contains(ele+1)){
                    ele++;
                    cnt++;
                }
                longest = Math.max(longest,cnt);
            }
        }
        return longest;
    }
}
