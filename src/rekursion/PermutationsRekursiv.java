package rekursion;

import helper.SavitchIn;

public class PermutationsRekursiv {
    int fakultaet(int number) {
        int result = 1;
        for (int x = number; x > 0; x--) {
            result *= x;
        }
        return result;
    }

    /*int findPermutations(int[] array, int permutations){
        if (array.length == 1) {
                return 1;
        } else {
            int[] newarray = new int[array.length-1];
            for (int x = 0; x < newarray.length; x++) {
                newarray[x] = array[x + 1];
            }
            permutations = array.length * findPermutations(newarray, permutations);
            return permutations;
        }
    }*/

    char[][] findAllPermutations(char allChars[][], char[] array, int dept) {
        if (array.length == 1) {
            for (int x = 0; x < allChars.length; x++) {
                if (allChars[x][dept] == '\u0000') {
                    allChars[x][dept] = array[0];
                    break;
                }
            }
        } else {
            for (int a = 0; a < array.length; a++) {
                char[] newarray = new char[array.length - 1];

                for (int x = 0; x < array.length; x++) {
                    if (x != a) {
                        for (int y = 0; y < newarray.length; y++) {
                            if (newarray[y] == '\u0000') {
                                newarray[y] = array[x];
                                break;
                            }
                        }
                    }
                }

                allChars = findAllPermutations(allChars, newarray, dept - 1);

                for (int x = 0; x < fakultaet(array.length - 1); x++) {
                    for (int y = 0; y < allChars.length; y++) {
                        if (allChars[y][dept] == '\u0000') {
                            allChars[y][dept] = array[a];
                            break;
                        }
                    }
                }
            }
        }
        return allChars;
    }
    public void main(String[] args){
        int lenght = SavitchIn.readLineInt();
        int permutations = fakultaet(lenght);
        char[] chars = new char[lenght];
        int[] array = new int[lenght];
        for (int x = 0; x < lenght; x++) {
            chars[x] = (char) ('a' + x);
            array[x] = x;
        }
        char[][] allChars = new char[permutations][lenght];
        allChars = findAllPermutations(allChars, chars, chars.length-1);
        for (int y = 0; y < permutations; y++) {
            System.out.printf("\n%d: ", y + 1);
            for (int x = lenght-1; x >= 0; x--) {
                System.out.printf("'%c', ", allChars[y][x]);
            }
        }
    }
}
