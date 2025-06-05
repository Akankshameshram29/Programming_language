package StackQueue;

public class QueueMain {
    public static void main(String[] args)  throws Exception{
        CustomQueue queue = new CustomQueue();
        queue.insert(23);
        queue.insert(34);
        queue.insert(45);
        queue.insert(55);
        queue.insert(66);

        queue.display();

        System.out.println(queue.remove());
        System.out.println(queue.remove());

        queue.display();

        CircularQueue cq = new CircularQueue();
        cq.insert(6);
        cq.insert(2);
        cq.insert(4);
        cq.insert(5);

       cq.display();
       System.out.println(cq.remove());
       System.out.println(cq.remove());
       cq.display();

       DynamicQueue dq = new DynamicQueue(5);
       dq.insert(23);
       dq.insert(32);
       dq.insert(24);
       dq.insert(54);
       dq.insert(34);
       
       dq.display();

       dq.insert(35);
       dq.display();
    }
}
