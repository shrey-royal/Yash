public class StrBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello ");
        
        System.out.println(sb.hashCode());
        sb.append("Java"); // now original string is changed
        System.out.println(sb); // prints Hello Java
        System.out.println(sb.hashCode());
    }
}

/*
String Builder in java:

> String Builder Class is used to create mutable (modifiable) string.
> It is like StringBuffer, but it is faster and uses less memory than StringBuffer.
> It is available since JDK 1.5.
> StringBuilder is non-synchronized i.e. not thread safe.

Methods:

> append() - It is used to add text at the end of the existing string.
> insert() - It is used to add text at the specified index position.
> replace() - It is used to replace the specific string from specified begin index and end index.
> delete() - It is used to delete string from specified begin index to end index.
> reverse() - It is used to reverse the string.
> capacity() - It returns the current capacity of the String Builder.
> ensureCapacity() - It ensures the capacity at least equal to the given minimum.

*/