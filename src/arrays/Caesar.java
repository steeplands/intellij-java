package arrays;

import helper.SavitchIn;

import java.util.Scanner;

public class Caesar {
    public static void main(String[] args) {
        System.out.println("Word:");
        String input = SavitchIn.readLine();
        char[] letters = new char[input.length()];
        for (int i = 0; i < input.length(); i++){
            letters[i] = input.charAt(i);
        }
        System.out.println("move by: ");
        int rotate = SavitchIn.readLineInt();
        for (int i = 0; i < letters.length; i++){
            if (letters[i] >= 'A' && letters[i] <= 'Z') {
                if (letters[i] + rotate > 'Z'){
                    letters[i] -= 26;
                }
                letters[i] = (char) ((letters[i] + rotate));
            }
            if (letters[i] >= 'a' && letters[i] <= 'z') {
                letters[i] = (char) ((letters[i] + rotate));
                if (letters[i] + rotate > 'z'){
                    letters[i] -= 26;
                }
            }
            System.out.print(letters[i]);
        }
    }
}
