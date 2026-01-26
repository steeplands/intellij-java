package grundlagen;

import helper.SavitchIn;

public class SavitchInBsp {
	public static void main(String[] args) {
		int zahl;

		System.out.print("Gib eine Zahl ein: ");
		zahl = SavitchIn.readLineInt();
		System.out.println("Die Zahl lautet: " + zahl);
	}
}