// Problem: Binary Search Tree Iterator

class BSTIterator {
    Stack<TreeNode> s=new Stack<>();

    public BSTIterator(TreeNode root) {
        pushAll(root);
    }
    
    public int next() {
        TreeNode temp=s.pop();
        pushAll(temp.right);
        return temp.val;
    }
    
    public boolean hasNext() {
        return !s.isEmpty();
    }
    
    // take all the lefts and push it onto the stack...
    public void pushAll(TreeNode root) {
        while(root!=null) 
        {  
        s.push(root);  
        root=root.left;  
        }  
    }
}
