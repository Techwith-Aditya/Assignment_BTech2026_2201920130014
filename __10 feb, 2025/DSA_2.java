// Problem: Delete nodes having greater value on right

class Solution {
    Node compute(Node head) {
        if (head == null || head.next == null) 
        {
            return head;
        }

        head.next = compute(head.next);
        if (head.next != null && head.next.data > head.data) 
        {
            return head.next;
        }

        return head;
    }
}
