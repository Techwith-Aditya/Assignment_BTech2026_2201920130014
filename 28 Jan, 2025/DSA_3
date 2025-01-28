// Problem: Balanced Tree Check

class Solution {
    public boolean isBalanced(TreeNode root) {
        return height(root)!=-1; // -1 means unbalanced hoga...
    }

    private int height(TreeNode node) {
        if(node==null) 
        {
            return 0;
        }

        int leftH=height(node.left);
        int rightH=height(node.right);

        if(leftH==-1 || rightH==-1 || Math.abs(leftH-rightH)>1) 
        {
            return -1;
        }
        return Math.max(leftH, rightH)+1;
    }
}
