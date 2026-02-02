package kontrollstruktur.schleifen;

public class ForEach {
    public static void main(String[] args) {
        int[][][] array = {
                {
                        {0, 0, 0},
                        {0, 0, 1}
                },
                {
                        {0, 1, 0},
                        {0, 1, 1}
                },
                {
                        {1, 0, 0},
                        {1, 0, 1},
                },
                {
                        {1, 1, 0},
                        {1, 1, 1},
                }
        };
        for (int[][] field : array) {
            for(int[] row : field) {
                for(int value : row) {
                    System.out.printf("%d, ", value);
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
