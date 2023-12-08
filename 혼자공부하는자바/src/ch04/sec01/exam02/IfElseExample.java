package ch04.sec01.exam02;

import java.util.Scanner;

public class IfElseExample {
	public static void main(String[] args) {
		
		System.out.print("점수를 입력해주세요.>");
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		char grade = ' ';
		
		if(score >= 90) {
			grade = 'A';
			System.out.println("점수가 90 이상입니다.");
		}
		else {
			grade = 'B';
			System.out.println("점수가 90보다 작습니다.");
		}
		System.out.println("등급은 "+grade+"입니다.");
		
		
		
	}

}
