

 class Array<E> {
     public <E> void printArray(E[] array) {
         for (E element : array) {
             System.out.println(element);
         }
     }
 }

     public class reverse {
         public static void main(String[] args) {

             Array<String> prints = new Array();

             Array<Integer> printInt = new Array();
             Integer[] intarray = {1, 2, 3, 4};

             String[] strings = {"hey","hello","what"};

             printInt.printArray(intarray);
             prints.printArray(strings);

             System.out.println("After Revese ");

             for (int i = intarray.length-1; i >= 0; i--) {
                 System.out.println(intarray[i] + " ");
             }
             System.out.println();
             for (int j = strings.length-1; j >= 0; j--) {
                 System.out.println(strings[j]+ " ");
             }
         }
     }
