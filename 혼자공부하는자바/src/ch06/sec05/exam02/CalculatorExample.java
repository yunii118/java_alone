package ch06.sec05.exam02;

public class CalculatorExample {

	public static void main(String[] args) {
		double result1 = 10*10*Calculator.PI;
		int result2 = Calculator.plus(100, 200);
		int result3 = Calculator.minus(200, 100);
		
		System.out.println("원의 면적 : "+result1);
		System.out.println("100 + 200 = "+result2);
		System.out.println("200 - 100 = "+result3);

	}

}
