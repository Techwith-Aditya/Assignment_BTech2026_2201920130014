// Problem: Reverse First K elements of Queue

class GfG {
    // Function to reverse first k elements of a queue.
    public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
        if (q == null || k <= 0 || k > q.size()) 
        {
            return q;
        }
        
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < k; i++) 
        {
            stack.push(q.poll());
        }
        
        while (!stack.isEmpty()) 
        {
            q.add(stack.pop());
        }
        
        int size = q.size();
        for (int i = 0; i < size - k; i++) 
        {
            q.add(q.poll());
        }
        
        return q;
    }
}
