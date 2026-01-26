package methoden;

import helper.SavitchIn;

public class CalcSum {
	public static int Sum(int a, int b){
		return a + b;
	}
	
	public static void main(String[] args){
		System.out.println("Zwei Zahlen: ");
		int 	a = SavitchIn.readLineInt(),
			b = SavitchIn.readLineInt();
		System.out.printf("a + b = %d", Sum(a, b));
	}
}