// Problem: Merge k Sorted Lists

// ___________Simplest Solution__________
// class Solution {
//     public ListNode mergeKLists(ListNode[] lists) {
//         ArrayList<Integer> elem=new ArrayList<>();
        
//         for (ListNode list:lists) 
//         {
//             ListNode temp=list;
//             while (temp!=null) 
//             {
//                 elem.add(temp.val);
//                 temp=temp.next;
//             }
//         }
//         Collections.sort(elem);
        
//         ListNode dummy=new ListNode(-1);
//         ListNode current=dummy;

//         for (int val:elem) 
//         {
//             current.next=new ListNode(val);
//             current=current.next;
//         }
        
//         return dummy.next;
//     }
// }

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists==null || lists.length==0) 
        {
            return null;
        }

        PriorityQueue<Pair<Integer, ListNode>> pq=new PriorityQueue<>((a, b)->a.getKey()-b.getKey());
        for(ListNode node:lists) 
        {
            if(node!=null) 
            {
                pq.add(new Pair<>(node.val, node));
            }
        }

        ListNode dummyNode=new ListNode(-1);
        ListNode temp=dummyNode;

        while(!pq.isEmpty()) 
        {
            Pair<Integer, ListNode> it=pq.poll();
            ListNode node=it.getValue();
            temp.next=node;
            temp=temp.next;

            if(node.next!=null) 
            {
                pq.add(new Pair<>(node.next.val, node.next));
            }
        }

        return dummyNode.next;
    }
}
