class MyStack {
    Queue<Integer> queue=new LinkedList<>();
    public MyStack() {
    }
    
    public void push(int x) {
        queue.add(x);
    }
    
    public int pop() {
        int n=queue.size();
        while(n>1){
            int x = queue.remove();
            queue.add(x);
            n--;
        }
        int x=queue.remove();
        return x;
    }
    
    public int top() {
        int n=queue.size();
        while(n>1){
            int x = queue.remove();
            queue.add(x);
            n--;
        }
        int x=queue.remove();
        queue.add(x);
        return x;        
    }
    
    public boolean empty() {
        return queue.isEmpty();
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