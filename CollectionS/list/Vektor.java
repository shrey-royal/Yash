import java.util.*;

public class Vektor {
    public static void main(String[] args) {
        Vector<String> car = new Vector<String>();

        car.add("BMW");
        car.add("Audi");
        car.add("Ferrari");
        car.add("Lamborghini");
        car.add("Mercedes");
        car.add("Porsche");

        System.out.println(car);

        car.add(2, "Bentley");
        System.out.println(car);

        car.remove(3);
        System.out.println(car);

        System.out.println(car.get(4));

        System.out.println(car.size());

        System.out.println(car.contains("BMW"));

        System.out.println(car.indexOf("Mercedes"));

        // car.clear();
        // System.out.println(car.isEmpty());

        System.out.println(car.clone());

        System.out.println(car.subList(2, 5));

        String[] arr = new String[car.size()];
        car.toArray(arr);

        for (String i : arr){
            System.out.print(i + ", ");
        }
        System.out.println();

        //Iterator
        Iterator<String> i = car.iterator();
        while(i.hasNext()){
            System.out.print(i.next() + ", ");
        }
        System.out.println();
    }
}
/*
> Vector is synchronized.  (thread safe)
> ArrayList is not synchronized.


> Vector grows twice of its size when it is full.

TASK:

Problem Statement: Online Shopping Cart

You are tasked with creating a basic online shopping cart system using Java's 'Vector' class to manage items in the cart. The shopping cart should allow users to perform the following actions:

1. Add Item to Cart: Users can add items to their shopping cart. Each item has a name, price, and quantity.

2. Remove Item from Cart: Users can remove items from their shopping cart based on the item's name.

3. View Cart: Users can view the list of items currently in their shopping cart, along with their individual prices and quantities.

4. Calculate Total: Users can calculate the total cost of all items in the cart.

Your task is to create a Java program that provides a user interface (console-based is fine) for users to interact with the shopping cart system. Use the 'Vector' class to store the items in the cart. Design appropriate classes to represent the items and the shopping cart, and implement the necessary methods to perform the actions mentioned above.

Remember to validate user inputs, handle edge cases (e.g., removing an item that is not in the cart), and provide clear instructions to the user.

Example Output:
'''
Welcome to the Online Shopping Cart!
1. Add Item to Cart
2. Remove Item from Cart
3. View Cart
4. Calculate Total
5. Exit

Please select an option: 1

Enter item name: Smartphone
Enter item price: 499.99
Enter item quantity: 2
Item added to cart!

Please select an option: 3

--- Shopping Cart ---
Item: Smartphone | Price: $499.99 | Quantity: 2

Please select an option: 2

Enter item name to remove: Smartphone
Item removed from cart!

Please select an option: 4

Total Cart Value: $0.00

Please select an option: 5

Thank you for shopping with us!
'''

Feel free to expand and customize the problem statement or the example output as needed.


*/