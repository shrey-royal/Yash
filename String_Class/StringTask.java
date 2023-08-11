public class StringTask {

    public static boolean isPalindrome(String str) {
        StringBuilder reversed = new StringBuilder(str).reverse();
        return str.equals(reversed.toString());
    }

    public static String findLongestPalindromicSubstring(String str) {
        int n = str.length();
        boolean[][] dp = new boolean[n][n];
        int maxLength = 1;  // All substrings of length 1 are palindromes
        int start = 0;  // Starting index of the longest palindromic substring

        // All substrings of length 1 are palindromes
        for (int i = 0; i < n; ++i) {
            dp[i][i] = true;
        }

        // Check for substrings of length 2
        for (int i = 0; i < n - 1; ++i) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                dp[i][i + 1] = true;
                maxLength = 2;
                start = i;
            }
        }

        // Check for substrings of length 3 and more
        for (int len = 3; len <= n; ++len) {
            for (int i = 0; i < n - len + 1; ++i) {
                int j = i + len - 1;
                if (str.charAt(i) == str.charAt(j) && dp[i + 1][j - 1]) {
                    dp[i][j] = true;
                    if (len > maxLength) {
                        maxLength = len;
                        start = i;
                    }
                }
            }
        }

        return str.substring(start, start + maxLength);
    }

    public static String manipulateString(String input) {
        StringBuffer result = new StringBuffer();

        if (isPalindrome(input)) {
            for (int i = 0; i < input.length(); i++) {
                result.append("*");
                result.append(Character.toUpperCase(input.charAt(i)));
            }
            result.append("*");
        } else {
            String longestPalindrome = findLongestPalindromicSubstring(input);
            for (int i = 0; i < longestPalindrome.length(); i++) {
                char c = longestPalindrome.charAt(i);
                result.append("*");
                result.append(Character.toUpperCase(c));
            }
            result.append("*");
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String input = "racecar";
        String output = manipulateString(input);
        System.out.println(output);
    }
}
