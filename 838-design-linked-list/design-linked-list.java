class ListNode{
    ListNode next;
    int val;
    ListNode(int val){
        this.next = null;
        this.val = val; 
    }
}
class MyLinkedList {
    int size;
    ListNode head;
    public MyLinkedList() {
        head=new ListNode(-1);
        size=0;
    }
    
    public int get(int index) {
        if(index >= size || index < 0) return -1;
        ListNode curr = head.next;
        for(int i=0;i<index;i++){
            curr = curr.next;
        }
        return curr.val;
    }
    
    public void addAtHead(int val) {
        ListNode newNode = new ListNode(val);
        newNode.next = head.next;
        head.next = newNode;
        size++;  
    }
    
    public void addAtTail(int val) {
        ListNode curr = head;
        while(curr.next!=null){
            curr = curr.next;
        }
        curr.next = new ListNode(val);
        size++;
    }
    
    public void addAtIndex(int index, int val) {
        if(index > size) return;
        if(index < 0){
            addAtHead(val);
            return;
        }
        ListNode curr = head;
        for(int i=0;i<index;i++){
            curr = curr.next;
        }
        ListNode newNode = new ListNode(val); 
        newNode.next = curr.next;
        curr.next = newNode;
        size++;
    }
    
    public void deleteAtIndex(int index) {
        if(index >= size || index < 0) return;
        ListNode curr = head;
        for(int i=0;i<index;i++){
            curr = curr.next;
        }
        ListNode tmp = curr.next;
        curr.next = tmp.next;
        tmp.next = null;      
        size--;  
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */