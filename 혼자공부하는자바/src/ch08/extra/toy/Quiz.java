package ch08.extra.toy;

import java.util.Scanner;

public abstract class Quiz implements HintHelp {
	// 필드
	// 문제, 해답
	String question;
	String answer;
	
	// 생성자
	
	// 메소드
	// 문제 출제
	// 알고리즘에 따라 출제내용이 바뀔수도 있음
	// 출제한 질문과 정답은 별도 필드변수에 저장되므로
	// return값 void
	
	abstract void createQuestion();
	// 문제 리턴
	String getQuestion() {
		return this.question;
	};
	// 정답 리턴
	String getAnswer() {
		return this.answer;
	}
	void playerReturn() {
		Scanner scanner = new Scanner(System.in);
		int player = scanner.nextInt();
	}
	

}
