/*
Problem: Remove Duplicates Sorted Array
Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
    ArrayList<Integer> removeDuplicates(int[] arr) {

        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (ans.isEmpty() || ans.get(ans.size() - 1) != arr[i]) {
                ans.add(arr[i]);
            }
        }

        return ans;
    }
}
