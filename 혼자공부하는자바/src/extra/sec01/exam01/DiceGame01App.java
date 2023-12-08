
package extra.sec01.exam01;


public class DiceGame01App {

	public static void main(String[] args) {
		// 주사위 눈금을 얻기위해 난수 이용
		// Math.random() 이용 : 0 <= 실수 < 1
		// (int) 데이터 타입을 강제로 정수로 만들어달라는 의미
		
		// num의 범위를 1 <= num < 7 로 바꿔줌
		int num = (int)(Math.random() * 6) + 1;
		int pl = (int)(Math.random() * 6) + 1;
		
		System.out.println("컴퓨터 주사위 눈금 : "+num);
		System.out.println("플레이어 주사위 눈금 : "+pl);
		
		int a = pl - num;
		
		if(a>0) {
			System.out.println("플레이어가 이겼습니다.");
		} // end of if
		else if(a == 0) {
			System.out.println("비겼습니다.");
		} // end of else if
		else {
			System.out.println("컴퓨터가 이겼습니다.");
		} // end of else
																																																																																																																																																																												

	} // end of main

} // end of DiceGame01App.class
