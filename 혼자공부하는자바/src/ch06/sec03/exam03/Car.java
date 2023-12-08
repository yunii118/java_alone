package ch06.sec03.exam03;

public class Car {
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	
	// 생성자
	// 매개변수 없음
	// 사용자 정의 기본 생성자
	Car(){
		
	}
	// 매개변수 1개
	Car(String model){
		this.model = model;
	}
	// 매개변수 2개
	//Car(String model, String color){
	//	this.model = model;
	//	this.color = color;
	//}
	
	Car(String model, String color){
		this(model, color, 250);
	}
	// 매개변수 3개
	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		
		
	}

}
