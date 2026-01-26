package beispiele.test.test2;

public class Bsp3 {
    public static void main(String[] args) {
        int[] arr = new int[9];
        for (int i = 45; i >= 37; --i) {
            arr[i-37] = i;
        }
        for (int i : arr) {
            System.out.printf("%d, ", i);
        }
    }
}
