// Problem: Isomorphic Trees

class Solution {
    boolean isIsomorphic(Node root1, Node root2) {
        if(root1 == null && root2 == null) 
        {
            return true;
        }
        if(root1 == null || root2 == null || root1.data != root2.data) 
        {
            return false;
        }
        
        // // without swapping me root1.left ko root2.left se compare krege...
        boolean withoutSwap = isIsomorphic(root1.left, root2.left) && isIsomorphic(root1.right, root2.right);
        
        // with swapping me root1.left ko root2.right se compare krege...
        boolean withSwap = isIsomorphic(root1.left, root2.right) && isIsomorphic(root1.right, root2.left);

        return withoutSwap || withSwap;
    }
}
