package arrays;

import helper.SavitchIn;

public class BubbleSort {
    public static void bubblesort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                int swap = array[j];
                if (array[j] > array[j + 1]) {
                    array[j] = array[j + 1];
                    array[j + 1] = swap;
                }
            }
        }
    }
    public static void main(String[] args){
        System.out.println("Länge Array: ");
        int n = SavitchIn.readLineInt();
        int[] intArray = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Der Wert an der Stelle %d: ", i+1);
            intArray[i] = SavitchIn.readLineInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.printf("%d, ", intArray[i]);
        }
        System.out.println();

        bubblesort(intArray);

        for (int i = 0; i < n; i++) {
            System.out.printf("%d, ", intArray[i]);
        }
    }
}