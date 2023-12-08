package sec04.exam03;

public class ContinueKeyCodeReadExample {
	public static void main(String[] args) throws Exception{
		int keyCode; // 키보값 저장
		boolean isRunning = true;
		
		System.out.print("키보드를 누른 후 엔터를 눌러주세요.>");
		
		while(isRunning) {
			// 키를 누르면 키코드 출력
			keyCode = System.in.read();
			System.out.println(keyCode);
		}
	}

}
