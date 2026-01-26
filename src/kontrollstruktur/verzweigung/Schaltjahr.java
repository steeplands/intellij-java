package kontrollstruktur.verzweigung;

import helper.SavitchIn;

public class Schaltjahr {
	public static void main(String[] args){
		System.out.println("Jahreszahl:");
		int year = SavitchIn.readLineInt();
		if (year % 400 == 0) {
			System.out.printf("%d ist ein kontrollstruktur.verzweigung.Schaltjahr!", year);
		}
		else if (year % 100 == 0){
			System.out.printf("%d ist kein kontrollstruktur.verzweigung.Schaltjahr", year);
		}
		else if (year % 4 == 0){
			System.out.printf("%d ist ein kontrollstruktur.verzweigung.Schaltjahr", year);
		}
		else {
			System.out.printf("%d ist kein kontrollstruktur.verzweigung.Schaltjahr", year);
		}
	}
}