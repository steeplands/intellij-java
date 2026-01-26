package arrays;

import helper.SavitchIn;

public class Halt {
    public static void main(String[] args) {
        System.out.println("Bitte geben Sie einen String ein: ");
        char[] text = SavitchIn.readLine().toCharArray();
        boolean h = false, a = false, l = false;
        for (int x = 0; x < text.length; x++) {
            if (text[x] == 'h') {
                h = true;
            } else if (h && Character.toLowerCase(text[x]) == 'a') {
                a = true;
            } else if (a && Character.toLowerCase(text[x]) == 'l') {
                l = true;
            } else if (l && Character.toLowerCase(text[x]) == 't') {
                break;
            }
            System.out.print(text[x]);
        }
    }
}
