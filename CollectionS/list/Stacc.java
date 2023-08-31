import java.util.*;

public class Stacc {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<Integer>();

        // System.out.print("How many elements you want to push: ");
        // int n = Integer.parseInt(System.console().readLine());  // Reading data using readLine
        
        // for(int i=0; i<n; i++) {
        //     System.out.print("Enter element: ");
        //     int x = Integer.parseInt(System.console().readLine());  // Reading data using readLine
        //     st.push(x);
        // }

        // Random rand = new Random();
        // for (int i = 0; i < n; i++) {
        //     st.push(rand.nextInt(100));
        // }
        // System.out.println("Stack: " + st);

        st.push(1);
        st.push(4);
        st.push(23);
        st.push(12);
        st.push(9);
        st.push(7);
        System.out.println("Stack: " + st);

        System.out.println("Peek: " + st.peek());

        System.out.println("Pop: " + st.pop());
        System.out.println("Stack: " + st);

        System.out.println("Search: " + st.search(23));
        System.out.println("Search: " + st.search(100));

        System.out.println("Empty: " + st.empty());

    }
}
/*
Stack in Java: 
>LIFO

Methods: 
    push(): 
    pop(): 
    peek(): 
    empty(): 
    search():


Tasks:

Problem Statement: Balanced Parentheses Checker

You are given a string containing parentheses (round brackets), square brackets, and curly braces. You need to implement a program that checks whether the given string has balanced parentheses or not. In other words, every opening parenthesis must have a corresponding closing parenthesis of the same type, and they must appear in the correct order.

Test cases:

Test Case 1:
Input: '(){}[]'
Expected Output: The parentheses are balanced.

Test Case 2:
Input: '({[})'
Expected Output: The parentheses are not balanced.

Test Case 3:
Input: '({})[]'
Expected Output: The parentheses are balanced.

Test Case 4:
Input: '((()))'
Expected Output: The parentheses are balanced.

Test Case 5:
Input: ')()'
Expected Output: The parentheses are not balanced.

Test Case 6:
Input: '{}{}{}'
Expected Output: The parentheses are balanced.

Test Case 7:
Input: '()({[()]})'
Expected Output: The parentheses are balanced.

Test Case 8:
Input: '((())]'
Expected Output: The parentheses are not balanced.

Test Case 9:
Input: '[{()}]'
Expected Output: The parentheses are balanced.

Test Case 10:
Input: '}'
Expected Output: The parentheses are not balanced.

*/