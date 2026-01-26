package beispiele.test.test2;

public class Bsp2 {
    public static void main(String[] args) {
        for (int number = 3; number <= 23; number+=5) {
            System.out.printf("%d: ", number);
            for (int t = 1; t <= number; t++) {
                if (number % t == 0) {
                    System.out.printf("%d", t);
                    if (number != t) {
                        System.out.print(", ");
                    }
                }
            }
            System.out.println();
        }
    }
}
