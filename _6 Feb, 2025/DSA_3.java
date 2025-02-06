// Problem: Quick Sort on Linked List

class GfG {
    public static Node quickSort(Node node) {
        if (node == null || node.next == null) 
        {
            return node;
        }

        Node last = node;
        while (last.next != null) 
        {
            last = last.next;
        }
        int pivot = last.data;

        Node smallerHead = new Node(-1); 
        Node smaller = smallerHead;
        
        Node equalHead = new Node(-1); 
        Node equal = equalHead;
        
        Node largerHead = new Node(-1);
        Node larger = largerHead;
        
        Node temp = node;
        while (temp != null) 
        {
            if (temp.data < pivot) 
            {
                smaller.next = temp;
                smaller = smaller.next;
            } 
            else if (temp.data == pivot) 
            {
                equal.next = temp;
                equal = equal.next;
            } 
            else 
            {
                larger.next = temp;
                larger = larger.next;
            }
            
            temp = temp.next;
        }

        smaller.next = null;
        equal.next = null;
        larger.next = null;

        Node sortedSmaller = quickSort(smallerHead.next);
        Node sortedLarger = quickSort(largerHead.next);

        return concatenate(sortedSmaller, equalHead.next, sortedLarger);
    }

    private static Node concatenate(Node smaller, Node equal, Node larger) {
        Node head = smaller;

        if (smaller != null) 
        {
            while (smaller.next != null) 
            {
                smaller = smaller.next;
            }
            smaller.next = equal;
        } 
        
        else 
        {
            head = equal;
        }

        while (equal.next != null) 
        {
            equal = equal.next;
        }
        equal.next = larger;

        return head;
    }
}
