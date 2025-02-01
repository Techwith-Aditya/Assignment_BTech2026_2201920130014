// Problem: Implement Queue using Stacks

import java.util.*;
class MyQueue {
    Stack<Integer> s1=new Stack<>();
    Stack<Integer> s2=new Stack<>();
    int size=0;
    public MyQueue() {
        
    }
    
    public void push(int x) {
        while(s1.size()!=0) // loop for putting everything from s1 into s2. Then we will get first entered element in s1 will be on to the top of s2...
        {
            s2.push(s1.peek());
            s1.pop();
        }

        size++;
        s1.push(x);
        System.out.println("Added element is: "+x);

        while(s2.size()!=0) // again putting everything back in s1...
        {
            s1.push(s2.peek());
            s2.pop();
        }
    }
    
    public int pop() {
        if(s1.isEmpty())
        {
            System.out.println("No element present");
            return -1;
        }
        int deleted=s1.pop();
        System.out.println("Deleted element is: "+deleted);
        size--;
        return deleted;
    }
    
    public int peek() {
        if(s1.isEmpty())
        {
            System.out.println("No element present");
            return -1;
        }
        return s1.peek();
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
