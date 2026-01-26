package rekursion;

import helper.SavitchIn;

import java.lang.module.FindException;

public class KombinationWiderholung {
    int[] SubOne(int[] array, int index) {
        for (int i = index; i < array.length; i++) {
            if (array[i] == 0) {
                SubOne(array, index + 1);
            } else {
                array[i]--;
                array[i+1]++;
            }
            break;
        }
        return array;
    }

    int[][] Kombinations(int[][] allChars, int[] current, int index, int pos, int k) {
        for (int f = 0; f < allChars.length; f++) {
            for (int i = 0; i < allChars.length; i++) {
                for (int j = 0; j < allChars[0].length; j++){
                    if (allChars[i][j] != 0) {
                        i++;
                        j = 0;
                    }
                }
                for (int j = 0; j < allChars[0].length; j++) {
                    allChars[i][j] = current[j];
                }
                break;
            }
            SubOne(current, 0);
        }
        return allChars;
    }
    public void main(String[] args) {
        int n = SavitchIn.readLineInt();
        int k = SavitchIn.readLineInt();
        int permutations = own.storastik.choose(n+k-1, k-1);
        int[][] allChars = new int[permutations][k];
        int[] current = new int[k];
        current[0] = k;
        allChars = Kombinations(allChars, current, 0, 0, k);
        for (int y = 0; y < allChars.length; y++) {
            System.out.printf("\n%4d: ", y+1);
            for (int x = 0; x < k; x++) {
                System.out.printf("%d, ", allChars[y][x]);
            }
        }
    }
}