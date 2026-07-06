/*
Problem: Kth from End of Linked List
Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int getKthFromLast(Node head, int k) {
       
        Node temp = head;
        int length = 0;
        while(temp!=null){
            length++;
            temp=temp.next;
        }
        
        temp = head;
        int cnt = 0;
        while(temp!=null){
            cnt++;
            if(cnt==length-k+1) return temp.data;
            temp = temp.next;
        }
        return -1;
        
    }
}
