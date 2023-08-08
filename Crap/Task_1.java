package Crap;
public class Task_1 {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5 };
        int[] arr2 = { 3, 4, 5, 6, 7 };
        int[] result = Intersection(arr1, arr2);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static int[] Intersection(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        int index = 0;
        for (int i = 0; i < arr1.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j])
                    isUnique = false;
            }
            if (isUnique) {
                result[index] = arr1[i];
                index++;
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < arr1.length; j++) {
                if (arr2[i] == arr1[j])
                    isUnique = false;
            }
            if (isUnique) {
                result[index] = arr2[i];
                index++;
            }
        }
        int[] finalResult = new int[index];
        for (int i = 0; i < index; i++) {
            finalResult[i] = result[i];
        }
        return finalResult;
    }
}
/*
1. Write a program to find the intersection of two arrays. The intersection should contain only unique elements that are present in both arrays, and the program should return the intersection as a new array.
*/