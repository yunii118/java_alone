package ch04.sec02.practice;

import java.util.Scanner;

public class KorEngMathScore {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		System.out.println("학생 이름을 입력해주세요.");
		String name = scann.nextLine();
		System.out.println("국어점수를 입력해주세요.");
		int kor = scann.nextInt();
		System.out.println("영어점수를 입력해주세요.");
		int eng = scann.nextInt();
		System.out.println("수학점수를 입력해주세요.");
		int math = scann.nextInt();
		
		int sum = kor+eng+math;
		double avg = (double)sum/3;
		
		System.out.println(name + "학생의 총점은 "+ sum +"점 입니다.");
		System.out.println(name + "학생의 평균은 "+ avg +"점 입니다.");
	
		

	}

}
