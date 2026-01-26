package kontrollstruktur.schleifen;

public class WhileFakultaet {
	public static void main(String[] args) {
		long 	i = 1,
			n = 1,
			product = 1;
		while (i <= 20) {
			n = 1;
			product = 1;
			i++;
			while (n < i) {
				product *= n;
			n++;
			}
		System.out.printf("%d! = %d\n", n-1, product);
		}	
	}
}