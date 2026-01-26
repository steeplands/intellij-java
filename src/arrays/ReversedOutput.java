package arrays;

import helper.SavitchIn;
public class ReversedOutput {
    public static void reverse(int[] array) {
        for (int i = 0; i < array.length/2; i++) {
            int swap = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = swap;
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
        reverse(intArray);
        for (int i = 0; i < n; i++) {
            System.out.printf("%d, ", intArray[i]);
        }
    }
}
