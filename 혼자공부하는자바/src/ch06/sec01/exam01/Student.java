package ch06.sec01.exam01;

public class Student {
	// new 생성자() : 생성자 클래스와 이름이 같다
	// 생성자는 new 새로운 객체(방)이 만들어지면
	// 방안의 멤버필드를 초기화하는 작업
	
	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println("s1변수가 Student객체를 참조합니다.");
		System.out.println(s1.toString());
		// 객체.toString() : 객체의 간략한 정보와 멤버필드의 내용을 문자열로 출력
		// 간략한 정보는 객체의 유일식별자 해쉬
		// 문자열을 출력한다. 해쉬문자열은 객체마다 가지는
		// 고유한 문자열이다.
		// 이것을 통해서 각 참조변수가 같은 객체를
		// 가르키는지 다른객체를 가르키는지 알수 있음
		
		Student s2 = new Student();
		System.out.println("s2변수가 또 다른 Student객체를 참조합니다.");
		System.out.println(s2.toString());
	}
	
	

}
