package ch06.sec00.practice3;



public class MemberServiceExample {

	public static void main(String[] args) {
		MemberService memberService = new MemberService();
		boolean result = memberService.login();
		if(result) {
			System.out.println("로그인 되었습니다.");
			memberService.logout();
		}
		else {
			System.out.println("id 또는 password가 일치하지 않습니다.");
		}

	}

}
