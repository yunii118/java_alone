package ch06.sec04.exam04;

public class Calculator {
	int plus(int x, int y) {
		int result = x+y;
		return result;
	}
	
	double avg(int x, int y) {
		double sum = plus(x,y);
		double result = sum/2;
		return result;
	}
	
	void execute() {
		// 자기자신을 의미하는 객체 this
		// 만일 실행대상을 확실하게 알고싶으면
		
		double result = avg(7, 0);
		println("실행결과 : "+result);
		return;
	}
	
	void println(String message) {
		System.out.println(message);
	}

}
