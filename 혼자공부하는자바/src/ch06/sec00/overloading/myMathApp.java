package ch06.sec00.overloading;

public class myMathApp {

	public static void main(String[] args) {
		//MyMath 형식의 myMath객체를 메모리에 만듦
		MyMath myMath = new MyMath();
		System.out.println(
				"10 * 10 = "+myMath.square(10));
		System.out.println(
				"10.0 * 10.0 = "+myMath.square(10.0));
		
		//MyMath 형식의 myMath1객체를 메모리에 만듦
		MyMath myMath1 = new MyMath();
		System.out.println(
				"10 * 10 = "+myMath1.square(10));
		System.out.println(
				"10.0 * 10.0 = "+myMath1.square(10.0));
		
		
		// 서로 다른 객체(new로 방을 따로 만듦)이므로 출력 안됨
		if(myMath == myMath1) {
			System.out.println(
					"myMath와 myMath1은 서로 같은 객체입니다."
					);
			
		}
		
	}

}
