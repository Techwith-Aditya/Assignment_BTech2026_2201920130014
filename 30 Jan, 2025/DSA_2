// Problem: Height of Binary Tree

class Solution {
    // Function to find the height of a binary tree.
    int height(Node node) {
        if(node == null) 
        {
            return -1;
        }
        
        int leftH=0;
        if(node.left != null) 
        {
            leftH = 1+height(node.left);
        }
        
        int rightH=0;
        if(node.right != null) 
        {
            rightH = 1+height(node.right);
        }
        
        return Math.max(leftH, rightH);
    }
}
