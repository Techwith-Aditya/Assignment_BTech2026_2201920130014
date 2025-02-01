// Problem: Diagonal Tree Traversal

// Isme hm current node ko phle queue me dalege, fir uska left check krege, agr uska left exist kr rha h to use queue me dalege...is current element ko hm list me add kr dege...aur current ko right node pe phucha dege...fir current k liye vhi sare steps repeat hoge...
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
