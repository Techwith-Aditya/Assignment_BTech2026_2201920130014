// Problem: Design a stack that supports push, pop, top, and retrieving the minimum element in constant time

class MinStack {
    private Stack<int[]> s=new Stack<>();

    public MinStack() {

    }
    
    public void push(int val) {
        if(s.isEmpty()) 
        {
            s.push(new int[]{val, val});
        } 
        else
        {
            int currentMin=s.peek()[1];
            s.push(new int[]{val, Math.min(val, currentMin)});
        }
    }
    
    public void pop() {
        if(!s.isEmpty()) 
        {
            s.pop();
        }
    }
    
    public int top() {
        if(!s.isEmpty()) 
        {
            return s.peek()[0];
        }
        throw new IllegalStateException("Stack is empty");
    }
    
    public int getMin() {
        if(!s.isEmpty()) 
        {
            return s.peek()[1];
        }
        throw new IllegalStateException("Stack is empty");
    }
}
