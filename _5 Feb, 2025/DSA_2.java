// Problem: Tree Boundary Traversal

class Solution {
    ArrayList<Integer> boundaryTraversal(Node node) {
        ArrayList<Integer> a=new ArrayList<>();
        if(isLeaf(node)==false)
        {
            a.add(node.data);
        }
        
        addLeftBoundary(node, a);
        addLeaves(node, a);
        addRightBoundary(node, a);
        return a;
    }
    
    boolean isLeaf(Node root) {
        if(root.left==null && root.right==null)
        {
            return true;
        }
        return false;
    }
    
    void addLeftBoundary(Node root, ArrayList<Integer> a) {
        Node curr=root.left;
        while(curr!=null)
        {
            if(isLeaf(curr)==false)
            {
                a.add(curr.data);
            }
            if(curr.left!=null)
            {
                curr=curr.left;
            }
            else
            {
                curr=curr.right;
            }
        }
    }
    
    void addLeaves(Node root, ArrayList<Integer> a) {
        if(isLeaf(root))
        {
            a.add(root.data);
            return;
        }
        if(root.left!=null)
        {
            addLeaves(root.left, a);
        }
        if(root.right!=null)
        {
            addLeaves(root.right, a);
        }
    }
    
    void addRightBoundary(Node root, ArrayList<Integer> a) {
        Node curr=root.right;
        ArrayList<Integer> rightNodesinTopToBottomOrder=new ArrayList<>();
        
        while(curr!=null)
        {
            if(isLeaf(curr)==false)
            {
                rightNodesinTopToBottomOrder.add(curr.data);
            }
            if(curr.right!=null)
            {
                curr=curr.right;
            }
            else
            {
                curr=curr.left;
            }
        }
        
        // main wali me reverse order me lga do right wale boundary nodes...
        for(int i=rightNodesinTopToBottomOrder.size()-1; i>=0; i--)
        {
            a.add(rightNodesinTopToBottomOrder.get(i));
        }
    }
    
}
