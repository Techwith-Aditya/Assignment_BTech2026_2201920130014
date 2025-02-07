// Problem: Linked List Cycle

class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) 
        {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) 
        {
            slow = slow.next;
            fast = fast.next.next;
            // [3,2,0,-4] me cycle aise hogi --> 3->2->0->-4->2->0->-4....
            if (slow == fast) // aage chlke slow fast ek ho jayege...
            {
                return true;
            }
        }

        return false;
    }
}
