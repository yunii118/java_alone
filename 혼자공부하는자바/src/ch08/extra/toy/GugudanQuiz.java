package ch08.extra.toy;

import java.util.Random;

public class GugudanQuiz extends Quiz{
	// 필드
	// 생성자
	GugudanQuiz(){
		createQuestion();
	}
	
	
	@Override
	
	void createQuestion() {
		// 프로그램의 흐름을 출력하는 로그 명령
		// 구구단 퀴즈 알고리즘
		// 난수로 몇단인가 생성
		// 사용자에게 입력받아도 됨
		// 출제된 구구단 계산결과에서 사용자에게 보여주지 않을 위치번호 생성
		// ex) 난수 3단을 생성, 3열을 가리려고 함
		// 위치     :   1|   2|   3|   4|   5|   6|   7|   8|   9|
		// 구구단값 : 3*1| 3*2|   0| 3*4| 3*5| 3*6| 3*7| 3*8| 3*9|
		Random rnd = new Random();
		int level = rnd.nextInt(9)+1;
		int hide = rnd.nextInt(9)+1;
		
		this.question = "";
		this.answer = "";
		final int MAX_QUESTION_ID = 9;
		
		for(int i = 0;i<MAX_QUESTION_ID;i++) {
			if(i==hide-1) {
				this.question +="[ O ]";
				
			}
			else {
				this.question +="["+(level * (i+1))+"]";
				
			}
		}
		this.question += "\n O에 들어갈 수는 무엇일까요?";
		this.answer = "정답 : "+ (level * hide);
	}

	
	@Override
	public String getHint() {
		return "우선 구구단이 몇 단인지 생각해보세요.";
	}

}
