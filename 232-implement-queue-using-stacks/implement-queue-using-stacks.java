class MyQueue {
    Stack<Integer> s1= new Stack<>();
    Stack<Integer> s2= new Stack<>();
    public MyQueue() {
        
    }
    
    public void push(int x) {
        s1.push(x);
    }
    
    public int pop() {
        int x=0;
        while(s1.size()>1){
            x=s1.pop();
            s2.push(x);
        }
        x=s1.pop();
        while(!s2.isEmpty()){
            int y = s2.pop();
            s1.push(y);
        }
        return x;
    }
    
    public int peek() {
        int x=0;
        while(!s1.isEmpty()){
            x=s1.pop();
            s2.push(x);
        }
        while(!s2.isEmpty()){
            int y = s2.pop();
            s1.push(y);
        }
        return x;        
    }
    
    public boolean empty() {
        return s1.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */