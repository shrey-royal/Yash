public class StrBuffer {
    public static void main(String[] args) {
        String str = "Hello";
        StringBuffer strBuffer = new StringBuffer(str);

        System.out.println("StringBuffer: " + strBuffer);
        System.out.println("StringBuffer Capacity: " + strBuffer.capacity());
        System.out.println("StringBuffer Length: " + strBuffer.length());
        //append
        strBuffer.append(" World12345678912");
        System.out.println("StringBuffer: " + strBuffer);
        System.out.println("StringBuffer Capacity: " + strBuffer.capacity());
        //ensureCapacity
        strBuffer.ensureCapacity(50);
        System.out.println("StringBuffer Capacity: " + strBuffer.capacity());
        //capacity = (oldcapacity*2)+2
    }
}

/*
String Buffer in java: 

> String Buffer is a peer class of String that provides much of the functionality of strings.
> String represents fixed-length, immutable character sequences while StringBuffer represents growable and writable character sequences.
> String buffers are safe for use by multiple threads. The methods are synchronized where necessary so that all the operations on any particular instance behave as if they occur in some serial order that is consistent with the order of the method calls made by each of the individual threads involved.
> It is Thread safe. Means two threads can't call the methods of StringBuffer simultaneously.


Types of Constructors:

1. StringBuffer(): creates an empty string buffer with the initial capacity of 16.
2. StringBuffer(int size): creates an empty string buffer with the specified capacity as length.
3. StringBuffer(String str): creates a string buffer with the specified string.

Methods of StringBuffer class:

1. append(): is used to append the string representation of some argument to the sequence.
2. insert(): is used to insert the string representation of some argument into the sequence.
3. replace(): is used to replace the characters in a substring of this sequence with characters in the specified String.
4. delete(): is used to delete the characters in a substring of this sequence.
5. reverse(): is used to reverse the characters in the StringBuffer.
6. capacity(): is used to return the current capacity.
7. ensureCapacity(): is used to ensure the capacity at least equal to the given minimum.
8. charAt(): is used to return the character at the specified index.
9. length(): is used to return the length of the string.
10. substring(): is used to return the substring from the specified beginIndex to endIndex.

Task:

**Problem Statement: Palindrome Manipulator**

You are given a string. Your task is to create a Java program that performs the following operations on the input string:

1. Check if the input string is a palindrome. A palindrome is a word, phrase, or sequence that reads the same backward as forward.

2. If the input string is a palindrome, create a new string by alternating the characters of the palindrome in reverse order with those in the original order. If the input string is not a palindrome, find the longest palindromic substring within the string.

3. Convert the newly generated string to uppercase and replace all vowels with "*".

4. Finally, output the modified string.

Write a Java program that takes an input string, performs the above operations, and outputs the modified string.

**Example:**

Input:
```
"racecar"
```

Output:
```
"*R*C*CEC*A*R*"
```

In this example, the input string "racecar" is a palindrome. The alternating characters in reverse and original order result in "*R*C*CEC*A*R*". After converting to uppercase and replacing vowels with "*", the final output is "*R*C*CEC*A*R*".

Your Java program should make use of the `StringBuffer` class methods like `reverse()`, `charAt()`, `append()`, and also involve logic to find the longest palindromic substring.

This problem statement tests your skills in using the `StringBuffer` class effectively, implementing palindrome detection and manipulation, and handling complex string transformations.



Explaination of the output:

Input: "racecar"

Step 1: Check if the input string is a palindrome.
The input string "racecar" reads the same forwards and backwards, so it is a palindrome.

Step 2: Alternate Characters in Reverse and Original Order.
We start with the palindrome "racecar". To alternate characters in reverse and original order, we get: "*R*C*CEC*A*R*"

Step 3: Convert to Uppercase and Replace Vowels.
After converting the alternating characters string to uppercase and replacing vowels with "*", we get: "*R*C*CEC*A*R*"

So, the final output is: "*R*C*CEC*A*R*"

Explanation of each part of the output:

- `*`: This is inserted between every pair of characters, as required by the alternating characters in reverse and original order.
- `R`: The first character of the palindrome "racecar" in uppercase.
- `C`: The second character of the palindrome "racecar" in uppercase.
- `CEC`: The substring "cec" from the middle of the palindrome, with uppercase "C" and lowercase "e".
- `A`: The second-to-last character of the palindrome "racecar" in uppercase.
- `R`: The last character of the palindrome "racecar" in uppercase.

This example demonstrates the process of checking for palindromes, manipulating strings using the `StringBuffer` class, and applying specific transformations to characters based on their positions and properties.


*/
