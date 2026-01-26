package arrays;

import java.util.Random;

public class PrintArray {
    public static void main(String[] args) {
    Random random = new Random();
    int[][] array = {
            {
                1, 2, 3, 4, 5,
            },
            {
                2, 3, 4, 5, 6,
            },
            {
                3, 4, 5, 6, 7,
            },
            {
                4, 5, 6, 7, 8,
            },
            {
                5, 6, 7, 8, 9,
            },
        };
    for (int i = 0; i < array.length; i++) {
        for (int j = 0; j < array[i].length; j++) {
            System.out.printf("%d, ", array[i][j]);
        }
        System.out.println();
    }
    for (int i = 0; i < array.length; i++) {
        for (int j = 0; j < array[i].length; j++) {
            array[i][j] = random.nextInt()%10;
            System.out.printf("%d, ", array[i][j]);
            }
            System.out.println();
        }
    }
}
