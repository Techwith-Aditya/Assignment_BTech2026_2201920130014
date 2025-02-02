// Problem: LRU Cache

class Node {
    int key;
    int value;
    Node prev;
    Node next;

    Node(int key, int value) {
        this.key = key;
        this.value = value;
    }
}

class LRUCache {
    HashMap<Integer, Node> map = new HashMap<>();
    int cap = 0;
    Node head = new Node(-1, -1);
    Node tail = new Node(-1, -1);

    public LRUCache(int capacity) {
        cap = capacity;
        map.clear();
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        if (!map.containsKey(key)) 
        {
            return -1;
        }
        Node node = map.get(key);
        deleteNode(node);
        insertAfterHead(node);

        return node.value;
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) 
        {
            Node node = map.get(key);
            node.value = value;
            deleteNode(node);
            insertAfterHead(node);
        } 
        else 
        {
            if (map.size() >= cap) 
            {
                Node node = tail.prev;
                map.remove(node.key);
                deleteNode(node);
            }
            
            Node newNode = new Node(key, value);
            map.put(key, newNode);
            insertAfterHead(newNode);
        }
    }

    public void deleteNode(Node node) {
        Node prevNode = node.prev;
        Node afterNode = node.next;

        prevNode.next = afterNode;
        afterNode.prev = prevNode;
    }

    public void insertAfterHead(Node node) {
        Node currAfterHead = head.next;
        head.next = node;
        node.next = currAfterHead;
        currAfterHead.prev = node;
        node.prev = head;
    }
}
