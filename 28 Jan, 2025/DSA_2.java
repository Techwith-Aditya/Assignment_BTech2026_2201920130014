// Problem: Leaves at Same Level or Not

import java.util.*;

class Node {
    int data;
    Node left; 
    Node right;
    Node(int data) {
        this.data=data;
        this.left=null;
        this.right=null;
    }
}

public class LeavesAtSameLevel {
    int firstEncounteredLeafLevel=-1;
    
    boolean check(Node root) {
        return isSameLevel(root, 0);
    }
    
    boolean isSameLevel(Node root, int Currlevel) {
        if(root==null)
        {
            return true;
        }
        if(root.left==null && root.right==null)
        {
            if(firstEncounteredLeafLevel==-1)
            {
                firstEncounteredLeafLevel=Currlevel;
            }
            return firstEncounteredLeafLevel==Currlevel;
        }
        return isSameLevel(root.left, Currlevel+1) && isSameLevel(root.right, Currlevel+1);
    }

    static Node buildTree(Integer[] arr) {
        if(arr.length==0 || arr[0]==null) 
        {
            return null;
        }

        Node root=new Node(arr[0]);
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        int i=1;

        while(i<arr.length) 
        {
            Node current=q.poll();

            // Assign left child
            if(i<arr.length && arr[i]!=null) 
            {
                current.left=new Node(arr[i]);
                q.add(current.left);
            }
            i++;

            // Assign right child
            if(i<arr.length && arr[i]!=null) 
            {
                current.right=new Node(arr[i]);
                q.add(current.right);
            }
            i++;
        }
        return root;
    }

    public static void main(String[] args) {
        LeavesAtSameLevel sol=new LeavesAtSameLevel();
        Integer[] arr = {10, 20, 30};
        
        Node root = buildTree(arr);
        boolean result = sol.check(root);
        System.out.println(result);

    }
}
