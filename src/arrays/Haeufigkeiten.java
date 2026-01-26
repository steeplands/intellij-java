package arrays;

import helper.SavitchIn;

import java.util.Random;

public class Haeufigkeiten {
    int findFactor(int x) {

        for (double a = Math.sqrt(x); a > 0; a--){
            if (x % a == 0) {
                return (int) a;
            }
        }
        return 1;
    }
    public void main(String[] args) {
        Random random = new Random();
        int bound = 120;
        int[] numbers = new int[10];

        for (int a = 0; a < numbers.length; a++) {
            numbers[a] = random.nextInt(bound);
        }
        for (int x = 0; x < findFactor(bound); x++) {
            System.out.println();
            for (int y = 0; y < bound/findFactor(bound); y++) {
                int currentValue = 0;
                for (int i = 0; i < numbers.length; i++) {
                    if (y+x == numbers[i]) {
                        currentValue++;
                    }
                }
                System.out.printf("%2d: %2d; ", y*findFactor(bound)+x, currentValue);
            }
        }
    }
}
