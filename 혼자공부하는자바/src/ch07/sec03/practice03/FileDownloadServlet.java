package ch07.sec03.practice03;

public class FileDownloadServlet extends HttpServlet{
	
	public FileDownloadServlet() {}
	
	@Override
	public void service() {
		System.out.println("파일 다운로드합니다.");
	}

}
