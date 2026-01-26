package grundlagen;

import java.util.Scanner;
public class ScannerBsp{
	public static void main(String[] args) {
		System.out.println("Bitte geben Sie eine Zahl ein: ");
		Scanner scanner = new Scanner(System.in);
		int value = scanner.nextInt();
		System.out.println("Die Zahl lautet: " + value);
	}
}