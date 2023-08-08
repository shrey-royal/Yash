package Crap;
import java.util.Arrays;

public class Array2d {
    public static void main(String[] args) {
        int[] arr[] = new int[3][3];

        for(int i=0; i < arr.length; i++) {
            for(int j=0; j < arr[i].length; j++) {
                arr[i][j] = i+j;
            }    
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }

        for (int[] i : arr) {
            for (int j : i) {
                System.out.print(j + "\t");
            }
            System.out.println();
        }
    }
}
/* 2d array complete */