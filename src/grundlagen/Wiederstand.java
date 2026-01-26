package grundlagen;

public class Wiederstand {
	public static void main(String args[]) {
		double 	u = 10,
			r1 = 560,
			r2 = 1000,
			r3 = 2200;
		double 	rges = r1 + r2 + r3,
			i = u / rges;
		double u1 = i * r1;
		System.out.printf("Rges = %f\nI = %f\nU1 = %f", rges, i, u1);
	}
}