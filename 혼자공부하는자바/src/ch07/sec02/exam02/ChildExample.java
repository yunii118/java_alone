package ch07.sec02.exam02;

public class ChildExample {

	public static void main(String[] args) {
		Child child = new Child();
		
		Parent parent = child;
		parent.method1();
		parent.method2();
		//parent.method3();
		// 부모클래스에서의 메소드만 호출가능함
		// 단, 메소드가 자식클래스에서 오버라이딩 되었을 경우
		// 오버라이딩 된 결과가 나옴
	}

}
