package arrays;

import helper.SavitchIn;

public class Maender {
    public static void main(String[] args) {
        int x;

        do {
            System.out.println("1 Zahl:");
            x = SavitchIn.readLineInt();

        } while (x < 2);
        int[][] arr = new int[x][x];
        for (int a = 0; a < x; a++){
            System.out.println();
            for(int b = 0; b < x; b++){
                arr[a][b] = (a % 2 == 0 ? b+1+a*x: x-b+a*x);
                System.out.printf("%5d, ", arr[a][b]);
            }
        }
    }
}
