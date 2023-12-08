package ch08.extra.toy;

public class FourBasicCalQuizExample {

	public static void main(String[] args) {
		
		Quiz quiz = new FourBasicCalQuiz();
		
		System.out.println(quiz.getQuestion());
		System.out.println(quiz.getHint());
		quiz.playerReturn();
		System.out.println(quiz.getAnswer());

	}

}
