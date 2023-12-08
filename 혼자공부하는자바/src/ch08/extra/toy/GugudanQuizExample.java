package ch08.extra.toy;

public class GugudanQuizExample {
	public static void main(String[] args) {
		
		// 추상클래스 quiz는 직접 객체 생성할 수 없음
		// 하지만 quiz를 상속받은 실현클래스의 객체를 가르킬수는 있음
		// Upcasting
		
		
		Quiz quiz = new GugudanQuiz();
		// 다운캐스팅 : 부모가 자식을 가르킬때 이참조를 다시 자식을 가르키도록 할 수 있음
		// 자식객체의 멤버를 다시 참조 가능
		
		
		System.out.println(quiz.getQuestion());
		
		System.out.println(quiz.getHint());
		
		System.out.println(quiz.getAnswer());
		
		
	
	}

}
