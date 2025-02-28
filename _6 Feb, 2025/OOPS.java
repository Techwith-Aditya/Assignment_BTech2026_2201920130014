// Problem: Find Median from Data Stream

class MedianFinder {
    PriorityQueue<Integer> maxHeap=new PriorityQueue<>(Collections.reverseOrder()); // contains first half of numbers & to design a maxHeap we do Collections.reverseOrder()...
    PriorityQueue<Integer> minHeap=new PriorityQueue<>(); // contains second half of numbers...

    public MedianFinder() {
        
    }
    
    public void addNum(int num) {
        if(maxHeap.isEmpty() || maxHeap.peek()>=num)
        {
            maxHeap.add(num);
        }
        else
        {
            minHeap.add(num);
        }

        if(maxHeap.size()>minHeap.size()+1)
        {
            minHeap.add(maxHeap.poll());
        }
        else if(maxHeap.size()<minHeap.size())
        {
            maxHeap.add(minHeap.poll());
        }
    }
    
    public double findMedian() {
        if(maxHeap.size()==minHeap.size())
        {
            return maxHeap.peek()/2.0 + minHeap.peek()/2.0;
        }
        return maxHeap.peek();
    }
}
