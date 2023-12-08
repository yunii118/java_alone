package ch04.sec02.practice;

import java.util.Scanner;

public class ForWhilePractice2 {

	public static void main(String[] args) {
		String password = "programmers123";
		System.out.println("비밀번호를 입력해주세요.");
		Scanner scanner = new Scanner(System.in);
		int i = 1;
		
		while(i<=5) {
			String right = scanner.nextLine();
			if(right.equals(password)) {
				System.out.println("암호 OK!");
				break;
			}
			else {
				System.out.println("암호가 틀립니다! 올바른 암호를 입력해주세요");
				i++;
			}
			
		}
		if(i ==6) {
			System.out.println("암호를 확인해주세요. 관리자에게 확인해주세요.");
		}

	}

}
