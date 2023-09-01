import java.util.*;

public class PriorityQueueue {
    public static void main(String[] args) {

        
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

        pq.add(10);
        pq.add(20);
        pq.add(15);
        pq.add(5);
        pq.add(25);

        System.out.println(pq);

        /*
        System.out.println("poll: " + pq.poll());
        System.out.println("size: " + pq.size());
        System.out.println("peek: " + pq.peek());

        System.out.println("remove: " + pq.remove());
        System.out.println("size: " + pq.size());
        System.out.println("element: " + pq.element());

        */

        // Comparator<Integer> descendingComparator = new Comparator<Integer>() {
        //     @Override
        //     public int compare(Integer a, Integer b) {
        //         return b - a;
        //     }
        // };

        // PriorityQueue<Integer> pq2 = new PriorityQueue<Integer>(descendingComparator);

        // pq2.add(10);
        // pq2.add(20);
        // pq2.add(15);
        // pq2.add(5);
        // pq2.add(25);

        // System.out.println(pq2);

        List<String> list = new ArrayList<String>();

        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        list.add("Orange");

        Comparator<String> lengthComparator = (s1, s2) -> Integer.compare(s1.length(), s2.length());
        Collections.sort(list, lengthComparator);

        for (String s : list) {
            System.out.println(s);
        }
        
    }
}

/*
> Priority Queue is an unbounded queue based on a priority heap and the elements of the priority queue are ordered by default in natural order.

> sorted according to their natural ordering or by a Comparator provided at queue construction time, depending on which constructor is used.

> The head of this queue is the least element with respect to the specified ordering. If multiple elements are tied for least value, the head is one of those elements -- ties are broken arbitrarily.


Methods of PriorityQueue:

To insert: 
    add() or offer()

Different from Queue:
    add() throws exception if queue is full
    offer() returns false if queue is full

To remove:
    poll() or remove()

Different from Queue:
    poll() returns null if queue is empty
    remove() throws exception if queue is empty

To get the head:
    peek() or element()

Different from Queue:
    peek() returns null if queue is empty
    element() throws exception if queue is empty


Tasks:


1. Task Scheduler: Implement a task scheduler that can schedule tasks with varying priorities. Tasks with higher priority should be executed before tasks with lower priority.

2. Merge K Sorted Lists: Given K sorted lists, implement a function to merge them into a single sorted list using a 'PriorityQueue'.

3. Top K Elements: Find the top K elements in an array using a 'PriorityQueue' to efficiently compute the result.

4. Dijkstra's Algorithm: Implement Dijkstra's shortest path algorithm using a 'PriorityQueue' to find the shortest path in a weighted graph.

5. Median of a Stream: Design a data structure that supports adding integers to a stream and finding the median of all elements encountered so far. Use two 'PriorityQueues' to maintain the data.

6. Kth Smallest Element in a Matrix: Given an N x N matrix where each row and column are sorted, find the Kth smallest element in the matrix using a 'PriorityQueue'.

7. Merge Intervals: Given a list of intervals, merge overlapping intervals using a 'PriorityQueue' to optimize the merging process.

8. Task Ordering: Given a list of tasks with dependencies, determine the order in which the tasks can be executed using a 'PriorityQueue'.

9. Huffman Coding: Implement the Huffman coding algorithm to compress and decompress data using a 'PriorityQueue' to build the Huffman tree.

10. Sliding Window Maximum: Given an array and an integer K, find the maximum element in each sliding window of size K using a 'PriorityQueue' efficiently.


Explaination of Merge K Sorted Lists:

'Problem Statement: Merge K Sorted Lists'

You are given K sorted lists, each containing N elements. Merge these K sorted lists into a single sorted list using a `PriorityQueue`.

'Example Test Cases:'

1. 'Basic Test Case:'

   Input:
   ```
   Lists = [[1, 4, 5], [1, 3, 4], [2, 6]]
   ```

   Output:
   ```
   [1, 1, 2, 3, 4, 4, 5, 6]
   ```

   Explanation:
   - We start with an empty `PriorityQueue`.
   - Initially, we add the first element from each list into the PriorityQueue: `[1, 1, 2]`.
   - The PriorityQueue rearranges itself to `[1, 1, 2]`.
   - We remove the smallest element (1) and add it to the merged list.
   - We add the next element from the list where 1 came from (List 1): `[4, 4]`.
   - The PriorityQueue rearranges itself to `[1, 2, 4, 4]`.
   - We continue this process until all elements are added to the merged list.

2. 'Edge Case: Empty Lists'

   Input:
   ```
   Lists = []
   ```

   Output:
   ```
   []
   ```

   Explanation:
   - Since there are no lists to merge, the result is an empty list.

3. 'Lists with Repeated Elements:'

   Input:
   ```
   Lists = [[2, 2, 3], [1, 1, 2], [3, 4, 5]]
   ```

   Output:
   ```
   [1, 1, 2, 2, 2, 3, 3, 4, 5]
   ```

   Explanation:
   - The input lists contain repeated elements, and the `PriorityQueue` ensures that the merged list is still sorted correctly.

4. 'Large Input:'

   Input:
   ```
   Lists = [[1, 2, 3, ..., 1000], [1001, 1002, 1003, ..., 2000]]
   ```

   Output:
   ```
   [1, 2, 3, ..., 2000]
   ```

   Explanation:
   - This test case demonstrates the efficiency of the `PriorityQueue` approach even with a large number of elements.

Test cases:

'1. Task Scheduler:'

- 'Basic Test Case:'

  Input:
  ```
  Tasks: [A, A, A, B, B, C]
  n: 2
  ```

  Output:
  ```
  Time: 8 (A -> B -> C -> A -> B -> idle -> A -> B)
  ```

'2. Merge K Sorted Lists:'

- 'Basic Test Case:'

  Input:
  ```
  Lists = [[1, 4, 5], [1, 3, 4], [2, 6]]
  ```

  Output:
  ```
  [1, 1, 2, 3, 4, 4, 5, 6]
  ```

'3. Top K Elements:'

- 'Basic Test Case:'

  Input:
  ```
  Array: [3, 1, 4, 1, 5, 9, 2, 6, 5, 3]
  k: 3
  ```

  Output:
  ```
  [9, 6, 5]
  ```

'4. Dijkstra's Algorithm:'

- 'Basic Test Case:'

  Input:
  ```
  Graph:
  A --(1)--> B --(3)--> C
  |        |
  \--(2)---/
  
  Source: A
  ```

  Output:
  ```
  Shortest Path from A to C: [A, B, C]
  ```

'5. Median of a Stream:'

- 'Basic Test Case:'

  Input:
  ```
  Stream: [5, 2, 6, 1, 3, 4]
  ```

  Output:
  ```
  [5.0, 3.5, 5.0, 3.0, 3.0, 3.5]
  ```

'6. Kth Smallest Element in a Matrix:'

- 'Basic Test Case:'

  Input:
  ```
  Matrix:
  [
    [1, 5, 9],
    [10, 11, 13],
    [12, 13, 15]
  ]
  k: 8
  ```

  Output:
  ```
  13
  ```

'7. Merge Intervals:'

- 'Basic Test Case:'

  Input:
  ```
  Intervals: [[1, 3], [2, 6], [8, 10], [15, 18]]
  ```

  Output:
  ```
  [[1, 6], [8, 10], [15, 18]]
  ```

'8. Task Ordering:'

- 'Basic Test Case:'

  Input:
  ```
  Tasks: [A, B, C, D]
  Dependencies: [(A, B), (A, C), (B, D)]
  ```

  Output:
  ```
  Valid Task Order: [A, B, C, D] (or other valid orders)
  ```

'9. Huffman Coding:'

- 'Basic Test Case:'

  Input:
  ```
  Frequencies: {'a': 5, 'b': 9, 'c': 12, 'd': 13, 'e': 16, 'f': 45}
  ```

  Output:
  ```
  Huffman Codes:
  {'a': '1100', 'b': '1101', 'c': '100', 'd': '101', 'e': '111', 'f': '0'}
  ```

'10. Sliding Window Maximum:'

- 'Basic Test Case:'

  Input:
  ```
  Array: [1, 3, -1, -3, 5, 3, 6, 7]
  k: 3
  ```

  Output:
  ```
  [3, 3, 5, 5, 6, 7]
  ```


*/