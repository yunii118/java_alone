package ch04.sec01.exam03;

public class IfElseIfElseExample {
	public static void main(String[] args) {
		int score = 75;
		char grade = ' ';
		
		if(score >=90) {
			grade = 'A';
			System.out.println("점수가 100~90입니다.");
		}
		else if(score >=80) {
			grade = 'B';
			System.out.println("점수가 89~80입니다.");
		}
		else if(score >=70) {
			grade = 'C';
			System.out.println("점수가 79~70입니다.");
		}
		
		
	}

}
