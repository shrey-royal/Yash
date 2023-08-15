import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(true) {
            System.out.println("Enter regex pattern: ");
            Pattern pattern = Pattern.compile(sc.nextLine());   // Compile pattern
            System.out.println("Enter text: ");
            Matcher matcher = pattern.matcher(sc.nextLine());   // Compile text
            boolean found = false;
            while(matcher.find()) {
                System.out.println("Found the text \"" + matcher.group() + "\" starting at index " + matcher.start() + " and ending at index " + matcher.end());
                found = true;
            }
            if(!found) {
                System.out.println("No match found.");
            }
        }
    }
}
