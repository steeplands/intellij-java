package kontrollstruktur.schleifen;

public class WhileCountDown {
	public static void main(String[] args) {
		int number = 100;
		while (number >= 50) {
			if (number % 10 == 0) {
				System.out.println();
			}
			System.out.printf("%4d ", number) ;
			--number;
		}
	}
}