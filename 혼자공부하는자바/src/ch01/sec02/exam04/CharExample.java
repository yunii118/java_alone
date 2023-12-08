package ch01.sec02.exam04;

public class CharExample {

	public static void main(String[] args) {
		char c1 = 'A';
		char c2 = 65;
		char c3 = '\u0041';
		
		char c4 = '가';
		char c5 = 44032;
		char c6 = '\uac00';
		
		System.out.println("c1 = "+c1);
		System.out.println("c2 = "+c2);
		System.out.println("c3 = "+c3);
		System.out.println("c4 = "+c4);
		System.out.println("c5 = "+c5);
		System.out.println("c6 = "+c6);
		
		
		// 이스케이프 시퀀스 연습
		String greeting = "안녕하세요\n \"HELLO\"\t\t\"Hi!\"";
		System.out.println(greeting);
		
		

	}

}