package beispiele;

import helper.SavitchIn;

public class Zahltag {
	public static void main(String[] args) {
		System.out.println("Rudis Preis:");
		double price = SavitchIn.readLineDouble();
		System.out.println("Goldzahn will zahlen: ");
		double number = SavitchIn.readLineDouble();
		if (number < price * 0.9) {
			System.out.println("Verzieh dich, du Landratte!");
		} else if (number > price * 1.2) {
			System.out.println("Da stimmt etwas nicht du Schurke! Versuchst du mich zu betrügen?");
		} else {
			System.out.println("Wir haben eine Abmachung, Kamerad!");
		}
	}
}