public class String_BB {
    public static void main(String[] args) {
        String s1 = "Hello";
        s1 = "World!";
        StringBuffer sb1 = new StringBuffer("Hello");
        sb1.append("World!");
        System.out.println(sb1);

        StringBuilder sb2 = new StringBuilder("Hello");
        sb2.append("World!");
        System.out.println(sb2);
    }
}

/*
 * String Buffer and String Builder: 
 * 
 * > String Buffer class is used to create mutable (modifiable) string. 
 * > String Builder class is also used to create mutable (modifiable) string.
 * 
 * > String Buffer is synchronized i.e. thread safe. means two threads can't call the methods of StringBuffer simultaneously.
 * > String Builder is non-synchronized i.e. not thread safe.
 * 
 * > String Buffer is less efficient than String Builder.
 * > String Builder is more efficient than String Buffer.
 * 
 * > String Buffer is introduced in JDK 1.0.
 * > String Builder is introduced in JDK 1.5.
 * 
 * > String Buffer is slower than String Builder.
 * > String Builder is faster than String Buffer.
 * 
 * Methods of String Buffer and String Builder:
 * 
 * 1. append() method:
 * 2. insert() method:
 * 3. replace() method:
 * 4. delete() method:
 * 5. reverse() method:
 * 6. capacity() method:
 * 7. ensureCapacity() method:
 * 8. trimToSize() method:
 * 9. setLength() method:
 * 10. charAt() method:
 * 11. getChars() method:
 * 12. setCharAt() method:
 * 13. length() method:
 * 14. subString() method:
 * 15. equals() method:
 * 16. equalsIgnoreCase() method:
 * 17. compareTo() method:
 * 18. compareToIgnoreCase() method:
 * 19. regionMatches() method:
 * 20. startsWith() method:
 * 21. endsWith() method:
 * 22. indexOf() method:
 * 23. lastIndexOf() method:
 * 24. hashCode() method:
 * 25. toCharArray() method:
 * 26. getBytes() method:
 * 27. offsetByCodePoints() method:
 * 28. codePointAt() method:
 * 29. codePointBefore() method:
 * 30. codePointCount() method:
 * 31. indexOf() method:
 * 32. lastIndexOf() method:
 * 33. substring() method:
 * 34. substring() method:
 * 35. concat() method:
 * 36. replace() method:
 * 37. matches() method:
 * 38. contains() method:
 * 39. replaceFirst() method:
 * 40. replaceAll() method:
 * 41. split() method:
 * 42. join() method:
 * 43. toLowerCase() method:
 * 44. toUpperCase() method:
 * 45. trim() method:
 * 46. toString() method:
 * 47. format() method:
 * 48. intern() method:
 * 49. notify() method:
 * 50. notifyAll() method:
 * 51. wait() method: 
 */
