// Problem: Level of a Node in Binary Tree

class Solution {
    int level = -1;

    int getLevel(Node node, int data) {
        if (helper(node, data, 1)) 
        {
            return level;
        }
        return 0;
    }

    boolean helper(Node root, int data, int currentLevel) {
        if (root == null) 
        {
            return false;
        }
        if (root.data == data) 
        {
            level = currentLevel;
            return true;
        }
        return helper(root.left, data, currentLevel + 1) || helper(root.right, data, currentLevel + 1);
    }
}
