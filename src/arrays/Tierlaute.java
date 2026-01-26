package arrays;

import helper.SavitchIn;

public class Tierlaute {
    public static void main(String[] args) {
        String[] Tiere = {"Fisch", "Biene", "Wolf", "Kuh"};
        String[] Tierlaut = {"Blup", "Summ", "Wau", "Muh"};
        for (int i = 0; i < Tiere.length; i++) {
            System.out.printf("Welches Tier macht %s?\n", Tierlaut[i]);
            String input = SavitchIn.readLine();
            for (int j = 0; j < Tiere.length; j++){
                if (Tiere[j].equals(input)) {
                    System.out.printf("%s macht %s\n", input, Tierlaut[j]);
                }
            }
        }
    }
}
