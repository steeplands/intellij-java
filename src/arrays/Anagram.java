package arrays;

import helper.SavitchIn;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        System.out.println("Wort:");
        char[] word1 = SavitchIn.readLine().toLowerCase().toCharArray();
        char[] word2 = SavitchIn.readLine().toLowerCase().toCharArray();
        for (int x = 0; x < word1.length; x++) {
            for(int y = 0; y < word2.length; y++) {
                if (word1[x] == word2[y]) {
                    word1[x] = '_';
                }
            }
        }
        char[] empty = new char[word1.length];
        for (int x = 0;  x < word1.length; x++) {
            empty [x] = '_';
        }
        if (word1.length == word2.length && Arrays.equals(empty, word1)) {
            System.out.printf("Die beiden Wörter sind Anagramme!");
        } else {
            System.out.println("Die beiden Wörter sind keine Anagramme");
        }
    }
}
