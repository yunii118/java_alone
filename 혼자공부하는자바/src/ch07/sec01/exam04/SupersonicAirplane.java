package ch07.sec01.exam04;

public class SupersonicAirplane extends Airplane{
	// 상수정의
	public static final int NOMAL = 1;
	public static final int SUPERSONIC = 2;
	
	public int flyMode = NOMAL;
	
	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속비행입니다.");
		}
		else {
			super.fly();
		}
	}
	
	void setFlyMode(int flyMode) {
		this.flyMode = flyMode;
		System.out.println("비행모드를 변경합니다.");
	}
	

}
