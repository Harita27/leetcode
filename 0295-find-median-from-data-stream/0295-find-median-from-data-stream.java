class MedianFinder {
    PriorityQueue<Integer> minheap=new PriorityQueue<>();//to store bigger elements
    PriorityQueue<Integer> maxheap=new PriorityQueue<>(Collections.reverseOrder());//to store smaller elements
    public MedianFinder() {
        
    }
    
    public void addNum(int num) {
       if(maxheap.isEmpty() || maxheap.peek()>num){
        maxheap.offer(num);
       }
       else{
        minheap.offer(num);
       }
       if(maxheap.size()-minheap.size()>1){
        minheap.offer(maxheap.poll());

       }
       else if(minheap.size()-maxheap.size()>1){
        maxheap.offer(minheap.poll());
       }
    }
    
    public double findMedian() {
        if(minheap.size()==maxheap.size()){
            return (double)(minheap.peek()+maxheap.peek())/2;
        }
        else if(minheap.size()>maxheap.size()){
            return minheap.peek();
        }
        else{
            return maxheap.peek();
        }
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */