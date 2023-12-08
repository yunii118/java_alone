package ch06.sec00.practice3;

import java.util.Scanner;

public class MemberService {
	private String id;
	private String password;
	
	
	boolean login() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("아이디를 입력해주세요.");
		String id = scanner.nextLine();
		this.id = id;
		
		System.out.println("비밀번호를 입력해주세요.");
		String password = scanner.nextLine();
		this.password = password;
		
		if((this.id.equals("hong"))&&(this.password.equals("12345"))) {
			return true;
		}
		else {
			return false;
		}
	}
	
	void logout() {
		System.out.println("로그아웃 되었습니다.");
	}

}
