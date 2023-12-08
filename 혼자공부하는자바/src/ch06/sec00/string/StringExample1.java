package ch06.sec00.string;

public class StringExample1 {

	public static void main(String[] args) {
		//문자열 선언
		String proverb = "A barking dog"; // new 연산자 생략
		String s1; // 문자열 결합 저장변수
		String s2;// 문자 교환
		String s3; // 부분문자열 구하기
		String s4; // 대문자로 교환
		
		s1 = proverb.concat(" never Bites");
		s2 = proverb.replace("dog", "cat");// dog을 cat으로 고침
		s3 = proverb.substring(2,5);// 2~4까지. 5는 안들어감
									//보통 인덱스는 0부터, 
									// from ~to에서 from들어가고 to는 안들어감
		s4 = proverb.toUpperCase();
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		

	}

}
