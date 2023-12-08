
package ch04.sec01.exam04;

public class IfDiceExample {
	public static void main(String[] args) {
		// 1~6까지의 임의의 주사위 눈금 생성
		int num = (int)(Math.random() * 6)+1;
		String msg = "번이 나왔습니다.";
		
		System.out.println(num+msg);
		
		
	}

}
