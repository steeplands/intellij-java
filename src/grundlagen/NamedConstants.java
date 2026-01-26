package grundlagen;

import helper.SavitchIn;

public class NamedConstants {
	public static void main(String[] args) {
	final double PI = Math.PI;
	System.out.println("Radius: ");
	double radius = SavitchIn.readLineDouble();
	System.out.printf("Radius: %f\nDurchmesser: %f\nUmfang: %f\nFlächeninhalt: %f", radius, 2 * radius, 2 * PI * radius, radius * radius * PI);
	}
}