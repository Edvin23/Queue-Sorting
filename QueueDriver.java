public class QueueDriver {
    public static void main(String[] args){
        CircularQueue<Integer> Q = new CircularQueue<>();
        Q.offer(10); System.out.println(Q);
        Q.offer(20); System.out.println(Q);
        Q.offer(30); System.out.println(Q);
        Q.offer(40); System.out.println(Q);
        Q.offer(50); System.out.println(Q);
        Q.offer(60); System.out.println(Q);
        Q.offer(70); System.out.println(Q);
        Q.poll(); System.out.println(Q);
        Q.poll(); System.out.println(Q);
        Q.poll(); System.out.println(Q);
        Q.offer(60); System.out.println(Q);
        Q.offer(70); System.out.println(Q);
        Q.offer(80); System.out.println(Q);
        Q.offer(90); System.out.println(Q);
        Q.offer(100); System.out.println(Q);
    }
}
