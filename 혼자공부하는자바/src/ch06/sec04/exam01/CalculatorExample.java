package ch06.sec04.exam01;

public class CalculatorExample {

	public static void main(String[] args) {
		// 계산기 객체 생성
		Calculator calc = new Calculator();
		
		// 전원 킨다
		calc.powerOn();
		// 덧셈 수행
		int returnValue = calc.add(100,200);
		System.out.println(" 100 + 200 = "+ returnValue);
		// 나눗셈 수행
		int returnValue2 = calc.div(100, 3);
		System.out.println("100 / 3 = "+returnValue2);
		
		double returnValue3 = calc.div(100.0,3);
		System.out.println("100 / 3 = "+ returnValue3);
		
		// 전원 끈다
		calc.powerOff();
	}

}
