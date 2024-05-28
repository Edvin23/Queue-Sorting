public class CircularQueue <E> implements BareBonesQueue<E>{
    private E[] Q;
    private int front;
    private int rear;
    private int size;
    private int capacity;
    private final int DEFAULT_CAPACITY = 5;

    public CircularQueue(){
        this.Q = (E[]) new Object[this.DEFAULT_CAPACITY];
        this.front = 0;
        this.rear = 0;
        this.size = 0;
        this.capacity = this.DEFAULT_CAPACITY;
    }

    public CircularQueue(int capacity){
        this.capacity = capacity;
        Q = (E[]) new Object[this.capacity];
        this.front = 0;
        this.rear = 0;
        this.size = 0;

    }

    @Override
    public void offer(E obj) {
        if(isFull()){
            System.out.println("Queue out of space; calling reallocate");
            reallocate();
            this.offer(obj);
        }
        else{
            Q[rear] = obj;
            rear = (rear + 1) % this.capacity;
            size++;
        }

    }

    private void reallocate() {
        int newCapacity = 2 * capacity;
        E[] newData = (E[])new Object[newCapacity];
        int j = front;
        for(int i = 0; i < size; i++){
            newData[i] = Q[j];
            j = (j + 1) % capacity;
        }
        front = 0;
        rear = size - 1;
        capacity = newCapacity;
        Q = newData;
    }

    @Override
    public E poll() {
        if(isEmpty()){
            System.out.println("Queue underflow");
            return null;
        }
        E temp = Q[front];
        front = (front + 1) % this.capacity;
        size--;
        return temp;
    }

    @Override
    public boolean isEmpty() {
        return (this.size == 0);

    }

    @Override
    public boolean isFull() {
        return (this.size == this.capacity);
    }

    @Override
    public E peek() {
        if(isEmpty()){
            System.out.println("Queue underflow");
            return null;
        }
        return Q[front];
    }

    public String toString(){
        String s = "Q: ";
        for(int i = front; i < front + size; i++){
            s += Q[i % this.capacity] + " | ";
        }
        return s;
    }
}