package arrays;

import helper.SavitchIn;

public class PrintCharArray {
    public static void main(String[] args) {
        System.out.println("Gib ein Wort ein: ");
        String input = SavitchIn.readLineWord();
        char[] word = input.toCharArray();
        for (int i = input.length(); i > 0; i--) {
            System.out.print(word[i-1]);
        }
    }
}