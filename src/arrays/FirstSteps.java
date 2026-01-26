package arrays;

import helper.SavitchIn;

public class FirstSteps {
    public static void main(String[] args){
        System.out.println("Länge des Arrays: ");
        int n = SavitchIn.readLineInt();
        int[] intArray = new int[n];
        intArray[0] = 3;
        //wert = intArray[4];
        intArray[intArray.length - 1] = intArray.length;
        for (int i : intArray) {
            System.out.printf("%d, ", i);
        }
    }
}
