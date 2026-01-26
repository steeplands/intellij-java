package beispiele;

import helper.SavitchIn;

import java.util.Random;

public class Piratenschlacht2 {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("Wie heißt der Kapitän?");
        String captain = SavitchIn.readLine();
        System.out.println("Wie heißt das Schiff?");
        String shipName = SavitchIn.readLine();
        int cannon;
        do {
            System.out.println("Wie viele Kanonen hat das Schiff?");
            cannon = SavitchIn.readLineInt();
        } while (cannon % 2 == 1 || cannon < 6 || cannon > 12);
        for (int x = 1; x <= cannon; x++) {
            System.out.printf("Kaptain %s schießt die %d.te Kanone ein!\n", captain, x);
            int attempt = 0;
            while (true) {
                int distance = random.nextInt(0, 21);
                System.out.printf("%d.ter Schuss: Versuch %d: %dm\n", x, ++attempt, distance);
                if (distance <= 5) {
                    System.out.printf("Kaptain %s hat die %d.te Kanone beim %d.ten Versuch mit %dm eingeschossen!\n\n", captain, x, attempt, distance);
                    break;
                }
            }
        }
    }
}
