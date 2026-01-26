package kontrollstruktur.verzweigung;

import helper.SavitchIn;

public class Wuerfeln {
	public static void main(String[] args) {
	System.out.println("Bitte geben Sie eine Zahl zwischen 1 und 6 ein:");
	int guessedNumber = SavitchIn.readLineInt();
	int zufallsZahl = (int)(Math.random() * 6 +1);
	if (zufallsZahl == guessedNumber) {
		System.out.printf("Super getippt: %d", zufallsZahl);
		}
	else {
		System.out.printf("Leider Nichts: %d", zufallsZahl);
		}
	}
}