package kontrollstruktur.verzweigung;

import helper.SavitchIn;

public class Schaltjahr2 {
	public static void main(String[] args){
		System.out.println("Jahreszahl:");
		int year = SavitchIn.readLineInt();
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0){
					System.out.println("kontrollstruktur.verzweigung.Schaltjahr");
				} else {
					System.out.println("kein kontrollstruktur.verzweigung.Schaltjahr");}
			} else {
				System.out.println("kontrollstruktur.verzweigung.Schaltjahr");}
		} else {
			System.out.println("kein kontrollstruktur.verzweigung.Schaltjahr");}
	}
}