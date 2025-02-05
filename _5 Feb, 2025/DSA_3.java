// Problem: Remove Nth Node From End of List

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp1=new ListNode(0);
        temp1.next=head;
        ListNode first=temp1;
        ListNode second=temp1;
        
        for(int i=0; i<n+1; i++) 
        {
            first=first.next;
        }
        
        while(first!=null) 
        {
            first=first.next;
            second=second.next;
        }
        
        second.next=second.next.next;
        return temp1.next;
    }
}
