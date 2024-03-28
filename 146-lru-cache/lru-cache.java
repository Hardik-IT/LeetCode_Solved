class ListNode{
    int key;
    int val;
    ListNode prev;
    ListNode next;
    public ListNode(int key,int val){
        this.key = key;
        this.val = val;
    }
}

class LRUCache {
    int capacity;
    Map<Integer,ListNode> dict;
    ListNode head;
    ListNode tail;
    public LRUCache(int capacity) {
        this.capacity = capacity;
        dict = new HashMap<>();
        head = new ListNode(-1,-1);
        tail = new ListNode(-1,-1);
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        if(!dict.containsKey(key)){
            return -1;
        }
            ListNode node = dict.get(key);
            remove(node);
            add(node);
            return node.val;
        
    }
    
    public void put(int key, int value) {
        if(dict.containsKey(key)){
            ListNode oldNode = dict.get(key);
            remove(oldNode);
        }

        ListNode newNode = new ListNode(key,value);
        dict.put(key,newNode);
        add(newNode);

        if(dict.size() > capacity){
            ListNode nodeDelete = head.next;
            remove(nodeDelete);
            dict.remove(nodeDelete.key);
        }
    }
    public void add(ListNode node){
        ListNode prevEnd = tail.prev;
        prevEnd.next = node;
        node.prev = prevEnd;
        node.next = tail;
        tail.prev = node;
    }
    public void remove(ListNode node){
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */