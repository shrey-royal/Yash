import java.util.*;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        
        hm.put(420, "Yash");
        hm.put(102, "Raj");
        hm.put(103, "Rahul");
        hm.put(104, "Rohit");
        hm.put(105, "Rohan");
        System.out.println("Initial Map: " + hm);

        // hm.remove(102);
        // System.out.println("Updated Map: " + hm);

        // hm.put(103, "Raj");
        hm.putIfAbsent(103, "Raj");
        System.out.println("Updated Map: " + hm);
    }
}

/*
Tasks:

Problem 1:
You have a list of student names and their corresponding test scores. Implement a program using a HashMap to store this data and then print the highest-scoring student.

Problem 2:
Create a LinkedHashMap to maintain a dictionary of words and their meanings. Allow users to add new words and meanings to the dictionary. Also, provide an option to look up the meaning of a given word.

Problem 3:
You are building a scheduling application that requires sorting events by their start times. Use a TreeMap to store event start times and event details, and display the events in chronological order.

Problem 4:
Develop a cache management system using a WeakHashMap to store expensive objects. Ensure that these objects can be garbage collected when they are no longer strongly referenced.

Problem 5:
Implement a program that uses an EnumMap to store information about days of the week (e.g., Monday, Tuesday, etc.) and their corresponding activities. Allow users to update the activities for each day.

Problem 6:
Create a ConcurrentMap to manage a shared resource among multiple threads. Implement a thread-safe counter that tracks the number of times a specific event occurs.

Problem 7:
Build a shopping cart system using a HashMap to store items and their quantities. Allow users to add, remove, and update the quantities of items in their cart.

Problem 8:
Develop a spell checker using a TreeMap to store a dictionary of words. Given a sentence, identify misspelled words and suggest corrections based on the closest matching words from the dictionary.

Problem 9:
Implement a simple address book application using a HashMap to store contacts. Allow users to add, delete, and search for contacts by name or phone number.

Problem 10:
Create a program that uses a TreeMap to manage a list of tasks with due dates. Provide options to add, remove, and display tasks sorted by their due dates.

*/