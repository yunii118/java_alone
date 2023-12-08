package sec04.exam05;

import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String inputData;
		
		while(true) {
			inputData= scanner.nextLine(); // 키보드로부터 입력된 데이터 저장변수

			// inputData 화면에 출력
			System.out.println(" 입력된 문자열 : \"" + inputData + "\"");
			if(inputData.equals("q")) {
				System.out.println("종료");
				break;
			}
		}
		
		

	}

}
