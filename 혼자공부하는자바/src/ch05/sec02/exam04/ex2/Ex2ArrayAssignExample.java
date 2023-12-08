package ch05.sec02.exam04.ex2;

public class Ex2ArrayAssignExample {

	public static void main(String[] args) {
		// 1. 크기가 10인 정수형 배열 생성
		//	데이터 모델에 해당 - model
		int[] s = new int[10];
		// 2. 각 배열에는 0부터 9까지 값을 채움
		//		실제 데이터를 처리하는 비지니스 로직
		for(int i =0;i<s.length;i++) {
			s[i] = i;
		}
		
		//		Business Logic - Controller라고 부름
		// 3. 배열의 내용을 출력
		//		Model과 Controller를 이용하여
		// 		출력할 내용 보여줌 - view
		/////이런방식으로 프로그램을 설계하여 작성
		///// MVC(Model-View-Controller) 디자인 패턴
		
		int count = 0;
		while(count<s.length) {
			System.out.print(s[count]+",");
			count++;
		}
		
		

	}

}
