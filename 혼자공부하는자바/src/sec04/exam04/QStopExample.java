package sec04.exam04;

public class QStopExample {
	public static void main(String[] args) throws Exception{
		// 1. 키코드를 저장한 변수
		int keyCode;
		// 1.5 키코드 읽기 무한 반복
		boolean isRunning = true;
		
		while(isRunning) {
			// 2. 키보드로부터 키코드값을 읽어옵니다.
			keyCode = System.in.read();
			// 3. 화면에 출력
			System.out.println(keyCode);
			// 3.5 만약 입력한 키코드가 'q'이면 반복 중지.자연스럽게 종
			if(keyCode == 113) {
				isRunning = false;
			}
			// break; = 반복문 강제종료
		}
		
	}

}
