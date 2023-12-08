package ch03.sec02.exam09.practice;

import java.util.Scanner;

public class Logical {
	 public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			// Scanner 클래스를 통해 문자 입력
			// Scanner 클래스는 문자 입력 기능 대신 문자열기능 사용
			// next 통해 문자열 입력받은 후 charAt 아용하여해당 ㅇㄴ덱스 문자 가져옴
			char charCode  = scanner.next().charAt(0);
	
			if((charCode >= 65) && (charCode<=90)) {
				System.out.println("대문자군요");
			}
			
			if((charCode >= 97) && (charCode<=122)) {
				System.out.println("소문자군요");
			}
			
			if((charCode >= 48) && (charCode<=57)) {
				System.out.println("0-9 숫자군요");
			}
			
			
			
			
		}

	}



