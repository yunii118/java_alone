package ch05.sec02.exam1;

public class ArrayCreateByValueListExample1 {

	public static void main(String[] args) {
		// 정수 배열 선언
		// 변수를 선언할 때 값을 대입하는 것 
		// = 초기화(initialize)
		// int[] scores = {}; // 빈 배열
		// int[] scores = new int[3] // 배열의 크기가 3인 정수배열 생성
		
		int[] scores = {83, 90, 87};
		// or int scores[] - c언어 스타일
		System.out.println("scores[0] : "+ scores[0] );
		System.out.println("scores[1] : "+ scores[1] );
		System.out.println("scores[2] : "+ scores[2] );
		
		for(int i = 0;i<scores.length;i++) {
			System.out.println("scores["+i+"] : "+scores[i]);	
		}
		
		
		// 배열의 크기 구하는 변수
		int scoresLength = 0;
		int sum = 0; // 현재 합계 낸 적 없으므로 초기값은 0
		for(int index = 0;index<3 ; index++) {
			scoresLength++; // 현재 사용중인 배열의 수
			sum = sum + scores[index];
		}
		double avg = (double)sum/scoresLength;
		System.out.println("배열의 총합 : "+ sum);
		System.out.println("배열의 평균 : "+ avg);

	}

}
