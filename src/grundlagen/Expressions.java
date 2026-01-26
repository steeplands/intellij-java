package grundlagen;

import helper.SavitchIn;

public class Expressions {
	public static void main(String[] args) {
	int 	a,
		b;
	double	c;
	System.out.println("Bitte geben Sie drei Zahlen ein: ");
	a = SavitchIn.readLineInt();
	b = SavitchIn.readLineInt();
	c = SavitchIn.readLineDouble();
	System.out.printf("a + b = %d\na - b = %d\na * b = %d\na / b = %d\na & b = %d", a+b, a-b, a*b, a/b, a%b);
	System.out.printf("\na + c = %f\na - c = %f\na * c = %f\na / c = %f\na & c = %f", a+c, a-c, a*c, a/c, a%c);
	System.out.printf("\nb + c = %f\nb - c = %f\nb * c = %f\nb / c = %f\nb & c = %f", b+c, b-c, b*c, b/c, b%c);
	}
}