package own;

import helper.SavitchIn;

public class storastik {
        public static int choose (int n, int k) {
            int result = 1;
            if (2 * k > n) {
                k = n - k;
            }
            for (int i = 1; i <= k; i++) {
                result = result * (n - i +1 ) / i;
            }
            return result;
        }
        public static int fakultaet(int n) {
            int result = 1;
            for (int i = 1; i <= n; i++){
                result *= i;
            }
            return result;
        }
        int permutations(int n, int k) {
            return choose(n, k) * fakultaet(k);
        }
    }
