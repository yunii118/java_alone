package ch06.sec00.accesscontrol;

public class Ex01AcessControlExample {

	public static void main(String[] args) {
		A objA = new A();
		//objA.a = 10;
		objA.b = 20;
		objA.c = 30;

	}

}
class A {
	private int a; // a 전용 접근 제어
	int b;// b 디폴트(패키지 레벨) 접근제어
	public int c; // c 공용
}
