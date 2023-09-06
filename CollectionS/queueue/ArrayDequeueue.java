import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayDequeueue {
    public static void main(String[] args) {
        ArrayDeque<Integer> adq = new ArrayDeque<Integer>();

        //add, addAll, addFirst, addLast -> throws IllegalStateException
        adq.add(1908);
        adq.add(2546);
        adq.add(4553);
        adq.add(3456);

        System.out.println(adq);
        // adq.addFirst(90);
        // adq.addLast(100);
        // System.out.println(adq);

        //offer, offerFirst, offerLast -> returns false
        // adq.offer(1908);
        // adq.offerFirst(90);
        // adq.offerLast(100);
        // System.out.println(adq);

        //getFirst, getLast -> throws NoSuchElementException
        // System.out.println(adq.getFirst());
        // System.out.println(adq.getLast());

        //peek, peekFirst, peekLast -> returns null
        // System.out.println(adq.peek());
        // System.out.println(adq.peekFirst());
        // System.out.println(adq.peekLast());

        //remove, remove(element), removeFirst, removeLast -> throws NoSuchElementException
        // System.out.println(adq.remove());
        // System.out.println(adq.removeFirst());
        // System.out.println(adq.removeLast());
        // System.out.println(adq);

        //poll, pollFirst, pollLast -> returns null
        // System.out.println(adq.poll());
        // System.out.println(adq.pollFirst());
        // System.out.println(adq.pollLast());
        // System.out.println(adq);

        //iterator(), descendingIterator()
        // System.out.println("Iterator");
        // Iterator<Integer> itr = adq.iterator();
        // while(itr.hasNext()) {
        //     System.out.println(itr.next());
        // }

        System.out.println("Descending Iterator");
        Iterator<Integer> itr1 = adq.descendingIterator();
        while(itr1.hasNext()) {
            System.out.println(itr1.next());
        }

    }
}