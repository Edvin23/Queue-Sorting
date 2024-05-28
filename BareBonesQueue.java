public interface BareBonesQueue <E>{
    public void offer(E obj);   //AddingData
    public E poll();            //Removing Data
    public boolean isEmpty();   //Check if queue is empty
    public boolean isFull();    //check if queue is full
    public E peek();            //Returns the first element;

}
