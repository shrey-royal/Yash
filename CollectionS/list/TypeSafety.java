import java.util.*;

public class TypeSafety {
    public static void main(String[] args) {

        List list = new ArrayList();

        list.add("A");
        // list.add(123);
        // list.add(123.456);
        // list.add(true);
        // list.add('A');
        // list.add(7845698);

        System.out.println(list);



        List<String> list1 = new ArrayList<String>();

        list1.add("A");
        // list1.add(123);
        // list1.add(123.456);
        // list1.add(true);
        // list1.add('A');
        // list1.add(7845698);

        System.out.println(list1);
    }
}

/*
Type Safety?
The List interface is a generic interface. It means, a list can only store a specific type of elements. For example, if a list is of type String, it can only store strings and not integers. but in the above snippet we can see that we can add any type of data in the list.

So here comes the concept of type safety. Type safety means that the compiler will ensure that the type of the data you are storing in the list is compatible with the type of the list.

> If you try to add an element of a different type to a list, the compiler will show an error.

> how to make a list type safe?
> List<String> list = new ArrayList<String>();

*/