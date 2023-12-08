package ch05.sec02.exam04.ex2;

public class ArrayDeclareExample {

	public static void main(String[] args) {
		// 배열 선언
		// 10명의 학생 성적 저장
		// 선언만
		int[] score = new int[10];
		
		// 이상태에서 배열 내용 출력
		for(int i = 0;i<score.length;i++) {
			System.out.println("["+i+"] = "+score[i]);
		}

	}

}
