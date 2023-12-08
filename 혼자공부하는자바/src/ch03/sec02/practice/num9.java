package ch03.sec02.practice;

import java.util.Scanner;

public class num9 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 두 수를 입력받음.double과 int 뭐가 올지 모르기때문에 일단 String으
		System.out.print("첫 번째 수: ");
		double first = scan.nextDouble();
		System.out.print("두 번째 수: ");
		double second = scan.nextDouble();
		
		double result = first/second;
		// 나누는 수 second가 0, 0.0일 때 처리해줘야함
		// 오류일 경우가 else문으로 오도록
		if((second != 0.0)&&(second !=0)) {
			System.out.println("결과: "+result);
		}
		else
			
			System.out.println("결과 : 무한대");
		
		
	}

}
