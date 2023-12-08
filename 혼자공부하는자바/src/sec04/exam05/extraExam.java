package sec04.exam05;

import java.util.Scanner;

public class extraExam {
	public static void main(String[] args) {
		// 입력장치 객체 생성
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("[필수 정보 입력]");
		System.out.print("1. 이름:");
		String name = scanner.nextLine();
		
		
		System.out.print("2. 주민번호 앞 6자리:");
		String birth = scanner.nextLine();
		
		
		System.out.print("3. 전화번호:");
		String tel = scanner.nextLine();
		
		System.out.println();
		System.out.println("[입력한 내용]");
		System.out.println(name);
		System.out.println(birth);
		System.out.println(tel);
		
			
	}

}
