package beispiele;

import helper.SavitchIn;

public class Piratenschlacht {
	public static int RNG(int min, int max) {
		return (int)(Math.random() * (max - min + 1) + min);
	}
	public static void Ausgabe(int r, int p) {
		if (p > 0) {
			System.out.println("Die Piraten haben gesiegt! Der Schatz gehört uns, uuaarrgh!");
		} else if (r > 0) {
			System.out.println("Ein Angriff wurde abgewehrt. Die Rotröcke triumphieren!");
		} else {
			System.out.println("Das Fort liegt in Trümmern, und der Schatz ist verloren!");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("HP: Rotröcke | HP: Piraten");
		int 	HP_Rotroecke = SavitchIn.readLineInt(),
			HP_Piraten = SavitchIn.readLineInt();
		if (HP_Rotroecke * HP_Piraten <= 0) {
			HP_Rotroecke = RNG(75, 100);
			HP_Piraten = RNG(75, 100);
		}
		while (HP_Rotroecke >= 0 && HP_Piraten >= 0) {
			System.out.printf("Rotröcke: %3d | Piraten: %3d\n", HP_Rotroecke, HP_Piraten);
			HP_Piraten -= RNG(5, 15);
			HP_Rotroecke -= RNG(5, 15);
		}
		Ausgabe(HP_Rotroecke, HP_Piraten);
	}
}