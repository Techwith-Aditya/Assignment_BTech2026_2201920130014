// Problem: Merge Sort for Linked List

class Solution {
    // Function to sort the given linked list using Merge Sort.
    static Node mergeSort(Node head) {
        if(head.next==null) // tod tod k jab ek ek node bch rhi ho...
        {
            return head;
        }
        
        Node mid=findMid(head);
        Node left=head;
        Node right=mid.next;
        mid.next=null;
        
        left=mergeSort(left);
        right=mergeSort(right);
        
        Node result=merge(left, right);
        
        return result;
    }
    
    static Node findMid(Node head) {
        Node slow=head;
        Node fast=head;
        
        while(fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        
        return slow;
    }
    
    static Node merge(Node left, Node right) {
        if(left==null)
        {
            return right;
        }
        
        if(right==null)
        {
            return left;
        }
        
        Node dummy=new Node(-1);
        Node temp=dummy;
        
        while(left!=null && right!=null)
        {
            if(left.data < right.data)
            {
                temp.next=left;
                temp=left;
                left=left.next;
            }
            else
            {
                temp.next=right;
                temp=right;
                right=right.next;
            }
        }
        
        while(left!=null)
        {
            temp.next=left;
            temp=left;
            left=left.next;
        }
        
        while(right!=null)
        {
            temp.next=right;
            temp=right;
            right=right.next;
        }
        
        return dummy.next;
    } 
}
