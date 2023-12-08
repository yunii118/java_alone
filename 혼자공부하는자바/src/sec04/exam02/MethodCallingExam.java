package sec04.exam02;

public class MethodCallingExam {
	// add method 생성
	public static int add(int x, int y) {
		// 입력값으로 넘어온 매개변수 x, y를 더한 결과 반환
		return (x+y);
	}
	
	// 자바가상머신에서 프로그램이 호출되는(=CallBack) main() 정의
	public static void main(String[] args) {
		int x = 100;
		int y = 200;
		
		// add 메소드 실행( =메소드 호출(method call))
		int result = add(x,y);
		System.out.printf("%d + %d = %d", x, y, result);
	}

}
