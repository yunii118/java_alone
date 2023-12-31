package ch08.extra.toy;

// 인터페이스는 다중상속 구현하도록 함
// 자바는 다중상속의 복잡성과 유지 예외처리에 어려움이 많은것을
// 개선하기 위해 다중상속 없앰
// 아예 없앤것이 아니라 유연하게 개념 분리
// 다중상속 하더라도 실제 구현은 메소드 재정의를 통해 자식클래스에서 이루어짐
// 실제 구현을 자식클래스에게 하도록 언어문법상세에 강조

public interface HintHelp {
	// 인터페이스는 실제 구현이 아니므로
	// 상속받는 구현클래스에서 구현
	String getHint();

}
