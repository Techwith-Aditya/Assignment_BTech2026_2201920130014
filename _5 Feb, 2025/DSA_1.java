// Problem: Reorder List

class Solution {
    public void reorderList(ListNode head) {
        if(head==null || head.next==null || head.next.next==null)
        {
            return;
        }

        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }

        ListNode secondHead=slow.next;
        slow.next=null;

        ListNode curr=secondHead;
        ListNode prev=null;
        ListNode nex=curr.next;
        while(curr!=null)
        {
            nex=curr.next;   
            curr.next=prev;
            prev=curr;
            curr=nex;
        }

        ListNode t1=head;
        ListNode t2=prev;
        while(t2!=null)
        {
            ListNode m1=t1.next;
            ListNode m2=t2.next;
            t1.next=t2;
            t2.next=m1;
            t1=m1;
            t2=m2;
        }
        // return head; ---> can't use because function is void 
    }
}
