package ch07.extra.exam01;

public class PolymorphismExample {

	public static void main(String[] args) {
		// 다형성 ( = polymorphism) : 
		//  - 다양한 객체에서 같은 기능을 수행하는것
		// - 반환형식 메소드이름(매개변수 형식) 똑같아야함
		//  - 다형성의 기본 특징 : 메소드 재정의(Overriding)
		
		JavaProgramming javaProg = new JavaProgramming();
		
		Programming prog = javaProg;

	}

}
