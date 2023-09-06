import java.util.LinkedList;
import java.util.Iterator;

public class LinkList {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<Integer>();

        //add, addAll, addFirst, addLast -> throws IllegalStateException
        ll.add(1908);
        ll.add(2546);
        ll.add(4553);
        ll.add(3456);

        System.out.println(ll);
        // ll.addFirst(90);
        // ll.addLast(100);
        // System.out.println(ll);

        //offer, offerFirst, offerLast -> returns false
        // ll.offer(1908);
        // ll.offerFirst(90);
        // ll.offerLast(100);
        // System.out.println(ll);

        //getFirst, getLast -> throws NoSuchElementException
        // System.out.println(ll.getFirst());
        // System.out.println(ll.getLast());

        //peek, peekFirst, peekLast -> returns null
        // System.out.println(ll.peek());
        // System.out.println(ll.peekFirst());
        // System.out.println(ll.peekLast());

        //remove, remove(element), removeFirst, removeLast -> throws NoSuchElementException
        // System.out.println(ll.remove());
        // System.out.println(ll.removeFirst());
        // System.out.println(ll.removeLast());
        // System.out.println(ll);

        //poll, pollFirst, pollLast -> returns null
        // System.out.println(ll.poll());
        // System.out.println(ll.pollFirst());
        // System.out.println(ll.pollLast());
        // System.out.println(ll);

        //iterator(), descendingIterator()
        // System.out.println("Iterator");
        // Iterator<Integer> itr = ll.iterator();
        // while(itr.hasNext()) {
        //     System.out.println(itr.next());
        // }

        // System.out.println("Descending Iterator");
        // Iterator<Integer> itr1 = ll.descendingIterator();
        // while(itr1.hasNext()) {
        //     System.out.println(itr1.next());
        // }
    }
}