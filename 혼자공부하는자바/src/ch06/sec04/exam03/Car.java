package ch06.sec04.exam03;

public class Car {
	// 자동차 연료를 의미하는 필드
	int gas;
	
	// 생성자
	// 메소드
	// gas값을 설정
	void setGas(int  gas) {
		this.gas = gas;
	}
	
	// 가스가 남아있는지 확인
	// 있다 없다 - boolean형이 적격
	boolean isLeftGas() {
		if(gas==0) {
			System.out.println("가스가 없습니다.");
			return false;
		}
		else {
			System.out.println("가스가 있습니다.");
			return true;
		}
	}
	
	// 자동차가 가스가 있는동안 계속해서 달리는것을 나타냄
	void run() {
		while(true) {
			if(gas>0) {
				System.out.println(
						"달립니다. (gas 잔량 : "+ gas + ")");
				gas-=1;
			}
			else {
				System.out.println(
						"멈춥니다. (gas 잔량 : "+gas+")");

				return;
			}
		}
	}

}
