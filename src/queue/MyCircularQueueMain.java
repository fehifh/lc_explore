package queue;


public class MyCircularQueueMain {
    public static void main(String[] args) {
//        MyQueue q = new MyQueue();
//        q.enQueue(5);
//        q.enQueue(3);
//        if (q.isEmpty() == false) {
//            System.out.println(q.Front());
//        }
//        q.deQueue();
//        if (q.isEmpty() == false) {
//            System.out.println(q.Front());
//        }
//        q.deQueue();
//        if (q.isEmpty() == false) {
//            System.out.println(q.Front());
//        }

        MyCircularQueue q = new MyCircularQueue(3);
        q.enQueue(1);
        System.out.println("size:"+q.size());
        q.enQueue(2);
        System.out.println("size:"+q.size());
        q.enQueue(3);
        System.out.println("size:"+q.size());
        if (q.isEmpty() == false) {
            System.out.println(q.Front());
            System.out.println("size:"+q.size());
        }
        q.deQueue();
        if (q.isEmpty() == false) {
            System.out.println(q.Front());
            System.out.println("size:"+q.size());
        }
        q.deQueue();
        if (q.isEmpty() == false) {
            System.out.println(q.Front());
            System.out.println("size:"+q.size());
        }
    }
}