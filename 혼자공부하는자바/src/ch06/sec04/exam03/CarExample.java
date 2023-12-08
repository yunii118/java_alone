package ch06.sec04.exam03;

public class CarExample {

	public static void main(String[] args) {
		
		// 자동차가 달리는것을 모델링
		// 1. 자동차 객체 생성
		Car car = new Car();
		
		// 기본 가스량 주입
		car.setGas(5);
		// 현재 자동차 가스 상태 확인
		boolean gasState = car.isLeftGas();
		// 차를 출발시킴
		// 출발한 차가 가스가 있는동안 달림
		// 가스가 남아있으면 가스충전 필요없음 출력
		// 없으면 가스를 새로 주입해주세요 출력
		if(gasState) {
			System.out.println("출발합니다.");
			car.run();
		}
		else {
			System.out.println("가스를 주입해주세요.");
		}
		

	}

}
