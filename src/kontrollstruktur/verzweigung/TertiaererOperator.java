package kontrollstruktur.verzweigung;

import helper.SavitchIn;

public class TertiaererOperator {
    public static void main(String[] args) {
        System.out.println("Eine Zahl: ");
        int z = SavitchIn.readLineInt();

        String istGerade = (z % 2 == 0) ? "Ja" : "Nein";
        System.out.printf("Ist die Zahl %d gerade?\n%s", z, istGerade);
    }
}