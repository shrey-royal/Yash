import java.util.*;

public class ArraYList {
    public static void main(String[] args) {
        // List<String> cars = new ArrayList<String>();

        // Adding elements
        // cars.add("Volvo XC90");
        // cars.add("BMW X5");
        // cars.add("Ford Mustang");
        // cars.add("Audi A6");
        // cars.add("Koenigsegg Agera R");
        
        // System.out.println(cars);

        // ArrayList<String> cars = new ArrayList<String>();

        // Scanner sc = new Scanner(System.in);
        // for (int i = 0; i < 5; i++) {
        //     System.out.println("Name a car: ");
        //     cars.add(sc.nextLine());
        // }
        // sc.close();

        // System.out.println(cars);

        // ArrayList<Integer> numbers = new ArrayList<Integer>();

        // numbers.add(1);
        // numbers.add(2);
        // numbers.add(3);
        // numbers.add(4);
        // numbers.add(5);

        // ArrayList<Integer> square = new ArrayList<Integer>();
        // for (int i = 0; i < numbers.size(); i++) {
        //     square.add(numbers.get(i) * numbers.get(i));
        // }
        // System.out.println(square);

        //iterating ArrayList
        ArrayList<String> cars = new ArrayList<String>();

        cars.add("Volvo XC90");
        cars.add("BMW X5");
        cars.add("Ford Mustang");
        cars.add("Audi A6");
        cars.add("Koenigsegg Agera R");

        // for (int i = 0; i < cars.size(); i++) {
        //     System.out.println(cars.get(i));
        // }

        //Iterator
        Iterator<String> it = cars.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("Size: " + cars.size());
        System.out.println("Get: " + cars.get(0));
        System.out.println("Set: " + cars.set(0, "Volvo XC60"));
        System.out.println(cars);

        System.out.println("Remove: " + cars.remove(0));
        System.out.println(cars);

        ArrayList<String> bikes = new ArrayList<String>();
        bikes.add("Honda CBR");
        bikes.add("Kawasaki Ninja");
        bikes.add("Yamaha R1");
        bikes.add("Ducati Monster");
        bikes.add("Suzuki Hayabusa");

        System.out.println("Before: " + cars);
        cars.addAll(bikes); // addAll() method appends all elements of the specified collection to the end of the list
        System.out.println("After: " + cars);

        System.out.println("Before: " + cars);
        cars.removeAll(bikes); // removeAll() method removes all the elements from the list
        System.out.println("After: " + cars);

        System.out.println("Before: " + cars);
        cars.clear(); // clear() method removes all the elements from the list
        System.out.println("After: " + cars);

        System.out.println("contains: " + bikes.contains("Honda CBR"));

        String bikeArray[] = new String[bikes.size()];
        bikes.toArray(bikeArray);
        for (String bike : bikeArray) {
            System.out.println(bike);
        }
    }
}
/*
Classes that Implement List
Since List is an interface, we cannot create objects from it.

In order to use functionalities of the List interface, we can use these classes:

> ArrayList
> LinkedList
> Vector
> Stack


Methods of List
The List interface includes all the methods of the Collection interface. Its because Collection is a super interface of List.

Some of the commonly used methods of the Collection interface that's also available in the List interface are:

add() - adds an element to a list
addAll() - adds all elements of one list to another
get() - helps to randomly access elements from lists
iterator() - returns iterator object that can be used to sequentially access elements of lists
set() - changes elements of lists
remove() - removes an element from the list
removeAll() - removes all the elements from the list
clear() - removes all the elements from the list (more efficient than removeAll())
size() - returns the length of lists
toArray() - converts a list into an array
contains() - returns true if a list contains specified element

*/