/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head==null) return null;
        Node curr=head;
        while(curr!=null){
            Node nwnode=new Node(curr.val);
            nwnode.next=curr.next;
            curr.next=nwnode;
            curr=nwnode.next;
        }
        curr=head;
        while(curr!=null){
            if(curr.random!=null){
                curr.next.random=curr.random.next;
            }
            curr=curr.next!=null ? curr.next.next:null;
        }
        Node old=head;
        Node nwhead=head.next;
        Node curold=old;
        Node curnew=nwhead;
        while(curold!=null){
            curold.next=curold.next.next;
            curnew.next=(curnew.next!=null) ? curnew.next.next:null;
            curold=curold.next;
            curnew=curnew.next;
        }
        return nwhead;
    }
}