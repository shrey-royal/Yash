import java.util.*;

public class HasSet {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<Integer>();

        // System.out.println("Enter the number of elements: ");
        // int n = new Scanner(System.in).nextInt();

        for (int i = 0; i < 10; i++) {
            // hs.add(new Random().nextInt(100));
            hs.add(i*5);
        }

        System.out.println("HashSet: " + hs);

        //Union
        HashSet<Integer> hs1 = new HashSet<Integer>();

        hs1.add(10);
        hs1.add(20);
        hs1.add(31);

        System.out.println("HashSet1: " + hs1);

        hs.addAll(hs1); // Union
        System.out.println("Union: " + hs);

        //Intersection
        HashSet<Integer> primeNumber = new HashSet<Integer>();

        primeNumber.add(2);
        primeNumber.add(3);
        primeNumber.add(5);
        System.out.println("Prime Number: " + primeNumber);

        HashSet<Integer> evenNumber = new HashSet<Integer>();

        evenNumber.add(2);
        evenNumber.add(4);
        evenNumber.add(6);
        System.out.println("Even Number: " + evenNumber);

        // evenNumber.retainAll(primeNumber); // Intersection
        // System.out.println("Intersection: " + evenNumber);

        // evenNumber.removeAll(primeNumber); // Difference
        // System.out.println("Difference: " + evenNumber);

        // subset

        HashSet<Integer> numbers = new HashSet<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        System.out.println("Numbers: " + numbers);

        boolean result = numbers.containsAll(primeNumber);
        System.out.println("Is primeNumber is subset of numbers? " + result);

        Integer[] arr = numbers.toArray(new Integer[numbers.size()]);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
