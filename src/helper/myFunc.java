package helper;

public class myFunc {
    public static void merge(int[] a) {
        int sum = 0;
        for (int i : a) {
            sum+=i;
        }
        System.out.println(sum);
    }
    public static void display(int[] a) {
        for (int i : a) {
            System.out.printf("%d, ", i);
        }
    }
    public static int getMax_idx(int[] a) {
        return a.length-1;
    }
    public static int search_idx(int key, int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (key == a[i]) {
                return i;
            }
        }
        return -1;
    }
    public static void mysort(int[] a) {
        for (int y = 0; y < a.length; y++) {
            for (int x = 0; x < a.length - 1; x++) {
                if (a[x + 1] < a[x]) {
                    int swap = a[x];
                    a[x] = a[x + 1];
                    a[x + 1] = swap;
                }
            }
        }
        for (int i: a) {
            System.out.printf("%d, ", i);
        }
    }
    public static boolean hasNeighbour(int[] a) {
        if (a.length == 1) {
            return true;
        }
        return false;

    }
    public static boolean hasDoubleValue(int[] a) {return false;}
    public static double getStdDeviation(int[] a) {return 0.0;}
    public static double getAvg(int[] a) {return 0.0;}

}
