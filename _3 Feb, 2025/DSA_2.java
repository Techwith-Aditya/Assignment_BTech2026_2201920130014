// Problem: Find a Corresponding Node of a Binary Tree in a Clone of That Tree

class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        if (original == null) 
        {
            return null;
        }
        if (original == target) 
        {
            return cloned;
        }
        
        TreeNode result = getTargetCopy(original.left, cloned.left, target);
        if (result != null) 
        {
            return result;
        }
        return getTargetCopy(original.right, cloned.right, target);
    }
}
