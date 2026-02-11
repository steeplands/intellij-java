package arrays;

import helper.ANSI;
import helper.PRNG;
import helper.SavitchIn;

public class TheaterBookingCentre {
    static boolean bookSeat(boolean[][] sit, int row, int seat) {
        if (seat <= sit.length - row + 3 && row < sit.length) {
            if (!sit[row - 1][seat - 1]) {
                sit[row - 1][seat - 1] = true;
                return true;
            }
        }
        return false;
    }
    static int[] bookRandomSeat(boolean[][] sit) {
        int row = PRNG.randomInt(sit.length);
        int seat = PRNG.randomInt(sit.length - row + 2);
        if (seat <= sit.length - row + 3) {
            if (!sit[row][seat]) {
                sit[row][seat] = true;
                return new int[]{row, seat};
            }
        }
        return null;
    }

    public static int getNumberOfAllSeats(int row) {
        return 3*row + row*(row-1)/2;
    }
    public static int getNumberOfUnbookedSeats(boolean[][] sit) {
        int unbookedSit = 0;
        for (boolean[] row : sit) {
            for(boolean value : row) {
                if (!value) {
                    unbookedSit++;
                }
            }
        }
        return unbookedSit;
    }
    public static int getNumberOfBookedSeats(boolean[][] sit) {
        int bookedSit = 0;
        for (boolean[] row : sit) {
            for(boolean value : row) {
                if (value) {
                    bookedSit++;
                }
            }
        }
        return bookedSit;
    }
    public static void printTheater(boolean[][] sit) {
        System.out.printf("Theatre with %d rows\n%d seats avaible\n      BOOKED: %d\n      FREE: %d\n",
                getNumberOfAllSeats(sit.length), getNumberOfAllSeats(sit.length), getNumberOfBookedSeats(sit), getNumberOfUnbookedSeats(sit));
        for (int i = 0; i < sit.length; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (boolean value : sit[i]) {
                System.out.printf("%c ", (value) ? '#' : '-');
            }
            System.out.println();
        }
        System.out.println();
    }

    public static boolean[][] createTheater(int rows) {
        boolean[][] sit = new boolean[rows][];
        for (int i = 0; i < rows; i++) {
            sit[i] = new boolean[rows - i + 2];
        }
        return sit;
    }
    public static void main(String[] args) {
        System.out.println("Reihen: ");
        int x = SavitchIn.readLineInt();
        boolean[][] sit;
        sit = createTheater(x);
        System.out.printf("The Booking Theater\n"
                + ANSI.ANSI_RED + "Create Theater\n"
                + ANSI.ANSI_YELLOW + "Book a seat\n"
                + ANSI.ANSI_GREEN + "Book a random seat\n"
                + ANSI.ANSI_RESET + "Show Theater\n");
    }
}