package own;

public class PermutationLotto {
    static int[] swap(int[] array, int swap) {
        int a = array[array.length-swap];
        array[array.length-swap] = array[array.length-swap-1];
        array[array.length-swap-1] = a;
        return array;
    }
    static boolean searchNeighbours(int[] array) {
        for (int x = 0; x < array.length-1; x++){
            if (array[x]+1 == array[x+1]) {
                return false;
            }
        }
        return true;
    }
    static int findValue(int x) {
        int result = 1;
        while (x % 2 == 0 && x != 0){
            x /= 2;
            result++;
        }
        return result;
    }
    static double power2(int x) {
        double result = 1;
        for (int a = 1; a <= x; a++) {
            result *= 2;
        }
        return result;
    }
    static void main(String[] args) {
        int run = 0;
        int[] numbers = new int[3];
        for (int x = 1;  x <= numbers.length; x++) {
            numbers[x-1] = x;
        }
        for (int x = 0; x <= power2(numbers.length-1); x++){
            swap(numbers, findValue(x));
            if (searchNeighbours(numbers)) {
                run++;
                System.out.printf("\nRun: %d\n", run);
                for (int y = 0; y < numbers.length; y++){
                    System.out.printf("%d, ", numbers[y]);
                }
            }
        }
    }
}
