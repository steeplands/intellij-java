package arrays;

import helper.SavitchIn;

public class MulTable {
    public static void main(String[] args) {
        int x;
        do {
            System.out.println("1 Zahl:");
            x = SavitchIn.readLineInt();

        } while (x < 3 || x > 10);
        int[][] arr = new int[x+1][x+1];
        for (int a = 0; a < x; a++) {
            System.out.println();
            for(int b = 0; b < x; b++){
                arr[a][b] = (a+1)*(b+1);
                System.out.printf("%3d ", (a+1)*(b+1));
            }
        }
    }
}
