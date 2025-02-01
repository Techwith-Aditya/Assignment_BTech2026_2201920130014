// Problem: Diagonal Tree Traversal

class Tree {
    public ArrayList<Integer> diagonal(Node root) {
        Queue<Node> q=new LinkedList<>();
        ArrayList<Integer> a=new ArrayList<>();
        
        if(root==null)
        {
            return a;
        }
        q.add(root);
        
        while(!q.isEmpty())
        {
            Node curr=q.peek();
            q.remove();
            while(curr!=null)
            {
                if(curr.left!=null)
                {
                    q.add(curr.left);
                }
                a.add(curr.data);
                curr=curr.right;
            }
        }
        return a;
    }
}
