package ch05.sec02.exam04.ex1;

public class Ex05ArrayForEachExample {

	public static void main(String[] args) {
		int[] numbers = new int[] { 10, 20, 30};
		int i = 0;
		for(int num:numbers) {
			System.out.println("numbers 배열의 "+i+"번 요소 : "+num);
			i++;
		}// end of for
		
		System.out.println();
		
		// 5명의 학생 이름을 배열에 저장
		// 이름 : 황진이,영희, 홍길동, 무지개, 가을
		// System.out.println()통해 출력
		// for~each 구문 사용
		
		String[] name = new String[] {"황진이", "영희", "홍길동", "무지개", "가을"};
		
		for(String student:name) {
			System.out.println(student);
		}// end of for
		

	}// end of main

}// end of class
