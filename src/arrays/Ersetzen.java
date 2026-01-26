package arrays;

import helper.SavitchIn;

public class Ersetzen {
    static void main(String[] args) {
        System.out.println("Gib einen fancy Text ein:");
        char[] text = SavitchIn.readLine().toCharArray();
        System.out.println("Welche Buchstaben sollen ersetzt werden?");
        char[] letters = SavitchIn.readLineWord().toLowerCase().toCharArray();
        for (int x = 0; x < text.length; x++) {
            for (int y = 0; y < letters.length; y++){
                if (Character.toLowerCase(letters[y]) == Character.toLowerCase(text[x])) {
                    text[x] = '*';
                }
            }
        }
        for (int x = 0; x < text.length; x++) {
            System.out.print(text[x]);
        }
    }
}
