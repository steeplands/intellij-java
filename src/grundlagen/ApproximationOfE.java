package grundlagen;

public class ApproximationOfE {
    public static void main(String[] args) {
        double totalCount = 0;
        for (int q = 0; q < 1000000; q++) {
            double num = 0;
            int count = 0;
            while (num < 1) {
                num += Math.random();
                count++;
            }
            totalCount += count;
            System.out.println(totalCount / (q + 1));
        }
    }
}

