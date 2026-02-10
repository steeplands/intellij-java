package arrays;

import helper.SavitchIn;

public class PascalschesDreieck {
    public static void main(String[] args) {
        System.out.println("Zahl:");
        int n = SavitchIn.readLineInt();
        int[][] array = new int[n][];
        array[0] = new int[]{1};
        if (n > 1) {
            array[1] = new int[]{1, 1};
        }
        for (int i = 2; i < n; i++) {
            array[i] = new int[i+1];
            for (int j = 0; j <= i; j++) {
                array[i][j] = ((j != 0) ? array[i-1][j-1] : 0) + ((j < i) ? array[i-1][j] : 0);
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }
            for(int j : array[i]) {
                System.out.printf("%d ", j);
            }
            System.out.println();
        }
    }
}
