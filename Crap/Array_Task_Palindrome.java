package Crap;
import java.util.Arrays;

public class Array_Task_Palindrome {
    public static void main(String[] args) {
        String[] arr = {"madam", "mom", "dad", "brother", "sister", "mom", "madam"};
        boolean result[] = new boolean[arr.length];

        for (int i = 0; i < arr.length; i++) {
            result[i] = isPalindrome(arr[i]);
        }

        // for(int i=0; i<arr.length; i++) {
        //     System.out.println(result[i]);
        // }
        System.out.println(Arrays.toString(result));
    }

    public static boolean isPalindrome(String str) {
        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        if (str.equals(reverse)) {
            return true;
        } else {
            return false;
        }
    }
}

/*
 * 
 * Checks Whether the given String array is Palindrome or not
 * 
 * (["madam", "mom", "dad", "brother", "sister", "mom", "madam"] -> [true, true, true, false, false, true, true])
 * 
 * 
 * 
 * Decimal to binary convertor ([12, 234, 12, 23, 34, 4, 54, 56] -> [1100,   11101010, 1100, 10111, 100010, 100, 110110, 111000])
 * 
 * 
 */