import java.util.StringTokenizer;

public class StrTokenizer {
    public static void main(String[] args) {
        String str = "Hello, World|of|Java";
        StringTokenizer st = new StringTokenizer(str, ", |", true);
        // while (st.hasMoreTokens()) {
        //     System.out.println(st.nextToken());
        // }

        System.out.println(st.countTokens());

        // while (st.hasMoreElements()) {
        //     System.out.println(st.nextElement());
        // }

        // System.out.println(st.nextToken());

        // while (st.hasMoreElements()) {
        //     System.out.println(st.nextToken());
        // }

        while (st.hasMoreTokens()) {
            System.out.print("-"+st.nextElement());
        }
    }
}

/*
String Tokenizer Class

Constructors:
> StringTokenizer(String str)
> StringTokenizer(String str, String delim)
> StringTokenizer(String str, String delim, boolean returnDelims)

str: String to be tokenized
delim: Delimiter
returnDelims: If true, delimiter characters are considered to be tokens. If false, delimiter characters serve to separate tokens.

for ex: 
StringTokenizer st = new StringTokenizer("Hello, World|of|Java",", |",true);
output: 
Hello
,
 
World
|
of
|
Java

-----------------

Methods:

1. int countTokens()
Returns the number of tokens remaining in the string using the current delimiter set.

2. boolean hasMoreTokens()
Tests if there are more tokens available from this tokenizer's string.

3. String nextToken()
Returns the next token from this string tokenizer.

4. String nextToken(String delim)
Returns the next token in this string tokenizer's string.

5. boolean hasMoreElements()
Returns the same value as the hasMoreTokens method.

6. Object nextElement()
Returns the same value as the nextToken method, except that its declared return value is Object rather than String.

*/