package rekursion;

import helper.SavitchIn;

public class PermutationRekursiv {
    public void main(String[] args) {
        int n = SavitchIn.readLineInt();
        int k = SavitchIn.readLineInt();
        int permutations = own.storastik.choose(n, k) * own.storastik.fakultaet(k);
        char[] chars = new char[n];
        char[][] allChars = new char[permutations][k];
        for (int x = 0; x < n; x++) {
            chars[x] = (char) ('a' + x);
        }
        char[] current = new char[k];
        allChars = permutation(allChars, chars, current, 0, 0,  k);
        for (int y = 0; y < permutations; y++) {
            System.out.printf("\n%d: ", y+1);
            for (int x = 0; x < k; x++) {

                System.out.printf("%c, ", allChars[y][x]);
            }
        }
    }
    public char[][] permutation(char[][] allChars, char[] elements, char[] current, int firstVal, int charIndex, int k) {
        if (charIndex == k) {
            for (int i = 0; i < allChars.length; i++) {
                if (allChars[i][0] == '\u0000') {
                    for (int a = 0; a < current.length; a++) {
                        allChars[i][a] = current[a];
                    }
                    break;
                }
            }
            return allChars;
        }
        for (int a = 0; a < elements.length; a++) {
            char[] newElements = new char[elements.length-1];
            for (int i = 0; i < elements.length; i++) {
                if (i != a) {
                    for (int j = 0; j < newElements.length; j++) {
                        if (newElements[j] == '\u0000') {
                            newElements[j] = elements[i];
                            break;
                        }
                    }
                }
            }
            current[firstVal] = elements[a];
            permutation(allChars, newElements, current, firstVal + 1, charIndex + 1, k);
        }
        return allChars;
    }
}
