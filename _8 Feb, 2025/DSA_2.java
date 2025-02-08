// Problem: Reverse a Doubly Linked List

class Solution {
    public DLLNode reverseDLL(DLLNode head) {
        if(head==null || head.next==null)
        {
            return head;
        }
        DLLNode dummy=new DLLNode(-1);
        dummy.next=head;
        
        DLLNode curr=head;
        DLLNode last=head;
        while(last.next!=null)
        {
            last=last.next;
        }
        
        while(curr!=last && curr.prev!=last)
        {
            int temp=curr.data;
            curr.data=last.data;
            last.data=temp;
            curr=curr.next;
            last=last.prev;
        }
        return dummy.next;
    }
}
