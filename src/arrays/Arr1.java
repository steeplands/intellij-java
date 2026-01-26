package arrays;

import helper.SavitchIn;

import java.util.Random;

public class Arr1 {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("2 Zahlen:");
        int x = SavitchIn.readLineInt();
        int y = SavitchIn.readLineInt();
        int[][] arr = new int[x][y];

        for (int a = 0; a < x; a++) {
            System.out.printf("\n%d: ", a+1);
            for (int b = 0; b < y; b++) {
                arr[a][b] = random.nextInt();
                System.out.printf("%12d, ", arr[a][b]);
            }
        }
    }
}
