class MyStack {
    Queue<Integer> queue;
    int size;
    public MyStack() {
        queue = new LinkedList<>();
        size = 0;
    }
    
    public void push(int x) {
        int csize = queue.size();
        queue.add(x);
        size++;        
        for(int i=0;i<csize;i++){
            int el = queue.remove();
            queue.add(el);
        }
    }
    
    public int pop() {
            size--;
            return  queue.remove();
    }
    
    public int top() {
        return queue.peek();
    }
    
    public boolean empty() {
        return size == 0;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */