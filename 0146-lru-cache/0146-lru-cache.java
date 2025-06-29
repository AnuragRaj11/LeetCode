class LRUCache {
    class Node{
        int key;
        int value;
        Node prev,next;
        Node(int key,int value){
            this.key=key;
            this.value=value;
        }
    }
    Node head=new Node(-1,-1);
    Node tail=new Node(-1,-1);
    int cap;
    HashMap<Integer,Node> m=new HashMap<>();

    public LRUCache(int capacity) {
        cap=capacity;
        head.next=tail;
        tail.prev=head;
    }
    private void add(Node newn){
        Node temp=head.next;
        newn.next=temp;
        newn.prev=head;
        head.next=newn;
        temp.prev=newn;
    }
    private void del(Node del){
        Node prevv=del.prev;
        Node nextt=del.next;
        prevv.next=nextt;
        nextt.prev=prevv;
    }
    public int get(int key) {
            if(m.containsKey(key)){
            Node ans=m.get(key);
            int res=ans.value;
            m.remove(key);
            del(ans);
            add(ans);
            m.put(key,head.next);
            return res;
        }
            return -1;
    }
    
    public void put(int key, int value) {
        if(m.containsKey(key)){
            Node curr=m.get(key);
            m.remove(key);
            del(curr);
        }
        if(m.size()==cap){
            m.remove(tail.prev.key);
            del(tail.prev);
        }
        add(new Node(key,value));
        m.put(key,head.next);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,valueue);
 */