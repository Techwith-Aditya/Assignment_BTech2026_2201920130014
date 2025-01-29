// Problem: Transform to Sum Tree

class Solution{
    public void toSumTree(Node root){
        transform(root);
    }
    
    public int transform(Node root) {
        if(root==null)
        {
            return 0;
        }
        
        int leftdata=0;
        int rightdata=0;
        
        leftdata=transform(root.left);
        rightdata=transform(root.right);
        
        int oldvalue=root.data;
        root.data=leftdata+rightdata;
        return root.data+oldvalue;
    }
}
