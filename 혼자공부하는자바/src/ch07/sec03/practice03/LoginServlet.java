package ch07.sec03.practice03;

public class LoginServlet extends HttpServlet {
	
	public LoginServlet() {
		
	}
	
	@Override
	public void service() {
		System.out.println("로그인 합니다.");
	}

}
