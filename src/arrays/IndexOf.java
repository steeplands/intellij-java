package arrays;

import helper.SavitchIn;

public class IndexOf {
    public static void main(String[] args) {
        System.out.println("Gib einen fancy Text ein:");
        char[] text = SavitchIn.readLine().toCharArray();
        System.out.println("Textschnipsel:");
        char[] wort = SavitchIn.readLine().toCharArray();
        for (int x = 0; x < text.length-wort.length; x++) {
            if (text[x] == wort[0]) {
                boolean search = true;
                for (int y = 0; y < wort.length; y++) {
                    if (text[x + y] != wort[y]){
                        search = false;
                    }
                }
                if (search) {
                    System.out.printf("Index: %d", x);
                }
            }
        }
    }
}
