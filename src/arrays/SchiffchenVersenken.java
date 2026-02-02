package arrays;

import helper.PRNG;
import helper.SavitchIn;

public class SchiffchenVersenken {
    public static boolean CheckPos(char[][] map, int y, int x) {
        if (map[y][x] == ' ') {
            return true;
        }
        else return false;
    }
    public static void main(String[] args) {
        int sizeOfMap = 6;
        int ships = 4;


        char hidden = 'h';
        char hit = 'x';
        char miss = 'o';

        char[][] map = new char[sizeOfMap][sizeOfMap];
        for (int y = 0; y < map.length; y++) {
            for (int x = 0; x < map.length; x++) {
                map[y][x] = ' ';
            }
        }
        for (int a = 0; a < ships; a++) {
            int y = PRNG.randomInt(sizeOfMap);
            int x = PRNG.randomInt(sizeOfMap);
            if (CheckPos(map, y, x)) {
                map[y][x] = hidden;
            }
            else {
                a--;
            }
        }
        int x;
        int y;
        while (ships > 0) {
            do {
                System.out.println("X-Koordinate: ");
                x = SavitchIn.readLineInt();
                System.out.println("Y-Koordinate: ");
                y = SavitchIn.readLineInt();
            } while (x >= sizeOfMap || x < 0 || y >= sizeOfMap || y < 0);
            if (CheckPos(map, y, x)) {
                System.out.println("Leider nichts!");
                map[y][x] = miss;
            } else {
                if (map[y][x] == hidden) {
                    System.out.println("Treffer!");
                    ships--;
                    map[y][x] = hit;
                } else if (map[y][x] == hit) {
                    System.out.println("Schon beschossen!");
                }
            }
            System.out.print("   ");
            for (int a = 1; a <= sizeOfMap; a++) {
                System.out.printf(" %d |", a);
            }
            System.out.println();
            for (int b = 0; b < sizeOfMap; b++) {
                System.out.printf("%d |", b + 1);
                for (int a = 0; a < sizeOfMap; a++){
                    System.out.printf(" %c |", (map[b][a] == hidden) ? ' ': map[b][a]);
                }
                System.out.println();
            }
        }
        System.out.println("Alles getroffen!");
    }
}
