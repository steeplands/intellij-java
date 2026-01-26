package beispiele.test.test2;

import helper.SavitchIn;

public class Bsp1 {
    public static void main(String[] args) {
        int size;
        do {
            System.out.println("Zahl [3; 10]");
            size = SavitchIn.readLineInt();
        } while (10 < size || 3 > size);

        int[][] array = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= i; j++) {
                array[j][i] = j;
            }
        }
        for (int[] row : array) {
            for (int value : row) {
                System.out.printf("%d, ", value);
            }
        }
    }
}
