package own;
import arrays.SchiffeVersenken;

import static arrays.SchiffeVersenken.findMaxSum;

public class AnotherRandomClass {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            System.out.printf("%d: %d\n", i, findMaxSum(i));
        }
    }
}
