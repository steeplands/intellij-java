package arrays;

import helper.SavitchIn;

import java.util.Random;

public class GetPasswd {
    public static void main(String[] args) {
        Random random = new Random();
        char[] validSigns = {'!', '#', '$', '%', '&', '(', ')', '*', '+', ',', '-', '.', '/',
                '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ':', ';', '<', '=', '>', '?',
                'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', ']', '_',
                'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        System.out.println("Wie lang soll dein Passwort sein?");
        int length = SavitchIn.readLineInt();
        System.out.printf("Passwort: ");
        for (int x = 0; x < length; x++) {
            System.out.printf("%c", validSigns[random.nextInt(0, validSigns.length)]);
        }
    }
}
