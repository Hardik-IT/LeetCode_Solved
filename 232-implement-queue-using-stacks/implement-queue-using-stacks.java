class MyQueue {
    Stack<Integer> input = new Stack<>();
    Stack<Integer> output = new Stack<>();
    public MyQueue() {
        
    }
    
    public void push(int x) {
        if(!input.isEmpty()){
            while(!input.isEmpty()){
                output.add(input.pop());
            }
        }
        input.add(x);
        if(!output.isEmpty()){
            while(!output.isEmpty()){
             input.add(output.pop());
            }
        }
    }
    
    public int pop() {
        if(!input.isEmpty())
            return input.pop();
        return 0;
    }
    
    public int peek() {
        if(!input.isEmpty())
        return input.peek();
        return 0;
    }
    
    public boolean empty() {
        return input.isEmpty();
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