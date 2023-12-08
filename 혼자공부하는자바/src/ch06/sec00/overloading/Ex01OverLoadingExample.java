package ch06.sec00.overloading;


public class Ex01OverLoadingExample {

	public int add(int x, int y) {
		// 변수가 두개인 이항 덧셈 함수
		return x+y;
	}
	
	public int add1(int x, int y, int z) {
		return x+ y+z;
	}
	
	public int add(int x, int y, int z) {
		// 변수가 세개인 삼항 덧셈 함수, 오버로딩 이용
		return x + y + z;
	}
	// 오버로딩 : 함수 이름은 같고 매개변수의 데이터형식과 갯수가 다름
	// 			 함수값의 리턴 형식은 관계없음
	// int add(100, 200, 300) , float add (100, 200, 300)은 오버로딩 안됨.
	
	
	
	public static void main(String[] args) {
		Ex01OverLoadingExample ex01 = new Ex01OverLoadingExample();
		System.out.println("100 + 200 = "+ex01.add(100,200));
		System.out.println(
				"100 + 200 + 300 = "+ex01.add(ex01.add(100, 200), 300));
		System.out.println("100 + 200 + 300 = "+ ex01.add(100, 200, 300));
		

	}

}
