package rekursion;

import helper.SavitchIn;

public class ChooseRekursiv {

    public void main(String[] args) {
        int n = SavitchIn.readLineInt();
        int k = SavitchIn.readLineInt();
        int permutations = own.storastik.choose(n, k);
        char[] chars = new char[n];
        char[][] allChars = new char[permutations][k];

        for (int x = 0; x < n; x++) {
            chars[x] = (char) ('a' + x);
        }
        char[] checker = new char[k];
        char[] current = new char[k];
        allChars = choose(allChars, chars, current, 0, 0, k);
        for (int y = 0; y < permutations; y++) {
            System.out.printf("\n%4d: ", y+1);
            for (int x = 0; x < k; x++) {
                System.out.printf("%c, ", allChars[y][x]);
            }
        }
    }

    static char[][] choose(char[][] allChars, char[] elements, char[] current, int index, int start, int k) {
        if (index == k) {
            for (int y = 0; y < allChars.length; y++) {
                if (allChars[y][0] == '\u0000') {
                    for (int i = 0; i < current.length; i++) {
                        allChars[y][i] = current[i];
                    }
                    break;
                }
            }
            return allChars;
        }

        for (int i = start; i <= elements.length - (k - index); i++) {
            current[index] = elements[i];
            choose(allChars, elements, current, index + 1, i + 1, k);
        }
        return allChars;
    }
}