// Solution_1: Simulated Linked List by simple traversal technique:

// class MyLinkedList {
//     private class Node {
//         int data;
//         Node next;
//         public Node(int data) {
//             this.data=data;
//             this.next=null;
//         }
//     }

//     private Node head;
//     private int size;

//     public MyLinkedList() {
//         head=null;
//         size=0;
//     }

//     public int get(int index) {
//         if(index < 0 || index >= size) 
//         {
//             return -1;
//         }
//         Node temp=head;
//         for(int i=0; i<index; i++) 
//         {
//             temp=temp.next;
//         }
//         return temp.data;
//     }

//     public void addAtHead(int val) {
//         Node newNode=new Node(val);
//         newNode.next=head;
//         head=newNode;
//         size++;
//     }

//     public void addAtTail(int val) {
//         Node newNode=new Node(val);
//         if(head==null) 
//         {
//             head=newNode;
//         } 
//         else 
//         {
//             Node temp=head;
//             while(temp.next != null) 
//             {
//                 temp=temp.next;
//             }
//             temp.next=newNode;
//         }
//         size++;
//     }

//     public void addAtIndex(int index, int val) {
//         if(index < 0 || index > size) 
//         {
//             return;
//         }
//         if(index==0) 
//         {
//             addAtHead(val);
//         } 
//         else if(index == size) 
//         {
//             addAtTail(val);
//         } 
//         else 
//         {
//             Node newNode=new Node(val);
//             Node temp=head;
//             for(int i=0; i<index-1; i++) 
//             {
//                 temp=temp.next;
//             }
//             newNode.next=temp.next;
//             temp.next=newNode;
//             size++;
//         }
//     }

//     public void deleteAtIndex(int index) {
//         if(index < 0 || index >= size) 
//         {
//             return;
//         }
//         if(index == 0) 
//         {
//             head=head.next;
//         } 
//         else 
//         {
//             Node temp=head;
//             for(int i=0; i<index-1; i++) 
//             {
//                 temp=temp.next;
//             }
//             temp.next = temp.next.next;
//         }
//         size--;
//     }
// }

// Solution_2: ArrayList implemented for LinkedList simulation:

class MyLinkedList {
    ArrayList<Integer> a=new ArrayList<>();
    public MyLinkedList() {

    }
    
    public int get(int index) {
        if(index<0 || index>=a.size())
        {
            return -1;
        }
        return a.get(index);
    }
    
    public void addAtHead(int val) {
        a.add(0, val);
    }
    
    public void addAtTail(int val) {
        a.add(a.size(), val);
    }
    
    public void addAtIndex(int index, int val) {
        if(index>=0 && index<=a.size())
        {
            a.add(index, val);
        }
    }
    
    public void deleteAtIndex(int index) {
        if(index>=0 && index<a.size())
        {
            a.remove(index);
        }
    }
}
