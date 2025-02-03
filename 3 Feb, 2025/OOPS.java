// Problem: Design Circular Queue

class MyCircularQueue {
    int[] q;
    int front, rear, N;

    public MyCircularQueue(int k) {
        q = new int[k];
        N = k;
        front = -1;
        rear = -1;
    }

    public boolean enQueue(int value) {
        if (isFull()) 
        {
            return false;
        }
        if (isEmpty()) 
        {
            front = rear = 0;
            q[rear] = value;
        } 
        else 
        {
            rear = (rear + 1) % N;
            q[rear] = value;
        }
        return true;
    }

    public boolean deQueue() {
        if (isEmpty()) 
        {
            return false;
        }
        if (front == rear) 
        {
            front = rear = -1;
        } 
        else 
        {
            front = (front + 1) % N;
        }
        return true;
    }

    public int Front() {
        if (isEmpty()) 
        {
            return -1;
        }
        return q[front];
    }

    public int Rear() {
        if (isEmpty()) 
        {
            return -1;
        }
        return q[rear];
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public boolean isFull() {
        return (rear + 1) % N == front;
    }
}
