/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        curr=head;
        return solve(head);
    }
    public boolean solve(ListNode head){
        if(head==null) return head;
        boolean ans=solve(head.next) && head.val == curr.val;
        curr=curr.next;
        return ans;
    }
}