package ch07.sec01.exam03;

public class Computer extends Calculator {
	@Override // 실행 주석(@) 은 내부적으로 클래스
			 // @ 다음에는 대문자로 시작
	double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI * r * r;
	}

}
