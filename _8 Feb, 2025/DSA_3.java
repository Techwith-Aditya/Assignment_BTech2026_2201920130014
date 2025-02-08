// Problem: Flattening a Linked List

class Solution {
    // Helper function to merge two sorted linked lists using bottom pointers
    Node mergeTwoLists(Node a, Node b) {
        Node dummy = new Node(-1);
        Node temp = dummy;
        
        // Merge two lists using the bottom pointers
        while (a != null && b != null) 
        {
            if (a.data < b.data) 
            {
                temp.bottom = a;
                temp=a;
                a = a.bottom;
            } 
            else 
            {
                temp.bottom = b;
                temp=b;
                b = b.bottom;
            }
            temp.next = null;
        }
        
        // Attach remaining nodes
        if (a != null) 
        {
            temp.bottom = a;
        } 
        else 
        {
            temp.bottom = b;
        }
        if(dummy.bottom!=null)
        {
            dummy.bottom.next=null;
        }
        return dummy.bottom;
    }

    Node flatten(Node head) {
        if (head == null || head.next == null) 
        {
            return head;
        }

        Node mergedHead=flatten(head.next);
        head=mergeTwoLists(head, mergedHead);
        return head;
    }
}
