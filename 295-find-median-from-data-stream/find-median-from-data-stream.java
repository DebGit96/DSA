class MedianFinder {

    PriorityQueue<Integer> firstMaxHeap;
    PriorityQueue<Integer> secondMinHeap;

    public MedianFinder() {
        firstMaxHeap= new PriorityQueue<>(Comparator.reverseOrder());
        secondMinHeap= new PriorityQueue<>();
    }
    
    public void addNum(int num) {
        firstMaxHeap.add(num);

        if(!secondMinHeap.isEmpty() && secondMinHeap.peek()<firstMaxHeap.peek()){
            secondMinHeap.add(firstMaxHeap.poll());
        }

        if(firstMaxHeap.size()>secondMinHeap.size()+1){
            secondMinHeap.add(firstMaxHeap.poll());
        }

        else if(secondMinHeap.size()>firstMaxHeap.size()+1){
            firstMaxHeap.add(secondMinHeap.poll());
        }
        
    }
    
    public double findMedian() {
        if(firstMaxHeap.size()>secondMinHeap.size()){
            return firstMaxHeap.peek();
        }

        else if(secondMinHeap.size()>firstMaxHeap.size()){
            return secondMinHeap.peek();
        }

        return ((firstMaxHeap.peek()+secondMinHeap.peek())/2.0d);
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */