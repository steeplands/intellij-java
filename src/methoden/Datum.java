package methoden;

import helper.SavitchIn;

public class Datum {
	public static boolean isSchaltjahr(int jahr){
		if (jahr % 400 == 0){
			return true;
		}
		else if (jahr % 100 == 0){
			return false;
		}
		else if (jahr % 4 == 0){
			return true;
		} else {
			return false;
		}
	}
	public static String month(int monat_value){
		String[] month = {"Januar", "Februar", "März", "April", "Mai", "Juni", "Juli", "August", "September", "Oktober", "November", "December"};
		while (monat_value > 12 || monat_value < 1) {
			System.out.println("Bitte geben Sie einen Wert zwischen 1 - 12 ein:");
			monat_value = SavitchIn.readLineInt();
			}
		return month[monat_value - 1];
		}
    public static int getTage(int month, int year){
        if (month == 2) {
            if (isSchaltjahr(year)) {
                return 29;
            } else {
                return 28;
            }
        } else if (month == 4 || month == 6 || month == 7 || month == 9 || month == 11) {
            return 30;
        } else {
            return 31;
        }
    }
	public static void main(String[] args) {
		System.out.println("Jahr:");
		int year = SavitchIn.readLineInt();
		System.out.printf("%d: %b\n", year, isSchaltjahr(year));
		System.out.println("Monat: ");
		int monat = SavitchIn.readLineInt();
		System.out.printf("Month: %s\n", month(monat));
        System.out.println("methoden.Datum: ");
        int day = SavitchIn.readLineInt();
        while (day < 0 || day > getTage(monat, year)) {
            System.out.println("Geben Sie ein gültiges methoden.Datum ein:");
            day = SavitchIn.readLineInt();
        }
        System.out.printf("%d. %s %d\n", day, month(monat), year);
	}
}