// Problem: Construct Binary Tree from Preorder and Inorder Traversal

class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int i=0; i<inorder.length; i++)
        {
            map.put(inorder[i], i);
        }
        
        // inorder me phle root dekho, fir preorder me jake right left subtree dekho...
        TreeNode root=construct(inorder, 0, inorder.length-1, preorder, 0, preorder.length-1, map); 
        return root;
    }

    public TreeNode construct(int[] inorder, int inStart, int inEnd, int[] preorder, int preStart, int preEnd, HashMap<Integer, Integer> map) {
        if(inStart>inEnd || preStart>preEnd)
        {
            return null;
        }

        TreeNode root=new TreeNode(preorder[preStart]);
        int inRoot=map.get(root.val); // ye pointer h, joki root ki value kha pr h ye btayega...
        int numsOnLeft=inRoot-inStart; // how many no.s are on left of root inside inorder...

        root.left=construct(inorder, inStart, inRoot-1, preorder, preStart+1, preStart + numsOnLeft, map);
        root.right=construct(inorder, inRoot+1, inEnd, preorder, preStart + numsOnLeft+1, preEnd, map);
        return root;
    }
}
