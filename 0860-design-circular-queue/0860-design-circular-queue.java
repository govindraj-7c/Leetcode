class MyCircularQueue {
    int[] queue;
    int front, rear, size;

    public MyCircularQueue(int k) {
        queue = new int[k];
        Arrays.fill(queue, -1);
        front = 0;
        rear = 0; size = 0;
    }
    
    public boolean enQueue(int value) {
        if(isFull()){
            return false;
        }
        if(isEmpty()){
            front = rear = 0;
            queue[rear] = value;
            size++;
            return true;
        }
        rear++;
        size++;
        rear = rear%queue.length;
        queue[rear] = value;
        return true;
    }
    
    public boolean deQueue() {
        if(isEmpty()){
            return false;
        }
        queue[front] = -1;
        size--;
        front++;
        front = front % queue.length;
        return true;
    }
    
    public int Front() {
        return queue[front];
    }
    
    public int Rear() {
        return queue[rear];
    }
    
    public boolean isEmpty() {
        if(size == 0){
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean isFull() {
        if(size == queue.length){
            return true;
        }
        else{
            return false;
        }
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */