package methoden;

public class Gerade {
	public static double Funktion(int k, int d, double x) {
		return k * x + d;
	}
	public static void main(String[] args) {
		double 	start = -3,
			end = 4,
			x = 0;
		while (x + start <= end) {
			System.out.printf("f(%.1f) = %.1f\n", x, Funktion(2, 3, x));
			x += 0.5;	 
		} 
	}
}