import java.util.*;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();
        
        String[] words = input.split("\\s+");
        Map<String, Integer> wordFrequency = new HashMap<>();
        
        for (String word : words) {
            word = word.toLowerCase(); // Convert to lowercase to treat words case-insensitively
            wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
        }
        
        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
