package ch06.sec05.exam01;

public class Car {
	//필드
	String model;
	int speed;
	
	//생성자
	public Car(String model) {
		this.model = model;
	}
	
	// 메소드
	// 왼쪽은 멤버필드의 speed
	// 오른쪽은 매개변수로 넘어온 speed
	void setSpeed(int speed) {
		this.speed = speed;
	}
	// 멤버필드의 speed의 값을 리턴
	int getSpeed() {
		return this.speed;
	}
	
	public void run() {
		for(int i = 10;i<=50;i+=10) {
			this.setSpeed(i);
			System.out.println(
					model + "가 달립니다. (시속 : "+
					speed + "km/h");
		}
	}

}
