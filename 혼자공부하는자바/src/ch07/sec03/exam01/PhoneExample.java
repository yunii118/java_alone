package ch07.sec03.exam01;

public class PhoneExample {

	public static void main(String[] args) {
		// Phone phone = new Phone();
		// 추상클래스는 new 연산자 사용 불가
		
		SmartPhone smart = new SmartPhone("홍길동");
		
		smart.turnOn();
		smart.internetSearch();
		smart.turnOff();

	}

}
