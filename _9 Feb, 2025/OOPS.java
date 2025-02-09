// Problem: Maximum Frequency Stack

class FreqStack {
    private Map<Integer, Integer> freq=new HashMap<>();
    private Map<Integer, Stack<Integer>> group=new HashMap<>();
    private int maxFreq=0;

    public FreqStack() {
        
    }
    
    public void push(int val) {
        int f=freq.getOrDefault(val, 0)+1;
        freq.put(val, f);
        if(f>maxFreq) 
        {
            maxFreq=f;
        }
        if (!group.containsKey(f)) 
        {
            group.put(f, new Stack<>());
        }
        group.get(f).push(val);
    }
    
    public int pop() {
        Stack<Integer> stack=group.get(maxFreq);
        int x=stack.pop();
        freq.put(x, freq.get(x)-1);
        if(stack.isEmpty()) 
        {
            group.remove(maxFreq);
            maxFreq--;
        }
        return x;
    }
}
