class MyQueue {
    Stack<Integer> input;
    Stack<Integer> output;
    public MyQueue() {
        input = new Stack<>();
        output = new Stack<>();
    }
    
    public void push(int x) {
        while(!output.isEmpty()){
            input.push(output.pop());
        }
        input.push(x);
        while(!input.isEmpty()){
            output.push(input.pop());
        }
    }
    
    public int pop() {
        return output.pop();
    }
    
    public int peek() {
        return output.peek();
    }
    
    public boolean empty() {
        return output.isEmpty();
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