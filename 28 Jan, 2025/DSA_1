// Problem: Deepest Leaves Sum

class Solution {
    int maxDepth=-1;
    int sum=0;

    public int deepestLeavesSum(TreeNode root) {
        dfs(root, 0);
        return sum;
    }

    private void dfs(TreeNode root, int currDepth) {
        if(root==null)
        {
            return;
        }
        if(root.left==null && root.right==null)
        {
            if(currDepth>maxDepth)
            {
                maxDepth=currDepth;
                sum=root.val;
            }
            else if(currDepth==maxDepth)
            {
                sum=sum+root.val;
            }
        }
        dfs(root.left, currDepth+1);
        dfs(root.right, currDepth+1);
    }
}
