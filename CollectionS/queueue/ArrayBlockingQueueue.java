import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueueue {
    public static void main(String[] args) throws InterruptedException {
        ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(10);

        queue.put(3487);
        queue.put(87);
        queue.put(348);
        queue.put(34871);
        System.out.println(queue.size());

        // queue.add(123123123);

        System.out.println(queue);

        System.out.println(queue.take());
        System.out.println(queue.take());
        System.out.println(queue.take());
        // System.out.println(queue.take());

        System.out.println(queue.size());
        System.out.println(queue);

    }
}
