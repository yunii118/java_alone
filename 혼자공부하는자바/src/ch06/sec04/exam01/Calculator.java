package ch06.sec04.exam01;

public class Calculator {
	// 명령메소드 두개, 반환값 필요x
	// 전원을 킨다.
	void powerOn() {
		System.out.println("시스템의 전원을 킵니다.");
	}
	// 전원을 끈다
	void powerOff() {
		System.out.println("시스템의 전원을 끕니다.");
	}
	// 기능메소드 = 반환값이 있을 수도 있음
	
	// 덧셈
	int add(int x, int y) {
		return x+y;
	}
	
	// 뺄셈
	int sub(int x, int y) {
		return x-y;
	}
	
	// 곱셈
	int mul(int x, int y) {
		return x*y;
	}
		
	// 나눗셈(오버로딩) : 메소드ㅢ 시그니쳐가 다른경우
	// 메소드 시그니쳐에는 메서드 선언중 반환값 안들어감
	double div(double x, double y) {
		return x/y;
	}
	
	// 정수몫만 반환하는 경우
	int div(int x, int y) {
		return x/y;
	}
	
	//나머지
	
	int mod(int x, int y) {
		return x%y;
	}
		
	
	

}
