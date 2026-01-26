package arrays;

import helper.SavitchIn;

public class TransMatrix {
    public static void main(String[] args) {
        System.out.println("Zahl: ");
        int x = SavitchIn.readLineInt();
        int[][] arr = new int[x][x];
        for (int a = 0; a < x; a++) {
            System.out.println();
            for(int b = 0; b < x; b++){
                System.out.printf("%d: %d: ", a, b);
                arr[a][b] = SavitchIn.readLineInt();
            }
        }
        int[][] newarray = new int[x][x];
        for (int a = 0; a < x; a++) {
            System.out.println();
            for(int b = 0; b < x; b++){
                newarray[a][b] = arr[b][a];
                System.out.printf("%d, ", newarray[a][b]);
            }
        }
    }
}
