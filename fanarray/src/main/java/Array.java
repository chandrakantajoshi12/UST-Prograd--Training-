import java.util.Arrays;

public class Array {

    public static void swaping(int[] array) {
        for (int i = 0; i < array.length - 1; i += 2) {
            int c = array[i] + array[i + 1];
            array[i] = c - array[i];
            array[i + 1] = c - array[i + 1];
        }
    }
    public static void printArray(int[] a) {
        System.out.println(Arrays.toString(a));
    }

    public static void main(String[] args) {
        int[] t = { 1, 2, 3, 4, 5 };
        printArray(t);
        swaping(t);
        printArray(t);
    }
}
//
//    As a fan of arrays you decided to write a program to swap every alternate elements with its previous element.
//


//    As a fan of arrays you decided to write a program to swap every alternate elements with its previous element.
//
//        Example
//
//        Input:
//
//        5
//
//        1 2 3 4 5
//
//        Output:
//
//        2 1 4 3 5
