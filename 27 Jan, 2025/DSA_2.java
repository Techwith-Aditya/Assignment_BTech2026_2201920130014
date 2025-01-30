// Problem: Binary Tree Right Side View

class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer> a=new ArrayList<>();
        rightSideViewHelper(root, a, 0);
        return a;
    }

    void rightSideViewHelper(TreeNode root, ArrayList<Integer> a, int level) {
        if(root==null) 
        {
            return;
        }

        if(level==a.size()) 
        {
            a.add(root.val);
        }

        // Phle right jaao, fir left jaao...
        rightSideViewHelper(root.right, a, level+1);
        rightSideViewHelper(root.left, a, level+1);
    }
}
