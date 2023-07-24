public class _array {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // int arr[]; // declaring array
        // arr = new int[10]; // allocating memory to array
        // String arr[] = new String[10];  // declaring and allocating memory to array
        
        for (int i : arr) { //here : means in arr
            System.out.print(i + ", ");
        }
        System.out.println();
    }
}
/*
Arrays in Java:

Like other programming languages Java also provides support for arrays. But here in java we have to first declare an array and then allocate memory for it. The general form of a one-dimensional array declaration is

type var-name[];
or
type[] var-name;
or
type []var-name;

where type declares the element type of the array. The square brackets ([]) indicate that it is an array. The size of the array is not part of its type (which is why the brackets are empty). Thus, following are all examples of valid declarations:

int month_days[];
char[] char_array;
double[] double_array;
byte byte_array[];

Instantiating an Array in Java:

The new operator is used to create the array and specify the number of elements it will hold. The general form of new as it applies to one-dimensional arrays appears as follows:


*/