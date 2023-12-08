package extra.sec02.scannerexam;
import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		System.out.println("a = "+a+", b : "+b);
		System.out.println("a+b = "+(a+b));
		
		// char 문자를 하나 입력받음 - System.in.read()
		// 이는 int형이기 때문에 강제 형변환
		
		char charCode = (char)System.in.read();
		
		
	}

}
