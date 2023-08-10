public class StringClass {
    public static void main(String[] args) {
        String str = "Hello World";

        // System.out.println("Hash Code: " + str.hashCode());
        System.out.println("Identity Hash Code: " + System.identityHashCode(str));
        str = "Hello World";
        // System.out.println("Hash Code: " + str.hashCode());
        System.out.println("Identity Hash Code: " + System.identityHashCode(str));

        //

    }
}

/*
String Class in Java:
    > String is a sequence of characters.
    > In Java, objects of String are immutable which means a constant and cannot be changed once created.
    > String objects are stored in a special memory area known as String Constant Pool.
    > String is a class in java.lang package.
    > String class is immutable, so that once it is created a String object cannot be changed.
    > If there is a necessity to make a lot of modifications to Strings of characters, then you should use String Buffer & String Builder Classes.


Task:

**Problem Statement: Title Case Reversal**

You are given a string containing multiple words. Your task is to create a Java program that performs the following operations on the input string:

1. Convert the string to title case: Capitalize the first letter of each word while making sure that the rest of the letters are in lowercase.

2. Reverse the order of the words in the title-cased string.

3. Remove all spaces and special characters from the reversed title-cased string.

4. Finally, output the modified string.

Write a Java program that takes an input string, performs the above operations, and outputs the modified string.

**Example:**

Input:
```
"hello world! this is a challenging problem."
```

Output:
```
Melbmessarg Cgnillengah Si Siht Sdlrow
```

In this example, the input string is first converted to title case: "Hello World! This Is A Challenging Problem." Then, the order of the words is reversed to "Problem. Challenging A Is This World! Hello". After removing spaces and special characters, the final output is "ProblemChallengingAIsThisWorldHello".

Your Java program should use methods like `split()`, `toUpperCase()`, `toLowerCase()`, `charAt()`, and `replaceAll()` to achieve the required transformations.

*/