import java.util.*;

public class EnuMSet {
    
    enum Size {
        SMALL, MEDIUM, LARGE, EXTRALARGE, EXTRAEXTRALARGE
    }

    enum Color {
        RED, GREEN, BLUE, YELLOW, ORANGE, PURPLE, BLACK, WHITE
    }
    
    public static void main(String[] args) {
        EnumSet<Size> sizes = EnumSet.allOf(Size.class);
        System.out.println("Sizes: " + sizes);

        EnumSet<Color> colors = EnumSet.allOf(Color.class);
        System.out.println("Colors: " + colors);

        EnumSet<Color> noColors = EnumSet.noneOf(Color.class);
        System.out.println("No Colors: " + noColors);

        EnumSet<Color> someColors = EnumSet.of(Color.RED, Color.GREEN, Color.BLUE);
        System.out.println("Some Colors: " + someColors);

        EnumSet<Color> rangeColors = EnumSet.range(Color.YELLOW, Color.PURPLE);
        System.out.println("Range Colors: " + rangeColors);

        EnumSet<Color> complementColors = EnumSet.complementOf(rangeColors);
        System.out.println("Complement Colors: " + complementColors);

        EnumSet<Color> copyColors = EnumSet.copyOf(someColors);
        System.out.println("Copy Colors: " + copyColors);
    }
}

/*

Tasks:

1. Unique Attendees: Create a program to manage a conference's attendees. Ensure that there are no duplicate attendee records using a 'Set'.

2. Library Catalog: Build a digital library catalog system where books are organized in a set to prevent duplicate entries.

3. Employee Skills: Develop an HR system to store and retrieve employee skills. Ensure that each skill is unique for an employee using a 'Set'.

4. Shopping Cart: Implement a shopping cart for an online store using a 'Set' to hold unique items, preventing duplicate product entries.

5. Friendship Network: Create a social networking application that models friendships. Use a 'Set' to store a user's friends to avoid duplicate friend connections.

6. Word Frequency Counter: Build a program that counts the frequency of words in a text document using a 'Set' to store unique words.

7. Email Subscription Management: Design an email subscription service where users can subscribe to various newsletters. Use a 'Set' to manage user subscriptions to prevent duplicates.

8. Course Enrollment: Develop a student registration system for a university where each student can enroll in courses. Ensure that a student cannot enroll in the same course twice using a 'Set'.

9. Travel Itinerary: Create a travel planning application where users can add destinations to their itinerary. Use a 'Set' to ensure that each destination is unique in the itinerary.

10. Product Inventory: Design an inventory system for a store to track product availability. Use a 'Set' to store product IDs to prevent duplicate entries.
*/