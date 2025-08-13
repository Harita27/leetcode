class MedianFinder {
    PriorityQueue<Integer> maxheap,minheap;
    public MedianFinder() {
        minheap=new PriorityQueue<>(Collections.reverseOrder());
        maxheap=new PriorityQueue<>();
    }
    public void addNum(int num) {
        if(minheap.size()==maxheap.size()){
            minheap.add(num);
            maxheap.add(minheap.poll());
        }
        else{
            maxheap.add(num);
            minheap.add(maxheap.poll());
        }
    }
    
    public double findMedian() {
        if(minheap.size()!=maxheap.size()){
            return maxheap.peek();
        }
        else return((minheap.peek()+maxheap.peek())/2.0);
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */