package ch08.extra.toy;

import java.util.Random;
import java.util.Scanner;

public class FourBasicCalQuiz extends Quiz {
	String hint;
	
	FourBasicCalQuiz(){
		createQuestion();
	}
	
	
	
	@Override
	public String getHint() { 
		
		return this.hint;
	}

	@Override
	void createQuestion() {
		
		Random rnd = new Random();
		int choice = rnd.nextInt(4);
		final int CALC_ADD = 0;
		final int CALC_MINUS = 1;
		final int CALC_SUB = 2;
		final int CALC_MUL = 3;
		final int CALC_MAX_NUM = 100;
		
		
		int x = rnd.nextInt(CALC_MAX_NUM)+1;
		int y = rnd.nextInt(CALC_MAX_NUM)+1;
		
		this.question = "";
		this.answer = "";
		
		
		switch(choice) {
			case CALC_ADD: 
				
				this.question = x + " + "+ y + " = ? ";
				this.answer = "정답은 "+(x+y) + "입니다.";
				
				this.hint = "두 수의 덧셈입니다.";
				break;
			case CALC_MINUS: // 뺄셈
				
				this.question = x + " - "+ y + " = ? ";
				this.answer = "정답은 "+(x-y) + "입니다.";
				this.hint = "두 수의 뺄셈입니다.";
				
				break;
			case CALC_SUB: // 나눗셈
				
				this.question = x + " / "+ y + " = ? ";
				this.answer = "정답은 "+(x/y) + "입니다.";
				this.hint = "두 수의 나눗셈입니다.";
				
				break;
			case CALC_MUL: // 곱셈
				
				this.question = x + " * "+ y + " = ? ";
				this.answer = "정답은 "+(x*y) + "입니다.";
				this.hint = "두 수의 곱셈입니다.";
				
				
				break;
		}
		
	
	}

	
}
