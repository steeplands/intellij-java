package arrays;

import java.util.Random;

public class SumAndAverage {
    public static void main(String[] args){
        Random random = new Random();
        int[] array = new int[random.nextInt(0, 100)];
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt();
            sum += array[i];
        }
        System.out.printf("Die Summe beträgt %d\nDer Durchschnitt beträgt %f", sum, ((double)sum/array.length));
    }
}
