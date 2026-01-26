package kontrollstruktur.schleifen;

import helper.SavitchIn;

public class Summe {
	public static void main(String[] args) {
		System.out.println("Zahl: ");
		int n = SavitchIn.readLineInt();
		int summe = 0;
		for (int i = 0; i <= n; i++) {
			summe+=i;
		}
		System.out.printf("Die kontrollstruktur.schleifen.Summe aller Zahlen bis %d ist %d", n, summe);
	}
}