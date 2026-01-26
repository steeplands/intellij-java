package arrays;

import helper.SavitchIn;

public class PrintCharakter {
    public static void main(String[] args) {
        System.out.println("Upperbound: ");
        int upperBound = SavitchIn.readLineInt();
        System.out.println("Lowerbound: ");
        int lowerBound = SavitchIn.readLineInt();
        for (int x = lowerBound; x < upperBound; x++) {
            System.out.printf("'%c', ", x);
        }
    }
}
