import java.util.regex.Pattern;

public class RegexExpression {
    public static void main(String[] args) {
        // Character classes
        // System.out.println(Pattern.matches("[a-f&&[^b-d]]", "d"));
        //Quantifier
        // System.out.println(Pattern.matches("[0-9]{10}", "aww"));
        // System.out.println(Pattern.matches("[0-9]{2,}", "22345"));
        //meta character
        System.out.println(Pattern.matches("\\d+", "12"));
    }
}