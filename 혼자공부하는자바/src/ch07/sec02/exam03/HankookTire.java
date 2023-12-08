package ch07.sec02.exam03;

public class HankookTire extends Tire {
	// 필드
	// 생성자
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	// 메소드
	@Override
	public boolean roll() {
		++accumulateRotation;
		if(accumulateRotation<maxRotation) {
			System.out.println(location+"한국타이어 수명 : "+(maxRotation - accumulateRotation)+"회");
			return true;
		}
		else {
			System.out.println("***"+location + "한국타이어 펑크 ***");
			return false;
		}
		
	}

}
