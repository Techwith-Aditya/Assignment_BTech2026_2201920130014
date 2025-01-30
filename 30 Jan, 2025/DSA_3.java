// Problem: Diameter of a Binary Tree

class Solution {
    int ansDiameter=0;
    
    int diameter(Node root) {
        find(root);
        return ansDiameter;
    }
    
    int find(Node root) {
        if(root==null)
        {
            return 0;
        }
        int leftH=find(root.left);
        int rightH=find(root.right);
        
        ansDiameter=Math.max(ansDiameter, leftH+rightH);
        return 1+Math.max(leftH, rightH);
    }
}
