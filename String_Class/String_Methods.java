// String Methods

public class String_Methods {
    public static void main(String[] args) {
        String str = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse lectus tortor, dignissim sit amet, adipiscing nec, ultricies sed, dolor.";
        System.out.println(str.length());
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(1));
        System.out.println(str.concat(" Hello World!"));
        System.out.println(str.contains("ipsum"));
        System.out.println(str.contains("Hello"));
        System.out.println(str.endsWith("dolor."));
        System.out.println(str.equals("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse lectus tortor, dignissim sit amet, adipiscing nec, ultricies sed, dolor."));
        System.out.println(str.equalsIgnoreCase("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse lectus tortor, dignissim sit amet, adipiscing nec, ultricies sed, dolor."));
        System.out.println(str.indexOf("ipsum"));
        System.out.println(str.indexOf("Hello"));
        System.out.println(str.indexOf("ipsum", 6));
        System.out.println(str.indexOf("ipsum", 7));
        System.out.println(str.substring(0, 4));
        System.out.println(str.replace("ipsum", "Hello"));
        System.out.println(str.replace("ipsum", "Hello").replace("Hello", "ipsum"));
        System.out.println(str.replaceAll("ipsum", "Hello"));
        System.out.println(str.intern());
        System.out.println(str.isEmpty());
        System.out.println(str.lastIndexOf("ipsum"));
        System.out.println(str.lastIndexOf("ipsum", 6));
        System.out.println(String.valueOf(str.charAt(0)));
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.trim());
        System.out.println(str.startsWith("Lorem"));
        System.out.println(str.endsWith("dolor."));
        System.out.println(str.toCharArray());
        System.out.println(String.format(str, "Hello %s", "World"));
        System.out.println(str.getBytes());
        System.out.println(str.codePointAt(0));
        System.out.println(str.codePointBefore(1));
        System.out.println(str.codePointCount(0, 4));
        System.out.println(str.offsetByCodePoints(0, 4));
        // StringJoiner sj = new StringJoiner(", ");
        // sj.add("Hello");
        // sj.add("World");
        // System.out.println(sj.toString());
        System.out.println(String.join("-", "Hello", "World")); 
    }
}