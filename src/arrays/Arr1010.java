package arrays;

import helper.SavitchIn;

public class Arr1010 {
    public static void main(String[] args) {
        int x;

        do {
            System.out.println("1 Zahl:");
            x = SavitchIn.readLineInt();

        } while (x < 3 || x > 10);
        int[][] arr = new int[x][x];
        for (int a = 0; a < x; a++){
            System.out.println();
            for(int b = 0; b < x; b++){
                arr[a][b] = (b <= a ? 1 : 0);
                System.out.printf("%d", arr[a][b]);
            }
        }
    }
}
