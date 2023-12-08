package ch07.sec02.exam03;

public class Tire {
	// 필드
	public int maxRotation; // 최대 회전수
	public int accumulateRotation; // 누적 회전수
	public String location; // 타이어 위치
	
	// 생성자
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
		
	}
	
	// 메소드
	public boolean roll() {
		++accumulateRotation;
		if(accumulateRotation<maxRotation) {
			System.out.println(location + "타이어 수명 : "+ (maxRotation - accumulateRotation) + "회");
			return true;			
		}
		else {
			System.out.println("***"+location+"타이어 펑크 ***");
			return false;
		}

	}

}
