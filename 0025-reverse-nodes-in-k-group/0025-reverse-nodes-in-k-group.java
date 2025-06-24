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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode curr=head;
        int c=0;
        while(curr!=null && c<k){
            curr=curr.next;
            c++;
        }
        if(c==k){
            ListNode prev=null;
            curr=head;
            int i=0;
            while(i<k){
                ListNode next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
                i++;
            }
            head.next=reverseKGroup(curr,k);
            return prev;
        }
        return head;
    }
}