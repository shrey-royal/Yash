import java.util.Arrays;

public class ArrayMethods {
    public static void main(String[] args) {
        //generate an array of random numbers

        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int)(Math.random() * 100);
        }

        //original array
        System.out.println("Original array is: " + Arrays.toString(numbers));

        //print the array
        // System.out.println("The array is: ");
        // printArray(numbers);

        //tostring
        // System.out.println("The array is: " + Arrays.toString(numbers));

        //sort
        // Arrays.sort(numbers);
        // System.out.println("The array is: " + Arrays.toString(numbers));

        //binary search
        // int index = Arrays.binarySearch(new int[] {65, 29, 12, 84, 90, 69, 14, 7, 25, 89}, 90);
        // System.out.println("The index of 50 is: " + index);

        //equals
        // int[] numbers2 = {65, 29, 12, 84, 90, 69, 14, 7, 25, 89};
        // int[] numbers3 = {65, 29, 12, 84, 90, 69, 14, 7, 25, 89};

        // System.out.println("The arrays are equal: " + Arrays.equals(numbers3, numbers2));

        //fill
        // Arrays.fill(numbers, 50);
        // System.out.println("The array is: " + Arrays.toString(numbers));

        //copyOf
        // int[] numbers2 = Arrays.copyOf(numbers, 5);
        // System.out.println("The array is: " + Arrays.toString(numbers2));

        //copyOfRange
        // int[] numbers2 = Arrays.copyOfRange(numbers, 2, 5);
        // System.out.println("The array is: " + Arrays.toString(numbers2));



    }

    // public static void printArray(int[] array) {
    //     for (int i = 0; i < array.length; i++) {
    //         //print each element of the array
    //         System.out.print(array[i] + " ");
    //     }
    //     System.out.println();
    // }
}

/*
java.util.Arrays contains some methods that are useful for working with arrays.

1. Arrays.toString(array) returns a string representation of the array.
2. Arrays.sort(array) sorts the array in ascending order.
3. Arrays.binarySearch(array, value) searches the array for the specified value using the binary search algorithm. The array must be sorted prior to making this call. This returns the index of the value if found, otherwise it returns a negative number.
4. Arrays.equals(array1, array2) returns true if the two arrays are equal to one another. This compares the contents of the arrays, not the references.
5. Arrays.fill(array, value) fills the array with the specified value.
6. Arrays.copyOf(array, length) returns a copy of the array with the specified length.
7. Arrays.copyOfRange(array, start, end) returns a copy of the array with the specified range.

*/