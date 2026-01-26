package methoden;

import helper.SavitchIn;

public class PrintSum{
	public static void Sum(int a, int b) {
		System.out.printf("a + b = " + (a + b));
	}
	
	public static void main(String[] args){
		System.out.println("Zwei Zahlen:");
		int 	a = SavitchIn.readLineInt(),
			b = SavitchIn.readLineInt();
		Sum(a, b);
	}
}