package kontrollstruktur.verzweigung;

import helper.SavitchIn;

public class Maximum {
	public static void main(String[] args) {
	System.out.println("zwei Zahlen:");
	double 	zahl1 = SavitchIn.readLineDouble();
	double	zahl2 = SavitchIn.readLineDouble();
	if (zahl1 < zahl2) {
		System.out.printf("%f ist größer als %f", zahl2, zahl1);
	}
	else if (zahl1 > zahl2) {
		System.out.printf("%f ist größer als %f", zahl1, zahl2);
	} else {
		System.out.println("Beide Zahlen sind gleich groß");
		}
	}
}