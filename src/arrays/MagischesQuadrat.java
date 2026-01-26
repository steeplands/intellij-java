package arrays;

import helper.SavitchIn;

public class MagischesQuadrat {
    int findValueK(int max, int n) {
        if (n < 0) {
            return max + n;
        }
        if (n >= max) {
            return n - max;
        }
        else {
            return n;
        }
    }
    int findValueM(int max, int n) {
        if (n <= 0) {
            return max + n;
        }
        if (n > max) {
            return n - max;
        }
        else {
            return n;
        }
    }
    public void main(String[] args) {
        int x;
        do {
            System.out.println("ungerade Zahl: ");
            x = SavitchIn.readLineInt();
        } while (x % 2 ==0);

        int[][] arr = new int[x][x];
        for (int b = 0; b < x; b++) {
            System.out.println();
            for(int a = 0; a < x; a++) {
                int k = b - a + (x-1)/2;
                int m = 2 * b - a;
                k = findValueK(x, k);
                m = findValueM(x, m);
                arr[b][a] = k*x+m;
                System.out.printf("%2d ", arr[b][a]);
            }
        }
    }
}
