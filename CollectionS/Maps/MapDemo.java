import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
        // Creating a HashMap
        Map<Integer, String> map = new HashMap<>();

        // 1. put(K, V)
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");

        // 2. putAll()
        Map<Integer, String> anotherMap = new HashMap<>();
        anotherMap.put(4, "Four");
        anotherMap.put(5, "Five");
        map.putAll(anotherMap);

        // 3. putIfAbsent(K, V)
        map.putIfAbsent(1, "New One"); // Won't replace existing value

        // 4. get(K)
        String value = map.get(2);
        System.out.println("Value for key 2: " + value);

        // 5. getOrDefault(K, defaultValue)
        String defaultValue = map.getOrDefault(6, "Default");
        System.out.println("Value for key 6: " + defaultValue);

        // 6. containsKey(K)
        boolean containsKey = map.containsKey(3);
        System.out.println("Contains key 3: " + containsKey);

        // 7. containsValue(V)
        boolean containsValue = map.containsValue("Four");
        System.out.println("Contains value 'Four': " + containsValue);

        // 8. replace(K, V)
        map.replace(2, "New Two");

        // 9. replace(K, oldValue, newValue)
        boolean replaced = map.replace(2, "New Two", "Replaced Two");
        System.out.println("Replaced: " + replaced);

        // 10. remove(K)
        map.remove(3);

        // 11. remove(K, V)
        boolean removed = map.remove(4, "Four");
        System.out.println("Removed: " + removed);

        // 12. keySet()
        Set<Integer> keys = map.keySet();
        System.out.println("Keys: " + keys);

        // 13. values()
        Collection<String> values = map.values();
        System.out.println("Values: " + values);

        // 14. entrySet()
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}

/*
Output:

The output of the provided Java code will be as follows:

'''
Value for key 2: New Two
Value for key 6: Default
Contains key 3: false
Contains value 'Four': false
Keys: [1, 2, 5]
Values: [One, Replaced Two, Five]
Key: 1, Value: One
Key: 2, Value: Replaced Two
Key: 5, Value: Five
'''

Here's what each part of the output means:

1. The program retrieves and prints the value associated with key 2, which has been updated to "New Two" using 'replace(K, V)'.

2. It attempts to retrieve the value associated with key 6, which doesn't exist, so it returns the default value "Default" using 'getOrDefault(K, defaultValue)'.

3. It checks if key 3 is present in the map and prints 'false' because it has been removed using 'remove(K)'.

4. It checks if the value "Four" is present in the map and prints 'false' because it has been removed using 'remove(K, V)'.

5. It retrieves and prints the keys using 'keySet()'.

6. It retrieves and prints the values using 'values()'.

7. It retrieves and prints all key-value pairs using 'entrySet()'.

*/