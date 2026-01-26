package arrays;

import helper.SavitchIn;
public class Wetterdaten {
    public static void main(String[] args) {
        System.out.println("Wie viele Messwerte: ");
        int number = SavitchIn.readLineInt();
        double[] data = new double[number];
        int sum = 0;
        for (int i = 0; i < number; i++) {
            System.out.printf("Wert an Tag %d: ", i + 1);
            data[i] = SavitchIn.readLineDouble();
            sum += data[i];
        }
        double average = (double)(sum) / number;
        for (int i = 0; i < number; i++) {
            System.out.printf("Messwert am Tag %d (%f) is %s als der Durchschnitt %f\n", i, data[i], (data[i] > average) ? "größer" : "kleiner", average);
        }
    }
}
