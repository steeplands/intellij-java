package arrays;

import helper.ANSI;
import helper.PRNG;
import helper.SavitchIn;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SchiffeKlicken {

    private JFrame frame;
    private JButton[][] buttons;
    private int[][] ships;
    private char[][] map;

    private int remAttemps;
    private int remShip;
    private int rows;
    private int cols;
    private int mapsize;

    private char unknown = '\u0000';
    private char hidden = 'h';
    private char hit = 'x';
    private char miss = 'o';

    public void MindowGUI(char[][] map, int[][] ships) {
        this.mapsize = map.length;
        this.rows = map.length;
        this.cols = map[0].length;

        this.ships = new int[3][(mapsize-1)/3*3];

        this.remAttemps = (mapsize*mapsize/3);

        createWindow();
    }

    private void createWindow() {
        frame = new JFrame("Schiffe Versenken");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JPanel gridPanel = new JPanel();
        gridPanel.setLayout(new GridLayout(rows + 1, cols + 1));

        buttons = new JButton[rows][cols];
        gridPanel.add(new JLabel(""));

        for (int x = 0; x < cols; x++) {
            JLabel label = new JLabel(String.valueOf(x + 1), SwingConstants.CENTER);
            label.setFont(new Font("Arial", Font.BOLD, 14));
            gridPanel.add(label);
        }

        for (int y = 0; y < rows; y++) {

            JLabel rowLabel = new JLabel(String.valueOf(y + 1), SwingConstants.CENTER);
            rowLabel.setFont(new Font("Arial", Font.BOLD, 14));
            gridPanel.add(rowLabel);

            for (int x = 0; x < cols; x++) {

                JButton button = new JButton();
                button.setFont(new Font("Arial", Font.BOLD, 16));

                int finalY = y;
                int finalX = x;

                button.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mousePressed(MouseEvent e) {
                        if (SwingUtilities.isLeftMouseButton(e) || SwingUtilities.isRightMouseButton(e)) {
                            if (remAttemps == 0) {
                                System.out.print(ANSI.ANSI_RED + "YOU LOOSE!" + ANSI.ANSI_RESET);
                                System.exit(0);
                            }
                            else if (remShip == 0) {
                                System.out.print(ANSI.ANSI_GREEN + "YOU WIN!" + ANSI.ANSI_RESET);
                                System.exit(0);
                            }
                            else {
                                if (map[finalY][finalX] == hidden) {
                                    map[finalY][finalX] = hit;
                                    for (int j = 0; j < ships.length; j++) {
                                        for (int i = 0; i < ((mapsize - j - 1) / 3); i++) {
                                            if (ships[j][3 * i] % mapsize == ships[j][1 + 3 * i] % mapsize && ships[j][i] % mapsize == finalX) {
                                                if ((ships[j][3 * i] / mapsize - finalY) * (finalY - ships[j][1 + 3 * i] / mapsize) >= 0) {
                                                    ships[j][2 + 3 * i]--;
                                                    if (ships[j][2 + 3 * i] == 0) {
                                                        remShip--;
                                                        break;
                                                    }
                                                }
                                            } else if (ships[j][3 * i] / mapsize == ships[j][1 + 3 * i] / mapsize && ships[j][3 * i] / mapsize == finalY) {
                                                if ((ships[j][3 * i] % mapsize - finalX) * (finalX - ships[j][1 + 3 * i] % mapsize) >= 0) {
                                                    ships[j][2 + 3 * i]--;
                                                    if (ships[j][2 + 3 * i] == 0) {
                                                        remShip--;
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    map[finalY][finalX] = miss;
                                    remAttemps--;
                                }
                            }
                            System.out.printf("ships: %d\ncanons: %d\n", remShip, remAttemps);
                        }
                        updateBoard();
                    }
                });

                buttons[y][x] = button;
                gridPanel.add(button);
            }
        }
        frame.add(gridPanel, BorderLayout.CENTER);
        frame.setSize(600, 600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        updateBoard();
    }

    private int[] buttonToGrid(int y, int x) {
        return new int[]{y, x};
    }

    public void updateBoard() {
        for (int y = 0; y < rows; y++) {
            for (int x = 0; x < cols; x++) {

                JButton button = buttons[y][x];
                char value = map[y][x];

                if (value == hidden) {
                    button.setText("");
                    button.setBackground(Color.GRAY);
                }
                else if (value != '\u0000') {
                    button.setText("" + value);
                }
                else {
                    button.setText("");
                }
                button.setBackground(Color.WHITE);
            }
        }
    }
    static boolean SearchPos(char[][] array, char hidden, int length, int direction, int x, int y) {
        if (x >= array.length || y >= array.length || x < 0 || y < 0 || array[y][x] != '\u0000') {
            return false;
        }
        if (length <= 1) {
            array[y][x] = hidden;
            return true;
        }
        else {
            if (SearchPos(array, hidden, length - 1, direction, x + (direction%2 - direction/2), y + ((direction+1)%2 - direction/2))) {
                array[y][x] = hidden;
                return true;
            }
            else {
                return false;
            }
        }
    }
    /*
    static void printArray(char[][] array, char unknown, char hidden, char hit) {

        System.out.print("\n    ");
        for (int i = 0; i < array.length; i++) {
            System.out.printf(" %2d ", 1 + i);
        }
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            System.out.print("   ");
            for (int j = 4 * array.length; j >= 0; j--) {
                System.out.print("-");
            }
            System.out.printf("\n%2d  ", i+1);
            for (char value : array[i]) {
                if (value == hit) {
                    System.out.printf("| %s ", ANSI.ANSI_CYAN + hit + ANSI.ANSI_RESET);
                }
                else if (value == hidden || value == '\u0000') {
                    System.out.printf("| %s ", unknown);
                }
                else {
                    System.out.printf("| %s ", ANSI.ANSI_RED + value + ANSI.ANSI_RESET);
                }
            }
            System.out.println("|");
        }

        System.out.print("   ");
        for (int j = 4 * array.length + 1; j > 0; j--) {
            System.out.print("-");
        }
    }
    */
    /*
    public void PrintUI(int remShips, int remCanons) {
        if (remShips > 0 && remCanons > 0) {

            String[] ship = {
                    "     |>    ",
                    "  ___|___  ",
                    " /   |   \\ ",
                    " \\___|___/ ",
                    "    \\_/    ",
                    ANSI.ANSI_CYAN + "   ~ ~ ~   " + ANSI.ANSI_RESET
            };
            System.out.printf("Schiffe: %d\n", remShips);
            /*
            for (int x = 0; x < ship.length; x++) {
                for (int i = 0; i < remShips; i++) {
                    System.out.printf("       %s", ship[x]);
                }
                System.out.println();
            }
             *//*
            System.out.printf("Kanonenkugeln: %d\n", remCanons);

            if (remShips > 6) {
                remShips = 6;
            }
            if (remCanons > 21) {
                remCanons = 21;
            }
            String[] canons = new String[findMaxSum(remCanons)];
            for (int i = 0; i < canons.length; i++) {
                canons[i] = "";
                for (int j = 0; j <= canons.length - i - 1; j++) {
                    canons[i] += " ";
                }
            }
            for (int i = 0; i < canons.length; i++) {
                for (int j = 0; j < canons.length - i; j++) {
                    canons[canons.length - i - 1] += ANSI.ANSI_YELLOW + ((remCanons > 0) ? " o" : "") + ANSI.ANSI_RESET;
                    remCanons--;
                }
                canons[canons.length - i - 1] += " ";
            }
            for (int i = 0; i < canons.length; i++) {
                for (int j = 0; j < i; j++) {
                    canons[i] += " ";
                }
            }
            for (int x = 0; x < ship.length || x < canons.length; x++) {
                for (int i = 0; i < ship.length && remShips > i; i++) {
                    if (ship.length > x) {
                        System.out.printf("    %s    ", ship[x]);
                    }
                }
                if (ship.length - canons.length <= x) {
                    System.out.print(canons[x - ship.length + canons.length]);
                }
                System.out.println();
            }


        }
    }
    */

    public void main(String[] args) {
        int mapsize;
        do {
            System.out.println("Größe des Spielfeldes");
            mapsize = SavitchIn.readLineInt();
        } while (mapsize < 6 || mapsize > 20);
        map = new char[mapsize][mapsize];
        ships = new int[mapsize][mapsize];

        for (int i = 4; i >= 2; i--) {
            for (int j = 0; j < (mapsize-i-2)/3+1; j++) {
                while (true) {
                    int direction = PRNG.randomInt(4);
                    int x = PRNG.randomInt(mapsize);
                    int y = PRNG.randomInt(mapsize);
                    if (SearchPos(map, hidden, i, direction, x, y)) {
                        remShip++;
                        ships[i-2][3*j+2] = i;
                        ships[i-2][3*j] = x + y * mapsize;
                        ships[i-2][3*j+1] = (x + (i-1) * (direction%2 - direction/2) + mapsize * (y + (i-1) * ((direction+1)%2 - direction/2)));
                        break;
                    }
                }
            }
        }
        MindowGUI(map, ships);
    }
}
