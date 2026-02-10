package own;

import helper.ANSI;
import helper.PRNG;
import helper.SavitchIn;

public class Mines {
    public static int[][] findNeigbours(int[][] map, int y, int x) {
        int neighbours = 8;
        if (x == 0 || x == map[y].length-1 || y == 0 || y == map.length - 1) {
            neighbours = 5;
        }
        if ((x == 0 || x == map[y].length-1) && (y == 0 || y == map.length - 1)) {
            neighbours = 3;
        }
        int pos = 0;
        int[][] list = new int[neighbours][2];

        if (x != 0) {
            list[pos++] = new int[]{y, x-1};
            if (y != 0){
                list[pos++] = new int[]{y-1, x-1};
            }
        }
        if (y != 0) {
            list[pos++] = new int[]{y-1, x};
            if (x != map[y].length-1) {
                list[pos++] = new int[]{y-1, x+1};
            }
        }
        if (x != map[y].length - 1) {
            list[pos++] = new int[]{y, x+1};
            if (y != map.length - 1) {
                list[pos++] = new int[]{y+1, x+1};
            }
        }
        if (y != map.length - 1) {
            list[pos++] = new int[]{y+1, x};
            if (x != 0) {
                list[pos] = new int[]{y+1, x-1};
            }
        }
        return list;
    }
    public static void AddNeigbours(int[][] map, int y, int x) {
        if (x != 0) {
            map[y][x - 1]++;
            if (y != 0) {
                map[y - 1][x]++;
                map[y - 1][x - 1]++;
            }
            if (y != map.length - 1) {
                map[y + 1][x]++;
                map[y + 1][x - 1]++;
            }
        }
        if (x != map.length - 1) {
            map[y][x + 1]++;
            if (y != 0) {
                map[y - 1][x]++;
                map[y - 1][x + 1]++;
            }
            if (y != map.length - 1) {
                map[y + 1][x]++;
                map[y + 1][x + 1]++;
            }
        }
    }
    public static void discoverCell(int[][] map, char[][] userInterface, int y, int x)  {
        if (map[y][x] == 0) {
            userInterface[y][x] = ' ';
            for (int[] j : findNeigbours(map, y, x)) {
                if (map[j[0]][j[1]] == 0 && userInterface[j[0]][j[1]] == '\u0000') {
                    discoverCell(map, userInterface, j[0], j[1]);
                }
                else if (map[j[0]][j[1]] != 0){
                    userInterface[j[0]][j[1]] = (char) ('0' + (map[j[0]][j[1]]));
                }
            }
        }
        else if (userInterface[y][x] == '\u0000') {
            userInterface[y][x] = (char)('0' + (map[y][x]));
        }
    }
    public static int getUserInput(String prompt, int maxValue) {
        int number;
        do {
            System.out.println(prompt);
            number = SavitchIn.readLineInt();
        } while (number > maxValue || number < 0);
        return number;
    }
    public static void PlaceRandomMine(int[][] map) {
        int y = PRNG.randomInt(map.length);
        int x = PRNG.randomInt(map[y]. length);
        if (map[y][x] != -1) {
            map[y][x] = -1;
            for (int[] j : findNeigbours(map, y, x)) {
                map[j[0]][j[1]] += (map[j[0]][j[1]] == -1) ? 0 : 1;
            }
        }
        else {
            PlaceRandomMine(map);
        }
    }
    public static void PrintArray(char[][] userInterface) {
        System.out.print("\n  ");
        for (int y = 1; y <= userInterface.length; y++) {
            System.out.printf(" %d  ", y);
        }
        for (int y = 0; y < userInterface.length; y++) {
            System.out.print("\n  ");
            for (int x = 0; x < userInterface.length; x++) {
                System.out.print("----");
            }
            System.out.printf("\n%d ", y + 1);
            for (int x = 0; x < userInterface[y].length; x++) {
                if (userInterface[y][x] == '\u0000') {
                    System.out.printf(" " + ANSI.ANSI_YELLOW + " " + ANSI.ANSI_RESET + " ");
                }
                else if (userInterface[y][x] == 'F') {
                    System.out.printf(" %s ", ANSI.ANSI_CYAN + "F" + ANSI.ANSI_RESET);
                }
                else {
                    System.out.printf(" %c ", (userInterface[y][x]));
                }
                System.out.print("|");
            }
        }
    }

    public static void main(String[] args) {
        int length = 8;
        int width = 8;
        int mines = 10;
        int[][] map = new int[length][width];
        boolean flagmode = false;
        String word;

        char[][] userInterface = new char[length][width];
        char hidden = '\u0000';
        char mine = 'o';
        char flag = 'F';

        for (int i = 0; i < mines; i++) {
            PlaceRandomMine(map);
        }

        while (mines > 0) {
            System.out.print("\nEvent: Flag / Dig (F/D)\n");
            word = SavitchIn.readLineWord();
            if (word.equals("F") || word.equals("f") && !flagmode) {
                flagmode = true;
            }
            else if (word.equals("D") || word.equals("d") && flagmode) {
                flagmode = false;
            }
            int x = getUserInput("X | Y; X: ", length) - 1;
            int y = getUserInput((x+1) + " | Y; Y: ", width) - 1;
            System.out.printf("%d | %d", x+1, y+1);
            if (!flagmode) {
                if (map[y][x] == -1 && userInterface[y][x] != flag) {
                    System.out.println("\nYou loose!");
                    break;
                }
                else if (userInterface[y][x] == '\u0000') {
                    discoverCell(map, userInterface, y, x);
                }
            }
            else {
                if (userInterface[y][x] == flag) {
                    mines++;
                    userInterface[y][x] = '\u0000';
                }
                else if (userInterface[y][x] == '\u0000'){
                    userInterface[y][x] = flag;
                    mines--;
                }
            }
            System.out.printf(ANSI.ANSI_RED + "\n%d\n" + ANSI.ANSI_RESET, mines);
            PrintArray(userInterface);
        }

        System.out.print("\n  ");
        for (int y = 1; y <= userInterface.length; y++) {
            System.out.printf(" %d ", y);
        }
        for (int y = 0; y < map.length; y++) {
            System.out.println();
            for (int x = 0; x < map[y].length; x++) {
                System.out.print(" ");
                if (userInterface[y][x] == flag) {
                    if (map[y][x] == -1) {
                        System.out.print(ANSI.ANSI_GREEN + mine + ANSI.ANSI_RESET);
                    }
                    else {
                        System.out.print(ANSI.ANSI_RED + mine + ANSI.ANSI_RESET);
                    }
                }
                else if (map[y][x] == -1 && userInterface[y][x] != flag) {
                    System.out.print(ANSI.ANSI_RED + mine + ANSI.ANSI_RESET);
                }
                else {
                    System.out.print((userInterface[y][x]) == '\u0000' ? ' ' : userInterface[y][x]);
                }
            }
        }
    }
}