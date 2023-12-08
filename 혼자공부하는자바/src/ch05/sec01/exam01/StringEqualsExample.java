package ch05.sec01.exam01;

public class StringEqualsExample {

	public static void main(String[] args) {
		String strVal1 = "신민철";
		String strVal2 = "신민철";
		
		if(strVal1 == strVal2) {
			System.out.println("둘이 참조가 같다.");
		}
		else
			System.out.println("둘이 참조가 다르다.");
		
		if(strVal1.equals(strVal2)) {
			System.out.println("둘이 문자열이 같다");
		}
		else
			System.out.println("둘이 문자열이 다르다");
			
		String strVar3 = new String("신민철");
		String strVar4 = new String("신민철");
		
		if(strVar3 == strVar4) {
			System.out.println("둘이 참조가 같다.");
		}
		else
			System.out.println("둘이 참조가 다르다.");
		
		if(strVar3.equals(strVar4)) {
			System.out.println("둘이 문자열이 같다");
		}
		else
			System.out.println("둘이 문자열이 다르다");
	}

}
