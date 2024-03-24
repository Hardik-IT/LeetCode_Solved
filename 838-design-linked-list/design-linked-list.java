class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
            this.next = null;
        }
}

class MyLinkedList {
    Node head;
    int size;

    public MyLinkedList() {
        size = 0;
        head = new Node(-1);
    }

    public int get(int index) {
        if (index >= size || index < 0) return -1;
        Node curr = head.next;
        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }
        return curr.val;
    }

    public void addAtHead(int val) {
        Node newNode = new Node(val);
        newNode.next = head.next;
        head.next = newNode;
        size++;
    }

    public void addAtTail(int val) {
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = new Node(val);
        size++;
    }

    public void addAtIndex(int index, int val) {
        if (index > size) return;
        if (index < 0) {
            addAtHead(val);
            return;
        }
        Node curr = head;
        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }
        Node newNode = new Node(val);
        newNode.next = curr.next;
        curr.next = newNode;
        size++;
    }

    public void deleteAtIndex(int index) {
        if (index >= size || index < 0) return;
        Node curr = head;
        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }
        Node temp = curr.next;
        curr.next = temp.next;
        temp.next = null;
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