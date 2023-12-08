package ch06.sec00.settergetter;

public class SafeArray {
	private int[] a; // 안전한 배열의 저장역할
	public int length; // 실제 안전한 배열의 최대크기
						// 코드에 집중하기 위해 속성함수 대신 public 설정
	
	// 생성자 = 클래스를 이용해서 클래스를 생성할 때
	// 객체를 생성한 방안의 멤버필드를 초기화하는
	// 여기서는 a[] 생성시 배열의 크기 설정
	// 배열의 값을 0에 가까운 값으로 초기화
	// length필드 초기화
	// 생성자는 클래스 이름과 같은 이름으로 시작하고
	// 초기화할 멤버필드의 값을 매개변수로 제공
	
	
	public SafeArray(int size) {
		a = new int[size]; //size - 배열의 크기
		length = size;
		
	}
	
	//배열에 들어있는 값을 읽을 때 get(읽을 index)
	public int get(int index) {
		// 정상적인 경
		if(0<=index && index <a.length) {
			return a[index];
		}
		// out of bound일경우 예외처리
		// 사용하지 않는 -1 리턴
		else {
			return -1;
		}
	}
	
	// 배열에 값을 대입하기 위해 put(인덱스, 값) 
	// 변수 하나에 저장할때 set
	// 동일한 변수가 여러개일때 인덱스로 가르킬때 put(현재 인덱스,저장할 값)
	public void put(int index, int value) {
		if(0<=index && index <a.length) {
			a[index] = value;
		}
		// out of bound일 경우 예외처리
		else {
			System.out.println("잘못된 index번호는 "+ index+"입니다.");;
		}
	}
	
	

}
