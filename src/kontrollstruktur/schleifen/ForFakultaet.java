package kontrollstruktur.schleifen;

public class ForFakultaet {
	public static void main(String[] args){
		for (int i = 1; i <= 20; i++) {
			long product = 1;
			for (int n = 1; n <= i; n++) {
				product *= n;
			}
		System.out.printf("%d! = %d", i, product);
		}
	}
}