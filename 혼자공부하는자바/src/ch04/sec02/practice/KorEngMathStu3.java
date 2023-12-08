package ch04.sec02.practice;

import java.util.Scanner;

public class KorEngMathStu3 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		int i = 0;
		int korSum = 0;
		int engSum = 0;
		int mathSum = 0;
		
		while(i<=2) {
		System.out.println("학생 이름을 입력해주세요.");
		String name = scann.next();
		System.out.println("국어점수를 입력해주세요.");
		int kor = scann.nextInt();
		System.out.println("영어점수를 입력해주세요.");
		int eng = scann.nextInt();
		System.out.println("수학점수를 입력해주세요.");
		int math = scann.nextInt();
		
		int sum = kor+eng+math;
		double avg = (double)sum/3;
		korSum +=kor;
		engSum +=eng;
		mathSum +=math;
		
		
		System.out.println(name + "학생의 총점은 "+ sum +"점 입니다.");
		System.out.println(name + "학생의 평균은 "+ avg +"점 입니다.");
		i++;
		}
		System.out.println("국어 점수의 총합은 "+korSum+"점, 평균은 "+korSum/3+"점 입니다.");
		System.out.println("영어 점수의 총합은 "+engSum+"점, 평균은 "+engSum/3+"점 입니다.");
		System.out.println("수학 점수의 총합은 "+mathSum+"점, 평균은 "+mathSum/3+"점 입니다.");
	

	}

}
