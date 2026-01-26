package own;

import helper.SavitchIn;

public class Paridy {
	public static boolean convert_to_bool(int a) {
		if (a == 0) {
			return false;
		} else {
			return true;
		}
	}
	public static int convert_to_int(boolean a) {
		if (a == false) {
			return 0;
		} else {
			return 1;
		}
	}
	public static boolean xnor(boolean a, boolean b) {
		if ((a && b) == false && (a || b == true)) { 
			return true;
		} else {
			return false;
		}
	}
	public static int power(int base, int exponent) {
		int result = 1;
		for (int x = 1; x <= exponent; x++){
			result *= base;
		}
		return result;
	}
	public static int len_bin(int number) {
		int len_var = 0;
		while (number != 1 && number != 0) {
			number /= 2;
			len_var++;
		}
		return len_var;
	}
	public static boolean paridy(int number) {
		boolean result = false;
		for (int x = 0; x <= len_bin(number); x++){
			result = xnor(result, convert_to_bool((number/(power(2, x)))%2));
			}
		return result;
	}
	public static void main(String[] args) {
		for (int n = 0; n <= 50; n++) {
			System.out.printf("%4d: %6d\n", n, convert_to_int(paridy(n)));
		}
	}

    public static class kombinatorik {
        int choose (int n, int k) {
            int result = 1;
            if (2 * k > n) {
                k = n - k;
            }
            for (int i = 1; i <= k; i++) {
                result = result * (n - i +1 ) / i;
            }
            return result;
        }
        int fakultaet(int n) {
            int result = 1;
            for (int i = 1; i <= n; i++){
                result *= i;
            }
            return result;
        }
        int permutations(int n, int k) {
            return choose(n, k) * fakultaet(k);
        }
        public void main(String[] args) {
            int n = SavitchIn.readLineInt();
            int k = SavitchIn.readLineInt();
            System.out.println(permutations(n, k));
        }
    }
}