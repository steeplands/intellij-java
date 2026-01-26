package arrays;

import helper.SavitchIn;

public class AddMatrix {
    public static void main(String[] args) {
        int x = 3;
        int[][] arr1 = new int[x][x];
        int[][] arr2 = new int[x][x];
        for (int a = 0; a < x; a++) {
            System.out.println();
            for(int b = 0; b < x; b++){
                System.out.printf("\nWert: Array 1: %d, %d: ", a+1, b+1);
                arr1[a][b] = SavitchIn.readLineInt();
                System.out.printf("Wert: Array 2: %d, %d: ", a+1, b+1);
                arr2[a][b] = SavitchIn.readLineInt();
            }
        }
        int[][] sumArray = new int[x][x];
        for (int a = 0; a < x; a++) {
            System.out.println();
            for(int b = 0; b < x; b++){
                sumArray[a][b] = arr1[a][b] + arr2[a][b];
                System.out.printf("%3d ", sumArray[a][b]);
            }
        }
    }
}
